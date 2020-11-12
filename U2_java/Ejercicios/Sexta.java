package com.danirs;

import java.util.Scanner;
// PASAR MILLAS A KM
public class Sexta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;

        System.out.println("introduce el numero de millas");
        n = sc.nextDouble();
        System.out.println("su equivalencia en km es " +(n*1.609));
    }
}
