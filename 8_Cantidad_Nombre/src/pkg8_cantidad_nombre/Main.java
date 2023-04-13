/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8_cantidad_nombre;

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

        //Crear un programa que permita ingresar un nombre y una cantidad numérica para que así 
        //después el programa escriba este nombre tantas veces como su cantidad ingresada. 
        //Utilizar la función MIENTRAS.
        Scanner SC = new Scanner(System.in);
        System.out.println("Ingrese algún nombre");
        String Nom;
        Nom = SC.next();
        System.out.println("Cantidad de veces que se repetirá el nombre");
        int Num;
        Num = SC.nextInt();
        while (Num > 0) {
            System.out.println(Nom);
            Num = Num - 1;
        }
    }
}
