import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables
        int num;
        int sumaPar = 0;
        int sumaImpar = 0;

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        int i = 1;

        // Suma de los números pares e impares usando do-while
        do {
            if (i % 2 == 0) {
                sumaPar += i;
            } else {
                sumaImpar += i;
            }
            i++; // Incrementamos el contador
        } while (i <= num); // Se ejecuta hasta llegar al número ingresado

        // Mostrar los resultados
        System.out.println("La suma de los números pares desde 1 hasta " + num + " es: " + sumaPar);
        System.out.println("La suma de los números impares desde 1 hasta " + num + " es: " + sumaImpar);
    }
}
