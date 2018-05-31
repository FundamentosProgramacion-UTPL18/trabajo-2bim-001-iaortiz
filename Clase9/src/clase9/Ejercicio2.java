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
        int[] elemento = {1,2,3,4,5,6,7};
        int prod ;
        for (int i = 0; i < elemento.length; i++) {
            if (elemento[i] % 2 == 0) {
                for (int j = 1; j < 13; j++) {
                    prod = i * j;
                    System.out.println(elemento[i]+ "x" + j+ " = " + prod);
                }
                System.out.println("\n");
            }

        }
    }
}
