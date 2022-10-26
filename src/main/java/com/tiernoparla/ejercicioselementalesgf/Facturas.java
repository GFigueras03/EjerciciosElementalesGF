package com.tiernoparla.ejercicioselementalesgf;
public class Facturas{
    public String codArticulo;
    public Integer cantVendida;
    public Double precioLitro;

   public Facturas(String codArticulo, Integer cantVendida, Double precioLitro){
        this.codArticulo = codArticulo;
        this.cantVendida = cantVendida;
        this.precioLitro = precioLitro;
    }
    public Double facturacionTotal(){
        return cantVendida * precioLitro;
    }
   
}
