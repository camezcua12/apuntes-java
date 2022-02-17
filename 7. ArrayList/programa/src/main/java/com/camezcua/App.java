package com.camezcua;

// Importamos los ArrayList del paquete java
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        /**
         * En lugar de trabajar con datos individuales, es posible trabajar con listas de datos
         * Esto permite almacenar todos esos elementos en una misma variable o constante
         * 
         * Los ArrayList tienen distintas propiedades:
         * 1. Tienen bastantes comportamientos en común con los arrays
         * 2. Los números de posición comienzan desde el 0 para la primera posición, en lugar del 1
         * 3. Permiten aumentar su tamaño dinámicamente
         * 4. Cuentan con una propiedad .size que indica la longitud del ArrayList
         * 5. Para acceder o cambiar los distintos valores no se accede por [] sino que se utilizan métodos propios
         * 
         * Patrón para crear un array:
         * 
         * ArrayList<[TIPO DE DATO]> [NOMBRE] = new ArrayList<[MISMO TIPO DE DATO]>();
         * 
         */

        // Creación de un ArrayList de cadenas
        ArrayList<String> cadenas = new ArrayList<String>();

        // Creación de un ArrayList de números enteros
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        // Añadir datos a un ArrayList al final
        cadenas.add("carlos");

        // Añadir datos a un ArrayList en una posición concreta (en la primera posición en este caso)
        cadenas.set(0, "alicia");

        // Acceder a la primera posición de un ArrayList
        String primeraCadena = cadenas.get(0);

        // Obtener longitud / tamaño del ArrayList
        int longitud = cadenas.size();

        /**
         * Acceder a la última posición de un ArrayList
         * 
         * La última posición se representa como [LONGITUD] - 1, ya que al empezar el primer elemento en 0, si la longitud es 5, la última posición sería 4
         */
        String ultimaCadena = cadenas.get(longitud - 1);
        // o
        String ultimaCadenaDeOtroModo = cadenas.get(cadenas.size() - 1);

        // Cambiar el valor de la primera posición
        cadenas.set(0, "otronombre");

        /**
         * Mostrar todos los nombres del ArrayList
         * 
         * Los for son el tipo de bucle ideal para recorrer ArrayList, ya que sabes que [NUMERO DE VUELTAS] = [LONGITUD DEL ARRAYLIST]
         * Por eso, comenzamos con el contador i en valor 0 (primera posición posible del ArrayList), y finalizamos cuando i = [LONGITUD - 1]
         * es decir, i < [LONGITUD]
         */
        for (int i = 0; i < cadenas.size(); i++) {
            System.out.println("Nombre: " + cadenas.get(i));
        }
    }
}
