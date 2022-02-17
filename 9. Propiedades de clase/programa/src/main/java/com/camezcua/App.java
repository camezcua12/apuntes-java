package com.camezcua;

public class App {
    /**
     * Las propiedades de una clase no son más que variables y constantes
     * En lugar de definirse en un método, se definen en la propia clase
     * Gracias a esto, las propiedades pueden ser accedidas desde cualquier lugar
     * 
     * Patrón para crear una propiedad variable de clase:
     * 
     * {public|private|protected} {static} [TIPO DE DATO] [NOMBRE] = [VALOR];
     * 
     * Patrón para crear una propiedad constante de clase:
     * 
     * {public|private|protected} {static} final [TIPO DE DATO] [NOMBRE] = [VALOR];
     * 
     * Las propiedades de clase son una buena forma de compartir información entre métodos, especialmente
     * si la misma información se utiliza en muchos métodos distintos
     */
    
    // Ejemplos de propiedades variables de clase
    public static String nombre = "carlos";
    public static int numero = 12;
    public static boolean esVerdad = false;

    // Ejemplos de propiedades constantes de clase
    public static final String nombreConstante = "alicia";
    public static final int numeroConstante = 12;
    public static final boolean esVerdadConstante = false;

    public static void main(String[] args) {
        // Podemos acceder tanto a variables locales como a propiedades

        // Variable de apoyo
        String otroNombre = "alicia";

        System.out.println("Nombre en la propiedad de clase: " + nombre);
        System.out.println("Nombre en el main: " + otroNombre);

        // Podemos también cambiar el valor de las propiedades variables
        nombre = "alicia";
        numero = 10;
        esVerdad = true;
    }

    public static void miMetodo() {
        // Podemos acceder a las propiedades de clase, pero no a las variables del método main

        System.out.println("Nombre en la propiedad de clase: " + nombre);
        // Da error
        // System.out.println("Nombre en el main: " + otroNombre);

        // Podemos también cambiar el valor de las propiedades variables
        nombre = "alicia";
        numero = 10;
        esVerdad = true;
    }
}
