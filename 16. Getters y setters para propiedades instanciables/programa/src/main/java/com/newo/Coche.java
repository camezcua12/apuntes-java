package com.newo;

public class Coche {
    /**
     * En esta clase, que será instanciada, es colocan las propiedades como
     * private, y se crean dos tipos de métodos:
     * 
     * 1) Getters
     * 
     * public [TIPO DE DATO DE LA PROPIEDAD] get[NOMBRE]() {
     *      return this.[NOMBRE];
     * }
     * 
     * 2) Setters
     * 
     * public void set[NOMBRE] ([TIPO DE DATO DE LA PROPIEDAD] [NOMBRE]) {
     *      this.[NOMBRE] = [NOMBRE];
     * }
     * 
     * En ambos casos se utiliza la expresión "this". Se utiliza dentro de puntos instanciables
     * de la propia clase, y sirve para referirse a su propia instancia en la que se está ejecutando
     */
    
    private int id;
    private String marca;
    private String modelo;

    public Coche(int id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
