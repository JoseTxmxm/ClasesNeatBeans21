
package actividad_condicionales;
import java.util.Scanner;

public class Actividad_condicionales {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       String nombre;
       float valor_compra, descuento = 0, precio_final = 0;
       
        System.out.println("Ingrese el nombre del cliente: ");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese el valor de la compra: ");
        valor_compra = sc.nextFloat();
        
        if(valor_compra < 80){
            descuento = 0;
            
        }else if(valor_compra < 80 && valor_compra <= 170 ){
            descuento = (float) 0.1;
        }else if(valor_compra > 170 && valor_compra < 350){
            descuento = (float)0.15f;
        }else if(valor_compra > 350 && valor_compra < 600){
            descuento = (float)0.2;
        }
        
        precio_final = valor_compra - (valor_compra*descuento);
        
        System.out.println(
                "Nombre del cliente: " + nombre + "\n" +
                "valor de compra: " + valor_compra + "\n" +
                "Valor de compra con descuento: " + precio_final);
    }
    
}
