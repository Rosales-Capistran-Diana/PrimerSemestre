/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9_10multiplicacion_suma;

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

//Diseñar un algoritmo que pida por teclado tres números; si el primero es negativo, 
//debe imprimir la multiplicación de los tres y si no lo es, imprimirá la suma.
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba el primer número (positivo para sumar o negativo para multiplicar)");
        int num1;
        num1 = sc.nextInt();
        System.out.println("Escriba el segundo número");
        int num2;
        num2 = sc.nextInt();
        System.out.println("Escriba el tercer número");
        int num3;
        num3 = sc.nextInt();

        if (num1 < 0) {
            int resultado = num1 * num2 * num3;
            System.out.println("El resultado es " + resultado);
        } else {
            int resultado = num1 + num2 + num3;
            System.out.println("El resultado es " + resultado);
        }
    }
}
