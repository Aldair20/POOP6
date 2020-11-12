/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 * Clase tomada de un círculo
 * @author Cabal
 */
public class Circulo {
    //atributos
    static double PI = Math.PI;
    private double radio;
    
    //constructor
    /**
     * Constructor vacío
     */
    public Circulo() {
    }
    
    /**
     * Constructor que recibe un parámetro
     * @param radio De tipo double, recibe el radio con el que va a operar 
     */
    public Circulo(double radio) {    //click derecho, insert code, constructor, select radio, generate 
        this.radio = radio;
    }
    
    //click derecho, insert code, getter and setter..., select radio, generate
    /**
     * 
     * @return Retorna el valor del radio que tiene almacenado
     */
    public double getRadio() {
        return radio;
    }
    
    /**
     * 
     * @param radio De tipo double, recibe el nuevo valor de radio 
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //click derecho, insert code, to string

    /**
     * 
     * @return Coloca es nombre de nuestra variable y su valor 
     */
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    //metodos
    /**
     * 
     * @return Retorna el perimetro de nuestro círculo 
     */
    public double perimetro(){
        return 2 * PI * radio;
    }
    /**
     * 
     * @return Retorna el area de nuestro círculo 
     */
    public double area(){
        return PI * radio * radio;
    }    
}