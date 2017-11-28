package fatec.poo.control;

import fatec.poo.model.Pedido;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Airton Brasil 0030481611002
 * @author Allan Flores 0030481611001
 * @author Caique Siqueira 0030481611009
 */
public class DaoPedido {
    private Connection conn;
    
    public DaoPedido (Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Pedido pedido) {
        PreparedStatement ps = null;
        try {
            Date dataPedido = Date.valueOf(pedido.getDataEmissaoPedido());
            Date dataPagto = Date.valueOf(pedido.getDataEmissaoPedido());
            
            String status;
            if (pedido.getStatus() == true){
                status = "V";
            } else {
                status = "F";
            }
            ps = conn.prepareStatement("INSERT INTO TP_Pedido" +
                " (Numero, CPF_Cliente, CPF_Vendedor, Status, Data_Pedido, Data_Pagto)"+
                " VALUES(?,?,?,?,?)"
            );
            ps.setInt(1, pedido.getNumero());
            ps.setString(2, pedido.getCliente().getCpf());
            ps.setString(3, pedido.getVendedor().getCpf());
            ps.setString(3, status);
            ps.setDate(4, dataPedido);
            ps.setDate(5, dataPagto);
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());   
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Pedido pedido) {
        PreparedStatement ps = null;
        try {
            Date dataPedido = Date.valueOf(pedido.getDataEmissaoPedido());
            Date dataPagto = Date.valueOf(pedido.getDataEmissaoPedido());
            
            String status;
            if (pedido.getStatus() == true){
                status = "V";
            } else {
                status = "F";
            }
            ps = conn.prepareStatement("UPDATE TP_Pedido" +
                    " set CPF_Cliente = ?, CPF_Vendedor = ?, Status = ?, Data_Pedido = ?, Data_Pagto = ?"+
                    " WHERE Codigo = ?");
            
            ps.setString(1, pedido.getCliente().getCpf());
            ps.setString(2, pedido.getVendedor().getCpf());
            ps.setString(3, status);
            ps.setDate(0, x);
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
    public Produto consultar (int codigo) {
        Produto produto = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM TP_Produto" +
                    " WHERE Codigo = ?");
            
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                produto = new Produto (codigo, rs.getString("Descricao"));
                produto.setEstoqueMin(rs.getInt("Estoque_Min"));
                produto.setPrecoUnit(rs.getDouble("Preco_Unit"));
                produto.setQtdeDisponivel(rs.getInt("Qtde_Disponivel"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (produto);
    }    
     
    public void excluir(Produto departamento) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TP_Produto" + 
                    " WHERE Codigo = ?");
            ps.setInt(1, departamento.getCodigo());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
