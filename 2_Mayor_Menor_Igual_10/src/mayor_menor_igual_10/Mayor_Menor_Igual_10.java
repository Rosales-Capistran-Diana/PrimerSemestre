/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayor_menor_igual_10;

import java.util.Scanner;

/**
 *
 * @author 52614
 */
public class Mayor_Menor_Igual_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Nombre: Diana Rebeca Rosales Capsitran
//No. control: 22550310
//Fundamentos de programación.        

        // Ingresar un numero para que diga si es mayor, menor o igual a 10.
        System.out.println("Escribe el número");
        Scanner SC = new Scanner(System.in);
        int N;
        N = SC.nextInt();
        //Colocar un "=" es para darle ese valor a la variable, si se coloca "==" es para comparar
        if (N == 10) {
            System.out.println(N + " es igual a 10");
            //Else = Sino
        } else {
            if (N > 10) {
                System.out.println(N + " es mayor a 10");
            } else {
                System.out.println(N + " es menor a 10");
            }
        }
    }
}
