package poo.cap4ejercicio12;

import java.util.Scanner;

public class trabajador {
    int NHT;
    int VHN;
    
    //Leer variables
    public void entradas(){
        Scanner Entrada1 = new Scanner(System.in);
        System.out.print("Ingrese el número de Horas Trabajadas: ");
        NHT = Entrada1.nextInt();
        
        Scanner Entrada2 = new Scanner(System.in);
        System.out.print("Ingrese el número Valor Hora normal Trabajada: ");
        VHN = Entrada2.nextInt();
    }
    
    //Calcular Salario
    public int calSalario(){
        int HET, HEE8,Salario;
        
        if (NHT > 40) {
            HET = NHT - 40;
            if (HET > 8){
                HEE8 = HET - 8;
                Salario = 40 * VHN + 16 * VHN + HEE8 * 3 * VHN;
            } else {
                Salario = 40 * VHN + HET * 2 * VHN;
              }
        } else {
            Salario = NHT * VHN;
        }
        return Salario;
    }
    
}
