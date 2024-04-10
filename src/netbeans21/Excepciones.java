
package excepciones;


public class Excepciones {

   
    public static void main(String[] args) {
        try{
            System.out.println("Intentamos ejecutar el bloque");
            System.out.println("Instruccion 1");
            System.out.println("Instruccion 2");
            System.out.println("Instruccion 3, etc...");
            /*Error provocado
            int n = integer.parse('N');*/
            
        }catch(Exception e){
            System.out.println("El error es: " + e);
            
            }finally{
            System.out.println("Instrucciones finalizadas");
        }
    }
}
//Como no encuentra un error pasa al finally
//Provocando un error pasa al catch