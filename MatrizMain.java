import java.util.Scanner;  //Scanner para leer las entradas

public class MatrizMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Objeto "entrada" para leer las entradas
        
        int opcion; //variable "opcion"
        do {  //bucle do-while
            System.out.println("\n---------Menú---------");
            System.out.println("1. Generar una matriz de 4x4, con la diagonal principal");
            System.out.println("2. Generar una matriz de 4x4, con la triangular inferior izquierda");
            System.out.println("3. Generar una matriz de 4x4, con la triangular superior derecha");
            System.out.println("4. Salir");
            System.out.print("Seleccione el número de la opción: ");
            opcion = entrada.nextInt(); //Las entradas del menu se guardan en la variable "opcion"
            
            switch (opcion) { //switch para escojer entre las funciones de mas abajo y mostrar la matriz
                case 1:
                    imprimirMatriz(Diagonal_Principal());
                    break;
                case 2:
                    imprimirMatriz(Triangular_Inferior_Izquierda());
                    break;
                case 3:
                    imprimirMatriz(Triangular_Superior_Derecha());
                    break;
                case 4:
                    System.out.println("Fin del programa.");
                    break;
                default: //default si es que ninguno de los casos anteriores coincide
                    System.out.println("\nOpción inválida. Por favor, seleccione un número válido.");
                    break;
            }
        } while (opcion != 4);
        
        entrada.close(); //cierra las entradas del usuario
    }
    
    public static void imprimirMatriz(int[][] matriz) { //metodo "imprimirMatriz", no devueleve nada (void), imprime una matriz
        for (int i = 0; i < matriz.length; i++) {  //bucle for que itera sobre las filas de la matriz //matriz.length devuelve el número de filas de la matriz. //cada iteración de "i" representa el índice de la fila actual
            for (int j = 0; j < matriz[i].length; j++) { //segundo bucle for que itera sobre las columnas de la matriz. //matriz[i].length dice cuántas columnas hay en la fila actual, entonces, este bucle va de columna en columna, dentro de cada fila
                System.out.print(matriz[i][j] + " ");  //añade un espacio después de imprimr el número en la celda
            }
            System.out.println(); //línea en blanco
        }
    }
    
    public static int[][] Diagonal_Principal() { //metodo para imprimir matriz 4x4 con la diasgonal principal solo con unos
        int[][] matriz = new int[4][4]; //matriz de int enteros 4x4
        for (int i = 0; i < 4; i++) { //bucle para iterar sobre las filas de la matriz, desde la primera (índice 0) hasta la cuarta (índice 3)
            matriz[i][i] = 1; //para colocar un 1 en la diagonal principal de la matriz
        }
        return matriz;
    }
    
    public static int[][] Triangular_Inferior_Izquierda() {  //metodo para imprimir matriz 4x4 con la parte triangular inferior izquierda solo con unos
        int[][] matriz = new int[4][4]; //matriz de enteros 4x4
        for (int i = 0; i < 4; i++) { //bucles para recorrer las filas y columnas de la matriz
            for (int j = 0; j < i; j++) { //En cada iteración, el bucle interior (j) se ejecuta desde 0 hasta el valor actual de (i)
                matriz[i][j] = 1; //para colocar 1 en todas las celdas que están en la parte triangular inferior izquierda de la matriz
            }
        }
        return matriz;
    }
    
    public static int[][] Triangular_Superior_Derecha() {  //metodo para imprimir matriz 4x4 con la parte triangular superior derecha solo con unos
        int[][] matriz = new int[4][4]; //matriz de enteros 4x4
        for (int i = 0; i < 4; i++) { //bucles para recorrer las filas y columnas de la matriz
            for (int j = i + 1; j < 4; j++) { // En cada iteración, el bucle interior (j) se ejecuta desde i + 1 hasta el 3
                matriz[i][j] = 1; //para colocar 1 en todas las celdas que están en la parte triangular superior derecha de la matriz.
            }
        }
        return matriz; //devuelve la matriz
    }
}
