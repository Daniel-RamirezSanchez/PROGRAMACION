package com.danirs;

import java.util.Scanner;

public class Bucles15 {
    public static void main(String[] args) {
        //8 por pantalla usando la letra M.
        // Se pide al usuario la altura, que debe ser un
        // número entero impar mayor o igual que 5.
        // Si el número introducido no es correcto, el programa deberá mostrar un mensaje de error.
        // La anchura de la figura siempre será de 6 caracteres.

        Scanner sc=new Scanner(System.in);
        int tam;

        System.out.println("introduce un numero impar y mayor o igual a 5");
        tam= sc.nextInt();

        while(tam<5 || tam%2==0){
            System.out.println("numero incorrecto. introduzca un numero impar y mayor o igual a 5");
            tam= sc.nextInt();
        }if(tam>=5 && tam%2==1){
            for (int f = 0; f < tam; f++) {
                for (int c = 0; c < 6; c++) {
                    if (f==0 || f==tam-1 || f==(tam/2)|| c==0 || c==5){
                        System.out.print("M");

                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
                }
            }


        }
}




