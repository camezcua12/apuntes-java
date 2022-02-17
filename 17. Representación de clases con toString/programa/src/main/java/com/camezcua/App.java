package com.camezcua;

public class App {
    /**
     * Al intentar mostrar por consola arrays, ArrayLists, clases o estructuras complejas
     * se puede ver que no se muestran como es debido
     * 
     * Para solucionar esto en el caso de las clases existe un patrón común llamado toString
     * 
     * toString es la metodología que permite convertir algo que no es una cadena, en una cadena que represente
     * una cantidad de información similar
     * 
     * (Coche.java) 
     */
    
     public static void main(String[] args) {
        Coche coche = new Coche(1, "Seat", "Ibiza");
        System.out.println("Coche: " + coche.toString());
    }
}
