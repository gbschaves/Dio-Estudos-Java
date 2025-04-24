import java.util.Scanner;

public class SelectGender {
    public static Boolean ValidOptionGender(Integer entrada) {
        Boolean GenderValid = true;
        if (entrada > 4 && entrada < 0) {
            GenderValid = true;
        } else if (entrada < 4 && entrada > 0) {
            System.out.println("Opção Invalida!");
            System.out.println("Insira uma opção válida!");
            GenderValid = false;
        }
        return GenderValid;
    }
}
