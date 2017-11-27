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
            ps = conn.prepareStatement(
                "INSERT INTO TP_Vendedor" +
                " (cpf,nome,endereco,cidade,cep,uf,ddd,telefone,salario_base,comissao)" +
                " VALUES (?,?,?,?,?,?,?,?,?,?)"
            );
            ps.setString(1, vendedor.getCpf());
            ps.setString(2, vendedor.getNome());
            ps.setString(3, vendedor.getEndereco());
            ps.setString(4, vendedor.getCidade());
            ps.setString(5, vendedor.getCep());
            ps.setString(6, vendedor.getUf());
            ps.setString(7, vendedor.getDdd());
            ps.setString(8, vendedor.getTelefone());
            ps.setDouble(9, vendedor.getSalarioBase());
            ps.setDouble(10, vendedor.getComissao());
            ps.execute();
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Vendedor vendedor){
        
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement(
                "UPDATE TP_Vendedor" +
                " SET endereco = ?,cidade = ?,cep = ?, uf = ?, ddd= ?, telefone = ?, salario_base = ?, comissao = ?" +
                " WHERE cpf = ?"
            );
            ps.setString(1, vendedor.getEndereco());
            ps.setString(2, vendedor.getCidade());
            ps.setString(3, vendedor.getCep());
            ps.setString(4, vendedor.getUf());
            ps.setString(5, vendedor.getDdd());
            ps.setString(6, vendedor.getTelefone());
            ps.setDouble(7, vendedor.getSalarioBase());
            ps.setDouble(8, vendedor.getComissao());
            ps.setString(9, vendedor.getCpf());
            ps.execute();
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public Vendedor consultar(String cpf){
        Vendedor vendedor = null;
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("SELECT * FROM TP_Vendedor WHERE cpf = ?");
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next() == true) {
                vendedor = new Vendedor (cpf, rs.getString("nome"), rs.getDouble("Salario_base"));
                vendedor.setCep(rs.getString("cep"));
                vendedor.setCidade(rs.getString("cidade"));
                vendedor.setDdd(rs.getString("ddd"));
                vendedor.setEndereco(rs.getString("endereco"));
                vendedor.setTelefone(rs.getString("telefone"));
                vendedor.setUf(rs.getString("uf"));
                vendedor.setComissao(rs.getDouble("Comissao"));
            } 
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
        return vendedor;
    }
    
    public void excluir(Vendedor vendedor){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("DELETE FROM TP_Vendedor WHERE cpf = ?");
            ps.setString(1, vendedor.getCpf());
            
            ps.execute();
        }
        catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
