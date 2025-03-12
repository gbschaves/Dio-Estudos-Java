
import javax.swing.*;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        Scanner scanner = new Scanner(System.in);
        LocalDate dataNascimentoFormatada = LocalDate.now();
        boolean dataNascimentoValido = true;

        System.out.println("Olá, nesta aplicação vamos simular um cadastro para auxiliar na fixação do conteúdo!");
        System.out.println("Preencha os campos abaixo para salvar seus dados!");
        System.out.print("Nome: ");

        String nome = scanner.nextLine();

        pf.setNome(nome);

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        pf.setCpf(cpf);

        System.out.print("Data de Nascimento (dd/MM/yyyy): ");
        String dataNascimentoString = scanner.nextLine();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        try {
            dataNascimentoFormatada = LocalDate.parse(dataNascimentoString, formatador);
            dataNascimentoValido = true;
        } catch (DateTimeParseException e) {
            System.out.println("Formato inválido! Use o formato dd/MM/yyyy.");
        }



    }
}
