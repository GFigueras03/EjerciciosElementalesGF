package com.tiernoparla.ejercicioselementalesgf;

// import java.util.*;

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

        // EJERCICIO 2

        /*
         * try (Scanner entrada = new Scanner(System.in)) {
         * Integer N;
         * Integer D;
         * Integer R;
         * Integer Q;
         * 
         * System.out.println("Introduce N:");
         * N = entrada.nextInt();
         * System.out.println("Introduce D:");
         * D = entrada.nextInt();
         * System.out.println("R = " + N);
         * R = N;
         * Q = 0;
         * 
         * while (R >= D) {
         * R = R - D;
         * Q++;
         * System.out.println(R);
         * }
         * if ((D * Q) + R == N) {
         * System.out.println(true);
         * }
         * 
         * // System.out.println("R = " + R + "\n" + "Q = " + Q + "\n" + "D = " + D);
         * // System.out.println("( D * Q ) + R = ");
         * // System.out.println((D * Q) + R);
         * }
         */

        /// EJERCICIO3
        // FIBONNACI
        // ARRAYS

        /*
         * Integer x1 = 1;
         * Integer x2 = 1;
         * Integer x3 = 0;
         * 
         * for(Integer i = 3; i<= 10; i++){
         * x3 = x2 + x1;
         * x1 = x2;
         * x2 = x3;
         * System.out.println(x3);
         * }
         * //FIBONACCI CON ARRAYS
         * 
         * Integer[] numeros = {1,1,2};
         * 
         * for(Integer i = 1; i<= 8; i++){
         * numeros[2] = numeros[1] + numeros[0];
         * numeros[0] = numeros[1];
         * numeros[1] = numeros[2];
         * System.out.println(numeros[2]);
         * }
         */
        /*
         * int N = 8;
         * Integer[] numeros = {1,1,2};
         * Integer[] result = new Integer[3];
         * 
         * for(Integer i = 0; i<= N; i++){
         * numeros[2] = numeros[1] + numeros[0];
         * numeros[0] = numeros[1];
         * numeros[1] = numeros[2];
         * System.out.println(numeros[2]);
         * }
         */

        int N = 8;
        int fibbo[] = new int[3];
        fibbo[0] = 1;
        fibbo[1] = 1;
        fibbo[2] = 0;

        int result[] = new int[N];

        for (int i = 0; i <= N; i++) {
            fibbo[2] = fibbo[1] + fibbo[0];
            fibbo[0] = fibbo[1];
            fibbo[1] = fibbo[2];
            result[i] = fibbo[2];
            // System.out.println(fibbo[2]);
            // System.out.println(result[i]);
             System.out.println(result[i]);
            
        }

    }

}
