package poo.cap4Ejercicio23;

/*Dados los valores A, B y C 
que son los parámetros de una ecuación de segundo grado, 
elaborar un algoritmo para hallar las posibles soluciones 
de dicha ecuación.
 */
public class cap4Ejercicio23 {
    
    public static void main(String args[]) {
        ecuacion ecu = new ecuacion();
        
        ecu.leerdatos();
        ecu.operacion();
        ecu.mostrardatos();
    }
}
