
package cuentabancaria;

import java.util.Scanner;
//Clase Principal
public class main_act {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----Cuenta de ahorros----");
        
        System.out.println("Ingrese el saldo inicial: ");
        float saldo_inicial = sc.nextFloat();
        
        CuentaAhorros_act cuenta1 = new CuentaAhorros_act(saldo_inicial);
        
        System.out.println("Ingrese la cantidad a consignar: ");
        float cantidad_depositar = sc.nextFloat();
        cuenta1.consignar(cantidad_depositar);
        
        System.out.println("Ingrese la cantidad a retirar: ");
        float cantidad_retirar = sc.nextFloat();
        cuenta1.retirar(cantidad_retirar);
        
        cuenta1.imprimir();
    }
   
}
