package calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        int opcion;
        do {
            System.out.println("\n===Calculadora Java===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Palíndromo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("\nIngrese el primer número: ");
                int num1 = operaciones.entero_positivo(entrada);
                System.out.print("Ingrese el segundo número: ");
                int num2 = operaciones.entero_positivo(entrada);

                if (operaciones.numeros_distintos(num1, num2)) {
                    switch (opcion) {
                        case 1:
                            operaciones.suma(num1, num2);
                            break;
                        case 2:
                            operaciones.resta(num1, num2);
                            break;
                        case 3:
                            operaciones.multiplicacion(num1, num2);
                            break;
                        case 4:
                            operaciones.division(num1, num2, entrada);
                            break;
                    }
                }
            } else if (opcion == 5) {
                operaciones.palindromo(entrada);
            } else if (opcion != 6) {
                System.out.println("\nOpción no válida!");
            }
        } while (opcion != 6);

        entrada.close();
        System.out.println("\nFin del programa!\n");
    }
}

