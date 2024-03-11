package Ejercicios_Clase;

public class Ejercicio_12 {
    
    public static void main(String args[]) {
        //Definir Variables
        double Horas_Trabajadas, Valor_Hora, Retencion;
        double Salario_Bruto, Salario_Neto;
        
        //Operaciones
        Valor_Hora = 5000;
        Horas_Trabajadas = 48;
        Salario_Bruto = Valor_Hora * Horas_Trabajadas;
        Retencion = Salario_Bruto * 0.125;
        Salario_Neto = Salario_Bruto - Retencion;
        
        //Imprimir en pantalla
        System.out.println("Horas Trabajas: " +Horas_Trabajadas);
        System.out.println("Valor por Hora: "+ Valor_Hora);
        System.out.println("Salario bruto: " +Salario_Bruto);
        System.out.println("Retención: " + Retencion);
        System.out.println("Salario Neto: "+ Salario_Neto);  
    }
}
