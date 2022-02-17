package com.newo;

public class App {
    /**
     * Al ejecutar código es posible que alguna instrucción no esté configurada
     * como debiese, y eso puede derivar en un error de interrupción del programa
     * o Excepción.
     * 
     * Una Excepción es un error grave que causa un estado alterado o la interrupción
     * completa de un programa
     * 
     * En ocasiones, es difícil anticiparse a cuándo algo va a dar una Excepción. Para
     * eso existen los try / catch
     * 
     * Este tipo de estructura permite intentar ejecutar un código, y en el caso de lanzar
     * una Excepción, no interrumpe la ejecución, sino que activa partes del código dedicadas
     * a controlar la situación
     */

    public static void main(String[] args) {
        String numeroAConvertir = "10";

        // Para convertir una cadena a entero utilizamos el método parseInt()
        int numero = Integer.parseInt(numeroAConvertir);

        System.out.println("Número convertido: " + numero);

        /**
         * En ese caso, la conversión funciona bien porque sabemos perfectamente que numeroAConvertir es 10,
         * y esa cadena se puede convertir sin problema a número
         * 
         * Ahora probemos con otra cadena:
         */
        numeroAConvertir = "a";

        // Esta instrucción causa la Excepción
        numero = Integer.parseInt(numeroAConvertir);

        /**
         * Este código lanza una Excepción que interrumpe el programa, ya que no es posible convertir correctamente
         * la cadena "a" a número
         * 
         * Para evitar esto podemos usar try / catch
         */

         try {
            numeroAConvertir = "a";

            // Esta instrucción causa la Excepción
            numero = Integer.parseInt(numeroAConvertir);
         } catch (NumberFormatException e) {
            /**
             * Al producirse la Excepción el programa no se interrumpe, sino que salta al bloque catch donde puedes
             * gestionar el error como necesites
             */

            System.out.println("El valor introducido no es válido!");
         }
    }
}
