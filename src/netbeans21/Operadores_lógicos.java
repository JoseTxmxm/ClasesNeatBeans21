package operadores_lógicos;

public class Operadores_lógicos {

    public static void main(String[] args) {
        //Primera variable
        boolean valor1 = true;
        //Segunda variable
        boolean valor2 = true;
        //Tercera variable
        boolean valor3 = true;
        //Cuarta variable
        boolean valor4 = false;
        
        //Operador lógico: &&
        System.out.println("Primer resultado " + (valor1 && valor2));//True
        System.out.println("Segundo resultado " + (valor3 && valor4));//False
        
        //Operador lógico: ||
        System.out.println("Tercer resultado " + (valor1 || valor2));//True
        System.out.println("Cuarto resultado " + (valor3 || valor4));//False
        
        //Operador lógico: !
        System.out.println("Quinto resultado " + (!valor1));//False
        System.out.println("Sexto resultado " + (!valor4));//True
        
        

    }
    
}
