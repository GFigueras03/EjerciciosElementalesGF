package com.tiernoparla.ejercicioselementalesgf;

import java.util.*;

public class EjerciciosElementalesGF {

    public static void main(String[] args) {
        // EJERCICIO 1
        // int i = 0;
        // while (i <= 10) {
        // i++;
        // if (i % 2 == 0) {
        // System.out.println(i);
        // } //IF
        // }//WHILE

        //EJERCICIO 2

        try (Scanner entrada = new Scanner(System.in)) {
            Integer N;
            Integer D;
            Integer R;
            Integer Q;

            System.out.println("Introduce N:");
            N = entrada.nextInt();
            System.out.println("Introduce D:");
            D = entrada.nextInt();
            System.out.println("R = " + N);
            R = N;
            Q = 0;

            while (R >= D) {
                R = R - D;
                Q++;
                System.out.println(R);
            }
                if((D*Q)+ R == N){
                    System.out.println(true);
                }


           // System.out.println("R = " + R + "\n" + "Q = " + Q + "\n" + "D = " + D);
           // System.out.println("( D * Q ) + R = ");
           // System.out.println((D * Q) + R);
        }

    }

}
