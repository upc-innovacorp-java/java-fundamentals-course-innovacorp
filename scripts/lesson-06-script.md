# Lección 6: Programación orientada a objetos

**Objetivo:** Comprender las clases, los objetos, los constructores y la encapsulación.

### Desarrollo del video

**Introducción:** Explicar que la programación orientada a objetos permite representar elementos del mundo real mediante clases y objetos.

**Explicación:**

- Clase: modelo que define atributos y métodos.
- Objeto: instancia de una clase.
- Constructor: inicializa un objeto.
- Encapsulación: permite proteger los atributos mediante el control de acceso.

**Demostración:** Crear una clase `Estudiante`:

```java
class Estudiante {
    private String nombre;
    private int edad;

    Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarDatos() {
        System.out.println(nombre + " - " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Ana", 16);

        estudiante.setNombre("Lucia");

        System.out.println(estudiante.getNombre());
        estudiante.mostrarDatos();
    }
}
```

Explicar cómo se define la clase, se crea un objeto con el constructor y se utilizan `private`, `getNombre()` y `setNombre()` para controlar el acceso al atributo.

### Actividad práctica

Crear una clase `Producto` con atributos privados `nombre` y `precio`. Agregar un constructor, métodos getter y setter, y crear un objeto para mostrar sus datos.

### Conclusiones

- Las clases definen las características y comportamientos de los objetos.
- Los objetos son instancias de una clase.
- Los constructores inicializan los objetos.
- La encapsulación protege los atributos mediante métodos de acceso.

### Enlaces

- **Video:** Pendiente de agregar.
- **Práctica JDoodle:** Pendiente de agregar.
- **Archivo inicial:** `starter-files/lesson-06/Main.java`
- **Ejemplo resuelto:** `completed-examples/lesson-06/Main.java`