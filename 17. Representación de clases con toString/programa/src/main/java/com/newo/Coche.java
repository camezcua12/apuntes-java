package com.newo;

public class Coche {
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

    /**
     * En este caso, el método toString de la clase Coche nos permite obtener un String que representa
     * la información esencial de lo que constituye este coche
     */
    public String toString() {
        return "ID: " + this.getId() + " | Marca: " + this.getMarca() + " | Modelo: " + this.getModelo();
    }
}