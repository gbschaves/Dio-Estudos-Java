import java.time.LocalDate;

public class PessoaModel {
    private String celular;
    private String email;
    private EnderecoModel endereco;

    public String getCelular() {
        return celular;
    }
    public String getEmail() {
        return email;
    }
    public EnderecoModel getEndereco() {return endereco;}

    public void setCelular(String celular) {
        this.celular = celular;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEndereco(EnderecoModel endereco) {}
}