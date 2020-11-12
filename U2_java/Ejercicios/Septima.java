package com.danirs;

import java.util.Scanner;
//calcula edad introduciendo año actual y de nacimiento
public class Septima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short nacimiento, actual;

        System.out.println("introduce tu año de nacimiento");
        nacimiento = sc.nextShort();
        System.out.println("introduce el año actual");
        actual = sc.nextShort();
        System.out.println("tu edad es " +(actual-nacimiento));
    }
}
