
package Controlador;

import Modelo.Operacion;
import Vista.Mensaje;

public class ControladorOperacion {
    Operacion objetomodelo;
    Mensaje objetovista;

    public ControladorOperacion() {
        objetomodelo = new Operacion();
        objetovista = new Mensaje();
    }
    
    public void iniciar(){
        objetovista.setTitulo("Producto de dos nùmeros");
        objetomodelo.setPrimero(objetovista.solicitarPrimerNumero("Digite el primer nùmero"));
        objetomodelo.setSegundo(objetovista.solicitarSegundoNumero("Digite el segundo nùmero"));
        objetovista.MostrarOperacion("El producto es: "+objetomodelo.multiplicacion());
    }
    
}
