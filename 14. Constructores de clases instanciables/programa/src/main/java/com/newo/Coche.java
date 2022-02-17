package com.newo;

public class Coche {
    /**
     * El constructor es un método que se ejecuta automáticamente cuando se hace un new [CLASE]() desde cualquier punto del código
     * Se pueden definir distintos constructores, y se ejecutará aquel que coincida con la forma en la que ha sido llamado inicialmente
     * 
     * Patrón para crear un constructor:
     * 
     * public [CLASE]({[TIPO DE DATO PARA ARGUMENTO] [NOMBRE], ...}) {}
     * 
     * Esencialmente, un constructor es un método public, sin static, y cuyo nombre y valor de retorno es la propia clase
     */

    public String marca;
    public String modelo;
    public int anioFabricacion;

    // Si se instancia esta clase como "new Coche();" se ejecutará este constructor
    public Coche() {
        this.marca = "PLANTILLA";
        this.modelo = "PLANTILLA";
        this.anioFabricacion = 0;
    }

    // Si se instancia esta clase como "new Coche('Ford', 'Fiesta', 1994);" se ejecutará este constructor
    public Coche(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }
}
