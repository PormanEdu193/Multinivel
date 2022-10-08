
package Controler;
import Model.Data;
import View.Form;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Controlers implements ActionListener {
    Form ObjectForm;
    Data ObjectData;
    
    public Controlers(){
        ObjectForm = new Form();
        ObjectData =  new Data();
        ObjectForm.setVisible(true);
        ObjectForm.getButton().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== ObjectForm.getButton()){
            
            ObjectForm.getTxtEntero().setText(""+ ObjectData.getValue_a());
            ObjectForm.getTxtDouble().setText(""+ObjectData.getValue_double());
            ObjectForm.getTxtBoolean().setText(""+ObjectData.isValue_boolean());
            ObjectForm.getTxtCaracter().setText(""+ObjectData.getValue_char());
            ObjectForm.getTxtSuma().setText(""+(ObjectData.getValue_a()+ObjectData.getValue_b()));
            ObjectForm.getTxtResta().setText(""+(ObjectData.getValue_a()-ObjectData.getValue_b()));
            ObjectForm.getTxtMultiplicacion().setText(""+(ObjectData.getValue_a()*ObjectData.getValue_b()));
            ObjectForm.getTxtModulo().setText(""+(ObjectData.getValue_a()%ObjectData.getValue_b()));
            
            DecimalFormat deci = new DecimalFormat("#.00");
            double div = Double.parseDouble(String.valueOf(ObjectData.getValue_a()))/Double.parseDouble(String.valueOf(ObjectData.getValue_b()));
            ObjectForm.getTxtDivision().setText(""+deci.format(div));
            
            
        }
    }
}
