/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 * La clase fecha funciona como apoyo a nustra clase persona 
 * @author Cabal
 */
class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
     * 
     * @return dia, Es de tipo  int
     */
    public int getDia() {
        return dia;
    }
    /**
     * 
     * @param setDia Recibe un int que contendrá el dia de hoy   
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * 
     * @return mes, Es de tipo  int
     */
    public int getMes() {
        return mes;
    }
    /**
     * 
     * @param setMes Recibe un int que contendrá el mes presente   
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    /**
     * 
     * @return anio, Es de tipo  int
     */
    public int getAnio() {
        return anio;
    }
    /**
     * 
     * @param setAnio Recibe un int que contendrá el anio en curso   
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
}
