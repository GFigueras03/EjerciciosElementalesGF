package com.tiernoparla.ejercicioselementalesgf;

import java.util.*;
//import java.lang.Math;


public class EjerciciosElementalesGF {
    //*===>EJ5 METODO CAPICUA <===*
    /* 
    static void myCapicua(int N){
        int aux, inverso = 0, cifra;
        aux = N;
        while(aux != 0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
        if(N == inverso){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    */
    //*===>EJ6 METODO NUMERO MENOR <=== MODO FACIL
    /* 
    static void myMenorNumber(int n,int n1,int n2,int n3,int n4, int n5, int n6, int n7){
        int op1 = Math.min(n,n1);
        int op2 = Math.min(n2, n3);
        int op3 = Math.min(n4, n5);
        int op4 = Math.min(n6, n7);
        int res1 = Math.min(op1, op2);
        int res2 = Math.min(op3, op4);
        int opFinal = Math.min(res1, res2);
        System.out.println(opFinal);

    }
    */
    //*===>EJ7 METODO MEDIA <===
     /*
    static void myMedia(){
        int tamaño;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros vas a utlizar??");
        tamaño = sc.nextInt();
        int suma = 0;
        int result[] = new int[tamaño];
        for(int i = 0; i < tamaño; i++){
            System.out.println("Cual es el numero" + " " + i);
            result[i] = sc.nextInt();
        } //!BUCLE 1

        System.out.println("estos son los numeros escogidos");

        for(int i = 0; i < result.length; i++){
           System.out.print("numero" + i + "= " + result[i] + " ");
           suma = suma + result[i];
        }//!BUCLE2

        System.out.println("\n" + "ESTA ES LA MEDIA:" + "\n" + (double)suma / tamaño); 
    }
    */
    
    //*===>EJ8 METODO CHAR MEDIO STRING <===
    /* 
    static void myChar(String palabra){
        System.out.println("LA PALABRA: " + palabra + " TIENE " + palabra.length() + " CHARACTERES");
        char[] letras = new char[palabra.length()];
        int posicion = palabra.length() / 2;
        int impar = posicion--;
        int i = 0;
        for(i = 0;i<palabra.length(); i++){
            letras[i] = palabra.charAt(i);
        }
         if(palabra.length()%2 != 0){
            System.out.println("AL SER UNA PALABRA IMPAR ESTA ES CARACTER DEL MEDIO: " + letras[posicion]);
         }else{
            System.out.println("AL SER UNA PALABRA PAR ESTOS SON SUS DOS CARACTERES DEL MEDIO: " + letras[posicion]+ "" + "" +  letras[impar]);
         }
    }
    //SUBSTRING
    */
    
    public static void main(String[] args) {
        //!=====> EJERCICIO 1 <=====!
        /*
         int i = 0;
         while (i <= 10) {
            i++;
            if (i % 2 == 0) {
                 System.out.println(i);
                 } //IF
            }//WHILE
        */
        //!=====> EJERCICIO 2 <=====!
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
        //!=====> EJERCICIO3 <=====!
        //?=====>FIBONNACI <=====?

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
        //?=====> FIBONACCI CON ARRAYS <=====?
        /*
        ?=====> FORMA 1 <=====?
       
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
        
    ?=====> FORMA 2 <=====?
    int N = 20;
    int fibbo[] = new int[N];
    fibbo[0] = 1;
    fibbo[1] = 1;
     x(n) = x(n-1) + x(n-2) //*FORMULA
    for (int i = 2; i < N; i++) {
        fibbo[i] = fibbo[i - 1] + fibbo[i - 2];
    } // FOR
    for (int i = 0; i < fibbo.length; i++) {
        System.out.println(fibbo[i]);
    } // FOR2
    */  
    //!Ejercicio 4 CAPICUA
        //PASO 1 MODULO 10
        //PASO 2 DIVIDIR / 10 Y GUARDAR VALORES
    //*=====> TEORIA <=====*
        // System.out.println(N%10); //?PRIMERA CIFRA
        // System.out.println((N/10)%10);//!SEGUNDA CIFRA
        // System.out.println(((N/10)/10)%10);//*TERCERA CICRA
    // System.out.println((((N/10)/10)/10)%10);//CUARTA CIFRA


    //sout(arr[0]*10^3)  // 1000
    //sout(arr[1]*10^2)  // 500
    //sout(arr[2]*10^1)  // 40
    //sout(arr[3]*10^0)  // 3

    //sout(arr[i]*10^(tamaño-1)-i)
    
    /*
     ?=====>  <=====?
    int N = 5005; 
    String tamaño1 = Integer.toString(N);
    int tamaño = tamaño1.length();
    int tmp = N;
    int cifras[] = new int[tamaño];
    */
    //!======> SACAR CIFRAS <======!
    /*
    for(int i = 0; i<tamaño; i++){
        System.out.println(tmp % 10);
        tmp = tmp / 10;
      }
    */
    //!=====> SACAR CIFRAS Y GUARDARLAS <=====!
    /*
    ?=====>  <=====?
    for(int i = 0; i< tamaño; i++){
        cifras[i] = tmp % 10;
        System.out.println(cifras[i]);
        tmp = tmp / 10;
    }
    */
     //!=====>PAS0 3 RECUPERAR NUMERO <=====!
     /* 
     ?=====>  <=====?
    double x = 0;
    for(int i = 0; i < tamaño; i++){
        x = x + cifras[i]*Math.pow(10,tamaño - (i+1));
        }//FOR
        System.out.println((int)x);

    if(x == N){
         System.out.println("EL NUMERO ES CAPICUA");
        }//IF
        
    else{
         System.out.println("EL NUMERO NO ES CAPICUA");
        }//ELSE
        */
   //!Ejercicio 5 CAPICUA EN METODO
    //CREAMOS EL METODO ARRIBA
    //LO LLAMAMOS AQUI ABAJO
    //?myCapicua(123454321);



   //!Ejercicio 6 MENOR DE X NUMEROS
    //CREAMOS EL METODO ARRIBA
    //LO LLAMAMOS AQUI ABAJO
    //?myMenorNumber(44,41,66,3,66,102,102,21);
    //*SIN MATH.MIN()
    /*
        int[] numeros = {0,100,22,1550,12,-1,44,221,13,-12,17,-170};
        int y = numeros[0];
        for(int i = 0; i< numeros.length; i++){
           if(y > numeros[i]){
               y = numeros[i];
           }else{
               y = y;
           }
        }
            System.out.println(y);
            */
  //!Ejercicio 7 MEDIA DE X NUMEROS
    //CREAMOS EL METODO ARRIBA
    //LO LLAMAMOS AQUI ABAJO
   // myMedia();
   //*HECHO EN CLASE
   //?FORMA 1
    int[] n = {1,4,5,7};
    int suma = 0;
    for(int i= 0; i<n.length; i++){
        suma = suma + n[i];
    }
    System.out.println(suma);
    System.out.println((double)suma / n.length);
    
  //!Ejercicio 8 STRING PALABRA DEL MEDIO
  //  myChar("GUILLERMO");

    } //TODOPSVM
}//TODOFINAL

