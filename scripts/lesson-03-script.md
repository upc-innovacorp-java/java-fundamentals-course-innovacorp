# Lección 3: Operadores y expresiones

**Objetivo:** Utilizar operadores para realizar cálculos, comparar valores y combinar condiciones.

### Desarrollo del video

**Introducción:** Explicar que los programas pueden realizar operaciones matemáticas y comprobar condiciones.

**Explicación:** Presentar los operadores:

- Aritméticos: `+`, `-`, `*`, `/`, `%`.
- Relacionales: `>`, `<`, `>=`, `<=`, `==`, `!=`.
- Lógicos: `&&`, `||`, `!`.

**Demostración:** Mostrar un ejemplo de compra:

```java
public class Main {
    public static void main(String[] args) {
        double precio1 = 15.0;
        double precio2 = 9.50;

        double subtotal = precio1 + precio2;
        double descuento = subtotal * 0.10;
        double total = subtotal - descuento;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total: " + total);

        System.out.println(total > 20);
        System.out.println(total > 20 && descuento > 0);
    }
}
```

Explicar cómo se suman los precios, se calcula el descuento y se comparan los resultados. Aclarar que `&&` representa AND y exige que ambas condiciones sean verdaderas.

### Actividad práctica

Modificar los precios y el porcentaje de descuento. Comprobar si el total supera los 20 soles.

### Conclusiones

- Los operadores aritméticos permiten realizar cálculos.
- Los operadores relacionales comparan valores.
- Los operadores lógicos permiten combinar condiciones.

### Enlaces

- **Video:** https://youtu.be/oE_QpTh7jp8
- **Práctica JDoodle:** https://www.jdoodle.com/ia/jd2p-tudv-vdfc
- **Archivo inicial:** `starter-files/lesson-03/Main.java`
- **Ejemplo resuelto:** `completed-examples/lesson-03/Main.java`