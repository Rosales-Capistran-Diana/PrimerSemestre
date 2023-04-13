/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedio_3_calificaciones;

import java.util.Scanner;

/**
 *
 * @author 52614
 */
public class Promedio_3_Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Nombre: Diana Rebeca Rosales Capsitran
//No. control: 22550310
//Fundamentos de programación.        

        //Determinar si un alumno aprueba o reprueba un curso, sabiendo que aprobará si su promedio de tres 
        //calificaciones es mayor o igual a 7.0;reprueba en caso contrario, deberá permitir ingresar las 
        //tres calificaciones y luego calcular su promedio.
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba la primer calificacion");
        double C1 = sc.nextDouble();
        System.out.println("Escriba la segunda calificacion");
        double C2 = sc.nextDouble();
        System.out.println("Escriba la tercer calificacion");
        double C3;
        C3 = sc.nextDouble();

        double Promedio;
        Promedio = (C1 + C2 + C3) / 3;
        if (Promedio >= 7) {
            System.out.println(Promedio + " es calificacion aprobatoria ");
        } else {
            if (Promedio < 7) {
                System.out.println(Promedio + " es calificacion reprobatoria ");
            }
        }
    }
}
