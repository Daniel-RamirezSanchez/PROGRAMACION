package com.danirs;

import java.util.Scanner;
//Dada una cadena mostrar por pantalla la cantidad de vocales que tiene.
public class Bucles16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String cadena;
        int numvocales=0;

        System.out.println("introduce la cadena");
        cadena= sc.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            char cararacter = cadena.charAt(i);
            if (cararacter=='a' || cararacter=='e' || cararacter=='i' || cararacter=='o' || cararacter=='u'){
                numvocales++;
            }

        }
        System.out.println("El numero de vocales es: " +numvocales);


    }
}
