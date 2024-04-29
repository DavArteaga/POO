package poo.cap4Ejercicio14;

import java.util.Scanner;

public class salario {
    //Variables globales
    int VD1, VD2, VD3, salar;
    
    public void entradas(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese Venta del departamento 1: ");
        VD1 = entrada.nextInt();
        
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Ingrese Venta del departamento 2: ");
        VD2 = entrada1.nextInt();
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Ingrese Venta del departamento 3: ");
        VD3 = entrada2.nextInt();
        
        Scanner entrada3 = new Scanner(System.in);
        System.out.print("Ingrese salario que reciben vendedores en cada departamento: ");
        salar = entrada3.nextInt();
    }
    
    public double salar1(double porven){
        double SALAR1;
        if (VD1 > porven) {
            SALAR1 = salar + 0.2 * salar;
        } else {
            SALAR1 = salar;
        }
        return SALAR1;
    }
    
    public double salar2(double porven){
        double SALAR2;
        if (VD2 > porven) {
            SALAR2 = salar + 0.2 * salar;
        } else {
            SALAR2 = salar;
        }
        return SALAR2;
    }
    public double salar3(double porven){
        double SALAR3;
        if (VD3 > porven) {
            SALAR3 = salar + 0.2 * salar;
        } else {
            SALAR3 = salar;
        }
        return SALAR3;
    }
}
