package com.daniRS;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo infiel.
        // El programa irá haciendo preguntas que el usuario contestará con verdadero o falso. Cada pregunta contestada como verdadero sumará 3 puntos.
        // Las preguntas contestadas con falso no suman puntos.
        // A continuación se listan las preguntas del test.
        Scanner sc=new Scanner(System.in);
        int contador=0;
        int respuesta;

        System.out.println("contesta las siguientes preguntas con el numero 1 si es verdadero o 2 si es falso");

        System.out.println(" Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        respuesta= sc.nextInt();
        while (respuesta==1){
            contador=contador+3;
        }
        System.out.println("Ha aumentado sus gastos de vestuario");
        respuesta = sc.nextInt();
        while (respuesta==1){
            contador=contador+3;
        }
            System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
        respuesta = sc.nextInt();
        while (respuesta==1){
            contador=contador+3;
        }
            System.out.println(" Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        respuesta= sc.nextInt();
        while (respuesta==1){
            contador=contador+3;
        }
            System.out.println("No te deja que mires la agenda de su teléfono móvil");
        respuesta = sc.nextInt();
        while (respuesta==1){
            contador=contador+3;
        }
            System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        respuesta = sc.nextInt();
        while(respuesta==1){
            contador=contador+3;
        }
            System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        respuesta = sc.nextInt();
        while (respuesta==1);{
            contador=contador+3;
        }
            System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        respuesta = sc.nextInt();
        while (respuesta==1);{
            contador=contador+3;
        }
            System.out.println("Has notado que últimamente se perfuma más");
        respuesta= sc.nextInt();
        while (respuesta==1){
            contador=contador+3;
            System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        respuesta= sc.nextInt();
        while (respuesta==1){
            contador=contador+3;

        }System.out.println("la puntuacion obtenida es " +(contador));

        if (contador>=0 && contador<=10){
            System.out.println(" ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }else if(contador>10 && contador<23){
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        }else {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza");

        }
            {

                {

                }}
            }











    }
}
