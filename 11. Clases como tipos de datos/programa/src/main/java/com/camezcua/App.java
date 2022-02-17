package com.camezcua;

// Importamos Scanner del paquete java
import java.util.Scanner;
// Importamos OtraClase del paquete/directorio carpeta
import com.camezcua.carpeta.OtraClase;

public class App {
    /**
     * Hasta ahora, todas las variables, constantes, propiedades, arrays, ArrayLists, métodos, etc trabajaban con tipos sencillos
     * Estos tipos sencillos (o nativos), no son los únicos que se pueden utilizar
     * 
     * Esencialmente, cualquier clase puede servir como tipo para una variable
     */
    public static MiClase miClase;

    public static void main(String[] args) {
        /**
         * Ya conocemos un caso de clase como tipo
         * 
         * En este ejemplo podemos ver como la variable scanner no es de tipo String, o int, etc, sino que es de tipo Scanner
         * Scanner en realidad no es más que un archivo Scanner.java, escrito en el código del paquete java
         */
        Scanner scanner = new Scanner(System.in);
        scanner.close();

        /**
         * De la misma manera podemos crear nuestras propias clases, y crear variables cuyos tipos sean dichas clases
         */
        MiClase miClase = new MiClase();

        /**
         * Y también podemos extraer nuestras propias clases de otras carpetas
         */
        OtraClase otraClase = new OtraClase();

        /**
         * Este sistema de tipos aplica a todo lo que hemos visto hasta ahora. Por toda la clase hay ejemplos...
         */
    }

    public static OtraClase dameOtraClase() {
        return new OtraClase();
    }
}
