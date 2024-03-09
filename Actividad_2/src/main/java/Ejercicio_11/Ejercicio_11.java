package Ejercicio_11;

//Escribir un algoritmo que acepte tres números 
//enteros diferentes y muestre el mayor de ellos
public class Ejercicio_11 {
    
    public static void main(String args[]) {
        //Crear Objeto
        numero n = new numero();
        
        n.numeros();
        
        System.out.println("El Mayor entre "+n.numero1+" , "+ n.numero2+" y "+n.numero3+ " es: " +n.encMayor());
    }
}
