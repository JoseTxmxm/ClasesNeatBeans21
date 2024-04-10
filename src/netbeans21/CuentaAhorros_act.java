
package cuentabancaria;

public class CuentaAhorros_act extends Cuenta_act {
    
    private boolean activa;
    
    public CuentaAhorros_act(float saldo){
        super(saldo);
        //Si el saldo es mayor o igual a 10.000, entonces estará activa.
        activa = saldo > 10000;
    }
    
    //Sobreescribir los métodos de la clase padre
    @Override
    public void consignar(float cantidad){
        if(activa){
            super.consignar(cantidad);
        }
    }
    
    @Override
    public void retirar(float cantidad){
        if(activa){
            super.retirar(cantidad);
        }
    }
    
    //Imprimir detalles de la cuenta de ahorros
    public void imprimir(){
        System.out.println("Saldo = $" + saldo);
        System.out.println("Número de transacciones = " +
                (numero_consignaciones+numero_retiros));
    }
}
