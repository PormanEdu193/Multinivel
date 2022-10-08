
package Modelo;

public class ParesImpares {
    private String nropares,nroimpares;

    public ParesImpares() {
        nropares="";
        nroimpares="";
    }

    public String getNropares() {
        return nropares;
    }

    public void setNropares(String nropares) {
        this.nropares = nropares;
    }

    public String getNroimpares() {
        return nroimpares;
    }

    public void setNroimpares(String nroimpares) {
        this.nroimpares = nroimpares;
    }
    
    public void numeros(int primero,int segundo){
        for(int i=primero;i<=segundo;i++){
            if(i%2==0){
                nropares=nropares+i+",";
            }
            else{
                nroimpares=nroimpares+i+",";
            }
        }
    }
    
}
