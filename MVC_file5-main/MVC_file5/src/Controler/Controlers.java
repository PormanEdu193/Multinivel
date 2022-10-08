
package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.text.html.ObjectView;

import Model.OneSecond;
import View.Form;

public class Controlers implements ActionListener{
    Form objectView;
    OneSecond objectModel;
    public Controlers() {
        objectView = new Form();
        objectModel = new OneSecond();
        objectView.setVisible(true);
        objectView.getButton().addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objectView.getButton()){
            
            objectModel.setHours(Integer.parseInt(objectView.getTxtHours().getText()));
            objectModel.setMinutes(Integer.parseInt(objectView.getTxtMinutes().getText()));
            objectModel.setSeconds(Integer.parseInt(objectView.getTxtSeconds().getText()));
            objectModel.Error();
            if(objectModel.isErrorB()==false){
                objectModel.OneSecondF();
                objectView.getTxtResultH().setText(""+objectModel.getHoursR());
                objectView.getTxtResultM().setText(""+objectModel.getMinutesR());
                objectView.getTxtResultS().setText(""+objectModel.getSecondsR());
            }else{
                JOptionPane.showMessageDialog(null, objectModel.getError(), "Error",1);
                objectView.getTxtHours().setText("");
                objectView.getTxtMinutes().setText("");
                objectView.getTxtSeconds().setText("");
            }
            
        }
    }
}
