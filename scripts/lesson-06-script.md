# Lección 6: Programación orientada a objetos en Java

**Tema:** Clases, objetos, atributos, constructores y encapsulación.  
**Herramienta:** JDoodle.

## 1. Objetivo

Comprender los conceptos fundamentales de programación orientada a objetos y crear objetos a partir de clases.

## 2. Introducción

**Texto en pantalla:** ¿Qué es la programación orientada a objetos?

**Narración:**

¡Hola! En esta lección conoceremos la programación orientada a objetos, también conocida como POO.

Imaginemos que queremos desarrollar un programa para registrar estudiantes. Cada estudiante tiene información, como su nombre y edad, y también puede realizar acciones.

Java nos permite representar estos elementos mediante clases y objetos.

## 3. ¿Qué es una clase?

**Texto en pantalla:** Una clase es un modelo para crear objetos.

**Código en pantalla:**

```java
class Estudiante {
    String nombre;
    int edad;

    void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
```

**Narración:**

Una clase funciona como un molde que define las características y acciones de los objetos.

Aquí definimos dos atributos y un método. Los atributos almacenan información y el método representa una acción.

## 4. ¿Qué es un objeto?

**Texto en pantalla:** Un objeto es una instancia de una clase.

**Código en pantalla:**

```java
class Estudiante {
    String nombre;
    int edad;

    void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();

        estudiante1.nombre = "Ana";
        estudiante1.edad = 16;

        estudiante1.mostrarDatos();
    }
}
```

**Narración:**

Utilizamos `new` para crear un objeto de la clase Estudiante. Después asignamos sus valores y llamamos al método `mostrarDatos`.

## 5. Constructores

**Texto en pantalla:** El constructor inicializa un objeto.

**Código en pantalla:**

```java
class Estudiante {
    String nombre;
    int edad;

    Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void mostrarDatos() {
        System.out.println(nombre + " tiene " + edad + " años");
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Ana", 16);
        estudiante1.mostrarDatos();
    }
}
```

**Narración:**

Un constructor tiene el mismo nombre que la clase y permite inicializar sus atributos cuando creamos un objeto.

La palabra `this` permite referirnos al atributo del objeto actual.

## 6. Encapsulación

**Texto en pantalla:** Proteger los datos de nuestros objetos.

**Código en pantalla:**

```java
class Estudiante {
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.setNombre("Ana");

        System.out.println(estudiante.getNombre());
    }
}
```

**Narración:**

La encapsulación consiste en controlar el acceso a los atributos de una clase.

El atributo nombre es privado. Utilizamos `setNombre` para asignar el valor y `getNombre` para obtenerlo.

## 7. Actividad práctica

**Texto en pantalla:** Reto: crea tu propio estudiante.

Crea una clase llamada `Estudiante` con los atributos nombre y edad. Agrega un constructor y un método para mostrar la información. Después crea dos objetos diferentes.

## 8. Cierre

¡Muy bien! Hoy aprendimos qué son las clases y los objetos, cómo utilizar constructores y cómo proteger información mediante la encapsulación.

En la última lección aprenderemos a trabajar con arreglos y cadenas de texto.

## 9. Recursos

- Editor: [JDoodle](https://www.jdoodle.com/online-java-compiler/)
- Archivo inicial: `starter-files/lesson-06/Main.java`
- Ejemplo resuelto: `completed-examples/lesson-06/Main.java`
- Práctica: [AGREGAR ENLACE JDoodle DE LA LECCIÓN 6]