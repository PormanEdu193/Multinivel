
package Controlador;

import Modelo.Mayor;
import Modelo.Menor;
import Modelo.Potencia;
import Modelo.Producto;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorOpe implements ActionListener {
    Formulario objetoVista;
    Menor objetoMenor;
    Mayor objetoMayor;
    Producto objetoProducto;
    Potencia objetoPotencia;

    public ControladorOpe() {
        objetoVista = new Formulario();
        objetoVista.setVisible(true);
        objetoVista.getBtnProducto().addActionListener(this);
        objetoVista.getBtnPotencia().addActionListener(this);
        objetoVista.getBtnMenor().addActionListener(this);
        objetoVista.getBtnMayor().addActionListener(this);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        int primero = Integer.parseInt(objetoVista.getTxtPrimerNum().getText());
        int segundo =Integer.parseInt(objetoVista.getTxtSegundoNum().getText());
        if(e.getSource()== objetoVista.getBtnProducto()){
          objetoProducto = new Producto(primero,segundo);
          objetoVista.getTxtResult().setText(" "+ objetoProducto.operacion());           
        }
        if(e.getSource()== objetoVista.getBtnPotencia()){
          objetoPotencia = new Potencia(primero,segundo);
          objetoVista.getTxtResult().setText(" "+ objetoPotencia.operacion());           
        }
        if(e.getSource()== objetoVista.getBtnMayor()){
          objetoMayor = new Mayor(primero,segundo);
          objetoVista.getTxtResult().setText(" "+ objetoMayor.operacion());           
        }
        if(e.getSource()== objetoVista.getBtnMenor()){
          objetoMenor = new Menor(primero,segundo);
          objetoVista.getTxtResult().setText(" "+ objetoMenor.operacion());           
        } 
    }
}
