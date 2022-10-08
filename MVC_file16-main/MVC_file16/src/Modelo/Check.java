
package Modelo;

import java.awt.Color;
import java.awt.Font;

public class Check {
    Font fuente;
    Color color;
    
    public Font checkLetra(int activar){
        if(activar == 1){
            fuente = new Font("Italic",Font.ITALIC,12);
        }
        else{
             fuente = new Font("Times new roman",Font.BOLD,12);
        }
        return fuente;
    }
    
    public Color checkColor(int activar){
        if(activar == 1){
            color = Color.RED;
        }
        else{
            color = Color.BLACK;
        }
        return color;
    }
    
    public Color checkFondo(int activar){
        if(activar==1){
           color = Color.ORANGE;
        }
        else{
            color = Color.WHITE;
        }
        return color;
    
    }
}
