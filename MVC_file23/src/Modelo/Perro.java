
package Modelo;

public class Perro extends Animales {
    private String mensaje="";

    public Perro(String especie, String nombre) {
        super(especie, nombre);
    }
    
    @Override
    public String imprimir(){
        mensaje+=super.imprimir();
        mensaje+="Soy un perro que ladra";
        return mensaje;
    }
        
}
