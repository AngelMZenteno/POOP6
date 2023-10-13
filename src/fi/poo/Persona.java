/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author Angel Maurice Zenteno Loyola
 * Simula a una persona
 */
public class Persona {
    private String nombre,apellido,direccion,pais;
    private int edad;
  
    /**
     * Constructor lleno de persona
     */
    public Persona() {
    }
        /**
     * Constructor lleno de persona
     * @param nombre El nombre de la persona en String
     * @param direccion La direccion de la persona en String
     * @param apellido La direccion de la persona en String
     * @param edad La edad de la persona en primitivo entero
     * @param pais La direccion de la persona en String
     */
    
    public Persona(String nombre, String apellido, String direccion, String pais, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.pais = pais;
        this.edad = edad;
    }

    /**
     * Metodo getNombre
     * @return regesa el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo setNombre
     * @param nombre Modifica el nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo getDireccion
     * @return regesa la direccion de la persona
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Metodo setDirrecion
     * @param direccion Modifica la direccion de la persona
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Metodo setApellido
     * @param apellido Modifica el apellido de la persona
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * Metodo getApellido
     * @return regesa el apellido de la persona
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * Metodo getApellido
     * @return regesa el apellido de la persona
     */
    public String getPais() {
        return pais;
    }
    /**
     * Metodo setPais
     * @param pais Modifica el pais de la persona
     */
    public void setPais(String pais) {
        this.pais = pais;
    }
    /**
     * Metodo getDireccion
     * @return regesa la direccion de la persona
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Metodo setEdad
     * @param edad Modifica la edad de la persona,
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Metodo que sirve para que la persona hable
     * @param var Lo que la persona esta diciendo
     */
    public void hablar(String var) {
        System.out.println(var);
    }
    public void dormir() {
        System.out.println("zzz");
    }

    public void caminar() {
        System.out.println("Estoy caminando");
    }
    public void comer() {
        System.out.println("ñamñam");
    }
    public void mirar() {
        System.out.println("Etoy mirando");
    }    
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", pais=" + pais + ", edad=" + edad + '}';
    }
    

   
}
