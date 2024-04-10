
package métodos;


public class Operaciones_1met {
    /*Atributos
    int numero1 = 2;
    int numero2 = 4;*/
    int suma, resta;
    
    public void binevenido(){
        System.out.println("Bienvenido");
    }
    //Parámetros opcionales
    public int sumar(int numero1, int numero2){
        suma = numero1 + numero2;
        return suma;
    }
    //Parámetros opcionales
    public int restar(int numero1, int numero2){
        resta = numero1 - numero2;
        return resta;
    }
    
    public void resultado(){
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
    }
}
