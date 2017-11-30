package com.cice.ejercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        /*
        System.out.print("Introduce un número del que que quieras saber si es par o impar: ");
        int numeroSC = SC.nextInt();

        System.out.print("El " + numeroSC + " es un número " );

        numeroSC %= 2;

        if (numeroSC == 0) {
            System.out.println("par");
        }else
            System.out.println("impar");

        */

        System.out.println("¿Que hora es compañero?");

        int horaSC = SC.nextInt();

        if (horaSC >= 6 && horaSC < 12){
            System.out.println("Buenos Días");

        }else if (horaSC >= 12 && horaSC < 21) {
            System.out.println("Buenas Tardes");
        }else if (horaSC >= 21 && horaSC < 6) {
            System.out.println("Buenas Tardes");
        }else if (horaSC >= 19 && horaSC < 6);
            System.out.println("Buenas Noches");
    }
}
