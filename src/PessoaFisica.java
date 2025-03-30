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
                String cpf;
                int[] cpfArray;
                boolean flag;

                do {
                    System.out.println("Insira o seu CPF: ");
                    cpf = scanner.nextLine().replaceAll("[^0-9]", ""); // Remove caracteres não numéricos
                    flag = cpf.length() == 11;

                    if (!flag) {
                        System.out.println("CPF incorreto, tente novamente!");
                    }
                } while (!flag);


                cpfArray = new int[11];
                for (int i = 0; i < 11; i++) {
                    cpfArray[i] = Character.getNumericValue(cpf.charAt(i));
                }

                int reverse = 10;
                int cpfAccumulator = 0;
                int validador1;
                int validador2;
                for (int i = 0; i < 10; i++) {
                    cpfAccumulator = cpfAccumulator + (cpfArray[i] * reverse);
                    reverse -= 1;

                    if (reverse < 2) {
                        reverse = 11;

                        int digito = (cpfAccumulator % 11);

                        if (digito < 2 ) {
                            validador1 = 0;
                        } else {
                            validador1 = 11 - digito;
                        }

                    }

                }


                for (int i = 0; i < 11; i++) {
                    cpfAccumulator = cpfAccumulator + (cpfArray[i] * reverse);
                    reverse -= 1;

                    if (reverse < 2) {
                        reverse = 11;

                        int digito = (cpfAccumulator % 11);

                        if (digito < 2 ) {
                            validador2 = 0;
                        } else {
                            validador2 = 11 - digito;
                        }

                    }

                }





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

            public void setSexo(String sexo) {
                this.sexo = sexo;
            }

}
