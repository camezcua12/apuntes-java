package com.newo;

public class App {
    /**
     * Los métodos de clase son funciones que establecen bloques de código reutilizables
     * Pueden recibir argumentos para su ejecución, y se declaran de una forma muy similar a las propiedades
     * Además, permiten si se necesita, devolver datos como resultado de su ejecución
     * 
     * Patrón para crear métodos:
     * 
     * {public|private|protected} {static} {[TIPO DE DATO]|void} [NOMBRE]({[TIPO DE DATO PARA ARGUMENTO] [NOMBRE], ...}) {}
     */

    // Propiedades variables de clase de apoyo
    public static String nombre = "carlos";
    public static int numero = 12;
    public static boolean esVerdad = false;
    public static void main(String[] args) {
        
    }

    // Ejemplos de métodos

    // Método que no devuelve nada
    public static void miMetodo() {}

    // Método que devuelve una cadena
    public static String miCadena() {
        return "carlos";
    }

    // Método que devuelve un entero
    public static int miNumero() {
        return 10;
    }

    // Método con un argumento de tipo cadena
    public static void otroMetodo(String cadena) {
        System.out.println("El valor de cadena es: " + cadena);
    }

    /**
     * Método con múltiples argumentos de distintos tipos
     * 
     * Es importante darse cuenta de que aunque el argumento int numero coincide en nombre con la propiedad de clase int numero,
     * son variables/valores independientes, y no están asociados de ningún modo
     */
    public static void otroMetodoConVariosArgumentos(String cadena, int numero, boolean esVerdad) {
        System.out.println("El valor de cadena es: " + cadena);
        System.out.println("El valor del número es: " + numero);
        System.out.println("El valor del booleano es: " + esVerdad);
    }

    // Método que llama a otro método en su código
    public static void nuevoMetodo() {
        miMetodo();
    }

    // Método que llama a otro método con argumentos
    public static void llamarMetodoConArgumentos() {
        String cadena = "carlos";
        int numero = 10;
        boolean esVerdad = false;

        otroMetodoConVariosArgumentos(cadena, numero, esVerdad);

        // También se pueden pasar los valores directamente
        otroMetodoConVariosArgumentos("carlos", 10, true);
    }

    // Método que llama a método y almacena sus resultados
    public static void metodoFinal() {
        int resultadoMetodo = miNumero();
        System.out.println("El número es: " + resultadoMetodo);
    }
}
