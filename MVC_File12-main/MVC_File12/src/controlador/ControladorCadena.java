
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import modelo.FuncionesCadena;
import vista.formulario;

public class ControladorCadena implements ActionListener{
    formulario objetoVista;
    FuncionesCadena objetoModelo;
    DefaultListModel modelo = new DefaultListModel();

    public ControladorCadena() {
        objetoVista = new formulario();
        objetoVista.setVisible(true);
        objetoVista.getButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== objetoVista.getButton()){
           String cadena = objetoVista.getTxtOracion().getText();
           objetoModelo = new FuncionesCadena(cadena);
           modelo.clear();
           modelo=objetoModelo.separar();
           objetoVista.getList().setModel(modelo);
           objetoVista.getTxtLongitud().setText(""+objetoModelo.longitud());
           objetoVista.getTxtCaracter().setText(""+objetoModelo.caracter());
           objetoVista.getTxtMayusculas().setText(""+objetoModelo.mayusculas());
           objetoVista.getTxtReemplazar().setText(objetoModelo.reemplazar());
           objetoVista.getTxtSub().setText(objetoModelo.subcadena());
       }
    }
}
