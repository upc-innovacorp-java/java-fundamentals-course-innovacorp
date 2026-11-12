# Lección 2: Variables y tipos de datos en Java

**Duración:** 9:34  
**Tema:** Variables y tipos de datos.  
**Herramienta:** JDoodle.

## 1. Objetivo

Aprender a declarar variables y utilizar los principales tipos de datos en Java.

## 2. Introducción

**Texto en pantalla:** ¿Cómo almacena información un programa?

**Narración:**

¡Hola nuevamente! En esta lección aprenderemos qué son las variables y los tipos de datos en Java.

Imaginemos que estamos creando un programa para registrar información de un estudiante. Necesitamos guardar su nombre, edad y promedio. Para eso utilizamos variables.

## 3. ¿Qué es una variable?

**Texto en pantalla:** Una variable almacena información.

**Narración:**

Una variable es un espacio en la memoria que utilizamos para guardar un dato. Podemos imaginarla como una caja que tiene un nombre y contiene información.

En Java indicamos el tipo de dato, el nombre de la variable y el valor que queremos guardar.

## 4. Tipos de datos

**Texto en pantalla:**

- `int`: números enteros.
- `double`: números decimales.
- `char`: un carácter.
- `String`: texto.
- `boolean`: verdadero o falso.

**Narración:**

El tipo `int` permite guardar números enteros, como una edad.

`double` permite guardar números decimales, como un promedio.

`char` almacena un carácter.

`String` permite almacenar textos.

Finalmente, `boolean` almacena los valores true o false.

## 5. Demostración práctica

**Texto en pantalla:** Creando nuestras primeras variables.

**Código en pantalla:**

```java
public class Main {
    public static void main(String[] args) {
        String nombre = "Lucia";
        int edad = 15;
        double promedio = 17.5;
        char inicial = 'L';
        boolean matriculado = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Inicial: " + inicial);
        System.out.println("Matriculado: " + matriculado);
    }
}
```

**Narración:**

Observemos que cada variable tiene un nombre y un tipo de dato.

Utilizamos el signo igual para asignar un valor. Después, con `System.out.println`, mostramos la información en pantalla.

Ejecutemos el programa y observemos los resultados.

## 6. Modificar una variable

**Narración:**

También podemos cambiar el valor de una variable durante la ejecución del programa.

```java
int edad = 15;
edad = 16;

System.out.println(edad);
```

Primero guardamos el valor 15 y después lo cambiamos a 16.

## 7. Actividad práctica

**Texto en pantalla:** Reto: presenta tus datos.

**Narración:**

Crea un programa que almacene tu nombre, edad, estatura y si te gusta programar.

Utiliza `String`, `int`, `double` y `boolean`. Después muestra toda la información en pantalla.

## 8. Cierre

¡Muy bien! Hoy aprendimos qué son las variables, cómo declararlas y cuáles son algunos de los tipos de datos más utilizados en Java.

En la siguiente lección conoceremos los operadores y aprenderemos a realizar operaciones con nuestros datos.

## 9. Recursos

- Editor: [JDoodle](https://www.jdoodle.com/online-java-compiler/)
- Archivo inicial: `starter-files/lesson-02/Main.java`
- Ejemplo resuelto: `completed-examples/lesson-02/Main.java`
- Video: https://youtu.be/_RuN5bcLtig