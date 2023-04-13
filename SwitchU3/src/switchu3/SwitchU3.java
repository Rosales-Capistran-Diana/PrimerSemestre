/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchu3;

import java.util.Scanner;

/**
 *
 * @author 52614
 */
public class SwitchU3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Nombre: Diana Rebeca Rosales Capsitran
//No. control: 22550310
//Fundamentos de programación.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int op;
        op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Hola mundo!");
                break;
            case 2:
                System.out.println("Mayor_Menor_Igual_10");
                System.out.println("Escribe el número");
                int N;
                N = sc.nextInt();
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
                break;
            case 3:
                System.out.println("Par_Impar");
                System.out.println("Ingrese un numero");
                int n;
                n = sc.nextInt();
                if (n % 2 == 0) {
                    System.out.println(n + " es un numero par");
                } else {
                    System.out.println(n + " es un numero impar");
                }
                break;
            case 4:
                System.out.println("Suma");
                System.out.println("Ingrese un numero");
                int n1;
                n1 = sc.nextInt();
                System.out.println("Ingrese otro numero");
                int n2;
                n2 = sc.nextInt();
                int Suma;
                Suma = n1 + n2;
                System.out.println(Suma + " es el resultado de la suma de los numeros " + n1 + " y " + n2);
                break;
            case 5:
                System.out.println("Suma_Numeros_Pares_del_2_al_100");
                int num = 2;
                int suma = 0;
                while (num <= 100) {
                    if (num % 2 == 0) {
                        suma = suma + num;
                    }
                    num = num + 1;
                }
                System.out.println(suma + " es la suma de los numeros pares");
                break;
            case 6:
                System.out.println("Divisores de un numero");
                System.out.println("Ingrese un numero");
                int d;
                d = sc.nextInt();
                System.out.println("Los divisores son:");
                for (int i = 1; i <= d; i++) {
                    if (d % i == 0) {
                        System.out.println(i);
                        break;
                    }
                }
            case 7:
                System.out.println("Promedio_3_Calificaciones");
                System.out.println("Escriba la primer calificacion");
                double C1 = sc.nextDouble();
                System.out.println("Escriba la segunda calificacion");
                double C2 = sc.nextDouble();
                System.out.println("Escriba la tercer calificacion");
                double C3 = sc.nextDouble();

                double Promedio;
                Promedio = (C1 + C2 + C3) / 3;
                if (Promedio >= 7) {
                    System.out.println(Promedio + " es calificacion aprobatoria ");
                } else {
                    if (Promedio < 7) {
                        System.out.println(Promedio + " es calificacion reprobatoria ");
                    }
                }
                break;
            case 8:
                System.out.println("Cantidad_Nombre");

                System.out.println("Ingrese algun nombre");
                String Nom = sc.next();
                System.out.println("Cantidad de veces que se repetira el nombre");
                int Num = sc.nextInt();
                while (Num > 0) {
                    System.out.println(Nom);
                    Num = Num - 1;
                }
                break;
            case 9:
                System.out.println("Suma_Num_Nat_1_al_50");
                int NUM;
                NUM = 1;
                int s = 0;
                do {
                    s = (s + NUM);
                    NUM++;
                } while (NUM <= 50);
                System.out.println(s + " es el resultado de la suma de los numeros naturales comprendidos entre 1 y 50");
                break;
            case 10:
                System.out.println("Multiplicacion_Suma");
                System.out.println("Escriba el primer numero (positivo para sumar o negativo para multiplicar)");
                int num1;
                num1 = sc.nextInt();
                System.out.println("Escriba el segundo numero");
                int num2;
                num2 = sc.nextInt();
                System.out.println("Escriba el tercer numero");
                int num3;
                num3 = sc.nextInt();

                if (num1 < 0) {
                    int resultado = num1 * num2 * num3;
                    System.out.println("El resultado es " + resultado);
                } else {
                    int resultado = num1 + num2 + num3;
                    System.out.println("El resultado es " + resultado);
                }
                break;
            case 11:
                System.out.println("Num_Primo_o_No");
                System.out.println("Ingrese un numero");
                int t1 = sc.nextInt();

                boolean band = true;
                int div = 2;

                if (t1 == 1) {
                    System.out.println(t1 + " es numero primo");
                } else {
                    while (band == true & t1 > div) {
                        if (t1 % div == 0) {
                            band = false;
                        }
                        div++;
                    }
                    if (band == true) {
                        System.out.println(t1 + " el numero es primo");

                    } else {
                        System.out.println(t1 + " el numero no es primo");
                    }
                }
                break;
            case 12:
                System.out.println("Suma_de_los_digitos_de_un_Numero");
                System.out.println("Ingrese un numero para sumar sus digitos");
                int D;
                D = sc.nextInt();

                int resultado = 0;
                while (D != 0) {
                    resultado = (resultado + D % 10);
                    D = (int) (D / 10);
                }
                System.out.println("El resultado es " + resultado);
                break;
            case 13:
                System.out.println("Grados Fahrenheit a Celsius");
                int fahrenheit = 10;
                double celsius;
                System.out.printf(" ºF \t ºC \n");
                System.out.println("---------------");
                while (fahrenheit <= 100) {
                    celsius = (fahrenheit - 32) * 5 / 9.0;
                    System.out.printf("%3d\t%6.2f \n", fahrenheit, celsius);
                    fahrenheit += 10;
                    System.out.println("---------------");
                }
                break;
            case 14:
                System.out.println("Lista de los numeros 1 - 10");
                int i = 1;
                do {
                    System.out.print(i + " ");
                    i++;
                } while (i <= 10);
                System.out.println("\nFin programa");
                break;
            case 15:
                System.out.println("Valor a + b");
                for (int a = 1, b = 1; a + b < 10; a++, b += 2) {
                    System.out.println("a = " + a + " b = " + b + " a + b = " + (a + b));
                }
                break;
            case 16:
                System.out.println("Tabla de potencias");
                int K,k;
                System.out.printf("%10s%10s%10s%10s%n", "x", "x^2", "x^3", "x^4");
                for (K = 1; K <= 10; K++) {
                    for (k = 1; k <= 4; k++) {
                        System.out.printf("%10.0f", Math.pow(K, k));
                    }
                    System.out.println();
                }
                break;
            case 17:
                System.out.println("Numeros del 1 al 50, hasta que el numero sea multiplo de 3 y 5");
                for (int g = 1; g <= 50; g++) {
                    if (g % 3 == 0 && g % 5 == 0) {
                        break; //provoca el final del for
                    }
                    System.out.println(g);
                }
                System.out.println("Hasta Pronto!!!");
                break;
            case 18:
                System.out.println("Numeros del 1 al 50, excepto multiplos del 3 y 5");
                for (int a = 1; a <= 50; a++) {
                    if (a % 3 == 0 && a % 5 == 0) {
                        continue;
                    }
                    System.out.println(a);
                }
                break;
            case 19:
                int w;
                System.out.println("Introduzca numero: ");
                w = sc.nextInt();
                System.out.println(w >= 0 ? "POSITIVO" : "NEGATIVO");
                break;
            case 20:
                System.out.println("Suma Numeros aleatorios hasta 100 o mas");
                int sum = 0;
                int r = 0;
                int cont = 0;
                int nr = 0;

                do {
                    nr = (int) (Math.random() * 14 + 1);
                    r = sum + nr;
                    System.out.println(sum + "+" + nr + "=" + r);
                    sum = (sum + nr);
                    if (r >= 0) {
                        cont++;
                    }
                } while (sum <= 100);

                System.out.println("'El valor de la suma total es:" + sum);
                System.out.println("Las sumas que se hicieron fueron: " + cont);
                break;
            default:
                System.out.println("Numero no valido");
        }
    }
}
