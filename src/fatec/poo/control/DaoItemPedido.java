package fatec.poo.control;

import fatec.poo.model.ItemPedido;
import fatec.poo.model.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Airton Brasil 0030481611002
 * @author Allan Flores 0030481611001
 * @author Caique Siqueira 0030481611009
 */
public class DaoItemPedido {
    private Connection conn;
    
    public DaoItemPedido (Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(ItemPedido item) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(
                "INSERT INTO TP_Item_Pedido" +
                " (Numero_Pedido, Codigo_Produto, Numero_Item, Qtde_Vendida)"+
                " VALUES(?,?,?,?)"
            );
            ps.setInt(1, item.getPedido().getNumero());
            ps.setInt(2, item.getProduto().getCodigo());
            ps.setInt(3, item.getNumeroItem());
            ps.setInt(4, item.getQtdeVendida());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());   
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.toString());   
        }
    }
    
    public void alterar(ItemPedido item) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(
                "UPDATE TP_Item_Pedido" +
                " SET Numero_Item = ?, Qtde_Vendida = ?"+
                " WHERE Numero_Pedido = ? AND Codigo_Produto = ?"
            );
            ps.setInt(1, item.getNumeroItem());
            ps.setInt(2, item.getQtdeVendida());
            ps.setInt(3, item.getPedido().getNumero());
            ps.setInt(4, item.getProduto().getCodigo());
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }

    public ArrayList<ItemPedido> consultarItens (Pedido pedido) {
        ArrayList<ItemPedido> listaItens = new ArrayList<ItemPedido>();
        DaoProduto daoProduto = new DaoProduto(conn);
        
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(
                "SELECT * FROM TP_Item_Pedido" +
                " WHERE Numero_Pedido = ?"
            );

            ps.setInt(1, pedido.getNumero());
            ResultSet rs = ps.executeQuery();
           
            while (rs.next() == true) {
                ItemPedido item = new ItemPedido(rs.getInt("Numero_Item"), rs.getInt("Qtde_Vendida"));
                item.setPedido(pedido);
                item.setProduto(daoProduto.consultar(rs.getInt("Codigo_Produto")));
                
                listaItens.add(item);
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        
        return listaItens;
    }    
     
    public void excluir(ItemPedido item) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(
                "DELETE FROM TP_Item_Pedido" +
                " WHERE Numero_Pedido = ? AND Codigo_Produto = ?"
            );
            ps.setInt(1, item.getPedido().getNumero());
            ps.setInt(2, item.getProduto().getCodigo());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());   
        }
    }
}
