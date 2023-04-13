package com.mycompany.tiendaatecnologica;

public class Producto {
    private String marca;
    private String modelo;
    private int ano;
    private int resolucionPantalla;
    private String tipoDeTeclado;
    private int bateria;
  
  public Producto(){}
  public Producto( String marca, String modelo,int ano, int resolucionPantalla, String tipoDeTeclado,int bateria){
    this.marca = marca;
    this.modelo = modelo;
    this.ano=ano;
    this.resolucionPantalla = resolucionPantalla;
    this.tipoDeTeclado=tipoDeTeclado;
    this.bateria=bateria;
  }

    @Override
    public String toString() {
        return "Producto{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", resolucionPantalla=" + resolucionPantalla + ", tipoDeTeclado=" + tipoDeTeclado + ", bateria=" + bateria + '}';
    }

   
}
