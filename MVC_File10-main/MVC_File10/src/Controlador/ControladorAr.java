
package Controlador;

import Modelo.Arreglo;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorAr implements ActionListener {
    Formulario objetoVista;
    Arreglo objetoModelo;
    int numero;
    int auxiliar;
    int arreglo[]=new int[10];

    public ControladorAr() {
        objetoVista = new Formulario();
        objetoModelo= new Arreglo();
        objetoVista.setVisible(true);
        objetoVista.getTxtValor().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objetoVista.getTxtValor()){
            numero= Integer.parseInt(objetoVista.getTxtValor().getText());
            arreglo[auxiliar]=numero;
            auxiliar++;
            objetoVista.getTxtValor().setText("");
            objetoVista.getTxtValor().requestFocus();
            if(auxiliar==10){
                objetoVista.getTxtValor().setEditable(false);
                objetoVista.getTxtCapturados().setText(objetoModelo.original(arreglo));
                objetoVista.getTxtOrdenados().setText(objetoModelo.ordenar(arreglo));
            }
        }
    }
    
}
