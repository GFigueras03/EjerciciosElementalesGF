package com.tiernoparla.ejercicioselementalesgf;

//import java.util.*;

public class EjerciciosElementalesGF {

    public static void main(String[] args) {
        // ! EJERCICIO 1
        /*
         int i = 0;
         while (i <= 10) {
         i++;
         if (i % 2 == 0) {
         System.out.println(i);
         } //IF
         }//WHILE
        */
        // ! EJERCICIO 2
        /*
         try (Scanner entrada = new Scanner(System.in)) {
         Integer N;
         Integer D;
         Integer R;
         Integer Q
         System.out.println("Introduce N:");
         N = entrada.nextInt();
         System.out.println("Introduce D:");
         D = entrada.nextInt();
         System.out.println("R = " + N);
         R = N;
         Q = 0
         while (R >= D) {
         R = R - D;
         Q++;
         System.out.println(R);
         }
         if ((D * Q) + R == N) {
         System.out.println(true);
         
         System.out.println("R = " + R + "\n" + "Q = " + Q + "\n" + "D = " + D);
         System.out.println("( D * Q ) + R = ");
         System.out.println((D * Q) + R);
         }
         */
        // ! EJERCICIO3
        //? FIBONNACI
        //? ARRAYS
        /*
       
          Integer x1 = 1;
          Integer x2 = 1;
          Integer x3 = 0;5
          
          for(Integer i = 3; i<= 10; i++){
          x3 = x2 + x1;
          x1 = x2;
          x2 = x3;
          System.out.println(x3);
          }
        */
        //? FIBONACCI CON ARRAYS
        /*
        ? FORMA 1
       
        int N = 20;
        int fibbo[] = new int[3];
        fibbo[0] = 1;
        fibbo[1] = 1;
        int result[] = new int[N];
        for (int i = 2; i < N; i++) {
        fibbo[2] = fibbo[1] + fibbo[0];
        fibbo[0] = fibbo[1];
        fibbo[1] = fibbo[2];
        result[i] = fibbo[2];
        System.out.println(result[i]);
        }
        
        ? FORMA 2
        int N = 20;
        int fibbo[] = new int[N];
        fibbo[0] = 1;
        fibbo[1] = 1;
        // * x(n) = x(n-1) + x(n-2)

        for (int i = 2; i < N; i++) {
            fibbo[i] = fibbo[i - 1] + fibbo[i - 2];
        } // FOR
        for (int i = 0; i < fibbo.length; i++) {
            System.out.println(fibbo[i]);
        } // FOR2

        */  
        
    }

}
