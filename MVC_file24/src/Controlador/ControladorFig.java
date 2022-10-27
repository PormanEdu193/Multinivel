
package Controlador;

import Modelo.Figuras;
import Modelo.Rectangulo;
import Modelo.Triangulo;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorFig implements ActionListener {
    Formulario objetoVista;

    public ControladorFig() {
        objetoVista = new Formulario();
        objetoVista.setVisible(true);
        objetoVista.getButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== objetoVista.getButton()){
         Rectangulo rectangulo = new Rectangulo(Double.valueOf(objetoVista.getTxtBase().getText()),Double.parseDouble(objetoVista.getTxtAltura().getText()));
         Triangulo triangulo = new Triangulo(Double.valueOf(objetoVista.getTxtBase().getText()),Double.parseDouble(objetoVista.getTxtAltura().getText()));
         Figuras objetoModelo;
         objetoModelo=triangulo;
         objetoVista.getTxtTriangulo().setText(String.valueOf(objetoModelo.area()));
         objetoModelo=rectangulo;
         objetoVista.getTxtRectangulo().setText(String.valueOf(objetoModelo.area()));
         
        }
    }
    
}
