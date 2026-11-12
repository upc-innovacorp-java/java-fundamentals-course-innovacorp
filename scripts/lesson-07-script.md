# Lección 7: Arreglos, cadenas de texto y buenas prácticas en Java

**Tema:** Arreglos, cadenas de texto y buenas prácticas.  
**Herramienta:** JDoodle.

## 1. Objetivo

Aprender a almacenar varios datos en arreglos, manipular cadenas de texto y reconocer buenas prácticas de programación.

## 2. Introducción

**Texto en pantalla:** ¿Cómo podemos almacenar varios datos?

**Narración:**

¡Hola! Bienvenidos a nuestra última lección del curso.

Hasta ahora hemos aprendido a trabajar con variables, operadores, estructuras de control, métodos y objetos.

Pero ¿qué sucede cuando necesitamos almacenar muchos valores relacionados? Por ejemplo, las notas de varios estudiantes.

Para resolverlo utilizamos arreglos.

## 3. ¿Qué es un arreglo?

**Texto en pantalla:** Un arreglo almacena varios valores del mismo tipo.

**Código en pantalla:**

```java
public class Main {
    public static void main(String[] args) {
        int[] notas = {15, 18, 16, 20, 14};

        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);
    }
}
```

**Narración:**

Un arreglo permite guardar varios elementos del mismo tipo de dato utilizando un solo nombre.

En Java, las posiciones comienzan desde el índice cero. Por eso `notas[0]` accede al primer elemento.

## 4. Recorrer un arreglo

**Texto en pantalla:** Utilizamos for para recorrer los elementos.

**Código en pantalla:**

```java
public class Main {
    public static void main(String[] args) {
        int[] notas = {15, 18, 16, 20, 14};

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota: " + notas[i]);
        }
    }
}
```

**Narración:**

La propiedad `length` nos indica cuántos elementos tiene el arreglo.

El ciclo comienza en cero y continúa mientras el índice sea menor que la cantidad de elementos.

## 5. Cadenas de texto

**Texto en pantalla:** String permite trabajar con textos.

**Código en pantalla:**

```java
public class Main {
    public static void main(String[] args) {
        String mensaje = "Aprender Java";

        System.out.println(mensaje);
        System.out.println(mensaje.length());
        System.out.println(mensaje.toUpperCase());
        System.out.println(mensaje.toLowerCase());
    }
}
```

**Narración:**

El tipo `String` permite almacenar textos.

El método `length` devuelve la cantidad de caracteres. `toUpperCase` convierte el texto a mayúsculas y `toLowerCase` lo convierte a minúsculas.

## 6. Buenas prácticas

**Texto en pantalla:**

- Utiliza nombres descriptivos.
- Mantén tu código ordenado.
- Respeta las mayúsculas y minúsculas.
- Revisa los índices de los arreglos.
- Comprueba los mensajes de error.

**Narración:**

Para escribir buenos programas debemos seguir algunas recomendaciones.

Utiliza nombres que expliquen qué almacena cada variable. Mantén una buena organización y utiliza sangrías para facilitar la lectura.

También recuerda que Java diferencia las letras mayúsculas y minúsculas. Finalmente, revisa los índices de los arreglos para evitar acceder a posiciones que no existen.

## 7. Actividad práctica

**Texto en pantalla:** Reto final: administra las notas.

**Narración:**

Crea un arreglo que almacene cinco notas de estudiantes. Utiliza un ciclo `for` para mostrar cada nota y calcular el promedio.

Después crea una variable de tipo String con el nombre del curso y muestra su cantidad de caracteres.

**Código de referencia:**

```java
public class Main {
    public static void main(String[] args) {
        int[] notas = {15, 18, 16, 20, 14};
        int suma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota: " + notas[i]);
            suma += notas[i];
        }

        double promedio = (double) suma / notas.length;
        String curso = "Programacion Java";

        System.out.println("Promedio: " + promedio);
        System.out.println("Curso: " + curso);
        System.out.println("Cantidad de caracteres: " + curso.length());
    }
}
```

## 8. Cierre del curso

¡Felicitaciones! Has llegado al final de nuestro curso de Fundamentos de Java para Principiantes.

Durante estas siete lecciones aprendimos qué es la programación, cómo utilizar variables y operadores, cómo tomar decisiones, crear métodos, trabajar con objetos y manipular arreglos y cadenas de texto.

Ahora tienes una base para continuar aprendiendo Java y desarrollar tus propios programas.

Recuerda que la mejor manera de aprender a programar es practicando, experimentando y aprendiendo de los errores.

¡Gracias por acompañarnos y muchos éxitos en tu camino como programador!

## 9. Recursos

- Editor: [JDoodle](https://www.jdoodle.com/online-java-compiler/)
- Archivo inicial: `starter-files/lesson-07/Main.java`
- Ejemplo resuelto: `completed-examples/lesson-07/Main.java`
- Práctica: [AGREGAR ENLACE JDoodle DE LA LECCIÓN 7]