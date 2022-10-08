
package Modelo;

public class Producto {
    int primero, segundo;

    public int getPrimero() {
        return primero;
    }

    public void setPrimero(int primero) {
        this.primero = primero;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    public int producto(){
        return primero*segundo;
    }
}
