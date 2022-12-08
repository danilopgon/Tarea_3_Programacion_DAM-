package Prog03_Ejerc1;




public class Principal {
    public static void main(String[] args) {
        /*instancia 1, con el primer constructor*/
        System.out.println("Primera fecha, inicializada con el primer constructor");
        Fecha objFecha1 = new Fecha(Fecha.enumMes.DICIEMBRE);
        objFecha1.setDia(-3);
        objFecha1.setAnio(2022);
        System.out.println(objFecha1.toString());
        System.out.println(objFecha1.isSummer() ? "Es verano" : "No es verano");
        
        /*instancia 2, con el segundo constructor*/
        System.out.println("\nSegunda fecha, inicializada con el segundo constructor");
        Fecha objFecha2 = new Fecha(24, Fecha.enumMes.ENERO, 2023);
        System.out.println("La fecha 2 contiene el año " + objFecha2.getAnio());
        System.out.println(objFecha2.toString());
        System.out.println(objFecha2.isSummer() ? "Es verano" : "No es verano");
       
    }
    
}
