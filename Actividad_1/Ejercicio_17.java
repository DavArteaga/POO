package Ejercicios_Clase;

public class Ejercicio_17 {

    public static void main(String args[]) {
        //Declarar Variables
        double radio, area_cir, longitud_cir;
        
        //Operaciones
        radio = 5;
        area_cir = Math.PI * Math.pow(radio, 2);
        longitud_cir = Math.PI * radio * 2;
        
        //Imprimir en pantalla
        System.out.println("La circunferencia tiene Radio: "+radio);
        System.out.println("El área del circulo es: "+ area_cir);
        System.out.println("La longitud de la circunferencia es: "+ longitud_cir);
    }
}