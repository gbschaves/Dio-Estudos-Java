import java.util.Date;

public class PessoaFisica {
            private String celular;
            private String cpf;
            private Date dataNascimento;
            private String email;
            private String Endereco;
            private int idade;
            private String nome;
            private String rg;
            private String sexo;

            //Criando Encapsulamento - Getters

            public String getCelular() {
                return celular;
            }

            public String getCpf() {
                return cpf;
            }

            public Date getDataNascimento() {
                return dataNascimento;
            }

            public String getEmail() {
                return email;
            }

            public String getEndereco() {
                return Endereco;
            }

            public int getIdade() {
                return idade;
            }

            public String getNome() {
                return nome;
            }

            public String getRg() {
                return rg;
            }

            public String getSexo() {
                return sexo;
            }

            //Criando Encapsulamento - Setters

            public void setCelular(String celular) {
                this.celular = celular;
            }

            public void setCpf(String cpf) {
                this.cpf = cpf;
            }

            public void setDataNascimento(Date dataNascimento) {
                        LocalDate dataNascimentoFormatada = LocalDate.now();
                        boolean dataNascimentoValido = true;
                        String dataNascimento = scanner.nextLine();
                        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        
                        try {
                                    dataNascimentoFormatada = LocalDate.parse(dataNascimentoString, formatador);
                                    dataNascimentoValido = true;
                                } catch (DateTimeParseException e) {
                                    System.out.println("Formato inválido! Use o formato dd/MM/yyyy.");
	            }

            
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public void setEndereco(String endereco) {
                Endereco = endereco;
            }

            public void setIdade(int idade) {
                this.idade = idade;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public void setRg(String rg) {
                this.rg = rg;
            }

            public void setSexo(String sexo) {
                this.sexo = sexo;
            }


}
