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
            ps = conn.prepareStatement("INSERT INTO cliente VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(0, cliente.getCpf());
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEndereco());
            ps.setString(3, cliente.getCidade());
            ps.setString(4, cliente.getCep());
            ps.setString(5, cliente.getUf());
            ps.setString(6, cliente.getDdd());
            ps.setString(7, cliente.getTelefone());
            ps.setDouble(8, cliente.getLimiteCred());
            ps.setDouble(9, cliente.getLimiteDisp());
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
            ps = conn.prepareStatement("SELECT * FROM tp_cliente WHERE cpf = ?");
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next() == true) {
                cli = new Cliente (cpf, rs.getString("nome"), rs.getDouble("Limite_Cred"));
                cli.setCep(rs.getString("cep"));
                cli.setCidade(rs.getString("cidade"));
                cli.setDdd(rs.getString("ddd"));
                cli.setEndereco(rs.getString("endereco"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setUf(rs.getString("uf"));
                cli.setLimiteDisp(rs.getDouble("Limite_Disp"));
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
