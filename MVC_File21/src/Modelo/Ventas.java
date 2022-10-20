
package Modelo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Ventas {
    ArrayList <Producto> productos;
    String titulos[]={"Nombre Producto","Cantidad", "Precio","SubTotal"};
    private int subtotal;
    private double iva,total;

    public double getIva() {
        return iva;
    }
    
    DefaultTableModel modelo=new DefaultTableModel(null,titulos);
     public Ventas(){
       productos=new ArrayList();
     }

    public int getSubtotal() {
        return subtotal;
    }

    public double getTotal() {
        return total;
    }
    
    
    
    
     
     
    public DefaultTableModel adicionar(Producto objetonuevo) {
       productos.add(objetonuevo);
       Object [] fila = new Object[4];
       subtotal=0;
       for (int i=0; i<productos.size();i++) {
         fila[0] = productos.get(i).getNombre();
         fila[1] = productos.get(i).getCantidad();
         fila[2] = productos.get(i).getPrecio();
         fila[3] = (productos.get(i).getCantidad()*productos.get(i).getPrecio());
         subtotal = subtotal+ productos.get(i).getCantidad()*productos.get(i).getPrecio();
         modelo.addRow(fila);
       } 
       iva= (subtotal*19)/100;
       total= iva+subtotal;
       if(subtotal>1000000){
          total= (subtotal+iva)-((subtotal*5)/100);
       }
       return modelo;
    }
}


