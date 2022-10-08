
package modelo;

import javax.swing.DefaultListModel;

public class CadenaLetra {
    String cadena;
    DefaultListModel modelo = new DefaultListModel();

    public CadenaLetra(String micadena) {
        cadena=micadena;
    }
    public DefaultListModel separarletras(){
        String letras [] = cadena.split(" ");
        //for(String letra:letras){
         //  modelo.addElement(letra);
         // }
         for(String letra:letras){
             if(letra.contains("o")){
                 modelo.addElement(letra);
             }
             if(letra.length()>2){
                 if(letra.charAt(2) == 'n'){
                 modelo.addElement(letra);
                 }
             }
             
  
        }
        return modelo;
    
    }
    
}
