
package Modelo;

public class Triangulo extends Figuras{

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return ((base*altura)/2);
    }
    
}
