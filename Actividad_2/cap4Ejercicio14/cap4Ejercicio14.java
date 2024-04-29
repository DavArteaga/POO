package poo.cap4Ejercicio14;

/*
Una empresa con tres departamentos tiene establecido un plan 
de incentivos para sus vendedores. Al final del período, 
a cada departamento se le pide el importe global de las ventas. 
A los departamentos que excedan el 33% de las ventas totales se 
les adiciona al salario de los vendedores un porcentaje equivalente 
al 20% del salario mensual. Las nóminas de los tres departamentos 
son iguales. Si se tienen los siguientes datos: 
*/

public class cap4Ejercicio14 {
    
    public static void main(String args[]) {
        //Crear objeto
        salario s = new salario();
        
        s.entradas();
        
        int TOTVEN = s.VD1 + s.VD2 + s.VD3;
        double PORVEN = 0.33 * TOTVEN;
        
        System.out.print("Salario vendedor DEPTO 1: $"+s.salar1(PORVEN)
                      +"\nSalario vendedor DEPTO 2: $"+s.salar2(PORVEN)
                      +"\nSalario vendedor DEPTO 3: $"+s.salar3(PORVEN));
        
    }
}
