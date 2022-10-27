
package Modelo;

public class Menor extends Operaciones{
    
    public Menor(int primero, int segundo) {
        super(primero, segundo);
    }
    
    @Override
    public String operacion(){
       return "El menor es: " + Math.max(primero, segundo);
    }
    
}
