package arreglos_java;

public class Arreglos_java {

    public static void main(String[] args) {
        //Arreglos unidimensionales
        System.out.println("Arreglo unidimensional, ejemplo 1");
        int notas[] = new int[5];// Declarar e inicializar array
        
        notas[0] = 4;
        notas[1] = 5;
        notas[2] = 6;
        notas[3] = 7;
        notas[4] = 8;
        System.out.println("El número es: " + notas[0]);
        System.out.println("");
        
        // Ejemplo 2
        System.out.println("Arreglo unidimensional, ejemplo 2");
        int notas1[] = {5,6,7,8,9};// Declarar e inicializar array
        
        // Recorrer arreglo
        for(int a = 0; a < notas1.length; a++){
            System.out.println("Notas: " + notas1[a]);
        }
    }
}

