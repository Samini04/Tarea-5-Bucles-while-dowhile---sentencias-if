import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // las variables
        int num = 0;
        int negativos = 0;
        int postivios = 0;

        do {
            System.out.println ("Introduce un número (0 para terminar):");
            num = sc.nextInt();

            if (num < 0) {
                negativos++;
            }
            else if (num > 0) {
                postivios++;
            }
        } while (num != 0); // El ciclo se repite mientras el número no sea 0

           // Mensaje final mostrando los resultados
            System.out.println("Has introducido " + negativos + " número negativos y " + postivios + " números positivos ");

    }
}
