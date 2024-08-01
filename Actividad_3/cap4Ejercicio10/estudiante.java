package poo.cap4Ejercicio10;

import javax.swing.JOptionPane;

public class estudiante {
    public void estudiantes(){
        String[] datos = new String[4];
        
        datos[0] = JOptionPane.showInputDialog("Número de Inscripción: ");
        datos[1] = JOptionPane.showInputDialog("Nombres: ");
        datos[2] = JOptionPane.showInputDialog("Patrimonio: ");
        datos[3] = JOptionPane.showInputDialog("Estrato Social: ");
        
        // Convertir lo datos que necesitamos en otro formato
        double Patri = Double.parseDouble(datos[2]);
        int Esocial = Integer.parseInt(datos[3]);
        double Matri = 50000;
        
        
        if (Patri > 2000000 && Esocial > 3){
            Matri = Matri + 0.03 * Patri;
        }
        
        JOptionPane.showMessageDialog(null, "El estudiante con Número de Inscripción: " +datos[0] +
                                            "\nY NOMBRE: "+datos[1] +
                                            "\nDebe Pagar: $" + (int) Matri);
        
        
    }
}
