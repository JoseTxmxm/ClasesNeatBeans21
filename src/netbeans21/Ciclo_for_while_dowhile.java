
package ciclo_for_while_dowhile;
import java.util.Scanner;// Importación de la librería Scanner

public class Ciclo_for_while_dowhile {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Creación de nuevo objeto Scanner
        
        // Ciclo for
        // Ejemplo 1, código para imprimir numeros del 1 al 10
        System.out.println("Ciclo for, ejemplo 1, impresion de numero hasta el 10");
        for(int i = 0; i <= 10; i++){
            // Instrucciones
            System.out.println("Numero:" + i);
        }
        System.out.println("");
        // Ejemplo 2, tabla de multiplicar del 4
        System.out.println("Ciclo for, Ejemplo: tabla del 4");
        for(int a = 1; a <= 10; a++){
            System.out.println("Número: " + a * 4);
        }
        System.out.println("");
        // Ciclo while
        System.out.println("Ciclo while");
        int x = 1;
        while(x <= 5){
            System.out.println("El valor de x:" + x);
            x++;/*No olvidar el incremento de la 
            variable (x) en este ciclo*/
        }
        System.out.println("");
        // Ciclo do while
        System.out.println("Ejemplo do while");
        int b = 0;
        do{
            // Instrucciones
            System.out.println("El numero es: " + b);
            b++;
        }while(b <= 5);
    }
    
}
