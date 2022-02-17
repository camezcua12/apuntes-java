package com.newo;

public class App {
    /**
     * En una clase, las propiedades y los métodos pueden ser estáticos o instaciables
     * 
     * Estáticos: se identifican por la palabra clave static y se pueden acceden a través del nombre de clase directo, sin instancia
     * Instanciables: no llevan la palabra clave static en su definición, y necesitan llamarse a través de una instancia de la clase
     */

    public static void main(String[] args) {
        /**
         * La clase de referencia es MiClase.java
         * En ella hay tanto propiedades como métodos, estáticos e instanciables
         */

        // Accedemos a los elementos estáticos de la clase sin instancia
        System.out.println("Propiedad cadena de la clase MiClase: " + MiClase.cadena);
        System.out.println("Método miMetodoEstatico de la clase MiClase: " + MiClase.miMetodoEstatico());
        System.out.println("Método miNumeroEstatico de la clase MiClase: " + MiClase.miNumeroEstatico());

        // No podemos acceder a los elementos instanciables desde la clase directamente
        // System.out.println("Propiedad anio de la clase MiClase: " + MiClase.anio);
        // System.out.println("Método miMetodo de la clase MiClase: " + MiClase.miMetodo());
        // System.out.println("Método miNumero de la clase MiClase: " + MiClase.miNumero());

        // Creamos una instancia de la clase
        MiClase miClase = new MiClase();

        // Ahora podemos acceder a los elementos instanciables desde la instancia que hemos creado
        System.out.println("Propiedad anio de la clase MiClase: " + miClase.anio);
        System.out.println("Método miMetodo de la clase MiClase: " + miClase.miMetodo());
        System.out.println("Método miNumero de la clase MiClase: " + miClase.miNumero());

        /**
         * ¿Cuándo un método o propiedad debe ser estático y cuando instanciado?
         * 
         * En términos generales, se parte de la base de que todo va a ser estático, para hacerlo fácilmente accesible.
         * Después, debes pensar para qué necesitas esa propiedad o método: 
         * 
         * ¿Es un elemento común que se necesita para toda la ejecución
         * de la clase, y que solo la propia clase va a conocer? 
         * Entonces debe ser algo estático
         * 
         * ¿Es algo que no sirve para nada para una clase modelo (por ejemplo, Coche) pero que por otra parte, sí que serviría
         * para una instancia? Por ejemplo, obtener el precio de una instancia de la clase Articulo. Solo tiene sentido dentro de la instancia,
         * porque la propia clase no va a tener precio
         * Entonces debe ser algo instanciable
         */
    }
}
