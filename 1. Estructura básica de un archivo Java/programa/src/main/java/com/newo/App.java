/**
 * 1. Cada archivo .java representa una clase
 * 2. Los nombres de archivo se deben crear con la primera letra mayúscula y acabados en .java
 */

/**
 * La propiedad package representa la ubicación de la clase en las carpetas relativas al proyecto
 * 
 * Como estamos en la primera carpeta del proyecto, el package es simplemente com.newo
 * 
 * Si estuviéramos en la carpeta "otros", el package sería com.newo.otros
 */
package com.newo;

// Define y nombra la clase. El nombre de la clase debe coincidir con el nombre del archivo Java donde está
public class App {
    /**
     * Algunas clases cuentan con un método main, pero no es obligatorio
     * 
     * El método main es el punto de arranque de la aplicación, es decir, es lo que se llama cuando le das a ejecutar o pulsas el "Play"
     * 
     * Toda aplicación debe tener un método main en alguna de sus clases, ya que si no no tendrá forma de funcionar.
     * 
     * Generalmente suelen estar en alguna clase nombrada como el programa, o App, Programa, Aplicacion, etc
     * 
     * El método main se debe definir exactamente como está escrito abajo, nunca cambiará. Se puede autocompletar con la mayoría de IDEs
     */
    public static void main(String[] args) {
        // Aquí se comienza a ejecutar la aplicación
        System.out.println("Hola mundo!");
    }
}
