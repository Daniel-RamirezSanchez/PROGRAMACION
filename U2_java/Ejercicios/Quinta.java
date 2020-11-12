package com.danirs;

import java.util.Scanner;
// INTRODUCE NUMEROS PARA OPERACIONES SENCILLAS (SUMA,RESTA,MULTIPLICACION,DIVISION)
public class Quinta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.println("introduce un numero");
        a = sc.nextInt();
        System.out.println("introduce otro numero");
        b = sc.nextInt();


        System.out.println("la suma es " +(a+b));
        System.out.println("la resta es " +(a-b));
        System.out.println("la multiplicacion es " +(a*b));
        System.out.println("la division es " +(a/b));
    }
}
