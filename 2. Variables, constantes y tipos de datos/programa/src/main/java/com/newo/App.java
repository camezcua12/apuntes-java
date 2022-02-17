package com.newo;

public class App {
    public static void main(String[] args) {
        /**
         * Para almacenar la información en el flujo de la programación, se utilizan las variables y constantes
         * 
         * Variables: pueden comenzar con un valor e ir cambiándolo a lo largo del código
         * Constantes: una vez se configura su valor, este no puede cambiar
         * 
         * Los distintos tipos de datos se representan con palabras clave:
         * 
         * String: cadenas de texto, contenidas dentro de "" o ''
         * int: números enteros
         * double o float: números decimales más complejos
         * boolean: tipo de dato que representa verdadero (true) o falso (false)
         * Y otros tantos...
         */

         /**
          * Para crear una variable:
          * 
          * [TIPO DE DATO] [NOMBRE] = [VALOR];
          *
          * También podemos crear un variable sin valor inicial (null):
          *
          * [TIPO DE DATO] [NOMBRE];
          *
          * Para cambiar el valor:
          *
          * [NOMBRE] = [NUEVO VALOR];
          *
          *
          * Para crear una constante:
          *
          * final [TIPO DE DATO] [NOMBRE] = [VALOR];
          *
          * En este caso, no podemos dejarla sin valor inicial, ya que al no cambiar nunca lo necesita en el momento de su creación
          * Tampoco se podría cambiar su valor
          */

          // Variables
          String cadena = "Hola mundo";
          int numero = 12;
          double numeroComplejo = 12.05;
          boolean esVerdad = false;

          // Cambiamos el valor a las variables
          cadena = "Adiós mundo";
          numero = 10;
          numeroComplejo = 10.05;
          esVerdad = true;

          // Constantes
          final String cadenaConstante = "Hola mundo";
          final int numeroConstante = 12;
          final double  numeroComplejoConstante = 12.05;
          final boolean esVerdadConstante = false;

          // No podemos cambiar el valor de las constantes, si descomentamos abajo daría error
          // cadenaConstante = "Adiós mundo";
    }
}
