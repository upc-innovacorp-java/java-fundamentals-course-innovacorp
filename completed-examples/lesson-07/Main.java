public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Mia"};
        System.out.println("Cantidad de nombres: " + nombres.length);
        for (int indice = 0; indice < nombres.length; indice++) {
            String nombreActual = nombres[indice];
            System.out.println("Nombre: " + nombreActual);
        }
        String mensaje = "Aprender Java es divertido";
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Cantidad de caracteres: " + mensaje.length());
    }
}
