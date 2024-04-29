package poo.cap4Ejercicio24;

import java.util.Scanner;

public class esferas {
    public void mayorPeso(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese peso de la esfera A: ");
        double PESOA = entrada.nextDouble();
        
        System.out.print("Ingrese peso de la esfera B: ");
        double PESOB = entrada.nextDouble();
        
        System.out.print("Ingrese peso de la esfera C: ");
        double PESOC = entrada.nextDouble();
        
        if (PESOA > PESOB && PESOA > PESOC){
            System.out.print("La esfera de mayor peso es la A ");
        }
        if (PESOB > PESOA && PESOB > PESOC){
            System.out.print("La esfera de mayor peso es la B");
        } else {
            System.out.print("La esfera de mayor peso es la C");
        }
    }
}
