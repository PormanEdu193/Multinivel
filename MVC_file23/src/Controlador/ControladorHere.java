
package Controlador;

import Modelo.ActividadUsuario;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ControladorHere implements ActionListener{
    
    Formulario objetoVista;
    ActividadUsuario objetoModelo;
    ActividadUsuario objetoActividad;
    DefaultTableModel modelo = new DefaultTableModel();
    
        public ControladorHere() {
            objetoVista=new Formulario();
            objetoModelo=new ActividadUsuario();
            objetoVista.setVisible(true);
            objetoVista.getButton().addActionListener(this);
         }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objetoVista.getButton())
            {
                String nombre=objetoVista.getTxtNombre().getText();
                String id=objetoVista.getTxtIdenti().getText();
                String edad=objetoVista.getTxtEdad().getText();
                String deporte=objetoVista.getComboDeporte().getSelectedItem().toString();
                String aficion=objetoVista.getComboAficion().getSelectedItem().toString();
                objetoActividad=new ActividadUsuario(nombre,id,edad,deporte,aficion);
                modelo=(DefaultTableModel)objetoVista.getTable().getModel();
                int filas=objetoVista.getTable().getRowCount();
                for (int i = 0;filas>i; i++)
                    modelo.removeRow(0);
                modelo=objetoModelo.adicionar(objetoActividad);
                objetoVista.getTable().setModel(modelo);
                objetoVista.getTxtTotalDeporte().setText(""+objetoModelo.getSumaDeportes());
                objetoVista.getTxtTotalAficion().setText(""+objetoModelo.getSumaAficion());
            } 
    }
    
}
