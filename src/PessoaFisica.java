import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class PessoaFisica {
            private String celular;
            private String cpf;
            private LocalDate dataNascimento;
            private String email;
            private String Endereco;
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

            public LocalDate getDataNascimento() {
                return dataNascimento;
            }

            public String getEmail() {
                return email;
            }

            public String getEndereco() {
                return Endereco;
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

            public void setCpf() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Insira o seu cpf: ");
                System.out.println("*Somente Números*");
                int cpf = scanner.nextInt();







                this.cpf = cpf;
            }

            public void setDataNascimento() {
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Data de Nascimento (dd/MM/yyyy): ");
                        String dataNascimentoString = scanner.nextLine();


                        LocalDate dataNascimentoFormatada;
                        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        Boolean flag = Data.isDataValid(dataNascimentoString, "dd/MM/yyyy");
                        System.out.println(Data.isDataValid(dataNascimentoString, "dd/MM/yyyy"));

                        do {
                            if (flag) {
                                dataNascimentoFormatada = LocalDate.parse(dataNascimentoString, formatador);
                                flag = true;
                                this.dataNascimento = dataNascimentoFormatada;
                            } else {
                                System.out.println("Data inválida! Use o formato dd/MM/yyyy ou insira uma data válida.");
                                System.out.print("Data de Nascimento (dd/MM/yyyy): ");
                                dataNascimentoString = scanner.nextLine();
                                flag = Data.isDataValid(dataNascimentoString, "dd/MM/yyyy");
                            }
                        }while(!flag);
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public void setEndereco(String endereco) {
                Endereco = endereco;
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
