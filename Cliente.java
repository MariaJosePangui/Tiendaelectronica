package com.mycompany.tiendaatecnologica;

public class Cliente {
    private String nombre;
    private String apellido;
    private String correoelectronico;
    private int celular;
    private String ciudad;

    public Cliente(String nombre, String apellido, String correoelectronico, int celular, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoelectronico = correoelectronico;
        this.celular = celular;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", correoelectronico=" + correoelectronico + ", celular=" + celular + ", ciudad=" + ciudad + '}';
    }

    
}
