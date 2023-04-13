/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9_suma_num_nat_1_al_50;

/**
 *
 * @author 52614
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
//Nombre: Diana Rebeca Rosales Capsitran
//No. control: 22550310
//Fundamentos de programación.        

        //Escribir un programa que permita sumar todos los números naturales 
//comprendidos entre 1 y 50 utilizando la función REPETIR
        int num = 1;
        int suma = 0;

        do {
            suma = (suma + num);
            num++;
        } while (num <= 50);

        System.out.println(suma + " es el resultado de la suma de los números naturales comprendidos entre 1 y 50");

    }
}
