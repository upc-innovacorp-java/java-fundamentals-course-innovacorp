# Lección 7: Arreglos, cadenas de texto y buenas prácticas

**Objetivo:** Utilizar arreglos y cadenas de texto dentro de un programa básico basado en programación orientada a objetos.

### Desarrollo del video

**Introducción:** Explicar que los arreglos permiten almacenar varios valores y que las cadenas de texto permiten trabajar con información escrita.

**Explicación:**

- Arreglos: almacenan varios elementos del mismo tipo.
- Índices: permiten acceder a cada elemento y comienzan desde cero.
- `length`: permite conocer la cantidad de elementos.
- `String`: permite almacenar y manipular textos.
- Buenas prácticas: utilizar nombres descriptivos, ordenar el código y revisar errores.

**Demostración:** Crear un pequeño registro de estudiantes que integre clases, objetos, arreglos y cadenas de texto.

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

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("Ana", 16),
            new Estudiante("Carlos", 17),
            new Estudiante("Lucia", 15)
        };

        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i].mostrarDatos();
        }

        String curso = "Fundamentos de Java";
        System.out.println(curso.toUpperCase());
    }
}
```

Explicar cómo el arreglo almacena objetos de tipo `Estudiante`, cómo el ciclo recorre sus elementos y cómo `toUpperCase()` transforma el texto.

### Actividad práctica

Agregar un nuevo estudiante al arreglo modificando el código. Después, mostrar su información y cambiar el texto del nombre del curso.

### Conclusiones

- Los arreglos permiten almacenar varios elementos.
- Los objetos pueden organizarse dentro de arreglos.
- Las cadenas de texto ofrecen métodos para manipular información.
- Las buenas prácticas ayudan a mantener programas claros y ordenados.
- La programación orientada a objetos permite construir programas que integran diferentes conceptos de Java.

### Enlaces

- **Video:** Pendiente de agregar.
- **Práctica JDoodle:** Pendiente de agregar.
- **Archivo inicial:** `starter-files/lesson-07/Main.java`
- **Ejemplo resuelto:** `completed-examples/lesson-07/Main.java`