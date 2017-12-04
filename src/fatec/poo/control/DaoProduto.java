package fatec.poo.control;

import fatec.poo.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Airton Brasil 0030481611002
 * @author Allan Flores 0030481611001
 * @author Caique Siqueira 0030481611009
 */
public class DaoProduto {
    private Connection conn;
    
    public DaoProduto (Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Produto produto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO TP_Produto" +
                    " (Codigo, Descricao,Qtde_Disponivel,Preco_Unit,Estoque_Min)"+
                    " VALUES(?,?,?,?,?)");
            ps.setInt(1, produto.getCodigo());
            ps.setString(2, produto.getDescricao());
            ps.setInt(3, produto.getQtdeDisponivel());
            ps.setDouble(4, produto.getPrecoUnit());
            ps.setInt(5, produto.getEstoqueMin());

            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Produto produto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TP_Produto" +
                    " set Descricao = ?,Qtde_Disponivel = ?,Preco_Unit = ?,Estoque_Min = ?"+
                    " WHERE Codigo = ?");
            
            ps.setInt(5, produto.getCodigo());
            
            ps.setString(1, produto.getDescricao());
            ps.setInt(2, produto.getQtdeDisponivel());
            ps.setDouble(3, produto.getPrecoUnit());
            ps.setInt(4, produto.getEstoqueMin());

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
     
    public void excluir(Produto produto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TP_Produto" + 
                    " WHERE Codigo = ?");
            ps.setInt(1, produto.getCodigo());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
