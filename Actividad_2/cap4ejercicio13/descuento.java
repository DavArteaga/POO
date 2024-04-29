package poo.cap4ejercicio13;

public class descuento {
    public double calValPagar(int Valcomp, String Color){
        double VALPAG;
        int PDES;
        if(Color.equals("BLANCO")){
            PDES = 0;
        } else {
                if(Color.equals("VERDE")){
                   PDES = 10; 
                } else {
                    if (Color.equals("AMARILLO")){
                        PDES = 25;
                    } else {
                        if (Color.equals("AZUL")){
                            PDES = 50;
                        } else {
                            PDES = 100;
                        }
                    }
                }
        }
        VALPAG = Valcomp - PDES*Valcomp / 100;
        return VALPAG;
    }
}
