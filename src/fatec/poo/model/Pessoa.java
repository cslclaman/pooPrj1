package fatec.poo.model;

/**
 *
 * @author Airton Brasil 0030481611002
 * @author Allan Flores 0030481611001
 * @author Caique Siqueira 0030481611009
 */
public class Pessoa {
    private String cpf;
    private String nome;
    private String endereco;
    private String cidade;
    private String cep;
    private String uf;
    private String ddd;
    private String telefone;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public static boolean cpfValido(String cpf){
        int[] numeros = new int[11];
        int verif1, verif2, soma;
        if (cpf.length() != 11){
            return false;
        } else {
            for (int c = 0; c < 11; c++){
                try {
                    numeros[c] = Integer.parseInt(cpf.substring(c,c+1));
                } catch (NumberFormatException ex){
                    return false;
                }
            }
            soma = 0;
            for (int c = 0; c < 9; c++){
                 soma += numeros[c] * (c + 1);
            }
            verif1 = (soma % 11) % 10 ;
            if (numeros[9] != verif1){
                return false;
            } else {
                soma = 0;
                for (int c = 0, d = 11; c < 10; c++, d--){
                    soma += numeros[c] * d;
                }
                verif2 = ((soma * 10) % 11) % 10;
                if (numeros[10] != verif2){
                    return false;
                } else {
                    return true;
                }
            }
        }
    }
}
