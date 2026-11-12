# Lección 1: Introducción a la programación y primeros pasos con Java

**Duración:** 5:19  
**Tema:** Introducción a la programación y Java.  
**Herramienta:** JDoodle.

## 1. Objetivo

Comprender qué es la programación, conocer el lenguaje Java y ejecutar el primer programa.

## 2. Introducción

**Texto en pantalla:** ¿Qué es programar?

**Narración:**

¡Hola! Bienvenidos a nuestro curso de Fundamentos de Java para Principiantes.

¿Alguna vez te has preguntado cómo sabe una computadora qué hacer cuando abrimos un juego o utilizamos una aplicación?

La respuesta está en la programación. Programar significa darle instrucciones a una computadora para que realice determinadas tareas. Podemos compararlo con una receta: seguimos una serie de pasos para conseguir un resultado.

## 3. Conociendo Java

**Texto en pantalla:** Java: un lenguaje de programación.

**Narración:**

Java es un lenguaje de programación que permite crear diferentes tipos de aplicaciones y sistemas. Nos permite escribir instrucciones para que una computadora realice determinadas tareas.

## 4. Demostración: primer programa

**Texto en pantalla:** Nuestro primer programa: ¡Hola, mundo!

**Narración:**

Ahora vamos a escribir nuestro primer programa. Utilizaremos JDoodle, un editor que funciona directamente desde el navegador. No necesitamos instalar nada.

Ingresamos a JDoodle, seleccionamos Java y escribimos el siguiente código.

**Código en pantalla:**

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");
    }
}
```

**Narración:**

La palabra `class` permite definir una clase llamada Main. El método `main` es el punto de inicio de nuestro programa.

Finalmente, `System.out.println` permite mostrar un mensaje en pantalla.

Presionamos Execute y observamos el resultado: ¡Hola, mundo!

## 5. Actividad práctica

**Texto en pantalla:** Tu primer reto.

**Narración:**

Ahora modifica el mensaje para que aparezca tu nombre y una frase que te guste.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, soy Ana");
        System.out.println("Estoy aprendiendo Java");
    }
}
```

Pausa el video, realiza el cambio y ejecuta tu programa.

## 6. Cierre

¡Excelente trabajo! Hoy aprendimos qué es la programación, conocimos Java y ejecutamos nuestro primer programa.

En la siguiente lección aprenderemos a utilizar variables y tipos de datos.

## 7. Recursos

- Editor: [JDoodle](https://www.jdoodle.com/online-java-compiler/)
- Archivo inicial: `starter-files/lesson-01/Main.java`
- Ejemplo resuelto: `completed-examples/lesson-01/Main.java`
- Video: https://youtu.be/8yNBXAotnqU