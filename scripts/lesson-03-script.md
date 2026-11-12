# Lección 3: Operadores y expresiones en Java

**Duración:** 7:47  
**Tema:** Operadores aritméticos, relacionales y lógicos.  
**Herramienta:** JDoodle.

## 1. Objetivo

Aprender a utilizar operadores para realizar cálculos, comparar valores y combinar condiciones.

## 2. Introducción

**Texto en pantalla:** ¿Cómo realizan operaciones los programas?

**Narración:**

¡Hola! En esta lección aprenderemos a utilizar operadores en Java.

Imaginemos que estamos desarrollando un programa para calcular el precio de una compra. Necesitamos sumar precios, comparar cantidades y comprobar condiciones. Para realizar estas tareas utilizamos operadores.

## 3. Operadores aritméticos

**Texto en pantalla:**

- `+`: suma.
- `-`: resta.
- `*`: multiplicación.
- `/`: división.
- `%`: residuo.

**Narración:**

Los operadores aritméticos permiten realizar operaciones matemáticas.

El signo más sirve para sumar, el menos para restar y el asterisco para multiplicar. El operador porcentaje permite obtener el residuo de una división.

**Código en pantalla:**

```java
public class Main {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 3;

        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicacion: " + (numero1 * numero2));
        System.out.println("Division: " + (numero1 / numero2));
        System.out.println("Residuo: " + (numero1 % numero2));
    }
}
```

**Narración:**

Observemos que al dividir dos números enteros obtenemos otro número entero. Por eso, 10 dividido entre 3 muestra 3.

## 4. Operadores relacionales

**Texto en pantalla:**

- `>`: mayor que.
- `<`: menor que.
- `>=`: mayor o igual que.
- `<=`: menor o igual que.
- `==`: igual a.
- `!=`: diferente de.

**Narración:**

Los operadores relacionales permiten comparar dos valores. El resultado será verdadero o falso.

**Código en pantalla:**

```java
int edad = 16;

System.out.println(edad >= 18);
System.out.println(edad < 18);
```

La primera comparación devuelve false y la segunda devuelve true.

## 5. Operadores lógicos

**Texto en pantalla:**

- `&&`: AND, significa Y.
- `||`: OR, significa O.
- `!`: NOT, significa negación.

**Narración:**

Los operadores lógicos permiten combinar condiciones.

AND exige que las dos condiciones sean verdaderas. OR necesita que al menos una sea verdadera. NOT invierte el resultado.

**Código en pantalla:**

```java
public class Main {
    public static void main(String[] args) {
        int edad = 20;
        boolean tieneEntrada = true;

        System.out.println(edad >= 18 && tieneEntrada);
    }
}
```

Como ambas condiciones se cumplen, el resultado es true.

## 6. Actividad práctica

**Texto en pantalla:** Reto: calcula una compra.

**Narración:**

Imagina que compras dos productos: uno cuesta 15 soles y otro cuesta 9.50 soles.

Crea un programa que calcule el subtotal, aplique un descuento del 10 % y muestre el total.

También comprueba si el total es mayor que 20 soles.

**Código de referencia:**

```java
public class Main {
    public static void main(String[] args) {
        double producto1 = 15.0;
        double producto2 = 9.50;

        double subtotal = producto1 + producto2;
        double descuento = subtotal * 0.10;
        double total = subtotal - descuento;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total: " + total);
        System.out.println("¿Es mayor que 20? " + (total > 20));
    }
}
```

Pausa el video y realiza el ejercicio en JDoodle.

## 7. Cierre

¡Excelente! Aprendimos a utilizar operadores aritméticos, relacionales y lógicos para realizar cálculos y comparar valores.

En la siguiente lección conoceremos las estructuras de control.

## 8. Recursos

- Editor: [JDoodle](https://www.jdoodle.com/online-java-compiler/)
- Archivo inicial: `starter-files/lesson-03/Main.java`
- Ejemplo resuelto: `completed-examples/lesson-03/Main.java`
- Video: https://youtu.be/oE_QpTh7jp8