public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Sofia", 15);
        Estudiante estudiante2 = new Estudiante("Lucas", 16);
        estudiante1.mostrarDatos();
        estudiante2.mostrarDatos();
    }
}
class Estudiante {
    private String nombre;
    private int edad;
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("----------------");
    }
}
