# Lección 4: Estructuras de control en Java

**Tema:** Condicionales y estructuras repetitivas.  
**Herramienta:** JDoodle.

## 1. Objetivo

Aprender a tomar decisiones y repetir instrucciones utilizando estructuras de control.

## 2. Introducción

**Texto en pantalla:** ¿Cómo puede un programa tomar decisiones?

**Narración:**

¡Hola! En esta lección aprenderemos cómo hacer que nuestros programas tomen decisiones y repitan instrucciones.

Por ejemplo, una aplicación puede comprobar si una persona es mayor de edad o repetir una operación varias veces. Para lograrlo utilizamos estructuras de control.

## 3. Condicional if y else

**Texto en pantalla:** if = si / else = si no.

**Narración:**

La estructura `if` permite ejecutar instrucciones cuando una condición es verdadera.

Si la condición no se cumple, podemos utilizar `else` para ejecutar otras instrucciones.

**Código en pantalla:**

```java
public class Main {
    public static void main(String[] args) {
        int edad = 16;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
```

Como la edad es 16, se ejecuta el bloque `else`.

## 4. Ciclo for

**Texto en pantalla:** for = repetir una cantidad conocida de veces.

**Narración:**

El ciclo `for` se utiliza cuando sabemos cuántas veces queremos repetir una instrucción.

**Código en pantalla:**

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Numero: " + i);
        }
    }
}
```

La variable `i` comienza en 1 y aumenta en cada repetición. Por eso veremos los números del 1 al 5.

## 5. Ciclo while

**Texto en pantalla:** while = repetir mientras se cumpla una condición.

**Narración:**

El ciclo `while` repite instrucciones mientras una condición sea verdadera.

**Código en pantalla:**

```java
public class Main {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}
```

El contador aumenta en cada repetición. Cuando llega a 6, la condición deja de cumplirse y el ciclo termina.

## 6. Actividad práctica

**Texto en pantalla:** Reto: clasifica y cuenta.

**Narración:**

Crea un programa que compruebe si una persona puede ingresar a una actividad utilizando su edad.

Si tiene 18 años o más, muestra acceso permitido. De lo contrario, muestra acceso no permitido.

Después utiliza un ciclo `for` para mostrar los números del 1 al 10.

## 7. Cierre

¡Muy bien! Hoy aprendimos a tomar decisiones con `if` y `else`, y a repetir instrucciones utilizando `for` y `while`.

En la próxima lección aprenderemos a crear métodos.

## 8. Recursos

- Editor: [JDoodle](https://www.jdoodle.com/online-java-compiler/)
- Archivo inicial: `starter-files/lesson-04/Main.java`
- Ejemplo resuelto: `completed-examples/lesson-04/Main.java`
- Práctica: [AGREGAR ENLACE JDoodle DE LA LECCIÓN 4]