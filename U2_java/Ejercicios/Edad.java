package com.danirs;

import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.println("Introduce tu edad");
        edad = sc.nextInt();

        if (edad < 18) {
            System.out.println("es menor de edad");
        } else if (edad < 65) {
            System.out.println("trabajador");
        } else if (edad < 100) {
            System.out.println("jubilado");
        } else
            System.out.println("eterno");
    }
}
