
package Controlador;

import Modelo.Empleados;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class HerenciaControlador implements ActionListener {
    Formulario objetoVista;
    Empleados objetoModelo;
    Empleados objetoEmpleado;
    DefaultTableModel modelo = new DefaultTableModel();

    public HerenciaControlador() {
        objetoVista=new Formulario();
        objetoModelo=new Empleados();
        objetoVista.setVisible(true);
        objetoVista.getButtonSin().addActionListener(this);
        objetoVista.getBottonCon().addActionListener(this);
    }
    
    
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==objetoVista.getButtonSin()) {
           objetoEmpleado=new Empleados();
           objetoEmpleado.setNombre(objetoVista.getTxtNombre().getText());
           objetoEmpleado.setIdentificacion(objetoVista.getTxtIdenti().getText());
           objetoEmpleado.setCargo(objetoVista.getComboBox().getSelectedItem().toString());
           objetoEmpleado.setSalario(Double.parseDouble(objetoVista.getTxtSalario().getText()));
           modelo=(DefaultTableModel)objetoVista.getTable().getModel();
           int filas=objetoVista.getTable().getRowCount();
           for (int i = 0;filas>i; i++)
             modelo.removeRow(0);
           modelo=objetoModelo.adicionar(objetoEmpleado);
           objetoVista.getTable().setModel(modelo);
           objetoVista.getTxtTotal().setText(""+objetoModelo.getSumatotal());
          }
      if(e.getSource()==objetoVista.getBottonCon()) {
          String nombre=objetoVista.getTxtNombre().getText();
          String identificacion=objetoVista.getTxtIdenti().getText();
          String cargo=objetoVista.getComboBox().getSelectedItem().toString();
          double salario=Double.parseDouble(objetoVista.getTxtSalario().getText());
          objetoEmpleado=new Empleados(cargo,salario,nombre,identificacion);
          modelo=(DefaultTableModel)objetoVista.getTable().getModel();
          int filas=objetoVista.getTable().getRowCount();
          for (int i = 0;filas>i; i++)
             modelo.removeRow(0);
          modelo=objetoModelo.adicionar(objetoEmpleado);
          objetoVista.getTable().setModel(modelo);
          objetoVista.getTxtTotal().setText(""+objetoModelo.getSumatotal());
        }
    }   
}
