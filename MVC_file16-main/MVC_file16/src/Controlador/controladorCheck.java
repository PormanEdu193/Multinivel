
package Controlador;

import Modelo.Check;
import Vista.formulario;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class controladorCheck implements ChangeListener{
    formulario objetoVista;
    Check objetoModelo;
    int activar;

    public controladorCheck() {
        objetoVista = new formulario();
        objetoVista.setVisible(true);
        objetoVista.getCheckFondo().addChangeListener(this);
        objetoVista.getCheckLetra().addChangeListener(this);
        objetoVista.getCheckTexto().addChangeListener(this);
    }
    
    public void stateChanged(ChangeEvent e){
        objetoModelo = new Check();
        if(e.getSource() == objetoVista.getCheckFondo()){
           if(objetoVista.getCheckFondo().isSelected()==true)
               activar= 1;
           else
               activar = 0;
           objetoVista.getTxtText().setBackground(objetoModelo.checkFondo(activar));
           }
        if(e.getSource() == objetoVista.getCheckLetra()){
           if(objetoVista.getCheckLetra().isSelected()==true)
               activar= 1;
           else
               activar = 0;
           objetoVista.getTxtText().setFont(objetoModelo.checkLetra(activar));
           }
        
        if(e.getSource() == objetoVista.getCheckTexto()){
           if(objetoVista.getCheckTexto().isSelected()==true)
               activar= 1;
           else
               activar = 0;
           objetoVista.getTxtText().setForeground(objetoModelo.checkColor(activar));
           }
           
        }
    
}
