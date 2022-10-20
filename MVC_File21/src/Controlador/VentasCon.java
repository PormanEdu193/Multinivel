
package Controlador;

import Modelo.Producto;
import Modelo.Ventas;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class VentasCon implements ActionListener {
    Formulario objetoVista;
    Ventas objetoModelo;
    Producto objetoProducto;
    DefaultTableModel modelo=new DefaultTableModel();

    public VentasCon() {
        objetoVista = new Formulario();
        objetoModelo= new Ventas();
        objetoVista.setVisible(true);
        objetoVista.getButton().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== objetoVista.getButton()){
            objetoProducto=new Producto();
            objetoProducto.setNombre(objetoVista.getComboBox().getSelectedItem().toString());
            objetoProducto.setCantidad(Integer.parseInt(objetoVista.getTxtCantidad().getText()));
            objetoProducto.setPrecio(Integer.parseInt(objetoVista.getTxtPrecio().getText()));
            modelo=(DefaultTableModel)objetoVista.getTable().getModel();
            int filas=objetoVista.getTable().getRowCount();
            for (int i = 0;filas>i; i++)
            modelo.removeRow(0);
            modelo=objetoModelo.adicionar(objetoProducto);
            objetoVista.getTable().setModel(modelo);
            objetoVista.getTxtSubtotal().setText(String.valueOf(objetoModelo.getSubtotal()));
            objetoVista.getTxtIva().setText(String.valueOf(objetoModelo.getIva()));
            objetoVista.getTxtTotal().setText(String.valueOf(objetoModelo.getTotal()));
            objetoVista.getTxtCantidad().setText("");
            objetoVista.getTxtPrecio().setText("");
        }
    }
    
}
