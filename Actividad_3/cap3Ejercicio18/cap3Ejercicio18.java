 /*Se tiene la siguiente información de un empleado:  
· código del empleado,  
· nombres,  
· número de horas trabajadas al mes,  
· valor hora trabajada,  
· porcentaje de retención en la fuente. 
Haga un algoritmo que muestre: 
código, nombres, salario bruto y salario neto. */
package poo.cap3Ejercicio18;

public class cap3Ejercicio18 {
    
    public static void main(String args[]) {
        //Crear objeto
        lectura lec = new lectura();
        
        //Llamamos el objeto
        lec.empleado();
    }
}

