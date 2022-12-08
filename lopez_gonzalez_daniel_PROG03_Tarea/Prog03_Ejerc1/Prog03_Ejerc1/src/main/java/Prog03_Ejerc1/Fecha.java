package Prog03_Ejerc1;

public class Fecha { //clase Fecha 
    
    enum enumMes { //enum denominado enumMes para los meses del año
        ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE
        
        
    }
    
    /* declaramos los atributos para día, mes y año*/
    private int dia;
    private enumMes mes;
    private int anio;

    /*constructor que inicializa mes al valor recibido, día y año se incializan a 0, el valor por defecto */
    Fecha(enumMes mes) {
        this.mes = mes;
    }

    /*constructor que permite inicializar todos los atributos*/
    Fecha(int dia, enumMes mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
   
    /*implementamos los métodos get/set de cada uno de los atributos*/
    
    /*get y set para dia*/
    public int getDia (){
        return dia;
    }
    
    public void setDia (int dia) {
        if (dia >=0 && dia < 31) { //evitamos números negativos y mayores de 31
            this.dia = dia;
        } else {
            System.out.println("Introduce un día valido");
    
        }
    }
    
    /*get y set para mes*/
    public enumMes getMes (){
        return mes;
    }
    
    public void setMes (enumMes mes) {
        this.mes = mes;
    }
    
    /*get y set para año*/
    public int getAnio () {
        return anio;
    }
    
    public void setAnio (int anio) {
        if (anio >= 0) {
            this.anio = anio;
            
        } else {
            System.out.println("Introduzca un año valido");
        }
        
    }
    
    /*implementamos un método para comprobar si es verano o no mediante el mes y el día*/
    
    public boolean isSummer (){ 
        return (this.mes == enumMes.JUNIO && this.dia >= 21) || this.mes == enumMes.JULIO || this.mes == enumMes.AGOSTO || (this.mes == enumMes.SEPTIEMBRE && this.dia < 21);
            
        }
        
   
    
    /*implementamos un método para recibir la fecha en formato largo*/
    
    @Override
    public String toString () {
      return "La fecha es: " + dia + " de " + mes.name().toLowerCase() + " del " + anio; //mostramos el mes en minuscula mediante el método toLowerCase
    }   
 
}