import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ultimoNumero = Integer.MIN_VALUE;
        int totalNumeros = 0;
        int fallos = 0;

        System.out.println("Introduce números. Introduce 0 para finalizar.");

        int numero; // Declarar la variable fuera del bucle
        do {
            System.out.print("Ingresa un número: ");
            numero = scanner.nextInt();

            if (numero != 0) { // Solo procesar si no es 0
                if (numero > ultimoNumero) {
                    ultimoNumero = numero;
                    totalNumeros++;
                } else {
                    System.out.println("Número no válido. Debe ser mayor que el último número dado: " + ultimoNumero);
                    fallos++;
                }
            }
        } while (numero != 0); // Continuar hasta que se ingrese 0

        System.out.println("Total de números introducidos (excluyendo el 0): " + totalNumeros);
        System.out.println("Total de números fallados: " + fallos);

        scanner.close();
    }
}
