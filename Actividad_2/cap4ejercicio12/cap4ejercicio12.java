package poo.cap4ejercicio12;

import java.util.Scanner;

/*Determinar la cantidad de dinero recibida por un trabajador por concepto 
de las horas semanales trabajadas en una empresa, sabiendo que cuando 
las horas de trabajo exceden de 40, el resto se considera horas extras 
y se pagan al doble de una hora normal, cuando no exceden de 8; 
si las horas extras exceden de 8, se pagan las primeras 8 al doble de 
lo que se paga una hora normal y el resto al triple. Del trabajador se 
conocen los siguientes datos:  nombres, número de horas trabajadas 
en la semana y valor recibido por una hora normal de trabajo.*/
public class cap4ejercicio12 {
    
    public static void main(String args[]) {
        //Declarar Variables
        String nom;
        
        //Leer las variables
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del trabajador: ");
        nom = entrada.nextLine();
        
        //Crear el objeto
        trabajador t = new trabajador();
        
        t.entradas();
        
        System.out.println("El trabajador "+nom+", devengo: $"+t.calSalario());
    }
}
