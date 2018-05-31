/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

/**
 *
 * @author Israel
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int[] elemento = {1,2,3,4,5,6,7};//Declaracion de array
        int prod ; //Declaracion de variable producto
        for (int i = 0; i < elemento.length; i++) {// Ciclo for para recorrer el array
            if (elemento[i] % 2 == 0) { // Condicional para los elementos pares
                for (int j = 1; j < 13; j++) { //Array para los números a multiplicar
                    prod = i * j; //Asignacion de valor para sacar producto
                    System.out.println(elemento[i]+ "x" + j+ " = " + prod); //Presentacion
                }
                System.out.println("\n"); // Salto de linea por presentacion
            }

        }
    }
}
