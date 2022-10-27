
package Modelo;

public class Caballo extends Animales {
    private String mensaje="";
    public Caballo(String especie, String nombre) {
        super(especie, nombre);
    }
    
    @Override
    public String imprimir(){
        mensaje+=super.imprimir();
        mensaje+="Soy un Caballo que relincha";
        return mensaje;
    }
    
}
