package fatec.poo.control;

import fatec.poo.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoCliente {
    private Connection conn;

    public DaoCliente(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Cliente cliente){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("INSERT INTO cliente () VALUES()");
            
            ps.execute();
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
        
    }
    
    public void alterar(Cliente cliente){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("UPDATE Cliente SET WHERE");
            
            ps.execute();
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public Cliente consultar(String cpf){
        Cliente cli = null;
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("SELECT * FROM Cliente WHERE = ?");
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next() == true) {
                cli = new Cliente ();
            }
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
        return cli;
    }
    
    public void excluir(Cliente cliente){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("DELETE FROM Cliente WHERE = ?");
            ps.setString(1, cliente.getCpf());
            
            ps.execute();
        }
        catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
