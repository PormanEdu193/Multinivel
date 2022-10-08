
package Controlador;

import Modelo.ParesImpares;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorParesImpares implements ActionListener {
    Formulario objetoVista;
    ParesImpares objetoModelo;

    public ControladorParesImpares() {
        objetoVista=new Formulario();
        objetoModelo=new ParesImpares();
        objetoVista.setVisible(true);
        objetoVista.getButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objetoVista.getButton()){
            int primero = Integer.parseInt(objetoVista.getTxtPrimero().getText());
            int segundo = Integer.parseInt(objetoVista.getTxtSegundo().getText());
            
            if(primero>segundo){
                JOptionPane.showMessageDialog(null,"El primer valor debe ser menor " ,"Error",1);
                objetoVista.getTxtPrimero().setText("");
                objetoVista.getTxtSegundo().setText("");
                objetoVista.getTxtImpares().setText("");
                objetoVista.getTxtPares().setText("");
                objetoVista.getTxtPrimero().requestFocus();
            }
            else{
                objetoModelo.numeros(primero, segundo);
                objetoVista.getTxtPares().setText(""+objetoModelo.getNropares());
                 objetoVista.getTxtImpares().setText(""+objetoModelo.getNroimpares());
            }
        }
    }
    
    
}
