package com.danirs;

import java.util.Scanner;

public class Bucles18 {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);

            System.out.print("Introduce el numero: ");
            int numEntero = Integer.parseInt(System.console().readLine());

            System.out.print("Introduce en que posicion quiere partir el número: ");
            int pos = Integer.parseInt(System.console().readLine());
            // Cuenta los números y calcula el reves
            int numFin = numEntero;
            int numDig = 0;
            int numReves = 0;
            while (numFin > 0){
                numReves = ((numReves*10) + (numFin % 10));
                numFin /=10;
                numDig++;
            }
            // Calcula primer número
            int num1 = 0;
            for (int i = 1; i < pos; i++){
                num1 = ((num1*10) + (numReves % 10));
                numReves /=10;
            }
            int num2 = 0;
            for (int i = pos; pos <= numDig; pos++){
                num2 = ((num2*10) + (numReves % 10));
                numReves /=10;
            }
            System.out.print("Los números partidos son el "+num1+" y el "+num2);
        }
    }

}