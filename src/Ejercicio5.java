import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos numeros iniciales:");
        System.out.println("Numero 1:");
        int num1= sc.nextInt();

        System.out.println("Numero 2:");
        int num2= sc.nextInt();

        System.out.println("Introduce el limte:");
        int limite = sc.nextInt();

        int contador =2;
        System.out.println("Serie de suma:"+ num1+num2);

        do {
            int nextNum = num1 + num2;
            System.out.print(" " + nextNum);

            // Actualizar los valores para la próxima iteración
            num1 = num2;
            num2 = nextNum;
            contador++;
        } while (contador < limite);

        sc.close();

    }
}
