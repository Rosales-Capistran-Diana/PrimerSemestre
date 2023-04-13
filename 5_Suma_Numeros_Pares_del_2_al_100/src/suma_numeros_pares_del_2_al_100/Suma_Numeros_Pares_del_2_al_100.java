/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma_numeros_pares_del_2_al_100;

/**
 *
 * @author 52614
 */
public class Suma_Numeros_Pares_del_2_al_100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Nombre: Diana Rebeca Rosales Capsitran
//No. control: 22550310
//Fundamentos de programación.

        // Escribir un programa que sume todos los números pares entre 2 y 100.
        int num = 2;
        int suma = 0;
        while (num <= 100) {
            if (num % 2 == 0) {
                suma = suma + num;
            }
            num = num + 1;
        }
        System.out.println(suma + " es la suma de los numeros pares");
    }
}
