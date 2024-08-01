package poo.cap4Ejercicio7;

import javax.swing.JOptionPane;

public class numeros {
    public void mayor(){
        double [] num = new double[2];
        num[0] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de A: "));
        num[1] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de B: "));
        
        if (num[0] > num[1]){
            JOptionPane.showMessageDialog(null, "A es mayor que B");
        } else {
            if (num[0] == num[1]){
                JOptionPane.showMessageDialog(null, "A es igual que B");
            } else {
                JOptionPane.showMessageDialog(null, "B es mayor que A");
            }
        }   
    }
}
