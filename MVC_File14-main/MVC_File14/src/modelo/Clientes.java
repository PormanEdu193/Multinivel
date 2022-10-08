
package modelo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Clientes {
    String titulos[]={"Nombre","Identificación","Edad","Correo"};
    DefaultTableModel modelo = new DefaultTableModel(null,titulos);
    ArrayList<Informacion> clientes;
    int sumaedades;
    double promedio;

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    

    public Clientes() {
        clientes = new ArrayList();
    }
    
    public DefaultTableModel adicionar(Informacion objetonuevo){
        clientes.add(objetonuevo);
        int i;
        sumaedades=0;
        Object [] fila = new Object[4];
        for(i=0;i<clientes.size();i++){
           fila[0]= clientes.get(i).getNombre();
           fila[1]= clientes.get(i).getIdentificacion();
           fila[2]= clientes.get(i).getEdad();
           fila[3]= clientes.get(i).getCorreo();
           sumaedades=sumaedades+clientes.get(i).getEdad();
           modelo.addRow(fila);
        }
        promedio=sumaedades/i;
        return modelo;
    }
    
}
