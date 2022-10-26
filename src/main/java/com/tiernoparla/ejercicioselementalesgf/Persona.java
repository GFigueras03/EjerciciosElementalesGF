package com.tiernoparla.ejercicioselementalesgf;

public class Persona {
    //!EJERCICIO 45
    public String nombre;
    public Integer edad;
    public Double altura;

    public Persona(String nombre, Integer edad, Double altura){
        this.nombre = nombre;
        this.edad  = edad; 
        this.altura = altura;
    }
    public int myEdad(){
        return edad;
    }
    public Double myAltura(){
        return altura;
    }
    
}   
