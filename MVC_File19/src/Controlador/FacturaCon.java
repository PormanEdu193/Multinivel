
package Controlador;

import Modelo.Datos;
import Modelo.Factura;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class FacturaCon implements ActionListener{
     Formulario objetoVista;
     Factura objetoModelo;
     Datos objetoDato;
     DefaultTableModel modelo = new DefaultTableModel();
    public FacturaCon() {
        objetoVista = new Formulario();
        objetoModelo = new Factura();
        objetoVista.setVisible(true);
        objetoVista.getjButton1().addActionListener(this);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objetoVista.getjButton1()){
            objetoDato = new Datos();
            objetoDato.setNombre(objetoVista.getComboBox().getSelectedItem().toString());
            objetoDato.setCantidad(Float.parseFloat(objetoVista.getTxtCantidad().getText()));
            objetoDato.setPrecio(Float.parseFloat(objetoVista.getTxtProducto().getText()));
            
            modelo=(DefaultTableModel) objetoVista.getjTable1().getModel();
            int fila = objetoVista.getjTable1().getRowCount();
            
            for(int i=0;fila>i;i++){
               modelo.removeRow(0);
            }
            
            modelo = objetoModelo.adcionar(objetoDato);
            objetoVista.getjTable1().setModel(modelo);        
        }
    }
    
}
