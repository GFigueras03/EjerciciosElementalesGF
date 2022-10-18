package com.tiernoparla.ejercicioselementalesgf;
import java.util.*;
import java.lang.Math;

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
    //static void myInteres(double cantidadInicial, double numeroMeses, double interes){
    /*
        for(int i = 0; i< 10; i++){
            double operacion = 0;
            operacion = (cantidadInicial * interes) / 100;
            operacion = (operacion * 1) /12;
            operacion = (operacion * numeroMeses);
            // System.out.println("El interes simple de: \n" + "Cantidad inicial: " + cantidadInicial + " Euros\n"
            //  + "Interes: " + interes +"% \n" + "A:" + (int)numeroMeses + " meses"+ "\nEs igual a " + operacion + " Euros");
            // System.out.print("\n" + "la suma de la cantidad inicial mas el interes a x meses es igual a = ");
            System.out.print("año " + i + " ");
            System.out.print((float)operacion + (float)cantidadInicial + " Euros \n");
            cantidadInicial = operacion + cantidadInicial;

        }
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
    //*===>EJERCICIO 14 CONTRASEÑA<===*
    /*
    static void myPass(){
        //DECLARACIONES
        Scanner sc = new Scanner(System.in);

        String contraseña;
        String numeros = "1234567890";
        String caracteresEspeciales = "!·$%&/()=ª!?¿¡'`^+*çÇ´¨-_.:,;<>";
        String cadena = " ";
        cadena = caracteresEspeciales.toString();
        int sumaNumeros = 0; //= SUMA DE NUMEROS
        int sumaCaracteres = 0; //=SUMA DE CARACTERES
    

        //?DECLARACION DE LA CONTRASEÑA
        System.out.println("introduce una contraseña");
        contraseña = sc.nextLine();
        //?

        for(int i = 0; i< contraseña.length(); i++ ){
            //!IDENTIFICAR NUMEROS
            for(int j = 0; j< numeros.length(); j++){
                if(contraseña.charAt(i) == numeros.charAt(j)){
                    sumaNumeros++;
                }//?IF
            }//?FOR2
            //!IDENTIFICAR CARACTERES
            for(int k = 0; k < caracteresEspeciales.length(); k++){
                if(contraseña.charAt(i) == cadena.charAt(k)){
                    sumaCaracteres++;
                }//?IF2
            }//?FOR3
        }//?FOR

        if(sumaNumeros >=2 && contraseña.length()>= 10 && sumaCaracteres == 0){
          System.out.println("la contraseña contiene "+ contraseña.length() + " caracteres"
           + " y " + sumaNumeros + " de ellos son numeros");
        }//?IF (si hay 2 o mas de 2 numeros, la suma de caracteres de la contraseña es mayor o igual a 10, y No hay ningun caracter)  )
        else if(sumaNumeros < 2 || contraseña.length()< 10 || sumaCaracteres>=1){
            System.out.println("Tu contraseña no cumple uno de los requisitos" + "\n" +
            " La contraseña debe tener minimo 10 caracteres" +
            "\n de ellos 2 minimo deben ser letras y no puede contener ningun caracter especial");
            myPass();//?VOLVEMOS A EJECUTAR LA FUNCION
        }//!PERO, si hay menos de 2 numeros, o , la contraseña tiene menos de 10 caracteres, o contiene algun caracter especial, HACEMOS QUE REPITA LA FUNCION HASTA QUE SEA CORRECTA)
    }
    */
    //*===>EJERCICIO 15 MATRIZ nxn<===*
    /* 
    static void myMatrix(int n){
    int[][] array = new int[n][n];
    // System.out.println(x);
       for(int i = 0; i < n; i++){
           for(int j = 0; j < n; j++){
            double x = Math.round(Math.random());
                array[i][j] = (int)x;
                // System.out.print(" | " + array[i][j]+ " | ");
               // System.out.print(array[i][j]);
           }
          // System.out.println("");
         }
          for (int[] matriz : array) {
            System.out.println(Arrays.toString(matriz));
         };
    }
    */
    //*===>EJERCICIO 16 AREA TRIANGULO METODO HERÓN<===*
    /*
    static void myArea(int lado1,int lado2,int lado3){
    int perimetro = lado1 + lado2 + lado3;
    int s = perimetro / 2; // s = semiperimetro
    double area = (s*(s-lado1)*(s-lado2)*(s-lado3));
    area = Math.sqrt(area);
    System.out.println(area + "m2");
    }
    */
    //*===>EJERCICIO 17 NUMEROS PRIMOS GEMELOS<===* 
    /* //!METODO DECIR SI UN NUMERO ES PRIMO
    static void esPrimo(int numero){
        boolean isPrime = true;
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                isPrime = false;
                break;          
                }
            }
        if(isPrime){
            System.out.println("el numero es primo");
        }else System.out.println("el numero no es primo");
    }
    */
    /*//!METODO CALCULAR PRIMOS GEMELOS HASTA N
    static void primosGemelos(int tamaño){
        ArrayList<Integer> primos = new ArrayList<Integer>();
        for(int i=1;i<=tamaño;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
            //  System.out.println(i);
                primos.add(i);        
            }
        }
        int[] array = new int[primos.size()];
        for(int i =0; i< primos.size(); i++){
            array[i] = primos.get(i);
            //  System.out.println(array[i]);
        }
        System.out.println("Son numeros primos gemelos:");
        for(int i = 1; i< primos.size() ; i++){
            if(array[i] - primos.get(i - 1) == 2){
                System.out.println(primos.get(i -1) + " " +  array[i]);
        
            }
        }
    }
        */
    //*===>EJERCICIO 20 NUMERO DEL MEDIOs<===*
    /* 
    static void myMidNumber(){
        Scanner sc = new Scanner(System.in);
        int tamaño = 3;
        int[] array = new int[tamaño];
        System.out.println("INTRODUCE 3 NUMEROS");
        for(int i = 0; i< tamaño; i++){
            System.out.println("numero "+ i);
            array[i] = sc.nextInt();
        }
        System.out.println("los numeros escogidos son " + array[0] + " " + array[1] + " " + array[2]);
        System.out.println("el numero del medio es "+ array[1]);
    }
    */
    //*===>EJERCICIO 22 DIGITOS PARES<===*
    /* 
    static void myNumeroPar(Integer numero){
    String cadena = numero.toString(); 
    int tamaño = cadena.length();
    int count = 0;
    for(int i = 0; i<tamaño; i++){
        int operacion = cadena.charAt(i) % 2;
        if(operacion == 0){
            count++;
        }
    }
        if(count == tamaño){
            System.out.println("Todos los digitos de " + numero + " son pares");
        }else System.out.println("Todos los digitos de " + numero + " no son pares ");
    }
    */
    //*===>EJERCICIO 23 CONTAR VOCALES<===*
     /* 
        static void contarVocales(String palabra){
            String vocales = "aeiou";
            int suma = 0;
            for(int i = 0; i< palabra.length(); i++ ){
                for(int j = 0; j< vocales.length(); j++){
                    if(palabra.charAt(i) == vocales.charAt(j)){
                        suma++;
                        break;
                    }
                }
        }
            if(suma == palabra.length()){
                System.out.println("Todos los caracteres de la palabra "+ palabra +" son vocales \n" + "vocales: " + suma + "/" + palabra.length() );
            }
            else{
                System.out.println("no todos los caracteres de la palabra "+ palabra + " son vocales\n" + "vocales: " +  suma + "/" + palabra.length());
            } 
        
        }   
    */
    //*===>EJERCICIO 24 DAR VUELTA A STRING<===*
    /* 
    static void myPalabra(String palabra){
        for (int i = palabra.length() - 1; i >= 0; i--) {
                System.out.print( "| " + palabra.charAt(i) + " |" );
        }
        System.out.println("\n");
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
    String palabras = " 5holaa me  llamo guiller mo Figueras  jime nez";
    palabras = palabras.trim();
    System.out.println(palabras.split("\\s+").length);
    */
    /*
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
    //!EJERCICIO 12 INTERES
    //? cantidad inicial, interes (porcentaje), tiempo (en meses)
    //myInteres(100,12 , 5);
    //EMPIEZAS CON UN INTERES A X AÑOS


    //!EJERCICIO 13 AÑO BISIESTO
    //myYear(1064);
    //!EJERCICIO 14 PASSWORD
    //myPass();
    /*//?MODO RAPIDO
    Scanner sc = new Scanner(System.in);
    String password = sc.nextLine();
    boolean pass = true;
    int counter = 0;
    for(char c : password.toCharArray()){
        if(Character.isDigit(c)){
            counter++;
        }
    }
    if(password.length()< 10 || !password.matches("[a-zA-Z0-9]*") || counter < 2 ){
        pass = false;
    }
    else pass = true;
    System.out.println(pass);
    */
    //!EJERCICIO 15 MATRIZ NxN METODO
   // myMatrix(8);
    /*  
    Random rnd = new Random();
    for(int i = 0; i< 10; i++){
       Boolean j = rnd.nextBoolean();
       if(j){
           System.out.println(rnd);
       }else{
           System.out.println(rnd);
       }
    }
    */
    //!EJERCICIO 16 AREA TRIANGULO
    //? pasar (lado1,lado2,lado3)
    // myArea(14,22,12);
    //!EJERCICIO 17 NºPRIMOS GEMELOS
    //esPrimo(17);    
    //primosGemelos(100);
    //!EJERCICIO 18 NO ENTIENDO LA SINTAXIS
    //!EJERCICIO 19 NºCONSECUTIVOS
    /* 
    Scanner sc = new Scanner(System.in);
    int n;
    boolean consecutivo = true;
    System.out.println("cuantos numeros quieres introducir");
    n = sc.nextInt();
    int array[] = new int[n];
    
    for(int i = 0; i<n ; i++){
        System.out.println("introduce el numero " + i);
        array[i] = sc.nextInt();
    }
     for(int i = 0; i < n; i++){
        if(i != n-1){
            if(array[i + 1] - array[i] != 1){
                consecutivo = false;
            }
        }
     }
     if(!consecutivo){
        System.out.println("La cadena no es consecutiva");
     } else System.out.println("La cadena es consecutiva");
     
     */
    ////!EJERCICIO 20 NUMERO DEL MEDIO
     // myMidNumber();
    ////!ERJECICIO 22 DIGITOS PARES
    //myNumeroPar(435);
    ////!ERJECICIO 23 DIGITOS PARES
    //?FALTA VERSION REGEX
    //contarVocales("aaaeeeiuuoo");
    ////!ERJECICIO 24 DAR VUELTA A UN STRING
    //myPalabra("palabra");
    ///////////
   
















    } //TODOPSVM
}//TODOFINAL

