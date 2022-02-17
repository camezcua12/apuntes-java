package com.newo;

public class App {

    public static void main(String[] args) {
        /**
         * En lugar de trabajar con datos individuales, es posible trabajar con listas de datos
         * Esto permite almacenar todos esos elementos en una misma variable o constante
         * 
         * Los Arrays tienen distintas propiedades:
         * 1. Se utilizan números enteros para apuntar a sus posiciones específicas
         * 2. Los números de posición comienzan desde el 0 para la primera posición, en lugar del 1
         * 3. Una vez creado el array, no es posible cambiar su tamaño, aunque sí los valores de cada posición existente
         * 4. Cuentan con una propiedad .length que indica la longitud del array
         * 
         * Patrón para crear un array:
         * a)
         * 
         * [TIPO DE DATO][] [NOMBRE];
         * 
         * b)
         * 
         * [TIPO DE DATO] [NOMBRE][];
         * 
         * Patrón para iniciar el array con datos concretos
         * 
         * [TIPO DE DATO][] [NOMBRE] = {VALOR1, VALOR2, VALOR3...};
         * 
         * Patrón para iniciar el array con X posiciones a nulo
         * 
         * [TIPO DE DATO][] [NOMBRE] = new [MISMO TIPO DE DATO][[TAMAÑO]];
         */

        // Creación de un array de cadenas
        String[] cadenas = {"carlos", "alicia"};

        // Creación de un array de 2 cadenas vacías
        String[] cadenasVacias = new String[2];

        // Creación de un array de números enteros
        int[] numeros = {1, 2, 3, 4, 5};

        // Acceder a la primera posición de un array
        String primeraCadena = cadenas[0];

        // Obtener longitud / tamaño del array
        int longitud = cadenas.length;

        /**
         * Acceder a la última posición de un array
         * 
         * La última posición se representa como [LONGITUD] - 1, ya que al empezar el primer elemento en 0, si la longitud es 5, la última posición sería 4
         */
        String ultimaCadena = cadenas[longitud - 1];
        // o
        String ultimaCadenaDeOtroModo = cadenas[cadenas.length - 1];

        // Cambiar el valor de la primera posición
        cadenas[0] = "otronombre";

        /**
         * Mostrar todos los nombres del array
         * 
         * Los for son el tipo de bucle ideal para recorrer arrays, ya que sabes que [NUMERO DE VUELTAS] = [LONGITUD DEL ARRAY]
         * Por eso, comenzamos con el contador i en valor 0 (primera posición posible del array), y finalizamos cuando i = [LONGITUD - 1]
         * es decir, i < [LONGITUD]
         */
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println("Nombre: " + cadenas[i]);
        }
    }
}
