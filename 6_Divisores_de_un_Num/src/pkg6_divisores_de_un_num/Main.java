/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6_divisores_de_un_num;

import java.util.Scanner;

/**
 *
 * @author 52614
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Nombre: Diana Rebeca Rosales Capsitran
//No. control: 22550310
//Fundamentos de programación.

//Ingresa un número y muestra en pantalla todos los divisores del mismo.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int d;
        d = sc.nextInt();
        System.out.println("Los divisores son:");
        for (int i = 1; i <= d; i++) {
            if (d % i == 0) {
                System.out.println(i);
            }
        }
    }

}
