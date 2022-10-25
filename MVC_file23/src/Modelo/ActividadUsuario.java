
package Modelo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ActividadUsuario extends Usuario{
    private String deporte,aficion;
    ArrayList<ActividadUsuario> usuario;
    int sumaDeportes,sumaAficion;
    String titulos[] = {"Nombre","Identificación","Edad","Deporte","Afición"};
    DefaultTableModel modelo = new DefaultTableModel(null,titulos);

    public ActividadUsuario(String deporte, String aficion, String nombre, String id, String edad) {
        super(nombre, id, edad);
        this.deporte = deporte;
        this.aficion = aficion;
    }

    public ActividadUsuario() {
        usuario=new ArrayList();
    }

    public String getDeporte() {
        return deporte;
    }

    public int getSumaAficion() {
        return sumaAficion;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getAficion() {
        return aficion;
    }

    public void setAficion(String aficion) {
        this.aficion = aficion;
    }

    public int getSumaDeportes() {
        return sumaDeportes;
    }

    public void setSumaDeportes(int sumaDeportes) {
        this.sumaDeportes = sumaDeportes;
    }
    
    public DefaultTableModel adicionar(ActividadUsuario objetonuevo) {
       usuario.add(objetonuevo);
       int i;
       sumaDeportes=sumaAficion=0;
       Object [] fila = new Object[5];
       for (i=0; i<usuario.size();i++) {
          fila[0] = usuario.get(i).getNombre();
          fila[1] = usuario.get(i).getIdentificacion();
          fila[2] = usuario.get(i).getEdad();
          fila[3] = usuario.get(i).getDeporte();
          fila[4] = usuario.get(i).getAficion();
          if(usuario.get(i).getDeporte().equals("Futbol"))
             sumaDeportes+=1;
          if(usuario.get(i).getAficion().equals("Dormir"))
             sumaAficion+=1;
          modelo.addRow(fila);
    }
       return modelo;
    }
}
