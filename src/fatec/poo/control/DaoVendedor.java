package fatec.poo.control;

import fatec.poo.model.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoVendedor {
    private Connection conn;

    public DaoVendedor(Connection con) {
        this.conn = con;
    }
    
    public void inserir(Vendedor vendedor){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("INSERT INTO Vendedor VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(0, vendedor.getCpf());
            ps.setString(1, vendedor.getNome());
            ps.setString(2, vendedor.getEndereco());
            ps.setString(3, vendedor.getCidade());
            ps.setString(4, vendedor.getCep());
            ps.setString(5, vendedor.getUf());
            ps.setString(6, vendedor.getDdd());
            ps.setString(7, vendedor.getTelefone());
            ps.setDouble(8, vendedor.getSalarioBase());
            ps.setDouble(9, vendedor.getComissao());
            ps.execute();
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Vendedor vendedor){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("UPDATE Vendedor SET WHERE");
            
            ps.execute();
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public Vendedor consultar(String cpf){
        Vendedor ven = null;
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("SELECT * FROM Vendedor WHERE = ?");
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next() == true) {
                ven = new Vendedor (cpf, rs.getString("nome"), rs.getDouble("Sal_base"));
                ven.setCep(rs.getString("cep"));
                ven.setCidade(rs.getString("cidade"));
                ven.setDdd(rs.getString("ddd"));
                ven.setEndereco(rs.getString("endereco"));
                ven.setTelefone(rs.getString("telefone"));
                ven.setUf(rs.getString("uf"));
                ven.setComissao(rs.getDouble("Comissao"));
            }
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
        return ven;
    }
    
    public void excluir(Vendedor vendedor){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("DELETE FROM Vendedor WHERE = ?");
            ps.setString(1, vendedor.getCpf());
            
            ps.execute();
        }
        catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
