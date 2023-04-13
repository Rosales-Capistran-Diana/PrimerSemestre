/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9_11_num_primo_o_no;

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
//Definir un programa que determine si un número ingresado es primo o no. 
//(Un número es primo si es divisible únicamente por 1 y por sí mismo).
Scanner sc= new Scanner(System.in);

System.out.println("Ingrese un número");
int n1 = sc.nextInt();
int contador =0;

for (int i= 1; i<= n1; i++){
    if (n1 % i == 0){
        contador++;
    }
}
    if (contador ==2){
        System.out.println( n1 + " es un número primo");
    } 
    else{
        System.out.println(n1 + " no es un número primo");
    }
    }
}