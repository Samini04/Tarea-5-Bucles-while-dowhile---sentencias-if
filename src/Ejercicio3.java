import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce números. Introduce 0 para finalizar.");
        int num=0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        do {
            System.out.println("Ingresa un número:");
            num = sc.nextInt();
            if (num != 0) {
                if (num > mayor) {
                    mayor = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
        } while (num != 0);

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        sc.close();
    }
}

