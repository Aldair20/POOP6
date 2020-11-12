/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 * Esta es la clase persona que se utilizo en la practica 5 
 * @author Caballero Daniel
 */
public class Persona {
    private String Nombre;
    private String Apellido;
    private Fecha fNacimiento;

    public Persona() {
    }
    
    /**
     * Es el constructor que recibe tres parametros
     * @param Nombre Es el nombre de nuestra persona, es de tipo string
     * @param Apellido Es el apellido de nuestra persona
     * @param fNacimiento La fecha de nacimiento, DD,MM,AAAA
     */
    public Persona(String Nombre, String Apellido, Fecha fNacimiento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fNacimiento = fNacimiento;
    }

    public Persona(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fNacimiento = new Fecha(3,5,2000);
    }
    
    
    /**
     * 
     * @return Nombre, es de tipo string 
     */
    public String getNombre() {
        return Nombre;
    }
    /**
     * 
     * @param Nombre Recibe un string que contendrá el nombre de nuestra persona 
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    /**
     * 
     * @return Apellido, Es de tipo  string
     */
    public String getApellido() {
        return Apellido;
    }
    /**
     * 
     * @param Apellido Recibe un string que contendrá el Apellido de nuestra persona   
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    /**
     * 
     * @return fNacimiento, Es de tipo  int
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
    /**
     * 
     * @param fNacimiento Recibe un int que contendrá la fecha de nacimiento nuestra persona   
     */    
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", fNacimiento=" + fNacimiento + '}';
    }
}
