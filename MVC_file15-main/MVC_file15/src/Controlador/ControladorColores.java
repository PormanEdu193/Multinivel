
package Controlador;

import Modelo.colores;
import Vista.formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ControladorColores implements ActionListener, ListSelectionListener{
    formulario objetoVista;
    colores objetoModelo;
    int numero;
    public ControladorColores() {
        objetoVista= new formulario();
        objetoVista.setVisible(true);
        objetoVista.getComboBox().addActionListener(this);
        objetoVista.getList().addListSelectionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== objetoVista.getComboBox()){
            numero=objetoVista.getComboBox().getSelectedIndex();
            objetoModelo= new colores();
            objetoVista.getTxtText().setBackground(objetoModelo.ComboColores(numero));
            
        } 
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if(e.getSource()==objetoVista.getList()){
            numero = objetoVista.getList().getSelectedIndex();
            objetoModelo = new colores();
            objetoVista.getTxtText().setForeground(objetoModelo.ListaColores(numero));
        }
    }
    
}
