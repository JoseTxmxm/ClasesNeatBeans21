
package actividad_estructura_datos;
import java.util.Scanner;

public class Actividad_estructura_datos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crear dos arreglos
        String[] empleados = new String[5];
        double[] sueldos = new double[5];
        
        //Definir variables
        double sumatoria = 0.0, promedio = 0.0, mayor = 0.0;
        int posicion = 0;
        
        //Solicitar datos
        for(int i = 0; i < 5; i++){
            System.out.println("Ingrese un nombre: ");
            empleados[i] = sc.next();
            
            System.out.println("Ingrese el sueldo del empleado: " + empleados[i]);
            sueldos[i] = sc.nextDouble();
            
            //Sumar los numeros ingresados
            sumatoria = sumatoria + sueldos[i];
        }
        //Obtener promedio
        promedio = sumatoria / 5;
        //Suponer que el numero mayor es el primero que se ingreso
        mayor = sueldos[0];
        
        for(int r = 0; r < sueldos.length; r++){
            
            //Obtener numero mayor
            if(sueldos[r] > mayor){
                mayor = sueldos[r];
                posicion = r;
            }
        }
        System.out.println(empleados[posicion] +
                " es el empleado con mayor sueldo y gana: " + mayor);
        System.out.println("El promedio de sueldos es: " + promedio);
        
    }
    
}
