package poo.parte2;

import javax.swing.JOptionPane;

public class PruebaFiguras {
    
    public static void main(String args[]) {
        Integer [] datos = new Integer[6];
        datos[0] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Radio del Círculo: "));
        Círculo figura1 = new Círculo(datos[0]);
        
        datos[1] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del Rectángulo: "));
        datos[2] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho del Rectángulo: "));
        Rectángulo figura2 = new Rectángulo(datos[1],datos[2]);
        
        datos[3] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado del Cuadrado: "));
        Cuadrado figura3 = new Cuadrado(datos[3]);
        
        datos[4] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Base del TriánguloRectángulo: "));
        datos[5] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del TriánguloRectángulo: "));
        TriánguloRectángulo figura4 = new TriánguloRectángulo(datos[4],datos[5]);
        
        JOptionPane.showMessageDialog(null, "El área del círculo es = " + figura1.calcularArea()+
                                            "\nEl perímetro del círculo es = " + figura1.calcularPerímetro());
       
        JOptionPane.showMessageDialog(null, "El área del rectángulo es = " + figura2.calcularArea() +
                                            "\nEl perímetro del rectángulo es = " + figura2.calcularPerímetro());
        
        JOptionPane.showMessageDialog(null, "El área del cuadrado es = " + figura3.calcularArea() +
                                            "\nEl perímetro del cuadrado es = " + figura3.calcularPerímetro());
        
        JOptionPane.showMessageDialog(null, "El área del triángulo es = " + figura4.calcularArea() +
                                            "\nEl perímetro del triángulo es = " + figura4.calcularPerímetro());
        
        figura4.determinarTipoTriángulo();
    }
}