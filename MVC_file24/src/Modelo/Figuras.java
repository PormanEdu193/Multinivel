
package Modelo;

public abstract class Figuras {
    double base,altura;

    public Figuras(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public abstract double area();
}
