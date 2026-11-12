# Lección 4: Estructuras de control

**Objetivo:** Aprender a tomar decisiones y repetir instrucciones utilizando estructuras de control.

### Desarrollo del video

**Introducción:** Explicar que los programas pueden decidir qué instrucciones ejecutar y repetir tareas automáticamente.

**Explicación:**

- `if` y `else`: permiten tomar decisiones.
- `for`: repite instrucciones una cantidad determinada de veces.
- `while`: repite instrucciones mientras se cumpla una condición.

**Demostración:** Ejecutar el siguiente ejemplo:

```java
public class Main {
    public static void main(String[] args) {
        int edad = 16;

        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Numero: " + i);
        }

        int contador = 1;

        while (contador <= 3) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}
```

Explicar cómo se evalúa la condición del `if`, cómo funciona el contador del `for` y por qué el `while` necesita actualizar su variable para terminar.

### Actividad práctica

Crear un programa que determine si una persona puede ingresar según su edad. Después, utilizar un ciclo `for` para mostrar los números del 1 al 10 y un ciclo `while` para mostrar los números del 1 al 5.

### Conclusiones

- `if` y `else` permiten ejecutar instrucciones según una condición.
- `for` permite repetir instrucciones una cantidad determinada de veces.
- `while` repite instrucciones mientras una condición sea verdadera.

### Enlaces

- **Video:** https://youtu.be/92fJsdaynhk?si=nM5Y3gj4EQ_HxvAk 
- **Práctica JDoodle:** https://www.jdoodle.com/ia/j9sf-ck9b-wx9z 
- **Archivo inicial:** `starter-files/lesson-04/Main.java`
- **Ejemplo resuelto:** `completed-examples/lesson-04/Main.java`