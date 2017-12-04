package fatec.poo.control;

import fatec.poo.model.Pedido;
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
public class DaoPedido {
    private Connection conn;
    
    public DaoPedido (Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Pedido pedido) {
        PreparedStatement ps = null;
        try {
            String status;
            if (pedido.getStatus() == true){
                status = "V";
            } else {
                status = "F";
            }
            ps = conn.prepareStatement(
                "INSERT INTO TP_Pedido" +
                " (Numero, CPF_Cliente, CPF_Vendedor, Status, Data_Pedido, Data_Pagto)"+
                " VALUES(?,?,?,?,?,?)"
            );
            ps.setInt(1, pedido.getNumero());
            ps.setString(2, pedido.getCliente().getCpf());
            ps.setString(3, pedido.getVendedor().getCpf());
            ps.setString(4, status);
            ps.setString(5, pedido.getDataEmissaoPedido());
            ps.setString(6, pedido.getDataPagto());
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
            String status;
            if (pedido.getStatus() == true){
                status = "V";
            } else {
                status = "F";
            }
            ps = conn.prepareStatement(
                "UPDATE TP_Pedido" +
                " set CPF_Cliente = ?, CPF_Vendedor = ?, Status = ?, Data_Pedido = ?, Data_Pagto = ?"+
                " WHERE Numero = ?"
            );
            
            ps.setString(1, pedido.getCliente().getCpf());
            ps.setString(2, pedido.getVendedor().getCpf());
            ps.setString(3, status);
            ps.setString(4, pedido.getDataEmissaoPedido());
            ps.setString(5, pedido.getDataPagto());
            
            ps.setInt(6, pedido.getNumero());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
    public Pedido consultar (int numero) {
        DaoCliente daoCliente = new DaoCliente(conn);
        DaoVendedor daoVendedor = new DaoVendedor(conn);
        
        Pedido pedido = null;
        
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(
                "SELECT * FROM TP_Pedido" +
                " WHERE Numero = ?"
            );

            ps.setInt(1, numero);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                boolean status = rs.getString("Status").equals("V");
                
                pedido = new Pedido (numero, rs.getString("Data_Pedido"));
                pedido.setDataPagto(rs.getString("Data_Pagto"));
                pedido.setStatus(status);
                pedido.setCliente(daoCliente.consultar(rs.getString("CPF_Cliente")));
                pedido.setVendedor(daoVendedor.consultar(rs.getString("CPF_Vendedor")));
                
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        
        return (pedido);
    }    
     
    public void excluir(Pedido pedido) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(
                "DELETE FROM TP_Pedido" + 
                " WHERE Numero = ?"
            );
            ps.setInt(1, pedido.getNumero());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());   
        }
    }
}
