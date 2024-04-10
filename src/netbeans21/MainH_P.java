
package herenciaypolimorfismo;


public class MainH_P {
    public static void main(String[] args) {
        EmpleadoH_P empleado = new EmpleadoH_P();
        
        empleado.setNombre("Este es el nombre del empleado");
        empleado.setEdad(30);
        empleado.setSexo('M');
        
        empleado.setNumeroEmpleado(1451);
        empleado.setPuesto("Ingeniero");
        empleado.setDepartamento("Sistemas");
        
        System.out.println("El número del empleado es: " + empleado.getNumeroEmpleado());
        System.out.println("El departamento del empleado es: " + empleado.getDepartamento());
        System.out.println("Nombre del empleado: " + empleado.getNombre());
        System.out.println("Puesto del empleado: " + empleado.getPuesto());
        System.out.println("La edad del empleado es: " + empleado.getEdad());
        System.out.println("El sexo del empleado es: " + empleado.getSexo());
        empleado.printMessage();
    }
 
}
