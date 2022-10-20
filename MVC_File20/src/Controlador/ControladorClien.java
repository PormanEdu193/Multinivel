
package Controlador;

import Modelo.Clientes;
import Modelo.Contactos;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class ControladorClien implements ActionListener {
    
    Formulario objetoVista;
    Contactos objetoModelo;
    Clientes objetoClientes;
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorClien() {
        objetoVista = new Formulario();
        objetoModelo = new Contactos();
        objetoVista.setVisible(true);
        objetoVista.getButton().addActionListener(this);
    }
    
  
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== objetoVista.getButton()){
         objetoClientes=new Clientes();
         objetoClientes.setNombre(objetoVista.getTxtNombre().getText());
         objetoClientes.setIdentificacion(objetoVista.getTxtIdentificacion().getText());
         objetoClientes.setEdad(Integer.parseInt(objetoVista.getTxtEdad().getText()));
         objetoClientes.setCorreo(objetoVista.getTxtCorreo().getText());
         modelo=(DefaultTableModel)objetoVista.getTable().getModel();
         int filas=objetoVista.getTable().getRowCount();
         for (int i = 0;filas>i; i++)
         modelo.removeRow(0);
         modelo=objetoModelo.adicionar(objetoClientes);
         objetoVista.getTable().setModel(modelo);
         objetoVista.getTxtNombre().setText("");
         objetoVista.getTxtIdentificacion().setText("");
         objetoVista.getTxtEdad().setText("");
         objetoVista.getTxtCorreo().setText("");
         objetoVista.getTxtNombre().requestFocus();
       }
    }
    
}
