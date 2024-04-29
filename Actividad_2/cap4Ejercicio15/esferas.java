package poo.cap4Ejercicio15;

import java.util.Scanner;

public class esferas {
    public void entradas(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese peso de la esfera A: ");
        double PESOA = entrada.nextDouble();
        
        System.out.print("Ingrese peso de la esfera B: ");
        double PESOB = entrada.nextDouble();
        
        System.out.print("Ingrese peso de la esfera C: ");
        double PESOC = entrada.nextDouble();
        
        System.out.print("Ingrese peso de la esfera D: ");
        double PESOD = entrada.nextDouble();
        
        if (PESOA == PESOB && PESOA == PESOC){
            if (PESOD > PESOA){
                System.out.print("La esfera D es la diferente y es mayor peso");
            } else {
                System.out.print("La esfera D es la diferente y es menor peso");
            }
        } else {
            if (PESOA == PESOB && PESOA == PESOD){
                if (PESOC > PESOA){
                    System.out.print("La esfera C es la diferente y es mayor peso");
                } else {
                    System.out.print("La esfera C es la diferente y es menor peso");
                }
            } else {
                if (PESOA == PESOC && PESOA == PESOD){
                    if (PESOB > PESOA){
                        System.out.print("La esfera B es la diferente y es mayor peso");
                    } else {
                        System.out.print("La esfera B es la diferente y es menor peso");
                    }
                } else {
                    if (PESOA > PESOB){
                        System.out.print("La esfera A es la diferente y es mayor peso");
                    } else {
                        System.out.print("La esfera A es la diferente y es menor peso");
                    }
                }
            }
        }
    }
}
