package poo.cap3Ejercicio19;

import javax.swing.JOptionPane;

public class cap3Ejercicio19 {
    
    public static void main(String args[]) {
        double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del Lado del Triángulo Equilátero"));
        
        triangulo tri = new triangulo();
        
        tri.calculos(lado);
        
    }
}
