package com.camezcua;

public class App {
    public static void main(String[] args) {
        /**
         * Para controlar el programa se utilizan las estructuras de control. Existen distintos tipos:
         * 
         * if: permite ejecutar código solo si se cumple una condición
         * if / else: permite ejecutar distinto código en caso de que se cumpla la condición o de que no
         * if / else if / else: permite ejecutar distinto código bajo distintas condiciones
         * switch: permite ejecutar código en función de múltiples posibles valores para una misma variable
         * while: permiter dar ciclos de código mientras una condición se cumpla
         * do - while: permite dar ciclos de código mientras una condición se cumpla, garantizando un mínimo de una ejecución
         * for: permite dar ciclos de código bajo unos criterios preelegidos
         * 
         * Generalmente para las estructuras de control son necesarios los comparadores:
         * 
         * ==: igual que
         * !=: distinto que
         * 
         * NOTA: en ocasiones, ciertos tipos como los String no se comparan correctamente con ==, y debemos utilizar .equals()
         * 
         * También es posible agrupar distintas condiciones:
         * 
         * &&: y
         * ||: o
         */

        // Variable de apoyo
        String nombre = "carlos";
        
        // if
        if (nombre.equals("carlos")) {
            // Si se cumple se ejecuta el código aquí
        }

        // if / else
        if (nombre.equals("carlos")) {
            // Si se cumple se ejecuta el código aquí
        } else {
            // En caso contrario, se ejecuta este otro bloque
        }

        // if / else if / else
        if (nombre.equals("carlos")) {
            // Si se cumple se ejecuta el código aquí
        } else if (nombre.equals("alicia")) {
            // Si la condición anterior falla, pero esta otra se cumple, se ejecuta este bloque
        } else {
            // En caso contrario, se ejecuta este otro bloque
        }

        // if con condiciones agrupadas (y)
        // Si el nombre es carlos Y no es alicia
        if (nombre.equals("carlos") && nombre.equals("alicia")) {
            // Se ejecuta este bloque de código
        }

        // if con condiciones agrupadas (o)
        // Si el nombre es carlos o es alicia
        if (nombre.equals("carlos") || nombre.equals("alicia")) {
            // Se ejecuta este bloque de código
        }

        // switch
        switch (nombre) {
            case "carlos":
                // En caso de que el nombre sea carlos se ejecuta este bloque
                break;

            case "alicia":
                // En caso de que el nombre sea alicia se ejecuta este bloque
                break;

            // Opcional
            default:
                // En caso de que ninguna de las condiciones haya funcionado, se ejecuta este bloque por defecto
                // Al ser el último del switch, no necesita break
        }

        /**
         * ¿Cuándo utilizar un if y cuándo un switch?
         * 
         * En el caso de que necesites comprobar muy pocos valores o necesites comparaciones complejas, utiliza el if
         * 
         * Si se trata de comparaciones de valores simples, y hay muchos posibles valores que quieres comparar, usa el switch
         */


        /**
         * while
         * 
         * Para utilizar while, necesitamos que fuera del propio while esté la condición que sirve para detenerlo, o crearíamos un bucle infinito
         */

        // Variable de apoyo
        int contador = 0;
        int vueltas = 10;

        // Mientras el valor de contador sea menor que vueltas, seguiremos dando ciclos en este bucle
        while (contador < vueltas) {
            // Se ejecuta el contenido de este bloque

            // Necesitamos incrementar el valor de contador para garantizar que en algún momento la condición no se cumplirá y finalizaremos el bucle
            contador++;
        }

        /**
         * do - while
         * 
         * Para utilizar do - while, necesitamos que fuera del propio do - while esté la condición que sirve para detenerlo, o crearíamos un bucle infinito
         */

        // Variable de apoyo 
        int otroContador = 0;
        int otrasVueltas = 10;

        do {
            // Este bloque de código se ejecutará como mínimo una vez hasta llegar a la condición que podría romper el bucle

            // Necesitamos incrementar el valor de contador para garantizar que en algún momento la condición no se cumplirá y finalizaremos el bucle
            contador++;
        } while (otroContador < otrasVueltas);
        // Mientras el valor de contador sea menor que vueltas, seguiremos dando ciclos en este bucle

        /**
         * for
         * 
         * Para este tipo de bucle, necesitamos conocer de antemano el número de vueltas que queremos dar
         * A diferencia de while, no necesitamos gestionar un contador de incremento, ya que el propio for lo tiene
         */

        // Variable de apoyo
        int vueltasParaFor = 10;

        /**
         * En el propio for se pueden distinguir 3 expresiones separadas por ;
         * 
         * 1. Variable contador: es el contador interno que se crea dentro del for, suele ser de tipo entero
         * 2. Condición de ruptura: permite establecer una condición estándar para regular el número de vueltas
         * 3. Acción final: acción que se realiza al final de cada vuelta del ciclo, contiene el incremento del contador para prevenir un bucle infinito
         */
        for (int i = 0; i < vueltasParaFor; i++) {
            // Se ejecuta este bloque de código en cada vuelta
        }


        /**
         * ¿Cuándo utilizar while, do - while o for?
         * 
         * Tanto while como do - while suelen ser utilizados cuando no hay un número claro de vueltas que debe dar el bucle o cuando hay condiciones
         * que pueden romperse por la propia ejecución de una vuelta de un bucle
         * Entre while y do - while, debes utilizar uno u otro si quieres comprobar la necesidad del bucle desde el principio o si
         * necesitas al menos una vuelta de ejecución
         * 
         * for permite dar una cantidad de vueltas predefinida, por lo que es útil cuando sabes que quieres dar X vueltas o quieres recorrer un array
         */
    }
}
