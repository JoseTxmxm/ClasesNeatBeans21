package arreglos_multidimensionales;

public class Arreglos_multidimensionales {

    public static void main(String[] args) {
     // Declarar e inicializar array matriz
     int [][] numeros = new int [3][3];
     int i,j;
     numeros[0][1] = 5;
     
     // Recorrer filas
        for (i = 0; i < numeros.length; i++) {
            System.out.println();            
            
            // Recorrer columnas
            for (j = 0; j < numeros.length; j++) {
                // Imprimir el valor de la matriz en el valor actual
                System.out.print(numeros[i][j] + " ");
            }
        }
    }
}
