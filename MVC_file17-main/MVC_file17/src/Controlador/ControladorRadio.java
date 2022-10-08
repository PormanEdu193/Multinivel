
package Controlador;

import Modelo.Radio;
import Vista.formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRadio implements ActionListener {
    formulario objetoVista;
    Radio objetoModelo;
    int activar;

    public ControladorRadio() {
        objetoVista = new formulario();
        objetoVista.setVisible(true);
        objetoVista.getRbPerro().addActionListener(this);
        objetoVista.getRbGato().addActionListener(this);
        objetoVista.getRbPescado().addActionListener(this);
        objetoVista.getRbVaca().addActionListener(this);
        objetoVista.getRbElefante().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        objetoModelo = new Radio();
        if(e.getSource()== objetoVista.getRbPerro()){
          activar=1;
        }
        if(e.getSource()== objetoVista.getRbGato()){
          activar=2;
        }
        if(e.getSource()== objetoVista.getRbPescado()){
          activar=3;
        }
        if(e.getSource()== objetoVista.getRbVaca()){
          activar=4;
        }
        if(e.getSource()== objetoVista.getRbElefante()){
          activar=5;
        }
        
        objetoVista.getTxtResult().setText(objetoModelo.ingles(activar));
    }
    
    
}
