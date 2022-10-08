
package Controlador;

import Moldelo.Recursividad;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRecursividad implements ActionListener {
    Formulario objetoVista;
    Recursividad objetoModelo;
    int numero;

    public ControladorRecursividad() {
        objetoVista= new Formulario();
        objetoModelo = new Recursividad();
        objetoVista.setVisible(true);
        objetoVista.getButton().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== objetoVista.getButton()){
          numero = Integer.parseInt(objetoVista.getTxtNumero().getText());
          objetoVista.getTxtResultado().setText(objetoModelo.invertir(numero));
        }
    }
    
}
