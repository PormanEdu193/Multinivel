
package Modelo;

public class Gato extends Animales {
    private String mensaje="";
    
    public Gato(String especie, String nombre) {
        super(especie, nombre);
    }
    
    @Override
    public String imprimir(){
        mensaje+=super.imprimir();
        mensaje+="Soy un gato que maulla";
        return mensaje;
    }
    
}
