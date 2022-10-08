package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Calculate;
import View.Form;

public class Controlers implements ActionListener{
    Form objectForm;
    Calculate objectModel;

    public Controlers() {
        objectForm = new Form();
        objectModel = new Calculate();
        objectForm.setVisible(true);
        objectForm.getButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == objectForm.getButton()){
            objectModel.setNum_1(Float.parseFloat(objectForm.getTxtFirst().getText()));
            objectModel.setNum_2(Float.parseFloat(objectForm.getTxtSecond().getText()));
            objectModel.setOperator(objectForm.getTxtOperator().getText().charAt(0));
            objectModel.Operation();
            if(objectModel.getError() != ""){
                objectForm.getTxtResult().setText(objectModel.getError());
            }
            else{
                objectForm.getTxtResult().setText(String.valueOf(objectModel.getResult()));
            }
        }
    }

    
}
