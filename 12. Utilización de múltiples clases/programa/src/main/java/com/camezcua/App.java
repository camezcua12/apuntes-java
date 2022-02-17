package com.camezcua;

public class App {
    /**
     * Es posible a acceder a métodos y propiedades de otras clases, haciendo más fácil hacer el código modularizable
     * 
     * Generalmente, es tan sencillo como importar su código a la clase donde quieres utilizar la clase
     * Si se tratan de métodos o propiedades estáticas podrás usarlos tal cual
     * Si se tratan de métodos o propiedades instanciadas tendrás que crear una instancia de la clase donde están
     */

    public static void main(String[] args) {
        System.out.println(MiClase.cadena);

        MiClase.metodoHolaMundo();
        MiClase.metodoAdiosMundo();
        MiClase.enviarMensaje("Mi mensaje");

        OtraClase otraClase = new OtraClase();
        MiClase.enviarMensaje(otraClase.obtenerMensaje());
    }
}
