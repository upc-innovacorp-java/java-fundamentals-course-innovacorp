# Lección 5: Métodos, parámetros y entrada de datos

**Objetivo:** Crear métodos reutilizables y recibir información ingresada por el usuario.

### Desarrollo del video

**Introducción:** Explicar que los métodos permiten organizar las instrucciones y reutilizar código.

**Explicación:**

- Métodos: agrupan instrucciones para realizar una tarea.
- Parámetros: permiten enviar información a un método.
- `return`: devuelve un resultado.
- `Scanner`: permite recibir datos desde la consola.

**Demostración 1:** Crear un método para sumar dos números.

```java
public class Main {
    static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultado = sumar(5, 3);
        System.out.println("Resultado: " + resultado);
    }
}
```

Explicar cómo se envían los parámetros y cómo se devuelve el resultado.

**Demostración 2:** Leer información con Scanner.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Hola, " + nombre);

        entrada.close();
    }
}
```

Explicar cómo `Scanner` recibe el texto ingresado por el usuario mediante `nextLine()`.

### Actividad práctica

Crear un método que calcule el doble de un número y solicitar al usuario el número mediante Scanner. Mostrar el resultado.

### Conclusiones

- Los métodos permiten reutilizar instrucciones.
- Los parámetros permiten enviar información.
- `return` devuelve resultados.
- `Scanner` permite recibir información del usuario.

### Enlaces

- **Video:** Pendiente de agregar.
- **Práctica JDoodle:** Pendiente de agregar.
- **Archivo inicial:** `starter-files/lesson-05/Main.java`
- **Ejemplo resuelto:** `completed-examples/lesson-05/Main.java`