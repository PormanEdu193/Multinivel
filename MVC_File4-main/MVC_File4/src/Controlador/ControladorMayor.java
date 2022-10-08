
package Controlador;

import Modelo.Mayor;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMayor implements ActionListener{
    Formulario ObjetoVista;
    Mayor ObjetoModelo;
    public ControladorMayor(){
        ObjetoVista = new Formulario(); 
        ObjetoModelo = new Mayor();
        ObjetoVista.setVisible(true);
        ObjetoVista.getButton().addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== ObjetoVista.getButton()){
            ObjetoModelo.setPrimero(Integer.parseInt(ObjetoVista.getTxtPrimero().getText()));
            ObjetoModelo.setSegundo(Integer.parseInt(ObjetoVista.getTxtSegundo().getText()));
            ObjetoModelo.setTercero(Integer.parseInt(ObjetoVista.getTxtTercero().getText()));
            ObjetoModelo.numeroMayor();
            ObjetoVista.getTxtMayor().setText(""+ObjetoModelo.getMayor());
        }
     }
}

