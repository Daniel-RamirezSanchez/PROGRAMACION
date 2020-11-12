package com.danirs;

import java.util.Scanner;

public class Main {
    //escribe HOLA
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;

        System.out.println("dime tu nombre");
        nombre = sc.nextLine();
        System.out.println("hola "+nombre);
    }
}
