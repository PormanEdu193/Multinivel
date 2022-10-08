
package Vista;

import javax.swing.JOptionPane;

public class Mensaje {
    private String titulo;

    public Mensaje() {
        titulo="";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public double solicitarPrimerNumero(String mensaje){
        return Double.parseDouble(JOptionPane.showInputDialog(null,mensaje,titulo,1));
    }
    
    public double solicitarSegundoNumero(String mensaje){
        return Double.parseDouble(JOptionPane.showInputDialog(null,mensaje,titulo,1));
    }
    public void MostrarOperacion(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje,titulo,1);
    }
}
