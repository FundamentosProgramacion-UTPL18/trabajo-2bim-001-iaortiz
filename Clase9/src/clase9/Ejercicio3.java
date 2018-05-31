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
public class Ejercicio3 {

    public static void main(String[] args) {
        double[] calificacion_1 = {18, 19, 15, 16, 17, 10};// calificación 1
        double[] calificacion_2 = {10, 12, 13, 20, 17, 20};// calificación 2
        double[] promedios = new double[6]; // Promedio del estudiante

        for (int i = 1; i < promedios.length; i++) {
            double suma = calificacion_1[i] + calificacion_2[i];
            double promedio = suma / 2;

            promedios[i] = promedio;
        }
        System.out.println("Reporte de notas:");
        System.out.println("\t\tNota1   Nota2   Promedio");
        for (int i = 1; i < promedios.length; i++) {

            System.out.printf("Estudiante %d:\t%.2f\t%.2f\t%.2f\n", i, calificacion_1[i], calificacion_2[i], promedios[i]);
        }
    }
}
