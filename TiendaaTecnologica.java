package com.mycompany.tiendaatecnologica;
import java.util.Scanner;

public class TiendaaTecnologica {
public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
       producto a1= new producto("Apple" ,"Blanco" ,258490, 17);
       producto a2=new producto("Lenovo","Negro", 499490,28);
       producto a3=new producto ("Lenovo ", "Gris" , 113890,9);
       producto a4=new producto();
       producto a5=new producto();
       producto a6=new producto();
       producto a7=new producto ();
       producto a8=new producto ();
       producto a9=new producto ();
    System.out.println("Bienvenido a nuestra tienda electronica");
        System.out.println("----- Seleccione un numero-----");
        System.out.println("1.Ver la lista de productos de nuestra tienda");
        System.out.println("2.Buscar por categorias");
        System.out.println("3.Agregar un producto a la lista");
        System.out.println("4.Modificar informacion de la lista");
        System.out.println("5.Eliminar un producto de la lista");
        System.out.println("6.Realizar la compra");
        String teclado = leer.nextLine();
        if(teclado.equals("1")){
            System.out.println("1."+a1.toString());
            System.out.println("2."+a2.toString());
            System.out.println("3."+a3.toString());
            System.out.println("4."+a4.toString());
            System.out.println("5."+a5.toString());
            System.out.println("6."+a6.toString());
            System.out.println("7."+a7.toString());
            System.out.println("8."+a8.toString());
            System.out.println("9."+a9.toString());
            System.out.println("10."+a10.toString());
    
        }else if(teclado.equals("2")){
            System.out.println("Escriba el producto de su preferencia:(Computaodre,Impresoras, Televisores)");
             String selec = leer.nextLine();
             if(selec.equals("Computador")){
             System.out.println("1."+a1.toString());
             System.out.println("2."+a2.toString());
             System.out.println("3."+a3.toString());
             
             }else if(selec.equals("Notebook")){
             System.out.println("4."+a4.toString());
             System.out.println("7."+a7.toString());
             System.out.println("10."+a10.toString());
             
             }else if(selec.equals("Tablet")){
              System.out.println("5."+a5.toString());
              System.out.println("6."+a6.toString());
              System.out.println("8."+a8.toString());
              System.out.println("9."+a9.toString());
             }
    }
    
    
}
