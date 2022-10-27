
package Modelo;

public class Animales {
    private String especie,nombre;
    private String informacion = "";

    public Animales(String especie, String nombre) {
        this.especie = especie;
        this.nombre = nombre;
    }
    
    public String imprimir(){
        informacion="Soy un animal de la especie: "+ this.getEspecie()+"\n";
        informacion="Mi nombre es: "+ this.getNombre()+"\n";
        return informacion;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
    
    
    
}
