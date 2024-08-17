package poo.Ejercicio4_1;

import javax.swing.JOptionPane;

/*Esta clase prueba diferentes acciones realizadas por cuentas bancarias
de tipo Cuenta de ahorros y Cuenta corriente*/

    public class PruebaCuenta {
    /*Método main que crea una cuenta de ahorros con un saldo inicial
    y una tasa de interés solicitados por teclado, a la cual se realiza una
    consignación y un retiro, y luego se le genera el extracto mensual*/
        public static void main(String args[]) {
            float [] dat = new float[4];
            
            JOptionPane.showMessageDialog(null, "CUENTA DE AHORROS");
            dat[0] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Saldo Inicial"));
            dat[1] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese tasa de interés"));
            
            CuentaAhorros cuenta1 = new CuentaAhorros(dat[0], dat[1]);
            
            dat[2] = Float.parseFloat(JOptionPane.showInputDialog("Ingresar la cantidad a consignar"));
            cuenta1.consignar(dat[2]);
            dat[3] = Float.parseFloat(JOptionPane.showInputDialog("Ingresar cantidad a retirar"));
            cuenta1.retirar(dat[3]);
            cuenta1.extractoMensual();
            cuenta1.imprimir();
        }
    }