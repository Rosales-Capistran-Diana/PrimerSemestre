/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package par_impar;

import java.util.Scanner;

/**
 *
 * @author 52614
 */
public class Par_Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Nombre: Diana Rebeca Rosales Capsitran
//No. control: 22550310
//Fundamentos de programación.

        //Ingresar un número y que diga si el mismo es par o impar.
        Scanner SC = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int N;
        N = SC.nextInt();
        if (N % 2 == 0) {
            System.out.println(N + " es un numero par");
        } else {
            System.out.println(N + " es un numero impar");
        }
    }
}
