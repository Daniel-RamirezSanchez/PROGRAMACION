package com.DANIEL_RS;

import java.util.Arrays;

// EJ 4
public class Main {

    public static void main(String[] args) {
	int [][] matriz = new int[5][9];
	int minimo=0;
	int maximo=0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= (int) (Math.random()*900+100);
                if (i==0 && j==0){
                    minimo = matriz[i][j];
                    maximo = matriz[i][j];
                }else {
                    if (matriz[i][j]<minimo){
                        minimo=matriz[i][j];
                    }
                    if (matriz[i][j]>maximo){
                        maximo=matriz[i][j];
                    }
                }
            }

        }

        System.out.println(Arrays.deepToString(matriz));
        System.out.println("el mínimo es: " +minimo);
        System.out.println("el máximo es: " +maximo);

    }
}
