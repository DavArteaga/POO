package Ejercicio_11;

import java.util.Scanner;

public class numero {
    //Variables Globales
    int numero1;
    int numero2;
    int numero3;
    
    public void numeros(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        numero1 = entrada.nextInt();
        
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Ingrese el seguno número: ");
        numero2 = entrada1.nextInt();
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Ingrese el seguno número: ");
        numero3 = entrada2.nextInt();
    }
    public int encMayor(){
        int Mayor;
        if (numero1 > numero2 && numero1 > numero3){
            Mayor = numero1;
        }
        if (numero2 > numero1 && numero2 > numero3){
            Mayor = numero2;
        } else {
            Mayor = numero3;
        }
        return Mayor;
    }
    
}
