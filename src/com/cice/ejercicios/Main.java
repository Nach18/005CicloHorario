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

        int x=0;

        switch (x){
            case 0:
                System.out.println("X vale 0");

            case 1:
                System.out.println("X vale 1");
                break;
            case 2:
                System.out.println("X vale 2");
        }


        for (int i = 0; i<=24; i++) {

            System.out.print("¿Que hora es compañero? (24H enteras)");

            int horaSC = SC.nextInt();

            if (horaSC >= 6 && horaSC < 12) {
                System.out.println("Son las " + horaSC + ", buenos días");
            } else if (horaSC >= 12 && horaSC < 21) {
                System.out.println("Son las " + horaSC + ", buenas tardes");
            } else if (horaSC >= 21 && horaSC <= 23 || horaSC >= 0 && horaSC < 6) {
                System.out.println("Son las " + horaSC + ", buenas noches");
            } else {
                System.out.println("No te he entendido, ¿me puedes repetir la hora según el formato de 24 Horas?");
            }

        }
    }
}
