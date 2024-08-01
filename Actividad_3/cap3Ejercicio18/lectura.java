package poo.cap3Ejercicio18;

import javax.swing.JOptionPane;
 
public class lectura {
    
    public void empleado() {
        //Array que tendrá los datos del EMPLEADO
        String [] emp = new String [5];
        
        //Recoger información del Empleado
        emp[0] = JOptionPane.showInputDialog("Digite el CODIGO del Empleado: ");
       
        emp[1] = JOptionPane.showInputDialog("Digite el NOMBRE del Empleado");
        
        emp[2] = JOptionPane.showInputDialog("Digite el #de HORAS TRABAJADAS del empleado");
        
        emp[3] = JOptionPane.showInputDialog("Digite el VALOR X HORA TRABAJADA del empleado");
        
        emp[4] = JOptionPane.showInputDialog("Digite el % de RETENCION EN LA FUENTE  del empleado" +
                                             "\n(el porcentaje debe estar dado en decimales usando .) ");
        
        //Convertir los string
        double hor = Double.parseDouble(emp[2]);
        double vah = Double.parseDouble(emp[3]);
        double ret = Double.parseDouble(emp[4]);
        
        //Operaciones
        double salb = hor * vah;
        double saln = salb - (salb * ret);
        
        //Imprimir
        JOptionPane.showMessageDialog(null, "CODIGO: " +emp[0] +
                                            "\nNOMBRE: "+emp[1] +
                                            "\nSALARIO BRUTO: $" + (int) salb +
                                            "\nSALARIO NETO: $" + (int) saln);
    }
}
