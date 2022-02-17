package com.newo;

public class App {
    /**
     * Para instanciar una clase, hacemos new [CLASE]();
     * Es posible, a la hora de instanciar, definir un constructor
     * 
     * El constructor es un método que se ejecuta en el momento de la instanciación, y se puede usar para inicializar parámetros necesarios de una clase
     * (Revisar clase Coche.java)
     */

    public static void main(String[] args) {
        // Creamos una instancia de un coche plantilla (por defecto)
        Coche cochePorDefecto = new Coche();

        // Creamos una instancia de un coche específico
        Coche seatIbiza = new Coche("Seat", "Ibiza", 2001);
    }
}
