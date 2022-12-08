package com.prog03.figuras;


public class Rectangulo {
    
    /* declaramos los atributos para base y altura
    también incluimos el atributo del area como variable global*/
    
    private float base;
    private float altura;
    private float area;
    
    /*constructor vacio*/
    public Rectangulo (){}
    
    /*constructor que inicializa base y altura*/
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    /* metodos set y get para actualizar y obtener valores */
    public float getBase (){
        return base;
    }
    
    public void setBase (float base) {
        if (base > 0) { //nos aseguramos de que el número introducido sea positivo
            this.base = base; 
        } else {
            System.out.println("Introduce un valor válido para la base");
        }
    }
    
    public float getAltura (){
        return altura;
    }
    
    public void setAltura (float altura) {
        if (altura > 0) { //nos aseguramos de que el número introducido sea positivo
            this.altura = altura; 
        } else {
            System.out.println("Introduce un valor válido para la altura");
        }
    }    
    
    /*metodo para obtener el area del rectangulo*/
    public float getArea () {  
        area = (base*altura);
        return area;
    }
    
    /*sobrescribimos el método toString para devolver una cadena con el área y la altura*/
    @Override
    public String toString () {
        return "El rectángulo tiene un área de " + area + " y una altura de " + altura;
    }
   
    /*comprobamos si la base y la altura son iguales, y por tanto estamos ante un cuadrado*/
    public boolean isCuadrado () {
        return this.base == this.altura;
    }
        
}
