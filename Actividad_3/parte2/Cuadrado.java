package poo.parte2;

public class Cuadrado {
    int lado; // Atributo que define el lado de un cuadrado
    
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    
    double calcularArea() {
        return lado*lado;
    }
    
    double calcularPerímetro() {
        return (4*lado);
    }
}

