
package Controlador;

import Modelo.VolumenMo;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VolumenCon implements ActionListener {
    Formulario objetoVista;
    VolumenMo objetoModelo;
    public VolumenCon() {
        objetoVista = new Formulario();
        objetoVista.setVisible(true);
        objetoVista.getBtnCon().addActionListener(this);
        objetoVista.getBtnSin().addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objetoVista.getBtnCon()){
           objetoModelo = new VolumenMo();
           objetoModelo.iniciar(Double.parseDouble(objetoVista.getTxtAlto().getText()), Double.parseDouble(objetoVista.getTxtAncho().getText()), Double.parseDouble(objetoVista.getTxtProfundo().getText()));
           objetoVista.getTxtVolumen().setText(String.valueOf(objetoModelo.volumen()));
        }
        else{
            objetoModelo = new VolumenMo(Double.parseDouble(objetoVista.getTxtAlto().getText()), Double.parseDouble(objetoVista.getTxtAncho().getText()), Double.parseDouble(objetoVista.getTxtProfundo().getText()));
            objetoVista.getTxtVolumen().setText(String.valueOf(objetoModelo.volumen()));
        }
    }
    
}
