import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel intro = new JLabel("Olá, Nesta aplicação vamos simular um cadastro para auxiliar na fixação do conteúdo ");

        frame.add(intro);

        JLabel orientacao = new JLabel("Preencha os campos abaixo para salvar seus dados!");

        frame.add(orientacao);

        JTextField  nomeLabel = new JTextField();


        private String celular;
        private String cpf;
        private Date dataNascimento;
        private String email;
        private String Endereco;
        private int idade;
        private String nome;
        private String rg;
        private String sexo;
    }
}
