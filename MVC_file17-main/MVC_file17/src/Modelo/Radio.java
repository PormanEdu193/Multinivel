
package Modelo;

public class Radio {
    String texto="";
    
    public String ingles(int activar){
        if(activar ==1){
            texto="Can"; 
        }
        if(activar ==2){
            texto="Cat"; 
        }
        if(activar ==3){
            texto="Fish"; 
        }
        if(activar ==4){
            texto="Cow"; 
        }
        if(activar ==5){
            texto="Elephant"; 
        }
        
        return texto;
    }
    
}
