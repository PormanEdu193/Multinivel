
package Modelo;

public class Producto extends Operaciones {

    public Producto(int primero, int segundo) {
        super(primero, segundo);
    }
    
    @Override
    public String operacion(){
       return "La operación es: " + Math.multiplyExact(primero, segundo);
    }
    
}
