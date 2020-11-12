package com.danirs;

import java.util.Scanner;
//PIDE DATOS AL USUARIO Y MUESTRA EN PANTALLA
public class Tercero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellidos,direccion;

        System.out.println("Introduce tu nombre");
        nombre = sc.nextLine();
        System.out.println("Introduce tus apellidos");
        apellidos = sc.nextLine();
        System.out.println("introduce tu direccion");
        direccion= sc.nextLine();

        System.out.println("----------------");
        System.out.println("NOMBRE: " +nombre);
        System.out.println("APELLIDOS: "+ apellidos);
        System.out.println("DIRECCION: " +direccion);
        System.out.println("----------------");
    }
}
