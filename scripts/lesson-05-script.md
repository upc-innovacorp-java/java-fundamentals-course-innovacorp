# Lección 5: Métodos, parámetros y entrada de datos en Java

**Tema:** Métodos, parámetros y lectura de información.  
**Herramienta:** JDoodle.

## 1. Objetivo

Aprender a crear métodos, utilizar parámetros y recibir información ingresada por el usuario.

## 2. Introducción

**Texto en pantalla:** ¿Cómo podemos reutilizar nuestro código?

**Narración:**

¡Hola! En esta lección aprenderemos a crear métodos en Java y a recibir información del usuario.

En lugar de escribir las mismas instrucciones una y otra vez, podemos agruparlas en un método y reutilizarlas cuando lo necesitemos.

## 3. ¿Qué es un método?

**Texto en pantalla:** Un método es un conjunto de instrucciones que realiza una tarea.

**Narración:**

Un método permite organizar nuestro programa en partes más pequeñas. Cada método puede encargarse de una tarea específica.

**Código en pantalla:**

```java
public class Main {

    static void saludar() {
        System.out.println("Hola, bienvenido a Java");
    }

    public static void main(String[] args) {
        saludar();
    }
}
```

Primero definimos el método llamado `saludar`. Después, desde `main`, lo llamamos escribiendo su nombre seguido de paréntesis.

## 4. Métodos con parámetros

**Texto en pantalla:** Los parámetros permiten enviar información a un método.

**Código en pantalla:**

```java
public class Main {

    static void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    public static void main(String[] args) {
        saludar("Lucia");
        saludar("Carlos");
    }
}
```

**Narración:**

El método recibe un parámetro llamado `nombre`. Cuando lo llamamos, enviamos un valor diferente. Así podemos reutilizarlo con distintas personas.

## 5. Métodos que devuelven valores

**Texto en pantalla:** return = devolver un resultado.

**Código en pantalla:**

```java
public class Main {

    static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void main(String[] args) {
        int resultado = sumar(5, 3);
        System.out.println("Resultado: " + resultado);
    }
}
```

**Narración:**

El método `sumar` recibe dos números enteros y devuelve su suma utilizando `return`.

## 6. Entrada de datos con Scanner

**Texto en pantalla:** Scanner permite leer información del usuario.

**Narración:**

También podemos permitir que el usuario ingrese sus propios datos. Para hacerlo utilizaremos `Scanner`, que permite leer información desde la consola.

**Código en pantalla:**

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = entrada.nextInt();

        System.out.println("Hola, " + nombre);
        System.out.println("Tienes " + edad + " años");

        entrada.close();
    }
}
```

Utilizamos `nextLine` para leer un texto y `nextInt` para leer un número entero.

## 7. Actividad práctica

**Texto en pantalla:** Reto: crea una calculadora sencilla.

**Narración:**

Crea un programa que solicite dos números al usuario y utilice un método llamado `sumar` para calcular el resultado. Muestra el resultado en pantalla.

## 8. Cierre

¡Excelente trabajo! Aprendimos a crear métodos, utilizar parámetros, devolver resultados y recibir información con Scanner.

En la siguiente lección conoceremos la programación orientada a objetos.

## 9. Recursos

- Editor: [JDoodle](https://www.jdoodle.com/online-java-compiler/)
- Archivo inicial: `starter-files/lesson-05/Main.java`
- Ejemplo resuelto: `completed-examples/lesson-05/Main.java`
- Práctica: [AGREGAR ENLACE JDoodle DE LA LECCIÓN 5]