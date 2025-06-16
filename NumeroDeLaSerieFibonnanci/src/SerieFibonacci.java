import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números de Fibonacci a generar: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, ingresa un número positivo mayor que cero.");
        } else {
            System.out.println("Serie de Fibonacci:");

            int a = 0, b = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(a + (i < n ? ", " : "\n"));
                int siguiente = a + b;
                a = b;
                b = siguiente;
            }
        }

        scanner.close();
    }
}
