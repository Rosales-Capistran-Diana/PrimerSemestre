/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma_de_los_digitos_de_un_num;

import java.util.Scanner;

/**
 *
 * @author 52614
 */
public class Suma_de_los_digitos_de_un_Num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Nombre: Diana Rebeca Rosales Capsitran
//No. control: 22550310
//Fundamentos de programación.        

        //Crear un programa que efectúe la suma de los dígitos de un número ingresado. 
        //Ejemplo: Si se ingresa 123, debería devolver 6.
        System.out.println("Ingrese un número para sumar sus dígitos");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        int resultado = 0;

// Se utiliza (!=) para decir que es diferente
        while (n != 0) {
            resultado = (resultado + n % 10);
            n = (int) (n / 10);
        }
        System.out.println("El resultado es " + resultado);
    }
}
