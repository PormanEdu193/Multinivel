
package Controlador;

import Modelo.Caballo;
import Modelo.Gato;
import Modelo.Perro;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorAni implements ActionListener{

    Formulario objetoVista;
    Caballo  objetoCaballo;
    Gato objetoGato;
    Perro objetoPerro;
    String especie="",nombre="";
    
     public ControladorAni() {
        objetoVista = new Formulario();
        objetoVista.setVisible(true);
        objetoVista.getRadioPerro().addActionListener(this);
        objetoVista.getRadioGato().addActionListener(this);
        objetoVista.getRadioCaballo().addActionListener(this);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objetoVista.getBtn()){
           objetoVista.getTxtResult().setText("");
           nombre = objetoVista.getTxtNombre().getText();
           
           if(objetoVista.getRadioPerro().isSelected()){
               especie = "Perro";
               objetoPerro = new Perro(especie,nombre);
               objetoVista.getTxtResult().append(objetoPerro.imprimir());
           }
           if(objetoVista.getRadioGato().isSelected()){
               especie = "Gato";
               objetoPerro = new Perro(especie,nombre);
               objetoVista.getTxtResult().append(objetoGato.imprimir());
           }
           if(objetoVista.getRadioCaballo().isSelected()){
               especie = "Caballo";
               objetoPerro = new Perro(especie,nombre);
               objetoVista.getTxtResult().append(objetoCaballo.imprimir());
           }
        }
    }
    
}
