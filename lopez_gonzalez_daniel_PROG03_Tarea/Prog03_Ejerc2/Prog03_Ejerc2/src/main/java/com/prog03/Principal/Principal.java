package com.prog03.Principal;

import com.prog03.figuras.Rectangulo;



public class Principal {
    public static void main(String[] args) {
        /*primer rectangulo, inicializado con el primer constructor y cuadrado*/
        System.out.println("Rectángulo 1, inicializado con el primer constructor: ");
        Rectangulo rectangulo1 = new Rectangulo();
        System.out.println("Altura inicializada en: " + rectangulo1.getAltura());
        System.out.println("Base inicializada en: " + rectangulo1.getBase());
        
        /*asignamos base y altura*/
        rectangulo1.setAltura(20);
        rectangulo1.setBase(20);
        System.out.println("Asignamos a altura: " + rectangulo1.getAltura());
        System.out.println("Asignamos a base: " + rectangulo1.getBase());
        
       
        /*calculamos el area y utilizamos el método to string para imprimir area y altura*/
        rectangulo1.getArea();
        System.out.println(rectangulo1.toString());
        
        /*comprobamos si es cuadrado*/
        System.out.println(rectangulo1.isCuadrado()? "El rectángulo es cuadrado" : "El rectángulo no es cuadrado");
        
        /*segundo rectangulo, inicializado con el segundo constructor y no cuadrado*/
        System.out.println("\nRectángulo 2, inicializado con el segundo constructor: ");
        Rectangulo rectangulo2 = new Rectangulo(30, 20);
        System.out.println("Altura inicializada en: " + rectangulo2.getAltura());
        System.out.println("Base inicializada en: " + rectangulo2.getBase());
        
       /*calculamos el area y utilizamos el método to string para imprimir area y altura del segundo triangulo*/
        rectangulo2.getArea();
        System.out.println(rectangulo2.toString());
        
       /*comprobamos si es cuadrado*/
        System.out.println(rectangulo2.isCuadrado()? "El rectángulo es cuadrado" : "El rectángulo no es cuadrado"); 
     
    }
}
