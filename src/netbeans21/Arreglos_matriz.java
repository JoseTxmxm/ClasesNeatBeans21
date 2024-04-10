package arreglos_matriz;

public class Arreglos_matriz {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        matriz[0][1] = 4;
        matriz[0][2] = 2;
        matriz[2][1] = 1;
        matriz[1][2] = 6;
        matriz[2][0] = 4;
        
        int filas, columnas;
        
        // Recorrer filas
        for (filas = 0; filas < matriz.length; filas++) {
            System.out.println("");
            // Recorrer columnas
            for (columnas = 0; columnas < matriz.length; columnas++) {
                System.out.print(matriz[filas][columnas] + " ");
                
            }
            
        }
    }
    
}
