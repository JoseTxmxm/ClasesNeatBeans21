
package métodos;


public class Métodos_1met {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones_1met op = new Operaciones_1met();
        //Invocar método
        op.binevenido();
        //op.sumar(2,3);
        //op.restar(4, 5);
        //op.resultado();
        
        System.out.println("La suma es: " + op.sumar(3, 6));
        System.out.println("La resta es: " + op.restar(5, 6));
    }
    
}
