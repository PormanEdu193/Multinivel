
package Controlador;

;

import Modelo.Producto;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorProducto implements ActionListener {
    Formulario objetoVista;
    Producto ObjetoModelo;
    
    public ControladorProducto() {
        objetoVista = new Formulario();
        ObjetoModelo = new Producto();
        objetoVista.setVisible(true);
        objetoVista.getBoton().addActionListener(this);
    }
        
    @Override
    public void actionPerformed (ActionEvent e){
        if (e.getSource()== objetoVista.getBoton()){
            ObjetoModelo.setPrimero(Integer.parseInt(objetoVista.getTxtPrimero().getText()));
            ObjetoModelo.setSegundo(Integer.parseInt(objetoVista.getTxtSegundo().getText()));
            objetoVista.getTxtProducto().setText(""+ObjetoModelo.producto());
        }
    }
    
    
}
