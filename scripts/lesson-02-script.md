# Lección 2: Variables y tipos de datos

**Objetivo:** Aprender a almacenar información utilizando variables y diferentes tipos de datos.

### Desarrollo del video

**Introducción:** Explicar que los programas necesitan guardar información, como nombres, edades y calificaciones.

**Explicación:** Presentar los tipos de datos principales:

- `int`: números enteros.
- `double`: números decimales.
- `String`: textos.
- `char`: un carácter.
- `boolean`: valores verdaderos o falsos.

**Demostración:** Escribir y ejecutar:

```java
public class Main {
    public static void main(String[] args) {
        String nombre = "Lucia";
        int edad = 15;
        double promedio = 17.5;
        char inicial = 'L';
        boolean matriculado = true;

        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(promedio);
        System.out.println(inicial);
        System.out.println(matriculado);
    }
}
```

Explicar cómo se declara cada variable y cómo se asigna y muestra su valor.

### Actividad práctica

Crear variables para almacenar el nombre, edad, estatura e inicial del estudiante, además de una variable que indique si le gusta programar. Mostrar todos los valores.

### Conclusiones

- Las variables permiten almacenar información.
- Cada variable tiene un tipo de dato.
- Java utiliza diferentes tipos para representar números, textos y valores lógicos.

### Enlaces

- **Video:** https://youtu.be/_RuN5bcLtig
- **Práctica JDoodle:** https://www.jdoodle.com/ia/7u6x-6ubx-zfzs
- **Archivo inicial:** `starter-files/lesson-02/Main.java`
- **Ejemplo resuelto:** `completed-examples/lesson-02/Main.java`