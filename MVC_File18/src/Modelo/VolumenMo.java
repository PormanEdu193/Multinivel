
package Modelo;

public class VolumenMo {
    private double alto,ancho,profundidad;
    public VolumenMo() {
        alto=0.0;
        ancho=0.0;
        profundidad=0.0;
    }

    public VolumenMo(double a, double n, double p) {
        alto = a;
        ancho = n;
        profundidad = p;
    }
    
    public void iniciar(double a,double n,double p){
       alto=a;
       ancho=n;
       profundidad=p;
    }
    
    public double volumen(){
      return alto*ancho*profundidad;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }  
}
