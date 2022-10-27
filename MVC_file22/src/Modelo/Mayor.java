
package Modelo;

public class Mayor extends Operaciones {

    public Mayor(int primero, int segundo) {
        super(primero, segundo);
    }
    
    @Override
    public String operacion(){
        
       return "El mayor es: " + Math.min(primero, segundo);
    }
    
}
