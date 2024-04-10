package condicionales_simples;
import java.util.Scanner;// Importacion de libreria Scanner
public class Condicionales_simples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Creacion de nuevo objeto Scanner
        
        // Declaracion de variables del programa
        int hora;// Declaracion de la variable hora
        int edad;// Declaracion de la variable edad
        int numero;// Declaracion de la variable numero
        int mes;// Declaracion de variable para almacenar mes
      
        
        // Entrada de datos para las variables del programa
        System.out.println("Ingrese su edad: ");// Ingrese la edad del usuario
        edad = sc.nextInt();// Almacenamiento de datos de las variables
        System.out.println("Ingrese la hora:");// Ingrese la hora de llegada
        hora = sc.nextInt();// Almacenamiento de datos de las variables
        System.out.println("Ingrese su numero:");
        numero = sc.nextInt();// Almacenamiento de datos de las variables
        System.out.println("Ingrese el numero debido al mes: ");
        mes = sc.nextInt();// Almacenamiento de datos de la variable
        
        // Nido de condicionales y sentencia switch para el programa:
        // Condicion 1
        //1 hora a 11 horas
        if(hora >= 1 && hora < 12){
            System.out.println("Buenos dias!\n");
            //12 horas a 17 horas
        }else if(hora >= 12 && hora < 18){
            System.out.println("Buenas tardes!\n");
            //18 horas a 24 horas
        }else if(hora >= 18 && hora < 24){
            System.out.println("Buenas noches!\n");
        }else{
            System.out.println("La hora que ingreso no existe\n");
        }
        // Condición 2
        System.out.println("Condicion 1");
        if(edad >= 5 && edad <= 10){
            System.out.println("Tu salon es el 1B\n");
        }else{
            System.out.println("Tu salon es el 1A\n");
        }
        
        // Condicion 3
        System.out.println("Condicion 2");
        if(edad >= 18){
            System.out.println("Eres mayor de edad\n");
        }else{
        System.out.println("Eres menor de edad\n");
        }
        // Condicion 3
        System.out.println("Condicion 3");
        if(numero > 0){
            System.out.println("El numero es positivo\n");
        }else if(numero < 0){
            System.out.println("El numero es negativo\n");
        }else{
            System.out.println("El numero es 0\n");
        }
        
        // Sentencias switch: ingresar el numero debido al mes
        // Instrucciones
        System.out.println("Sentencia switch");
        switch(mes){
            case 1:
                System.out.println("Su nombre corresponde a Enero");
                break;
            case 2:
                System.out.println("Su mes corresponde a Febrero");
                break;
            case 3:
                System.out.println("Su mes corresponde a Marzo");
                break;
            case 4:
                System.out.println("Su mes corresponde a Abril");
                break;
            case 5:
                System.out.println("Su mes corresponde a Mayo");
                break;
            case 6:
                System.out.println("Su mes corresponde a Junio");
            case 7:
                System.out.println("Su mes corresponde a Julio");
                break;
            case 8:
                System.out.println("Su mes corresponde a Agosto");
                break;
            case 9:
                System.out.println("Su mes corresponde a Septiembre");
                break;
            case 10:
                System.out.println("Su mes corresponde a Octubre");
                break;
            case 11:
                System.out.println("Su mes corresponde a Noviembre");
                break;
            case 12:
                System.out.println("Su mes corresponde a Diciembre");
                break;
            default:
                System.out.println("No se encontro el valor ingresado");
                break;
                    
        }
    }
}
