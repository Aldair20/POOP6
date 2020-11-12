/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 * Nuestro main principal
 * @author Cabal, Mendoza
 */
public class POOP5 {
    
    //EJE 1.estructura de los paquetes
    //EJE 2.convertir en .jar
    //click derecho en la taza del POOP5, properties, packaging, compress JAR file
    //click derecho en la taza del POOP5, clean and build, run
    //EJE 3. Generar la doumentacion
    //click derecho en la taza del POOP5, generate JavaDoc, y ya solito corre 
    //crear un documento en github y subirlo al github toda la documentacion de esta practica
    //Investigar como ponerlo en una pagina web de github
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(6.0);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        System.out.println("Perimetro c1 = "+c1.perimetro());
        System.out.println("Area c1 = "+c1.area());
        System.out.println("Perimetro c2 = "+c2.perimetro());
        System.out.println("Area c2 = "+c2.area());
        
        c1.setRadio(9.0);
        System.out.println("Perimetro c1 = "+c1.perimetro());
        System.out.println("Area c1 = "+c1.area());
        
        System.out.println("----------------------------------------------------------");
        
        Persona amigo = new Persona();
        Fecha fNacimiento = new Fecha(3,4,2002);
        amigo.setNombre("Edgar");
        amigo.setApellido("Romero Martines");
        amigo.setfNacimiento(fNacimiento);
        
        System.out.println("Info de mi Amigo "+amigo.toString());
        System.out.println("Info de mi amigo "+amigo);
        
        Persona amigo2 = new Persona("Raul","Ayala Barbosa",new Fecha(20,4,1993));
        
        System.out.println("Info Amigo 2= "+amigo2);
        
        Persona amigo3 = new Persona("Diego", "Pedraza Peralta");
        System.out.println("info persona 3"+amigo3);
        
        
        //implementar 1 pero ahora con todo lo setter and getter  //ya hecho
        //clase implementada Triangulo rectangulo
        
        Triangulo abc = new Triangulo(3.0,4.0,5.0);
        System.out.println(abc.toString());
        System.out.println("Perimetro abc = "+abc.perimetro());
        System.out.println("Area abc = "+abc.area());
        System.out.println("Angulo A = "+abc.anguloA());
        abc.setCatetoA(15);
        System.out.println(abc.getCatetoA());
        
    }
    
}
