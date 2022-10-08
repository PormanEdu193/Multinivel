
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Clientes;
import modelo.Informacion;
import vista.Formulario;

public class ControladorClientes implements ActionListener {
    Formulario objetoVista;
    Informacion objetoInformacion;
    Clientes objetoModelo;
    String nombre,identificacion,correo;
    int edad;
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorClientes() {
        objetoVista = new Formulario();
        objetoModelo = new Clientes();
        objetoVista.setVisible(true);
        objetoVista.getButton().addActionListener(this);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== objetoVista.getButton()){
             nombre = objetoVista.getTxtNombre().getText();
             identificacion = objetoVista.getTxtId().getText();
             correo = objetoVista.getTxtCorreo().getText();
             edad = Integer.parseInt(objetoVista.getTxtEdad().getText());
             objetoInformacion = new Informacion();
             objetoInformacion.setNombre(nombre);
             objetoInformacion.setIdentificacion(identificacion);
             objetoInformacion.setEdad(edad);
             objetoInformacion.setCorreo(correo);
             
             modelo =(DefaultTableModel) objetoVista.getTable().getModel();
             int filas= objetoVista.getTable().getRowCount();
             
             for(int i=0;filas>i;i++)
                  modelo.removeRow(0);
             modelo=objetoModelo.adicionar(objetoInformacion);
             objetoVista.getTable().setModel(modelo);
             objetoVista.getTxtNombre().setText("");
             objetoVista.getTxtId().setText("");
             objetoVista.getTxtCorreo().setText("");
             objetoVista.getTxtEdad().setText("");
             objetoVista.getTxtNombre().requestFocus();
             objetoVista.getTxtPromedio().setText(""+objetoModelo.getPromedio());
             
            
        }
    }
}
