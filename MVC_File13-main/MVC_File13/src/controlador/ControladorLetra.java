
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import modelo.CadenaLetra;
import vista.formulario;

public class ControladorLetra implements ActionListener{
    formulario objetoVista;
    DefaultListModel modelo = new DefaultListModel();

    public ControladorLetra() {
        objetoVista = new formulario();
        objetoVista.setVisible(true);
        objetoVista.getButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== objetoVista.getButton()){
            String cadena = objetoVista.getTxtOracion().getText();
            CadenaLetra objetoModelo;
            objetoModelo = new CadenaLetra(cadena);
            modelo.clear();
            modelo= objetoModelo.separarletras();
            objetoVista.getList().setModel(modelo);
        }
    }
    
}
