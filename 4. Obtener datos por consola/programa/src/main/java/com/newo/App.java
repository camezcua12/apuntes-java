package com.newo;

// Importamos la utilidad escaner del paquete java (por eso comienza por java.)
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /**
         * Para obtener datos del usuario por la consola, podemos utilizar la clase nativa Scanner
         * 
         * Esta deja la consola a la espera de entrada del usuario, y permite convertir la entrada a tipos concretos
         */

         // Creamos el escáner para poder utilizarlo
         Scanner scanner = new Scanner(System.in);

         System.out.println("Introduzca un dato:");

         // Todo lo que escriba el usuario antes de dar a la tecla intro se guardará en esta variable
         String dato1 = scanner.nextLine();

         // Mostramos el resultado
         System.out.println("El valor introducido por el usuario es: " + dato1);

         System.out.println("Introduzca un número:");

         // En este caso, se recibirán los datos del usuario y se convertirán a entero
         int numero1 = scanner.nextInt();

         // Mostramos el resultado
         System.out.println("El valor introducido por el usuario es: " + numero1);

         // Una vez terminamos de usar el escáner, lo cerramos
         scanner.close();
    }
}
