package com.camezcua;

public class App {
    /**
     * Un patrón común es la creación de getters y setters para gestionar el acceso
     * y cambio de las propiedades de una clase instanciable, de manera que se hagan
     * private (invisibles al exterior de la clase) y solo haya una forma de poder
     * modificar su valor
     * 
     * (Coche.java)
     */

    public static void main(String[] args) {
        Coche coche = new Coche(1, "Seat", "Ibiza");
    }
}
