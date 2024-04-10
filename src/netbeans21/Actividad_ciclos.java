/* Escribir programa que solicite tu nombre completo y la calificación
obtenida en cada asignatura. Y como resultado devuelve tu nombre
y el promedio del semestre*/
package actividad_ciclos;
import java.util.Scanner;// Importación de librería Scanner

public class Actividad_ciclos {

    //public
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);// Creación de nuevo objeto Scanner
       
        /*Declaración de las variables para el almacenamiento de los
        datos del programa de la actividad_ciclos*/
        String nombre;// Variable nombre del alumno
        float nota = 0.0f, promedio = 0.0f, sumatoria = 0.0f;// Datos de notas
        
        // Solicitar nombre
        System.out.println("Ingrese su nombre completo: ");
        nombre = sc.nextLine();// Entrada y almacenamiento del nombre
                
        // Ciclo for para la iteración de las notas
        for(int i = 1; i <= 5; i++){
            System.out.println("Calificación obtenida de la materia: " + (i));
            nota = sc.nextFloat();// Entrada y almacenamiento de datos de las notas
             // Fórmula para promedio = sumatoria/número de notas
            sumatoria = sumatoria + nota;
            promedio = sumatoria / 5;
        }
            // Promedio = (nota1 + nota2 + nota3 + nota4 + nota5)/Cantidad de notas
            System.out.println("Nombre de alumno: " + nombre);// Salida de datos del nombre
            System.out.println("Promedio obtenido por el alumno: " + promedio);// Salida de datos del promedio
    }
    
}
