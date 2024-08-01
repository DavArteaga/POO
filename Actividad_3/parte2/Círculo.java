package poo.parte2;

public class Círculo {
    int radio; // Atributo que define el radio de un círculo

    Círculo(int radio) {
        this.radio = radio;
    }
    
    double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }
    
    double calcularPerímetro() {
        return 2*Math.PI*radio;
    }
}

