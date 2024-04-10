package operadores_asignación;


public class Operadores_asignación {

    public static void main(String[] args) {
        
        /*Asignaciones simples
        int a = 5;
        int b = 6;
        a = b;
        System.out.println("a =" + a);*/
        
        /*Segundo ejemplo
        int a = 5, b = 10, c = 3, d = 8;
        a = a + 4;
        b = b - 5;
        c = c * 3;
        d = d / 4;
        
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        System.out.println("c =" + c);
        System.out.println("d =" + d);*/
        
        //Tercer ejemplo, operaciones de asignación compuestas
        int a = 5, b = 10, c = 3, d = 8;
        a += 4;
        b -= 5;
        c *= 3;
        d /= 4;
        
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        System.out.println("c =" + c);
        System.out.println("d =" + d);
    }
    
}
