
import javax.swing.*;
import java.awt.event.ActionListener;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Olá, nesta aplicação vamos simular um cadastro para auxiliar na fixação do conteúdo!");
        System.out.println("Preencha os campos abaixo para salvar seus dados!");

//        System.out.print("Nome: ");
//        String nome = scanner.nextLine();
//        pf.setNome(nome);
//
//        System.out.print("E-mail: ");
//        String email = scanner.nextLine();
//        pf.setEmail(email);
//
//        System.out.print("CPF: ");
//        String cpf = scanner.nextLine();
//        pf.setCpf(cpf);
//
//        System.out.print("RG");
//        String rg = scanner.nextLine();
//        pf.setRg(rg);
//
//        System.out.print("Idade: ");
//        int idade = scanner.nextInt();
//        pf.setIdade(idade);

        System.out.print("Data de Nascimento (dd/MM/yyyy): ");
        String dataNascimentoString = scanner.nextLine();
        pf.setDataNascimento(dataNascimentoString);

//        System.out.print("Endereco: ");
//        String endereco = scanner.nextLine();
//        pf.setEndereco(endereco);
//
//        System.out.print("Celular: ");
//        String celular = scanner.nextLine();
//        pf.setCelular(celular);






    }
}
