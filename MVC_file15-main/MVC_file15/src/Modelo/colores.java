
package Modelo;

import java.awt.Color;

public class colores {
    Color color;

    public Color ComboColores(int numero) {
        switch(numero){
            case 0:
                color=Color.white;
                break;
            case 1:
                color=Color.red;
                break;
            case 2:
                color=Color.blue;
                break;
            case 3:
                color=Color.orange;
                break;
            case 4:
                color=Color.gray;
                break;
            case 5:
                color=Color.pink;
                break;
            case 6:
                color=Color.yellow;
                break;
            case 7:
                color=Color.green;
                break;
        }
                
        return color;
    }
    
    public Color ListaColores(int numero) {
        switch(numero){
            case 0:
                color=Color.black;
                break;
            case 1:
                color=Color.yellow;
                break;
            case 2:
                color=Color.green;
                break;
            case 3:
                color=Color.blue;
                break;
            case 4:
                color=Color.red;
                break;
            case 5:
                color=Color.orange;
                break;
            case 6:
                color=Color.pink;
                break;
            case 7:
                color=Color.gray;
                break;
        }
                
        return color;
    }
    
}
