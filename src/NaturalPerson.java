import javax.xml.validation.Validator;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class NaturalPerson {
            private String celular;
            private String cpf;
            private LocalDate dataNascimento;
            private String email;
            private String Endereco;
            private String nome;
            private String rg;
            private String genero;

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

            public String getGenero() {
               return genero;
            }

            //Criando Encapsulamento - Setters

            public void setCelular(String celular) {
                this.celular = celular;
            }

            public void setCpf() {
                Scanner scanner = new Scanner(System.in);
                String cpf;
                boolean flag;

                do {
                    System.out.println("Insira o seu CPF: ");
                    cpf = scanner.nextLine().replaceAll("[^0-9]", ""); // Remove caracteres não numéricos
                    flag = cpf.length() == 11;

                    if (!flag) {
                        System.out.println("CPF incorreto, tente novamente!");
                    }
                } while (!flag);


                CpfValidator.isCPFValid(cpf);


                this.cpf = cpf;
            }

            public void setDataNascimento() {
                        Scanner scanner = new Scanner(System.in);
                        LocalDate dataNascimentoFormatada;
                        System.out.print("Data de Nascimento (dd/MM/yyyy): ");
                        boolean flag;
                        do {
                            String dataNascimentoString = scanner.nextLine();
                            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                            flag = Data.isDataValid(dataNascimentoString, "dd/MM/yyyy");

                            if (!flag) {
                                dataNascimentoFormatada = LocalDate.parse(dataNascimentoString, formatador);
                                flag = true;
                                this.dataNascimento = dataNascimentoFormatada;
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

            public void setSexo(String genero) {
                this.genero = SelectGender.ValidOptionGender();;
            }

}
