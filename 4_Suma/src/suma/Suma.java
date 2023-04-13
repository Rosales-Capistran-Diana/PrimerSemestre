/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author 52614
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Nombre: Diana Rebeca Rosales Capsitran
//No. control: 22550310
//Fundamentos de programación.        

        //Ingresa dos números y devuelve el resultado de la suma entre ambos.
        System.out.println("Ingrese un número");
        Scanner SC = new Scanner(System.in);
        int n1;
        n1 = SC.nextInt();
        System.out.println("Ingrese otro número");
        int n2;
        n2 = SC.nextInt();
        int Suma;
        Suma = n1 + n2;
        System.out.println(Suma + " es el resultado de la suma de los numeros " + n1 + " y " + n2);
    }
}
