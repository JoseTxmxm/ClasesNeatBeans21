
package herenciaypolimorfismo;


public class EmpleadoH_P extends PersonaH_P {
    //Atributos
    private int numeroEmpleado;
    private String departamento;
    private String puesto;
    
    public EmpleadoH_P(){}

    public EmpleadoH_P(String nombre, int edad, char sexo, int numeroEmpleado, String departamento, String puesto) {
        super(nombre, edad, sexo);
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
        this.puesto = puesto;
    }
    
    @Override
    public void printMessage(){
        System.out.println("Soy un programador del área de sistemas");
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    
}
