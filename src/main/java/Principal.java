
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 1; i <= 5; i++) {
            int numero = leitor.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");

        leitor.close();

    }
}
