import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;


public class PessoaFisicaModel {
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
                boolean validador;

                do {

                    System.out.println("Insira o seu CPF: ");
                    cpf = scanner.nextLine().replaceAll("[^0-9]", ""); // Remove caracteres não numéricos
                    flag = cpf.length() == 11;

                    if (!flag) {
                        System.out.println("CPF incorreto, tente novamente!");
                        cpf = scanner.nextLine().replaceAll("[^0-9]", "");
                        flag = cpf.length() == 11;
                    }




                int[] cpfArray;

                cpfArray = new int[11];
                for (int i = 0; i < 11; i++) {
                    cpfArray[i] = Character.getNumericValue(cpf.charAt(i));
                }

                int reverse = 10;
                int cpfAccumulator = 0;
                int validador1 = 0;
                int validador2 = 0;


                for (int i = 0; i < 9; i++) {
                    cpfAccumulator = cpfAccumulator + (cpfArray[i] * reverse);
                    reverse -= 1;

                    if (reverse < 2) {
                        int digito = cpfAccumulator % 11;

                        if (digito < 2 ) {
                            validador1 = 0;
                            reverse = 11;
                            cpfAccumulator = 0;
                        } else if(digito >= 2) {
                            validador1 = 11 - digito;
                            reverse = 11;
                            cpfAccumulator = 0;
                        }

                    }

                }

                for (int i = 0; i < 10; i++) {
                    cpfAccumulator = cpfAccumulator + (cpfArray[i] * reverse);
                    reverse -= 1;
                    System.out.println(cpfArray[i]);
                    System.out.println(cpfAccumulator);

                    if (reverse < 2) {

                        int digito = cpfAccumulator % 11;

                        if (digito < 2) {
                            validador2 = 0;
                            System.out.println(validador2);
                        } else if (digito >= 2) {
                            validador2 = 11 - digito;
                            System.out.println(validador2);
                        }
                    }

                }




                    if (validador1 == cpfArray[9] && validador2 == cpfArray[10]) {
                        validador = true;
                        this.cpf = cpf;

                    } else {
                        System.out.println("CPF invalido!");
                        validador = false;
                    }
                } while (!flag || !validador);

            }

            public void setDataNascimento() {
                        Scanner scanner = new Scanner(System.in);
                        LocalDate dataNascimentoFormatada;
                        System.out.print("Data de Nascimento (dd/MM/yyyy): ");
                        boolean flag;
                        do {
                            String dataNascimentoString = scanner.nextLine();
                            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                            try {
                                formatador.parse(dataNascimentoString);
                                flag = true;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                System.out.println("Data de Nascimento incorreta, tente novamente!");

                                flag = false;
                            }

                            if (!flag) {
                                dataNascimentoFormatada = LocalDate.parse(dataNascimentoString, formatador);
                                this.dataNascimento = dataNascimentoFormatada;
                            }
                        }while(flag);
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

            public void setGenero() {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Selecione um genero: ");
                System.out.println("1 - Masculino");
                System.out.println("2 - Feminino");
                System.out.println("3 - Outro");
                Integer opcaoGenero = scanner.nextInt();
                try{
                    opcaoGenero = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Selecione uma opção valida: ");
                }

                System.out.println(opcaoGenero);
                boolean genderoValido = true ;
                String generoFinal = "";

                do{
                                        switch (opcaoGenero) {
                            case 1:
                                genderoValido = true;
                                generoFinal = "Masculino";
                                break;
                            case 2:
                                genderoValido = true;
                                generoFinal = "Feminino";
                                break;
                            case 3:
                                genderoValido = true;
                                generoFinal = "Outro";
                                break;
                            default:
                                genderoValido = false;
                                System.out.println("Selecione uma opção valida: ");
                                opcaoGenero = scanner.nextInt();
                                break;
                        }


                }while(!genderoValido);

                System.out.println(generoFinal);
                this.genero = generoFinal;
            }

}
