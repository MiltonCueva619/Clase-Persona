package com.mycompany.persona;

public class Persona {
    public String nombre;
    public String apellido; 
    public int edad;
    private int cedula;
    
    public Persona(String nombre, String apellido, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;       
    } 
    public int getCedula(){
        return cedula;
    }   
    public void setCedula(int cedula){
        this.cedula=cedula;
    } 
}
