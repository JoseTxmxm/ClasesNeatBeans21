package arreglos_dinamicos;

import java.util.ArrayList;
import java.util.List;

public class Arreglos_dinamicos {

    public static void main(String[] args) {
        // array de tipo string
        System.out.println("Ejemplo 1");
        List<String> animales = new ArrayList<>();
        
        // agregar elementos al array
        animales.add("leon");
        animales.add("tigre");
        animales.add("gato");
        animales.add("perro");
        
        System.out.println("Primer array: " + animales);
        
        animales.add(4,"elefnate");
        
        System.out.println("Segundo array: " + animales);
        System.out.println("");
        System.out.println("Ejemplo 2");
        
        //Segundo ejemplo
        List<String> lenguajes_programacion = new ArrayList();
        
        lenguajes_programacion.add("c++");
        lenguajes_programacion.add("Python");
        lenguajes_programacion.add("Java");
        lenguajes_programacion.add("Ruby");
        
        System.out.println("Arreglo 1 " + lenguajes_programacion);
        
        // Remover elementos del indice
        lenguajes_programacion.remove(2);
        System.out.println("Lista sin el indice " + lenguajes_programacion); 
    }
}
