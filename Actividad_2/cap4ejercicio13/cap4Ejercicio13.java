package poo.cap4ejercicio13;

import java.util.Scanner;

/*
Un almacén efectúa una promoción en la cual se hace un 
descuento sobre el valor de la compra total, según el 
color de la bolita que el cliente saque al pagar en caja. 
Si la bolita es blanca no se le hará descuento alguno, 
si es verde se le hará un 10% de descuento, si es amarilla 
un 25%, si es azul un  50% y si es roja un 100%. Hacer un 
algoritmo para determinar la cantidad final que un cliente 
deberá pagar por su compra. Se sabe que sólo hay bolitas de 
los colores mencionados. 
 */

public class cap4Ejercicio13 {
    
    public static void main(String args[]) {
        //Pedir datos
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor de la compra: ");
        int VALCOMP = entrada.nextInt();
        
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Ingrese el color de la bola en mayuscula: ");
        String COLOR = entrada1.nextLine();
        
        //Crear objeto
        descuento des = new descuento();
        double VALPAG = des.calValPagar(VALCOMP, COLOR);
        
        System.out.print("El cliente debe pagar: $"+VALPAG);
    }
}
