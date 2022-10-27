
package Modelo;


public class Potencia extends Operaciones{

    public Potencia(int primero, int segundo) {
        super(primero, segundo);
    }
    
    @Override
    public String operacion(){
       return "La operación es: " + Math.pow(primero, segundo);
    }
}
