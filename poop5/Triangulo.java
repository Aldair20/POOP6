/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 * Clase Triángulo
 * @author Cabal,Mendoza
 */
public class Triangulo {
    private double catetoA;
    private double catetoB;
    private double hipotenusa;

    /**
     * Constructor vacío
     */
    public Triangulo() {
    }

    /**
     * Constructor que recibe tres parámetros
     * @param catetoA De tipo double, toma el valor del cateto A
     * @param catetoB De tipo double, toma el valor del cateto B
     * @param hipotenusa De tipo double, toma el valor de la hipotenusa
     */
    public Triangulo(double catetoA, double catetoB, double hipotenusa) {
        this.catetoA = catetoA;
        this.catetoB = catetoB;
        this.hipotenusa = hipotenusa;
    }
    /**
     * 
     * @return Retorna el valor del cateto A 
     */
    public double getCatetoA() {
        return catetoA;
    }
    /**
     * 
     * @param catetoA Cambia el valor del cateto A, recibiendo el parametro
     */
    public void setCatetoA(double catetoA) {
        this.catetoA = catetoA;
    }
    /**
     * 
     * @return Retorna el valor del cateto B
     */
    public double getCatetoB() {
        return catetoB;
    }
    /**
     * 
     * @param catetoB Cambia el valor del cateto B, recibiendo el parametro
     */
    public void setCatetoB(double catetoB) {
        this.catetoB = catetoB;
    }
    
    /**
     * 
     * @return Retorna el valor de la hipotenusa
     */
    public double getHipotenusa() {
        return hipotenusa;
    }
    /**
     * 
     * @param hipotenusa Cambia el valor de la hipotenusa, recibiendo el parametro
     */
    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
    
    /**
     * 
     * @return Retorna el nombre de nuestras varibales y sus respectivos valores 
     */
    @Override
    public String toString() {
        return "Triangulo{" + "catetoA=" + catetoA + ", catetoB=" + catetoB + ", hipotenusa=" + hipotenusa + '}';
    }
    
    //metodos
    /**
     * 
     * @return Retorna el valor del perimétro calculado de nuestro triángulo
     */
    public double perimetro(){
        return catetoA+catetoB+hipotenusa;
    }
    
    /**
     * 
     * @return Retorna el valor del área calculada de nuestro triángulo 
     */
    public double area(){
        return (catetoA * catetoB)/2;
    }
    
    /**
     * 
     * @return Calcula el valor de nuestro ángulo A 
     */
    public double anguloA(){
        return Math.toDegrees(catetoA/hipotenusa);
    }
    /**
     * 
     * @return Calcula el valor de nuestro ángulo B 
     */
    public double anguloB(){
        return Math.toDegrees(catetoB/hipotenusa);
    }
    
}
