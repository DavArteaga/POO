package poo.cap4Ejercicio22;

import javax.swing.JOptionPane;

public class empleado {
    
    public void empleado(){
        String[] datos = new String[3];
        
        datos[0] = JOptionPane.showInputDialog("Nombre del Empleado: ");
        datos[1] = JOptionPane.showInputDialog("Salario básico por hora: ");
        datos[2] = JOptionPane.showInputDialog("Número de Horas Trabajadas en el mes: ");
        
        int sal = Integer.parseInt(datos[1]);
        int hor = Integer.parseInt(datos[2]);
        
        if (sal*hor > 450000){
            JOptionPane.showMessageDialog(null, datos[0] +
                                          "\n $" +sal*hor);
        }
        else {
            JOptionPane.showMessageDialog(null, datos[0]);
        }
    }
}
