package com.camezcua;

public class App {
    /**
     * La instanciación de clases se traduce en hacer new [CLASE]();
     * 
     * Esto permite almacenar una copia o "instancia" de una misma clase, pero haciéndola distinta a todas las demás instancias
     * 
     * La utilidad de esto es poder almacenar versiones distintas a todas las demás de una misma clase, y/o realizar configuraciones
     * iniciales al generar cada copia de una misma clase
     */

    public static void main(String[] args) {
        // Creamos una instancia
        MiClase miClase = new MiClase();

        // Ahora podemos acceder a todas las propiedades y métodos no estáticos (static) de la clase
        String cadena = miClase.obtenerCadena();

        // En cambio, no funcionaría si no lo hacemos sobre la instancia, sino sobre la clase original
        // String otraCadena = MiClase.obtenerCadena();

        // Por otro lado, OtraClase implementa el método de manera estática, de modo que podemos accederlo directamente sin instancia
        String miCadena = OtraClase.obtenerCadena();
    }
}
