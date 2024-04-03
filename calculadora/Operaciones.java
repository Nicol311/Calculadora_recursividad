package calculadora;
import java.util.Scanner;

class Operaciones {
//Suma
    public void suma(int num1, int num2) {
        System.out.println("\nEl resultado de la suma es: " + (num1 + num2));
    }
//Resta
    public void resta(int num1, int num2) {
        System.out.println("\nEl resultado de la resta es: " + (num1 - num2));
    }
//Multiplicación
    public void multiplicacion(int num1, int num2) {
        System.out.println("\nEl resultado de la multiplicación es: " + (num1 * num2));
    }
//División
    public void division(int num1, int num2, Scanner entrada) {
        int divisor = num2;
        if (divisor != 0) {
            double resultado = (double) num1 / divisor;
            System.out.println("\nEl resultado de la división es: " + resultado);
        } else {
            System.out.println("Error, no se puede dividir por cero!");
        }
    }
//Verificar si el numero es positivo
    public int entero_positivo(Scanner entrada) {
        int num;
        do {
            num = entrada.nextInt();
            if (num < 0) {
                System.out.print("Error, por favor ingrese un número entero positivo: ");
            }
        } while (num < 0);
        return num;
    }
//Verificar si los numeros son distintos
    public boolean numeros_distintos(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("Error, los números ingresados deben ser distintos!");
            return false;
        }
        return true;
    }
//Verificar si la palabra ingresada es un palíndromo
    public void palindromo(Scanner entrada) {
        System.out.print("Ingrese una palabra: ");
        if (entrada.hasNext("[a-zA-Z]+")) { // Verifica si la entrada son solo letras
            String palabra = entrada.next();
            if (es_palindromo(palabra.toLowerCase(), 0, palabra.length() - 1)) {
                System.out.println("\nLa palabra es un palíndromo!");
            } else {
                System.out.println("\nLa palabra no es un palíndromo!");
            }
        } else {
            entrada.next(); // Limpiar la entrada incorrecta
            System.out.println("\nDebe ingresar una palabra válida!");
        }
    }
// Recursividad para verificar si una palabra es un palíndromo
    private boolean es_palindromo(String palabra, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        }
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }
        return es_palindromo(palabra, inicio + 1, fin - 1);
    }
}
