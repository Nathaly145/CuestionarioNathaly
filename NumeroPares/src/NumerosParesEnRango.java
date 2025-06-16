import java.util.Scanner;

public class NumerosParesEnRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de inicio del rango (positivo): ");
        int inicio = scanner.nextInt();

        System.out.print("Ingresa el número final del rango (positivo): ");
        int fin = scanner.nextInt();

        if (inicio <= 0 || fin <= 0 || inicio > fin) {
            System.out.println("Rango inválido. Asegúrate de que ambos números sean positivos y que inicio sea menor o igual que fin.");
        } else {
            System.out.println("Números pares en el rango de " + inicio + " a " + fin + ":");
            for (int i = inicio; i <= fin; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
