package com.tiernoparla.ejercicioselementalesgf;

//import java.util.*;
//import java.lang.Math;


public class EjerciciosElementalesGF {
    //!FUNCIONES{
    //*===>EJERCICIO 5 METODO CAPICUA <===*
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
    //*===>EJERCICIO 6 METODO NUMERO MENOR <=== MODO FACIL
    /* 
    static void myMinorNumber(int n,int n1,int n2,int n3,int n4, int n5, int n6, int n7){
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
    //*===>EJERCICIO 7 METODO MEDIA <===*
     /*
    static void myMedia(){
        int tamaño;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros vas a utlizar??");
        tamaño = sc.nextInt();
        int suma = 0;
        int result[] = new int[tamaño];
        for(int i = 0; i < tamaño; i++){
            System.out.println("Cual es el numero "  + i);
            result[i] = sc.nextInt();
        }//?BUCLE 1

        System.out.println("estos son los numeros escogidos");

        for(int i = 0; i < result.length; i++){
           System.out.print("numero" + i + "= " + result[i] + " ");
           suma = suma + result[i];
        }//?BUCLE2

        System.out.println("\n" + "ESTA ES LA MEDIA:" + "\n" + (double)suma / tamaño); 
    }
    */
    //*===>EJERCICIO 8 METODO CHAR MEDIO STRING <===*
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
            System.out.println("AL SER UNA PALABRA PAR ESTOS SON SUS DOS CARACTERES DEL MEDIO: " + letras[posicion]+ " " +  letras[impar]);
        }
    }
    */
    //*===>EJ8 MODO2<===*
     /*
    static void myChar2(String palabra){
        char letraImpar = palabra.charAt(palabra.length()/2);
        String letras = palabra.substring((palabra.length()/2)-1,(palabra.length()/2) +1);
           
        if(palabra.length()%2 != 0){
            System.out.println(letraImpar);
        }else{
            System.out.println(letras);
             }
        }
    */
    //*===>EJERCICIO 9 CONTAR VOCALES(VERSION METODO / MODO FACIL)<===*
     /*
    static void myVocals(String palabra){
        char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o';
        char u = 'u';
        palabra = palabra.toLowerCase();
        char[] arr = new char[palabra.length()];
        int recuento = 0;
        for(int y = 0; y< palabra.length(); y++){
            arr[y] = palabra.charAt(y);
            if(arr[y] == a || arr[y] == e || arr[y] == i || arr[y] == o || arr[y] == u){
                recuento= recuento + 1;
            }
        }
        System.out.println("la palabra " + palabra + " tiene " + palabra.length() + " caracteres y " + recuento + " vocales");
    }
    */
    //*===>EJERCICIO 12 METODO INTERES)<===*
    /* 
    static void myInteres(double cantidadInicial, double numeroMeses, double interes){
        double operacion = 0;
        operacion = (cantidadInicial * interes) / 100;
        operacion = (operacion * 1) /12;
        operacion = (operacion * numeroMeses);
        System.out.println("El interes simple de: \n" + "Cantidad inicial: " + cantidadInicial + " Euros\n"
         + "Interes: " + interes +"% \n" + "A:" + (int)numeroMeses + " meses"+ "\nEs igual a " + operacion + " Euros");
        System.out.print("\n" + "la suma de la cantidad inicial mas el interes a x meses es igual a = ");
        System.out.print(operacion + cantidadInicial + " Euros \n");
    }
    */
    //*===>EJERCICIO 13 AÑO BISIESTO)<===*
    /*
    static void myYear(int numero){
        if(numero%4 != 0){
            System.out.println("El año no es bisiesto");
        }else{
            System.out.println("El año es bisiesto");
        }
    }
    */
    //!}
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
    //?=====> FORMA 1 <=====?  
    /* 
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
    */ 
    //?=====> FORMA 2 <=====?
    /*
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
    
    
    // ?=====>  <=====?
     /*
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
    // ?=====>  <=====?
    /*
    for(int i = 0; i< tamaño; i++){
        cifras[i] = tmp % 10;
        System.out.println(cifras[i]);
        tmp = tmp / 10;
    }
    */
     //!=====>PAS0 3 RECUPERAR NUMERO <=====!
     
    //?=====>  <=====?
    /* 
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
    //?myMinorNumber(44,41,66,3,66,102,102,21);
    //*SIN MATH.MIN()
    /*
    int[] numeros = {0,100,22,1550,12,-1,44,221,13,-12,17,-170};
    int min = numeros[0];
    for(int i = 0; i< numeros.length; i++){
        if(min > numeros[i]){
            min = numeros[i];
        }
    }
        System.out.println(min);
    */
    //!Ejercicio 7 MEDIA DE X NUMEROS
    //CREAMOS EL METODO ARRIBA
    //LO LLAMAMOS AQUI ABAJO
    // myMedia();
    //*HECHO EN CLASE
    //?FORMA 1
    /*
    int[] n = {7,7,7,7,10};
    int suma = 0;
    for(int i= 0; i < n.length; i++){
        suma = suma + n[i];
        }
    System.out.println(suma);
    System.out.println((double)suma / n.length);
    */
    //!Ejercicio 8 STRING PALABRA DEL MEDIO
    //  myChar("GUILLERMO");
    //?MODO 2
    //MODO BUGGEADO
    /*
    String palabra = "CINCO";
    char[] letras = new char[palabra.length()];

    for(int i = 0;i<palabra.length(); i++){
        letras[i] = palabra.charAt(i);
        System.out.println(letras[i]);
    }
    String x = palabra.substring(0, palabra.length()/2);
    String y  = palabra.substring((palabra.length()/2)+1, palabra.length());
    System.out.println(x + y);

    //myChar2("GUILLERMO");
    */
    //!Ejercicio 9 CONTAR VOCALES
    /* //?SIN METODO
    String palabra = "";
    char a = 'a';
    char e = 'e';
    char i = 'i';
    char o = 'o';
    char u = 'u';
    char[] arr = new char[palabra.length()];
    int recuento = 0;
    for(int y = 0; y< palabra.length(); y++){
        arr[y] = palabra.charAt(y);
        if(arr[y] == a || arr[y] == e || arr[y] == i || arr[y] == o || arr[y] == u){
            recuento= recuento + 1;
        }
    }
    System.out.println("la palabra " + palabra + " tiene " + recuento + " vocales");
    */
    //myVocals("Guillermo");
    //!EJERCICIO CON MATRICES
    /*
    String vocales = "aeiou";
    String palabra;
    int suma = 0;
    Scanner sc = new Scanner(System.in);

    palabra = sc.nextLine().toLowerCase();
    for(int i = 0; i< palabra.length(); i++ ){
        for(int j = 0; j< vocales.length(); j++){
            if(palabra.charAt(i) == vocales.charAt(j)){
                suma++;
                break;
            }
        }
    }
    System.out.println("la palabra " + palabra + " posee " + suma + " vocales");
    
    */
    //!PROFE
    /*
    String palabra = "abcdef";
    int suma = 0;
    for(char c : palabra.toCharArray()){
       if(c == 'a' ||  c == 'e' || c == 'i' || c == 'o' || c == 'u') {
           suma++;
       }  
    }
    System.out.println(suma);


    */
    //!Ejercicio 10 CONTAR PALABRAS
    /* 
    String palabras = "holaa me  llamo guiller mo Figueras  jime nez ";
    String arr[] = palabras.split(" ");
     int contador = 0;
     for(int i = 0; i < arr.length; i ++){
         System.out.println(arr[i]);
         if(arr[i] != "  "){
             contador++;
         }else {
             break;
         }
     }
     String resultado = palabras.replaceAll("\\s", ".");
    System.out.println(palabras.split("\\s+").length);
    System.out.println(resultado);
    */
    //!Ejercicio 11 SUMA DE DIGITOS DE UN ENTERO
    /*
    Integer numero = 1234;
    String cadena;
    Integer suma = 0;
    cadena = numero.toString();
    Integer array[] = new Integer[cadena.length()];

    for(int i = 0; i< cadena.length(); i++){
        array[i] = Integer.parseInt(cadena.substring(i, i + 1));
        suma = suma + array[i];
    }
    System.out.println("la suma de los digitos de " +numero +" es igual a = " + suma);
    */

    //!EJERCICIO 12
    //? cantidad inicial, interes (porcentaje), tiempo (en meses)
    //myInteres(10000, 5, 4);

    //!EJERCICIO 13
    //myYear(1064);

    } //TODOPSVM
}//TODOFINAL

