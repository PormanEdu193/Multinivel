
package Modelo;

public class Mayor {
    private int primero,segundo,tercero,mayor;

    public int getPrimero() {
        return primero;
    }

    public void setPrimero(int primero) {
        this.primero = primero;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segund) {
        this.segundo = segund;
    }

    public int getTercero() {
        return tercero;
    }

    public void setTercero(int tercero) {
        this.tercero = tercero;
    }

    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }
    
    public void numeroMayor(){
        if(primero==segundo && segundo==tercero){
            mayor=primero;}
        if(primero>segundo && primero>tercero){
            mayor=primero;}
        if(segundo>primero && segundo>tercero){
            mayor=segundo;}
        if(tercero>primero && tercero>segundo){
            mayor=tercero;}
    }
    
}
