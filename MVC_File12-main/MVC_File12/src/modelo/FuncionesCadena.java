
package modelo;

import javax.swing.DefaultListModel;

public class FuncionesCadena {
    String cadena;
    DefaultListModel modelo = new DefaultListModel();

    public FuncionesCadena(String micadena) {
        cadena = micadena;
    }
    
    public DefaultListModel separar(){
        String palabras[]=cadena.split(" ");
        for(String palabra:palabras){
            modelo.addElement(palabra);
        }
        return modelo;
    }
    public int longitud(){
        return cadena.length();
    }
    public char caracter(){
        return cadena.charAt(3);
    }
    public String mayusculas(){
        return cadena.toUpperCase();
    }
    public String reemplazar(){
        return cadena.replace("a", "x");
    }
    public String subcadena(){
        return cadena.substring(3,10);
    }
    
    
}
