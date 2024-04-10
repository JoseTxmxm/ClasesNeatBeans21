
public class Main_enc1 {
    public static void main(String[] args) {
        Animal_enc1 perro = new Animal_enc1();
        perro.setNombre("Tony");
        perro.setEdad(2);
        perro.setRaza("Dalmata");
        
        System.out.println("El nombre del perro es: " + perro.getNombre() +
                "\n La edad es: " + perro.getEdad() +
                "\n La raza es: " + perro.getRaza());
    }
}
