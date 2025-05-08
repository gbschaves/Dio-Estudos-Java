import java.util.InputMismatchException;
import java.util.Scanner;

public class SelectGender {
    public static String ValidOptionGender() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione um genero: ");
        System.out.println("1 - Masculino");
        System.out.println("2 - Feminino");
        System.out.println("3 - Outro");

        Integer genero = scanner.nextInt();
        boolean genderoValido = false ;
        String generoFinal = "";


        do{
            try {
                switch (genero) {
                    case 1:
                        genero = 1;
                        genderoValido = true;
                        generoFinal = "Masculino";
                    case 2:
                        genero = 2;
                        genderoValido = true;
                        generoFinal = "Feminino";
                    case 3:
                        genero = 3;
                        genderoValido = true;
                        generoFinal = "Outro";
                    default:
                        genderoValido = false;
                }

            } catch(InputMismatchException e) {
                System.out.println("Selecione uma opção valida: ");
            }
        }while(genderoValido);

        return generoFinal;
    }
}
