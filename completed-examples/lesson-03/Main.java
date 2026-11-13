public class Main {
    public static void main(String[] args) {
        double subtotal = 24.50;
        double tasaDescuento = 0.10;
        double descuento = subtotal * tasaDescuento;
        double total = subtotal - descuento;
        boolean tieneDescuento = subtotal >= 20;
        boolean compraGrande = subtotal > 30;
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total: " + total);
        System.out.println("¿Tiene descuento?: " + tieneDescuento);
        System.out.println("¿Compra grande?: " + compraGrande);
        System.out.println("¿Ambas condiciones?: " + (tieneDescuento && compraGrande));
    }
}
