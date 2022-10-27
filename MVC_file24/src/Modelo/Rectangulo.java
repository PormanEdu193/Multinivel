
package Modelo;

public class Rectangulo extends Figuras {

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
       return (base*altura);
    }
    
}
