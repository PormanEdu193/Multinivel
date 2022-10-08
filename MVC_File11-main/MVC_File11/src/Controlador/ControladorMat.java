
package Controlador;

import Moldelo.FuncionesMat;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMat implements ActionListener {
    Formulario objetoVista;
    FuncionesMat objetoModelo;

    public ControladorMat() {
        objetoVista = new Formulario();
        objetoModelo = new FuncionesMat();
        objetoVista.setVisible(true);
        objetoVista.getButton().addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== objetoVista.getButton()){
            objetoVista.getTxtPrimero().append(objetoModelo.funcionesMate());
        }
    }
}
