public class Main {
    public static void main(String[] args) {
        int nota = 15;
        if (nota >= 11) {
            System.out.println("El estudiante aprobo.");
        } else {
            System.out.println("El estudiante desaprobo.");
        }
        for (int contador = 1; contador <= 5; contador++) {
            System.out.println("Numero: " + contador);
        }
        int intentos = 1;
        while (intentos <= 3) {
            System.out.println("Intento: " + intentos);
            intentos++;
        }
    }
}
