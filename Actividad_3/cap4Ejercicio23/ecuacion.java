package poo.cap4Ejercicio23;

import java.lang.Math;
import javax.swing.JOptionPane;

public class ecuacion {
    Integer [] datos = new Integer[3];
    Double [] sol = new Double[2];

public void leerdatos(){
    datos[0] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para A: ")); //A
    datos[1] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para B: ")); //B
    datos[2] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para C: ")); //C
}

public void operacion(){
    sol[0] = (- datos[1] + Math.sqrt(Math.pow(datos[1], 2) - 4 * datos[0] * datos[2]))/2*datos[0];
    sol[1] = (- datos[1] - Math.sqrt(Math.pow(datos[1], 2) - 4 * datos[0] * datos[2]))/2*datos[0];
}

public void mostrardatos(){
    JOptionPane.showMessageDialog(null, "Sol_1: "+ sol[0]+
                                      "\nSol_2: "+ sol[1]);
}
}