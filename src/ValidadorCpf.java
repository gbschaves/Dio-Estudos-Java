public class ValidadorCpf {
    public static boolean isCPFValid(String cpf) {
        boolean valido1 = true;
        boolean valido2 = true;
        int[] cpfArray;
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
                int digito = (cpfAccumulator % 11);

                if (digito < 2 ) {
                    validador1 = 0;
                } else if(digito >= 2) {
                    validador1 = 11 - digito;
                } else {
                    valido1 = false;
                }

            }

        }


        for (int i = 0; i < 11; i++) {
            cpfAccumulator = cpfAccumulator + (cpfArray[i] * reverse);
            reverse -= 1;


            if (reverse < 2) {
                reverse = 11;

                int digito = (cpfAccumulator % 11);

                if (digito < 2) {
                    validador2 = 0;
                } else if (digito >= 2) {
                    validador2 = 11 - digito;
                } else {
                    valido2 = false;
                }
            }

        }

        if (valido1 && valido2) {
                System.out.println("CPF valido!");
                return true;
        }else{
                System.out.println("CPF invalido!");
                return false;
        }
    }

}
