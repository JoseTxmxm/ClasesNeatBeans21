package actividad_operadores;
import java.util.Scanner;//Importacion de la libreria Scanner

public class Actividad_operadores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Creacion de un objeto Scanner
        
        int primer_numero, segundo_numero;
        System.out.println("Ingresa el primer numero: ");
        primer_numero = sc.nextInt();//Para guardar el valor de esta variable
        
        System.out.println("Ingresa el segundo numero: ");
        segundo_numero = sc.nextInt();//Para guardar el valor de la segunda variable
        
        //Suma
        System.out.println(primer_numero + segundo_numero);
        //Multiplicacion
        System.out.println(primer_numero * segundo_numero);
        //¿Son iguales?
        System.out.println(primer_numero == segundo_numero);
        //¿El primer mumero es menor que el segundo?
        System.out.println(primer_numero < segundo_numero);
        //¿El segundo numero es mayor o igual que el primero?
        System.out.println(segundo_numero >= primer_numero);

    }
    
}
