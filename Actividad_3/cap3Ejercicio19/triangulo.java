package poo.cap3Ejercicio19;

//import java.lang.Math;
import javax.swing.JOptionPane;

public class triangulo {
    public void calculos(double lado){
        double [] tri = new double[3];
        
        tri[0] = lado * 3;
        tri[1] = Math.sqrt(Math.pow(lado, 2) + Math.pow(lado/2,2));
        tri[2] = lado * tri[1] / 2;
        
        JOptionPane.showMessageDialog(null, "Perimetro: " + tri[0] +
                                            "\nAltura: "+ tri[1] +
                                            "\nArea: " + tri[2]);
    }
}
