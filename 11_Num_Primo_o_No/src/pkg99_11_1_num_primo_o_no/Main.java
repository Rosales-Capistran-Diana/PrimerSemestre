/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg99_11_1_num_primo_o_no;

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

//Definir un programa que determine si un número ingresado es primo o no. 
//(Un número es primo si es divisible únicamente por 1 y por sí mismo).
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int n1 = sc.nextInt();

        boolean band = true;
        int div = 2;

        if (n1 == 1) {
            System.out.println(n1 + " es número primo");
        } else {
            while (band == true & n1 > div) {
                if (n1 % div == 0) {
                    band = false;
                }
                div++;
            }
            if (band == true) {
                System.out.println(n1 + " el número es primo");

            } else {
                System.out.println(n1 + " el número no es primo");
            }

        }
    }
}
