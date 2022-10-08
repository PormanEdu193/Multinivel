
package Vista;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class formulario extends javax.swing.JFrame {

    
    public formulario() {
        initComponents();
    }

    public JRadioButton getRbElefante() {
        return RbElefante;
    }

    public JRadioButton getRbGato() {
        return RbGato;
    }

    public JRadioButton getRbPerro() {
        return RbPerro;
    }

    public JRadioButton getRbPescado() {
        return RbPescado;
    }

    public JRadioButton getRbVaca() {
        return RbVaca;
    }
    

    public ButtonGroup getGroup() {
        return Group;
    }

    public JTextField getTxtResult() {
        return TxtResult;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Group = new javax.swing.ButtonGroup();
        RbPerro = new javax.swing.JRadioButton();
        RbGato = new javax.swing.JRadioButton();
        RbPescado = new javax.swing.JRadioButton();
        RbVaca = new javax.swing.JRadioButton();
        RbElefante = new javax.swing.JRadioButton();
        TxtResult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Group.add(RbPerro);
        RbPerro.setText("Perro");

        Group.add(RbGato);
        RbGato.setText("Gato");

        Group.add(RbPescado);
        RbPescado.setText("Pescado");

        Group.add(RbVaca);
        RbVaca.setText("Vaca");

        Group.add(RbElefante);
        RbElefante.setText("Elefante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RbElefante)
                    .addComponent(RbVaca)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RbPescado)
                        .addGap(26, 26, 26)
                        .addComponent(TxtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RbGato)
                    .addComponent(RbPerro))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(RbPerro)
                .addGap(18, 18, 18)
                .addComponent(RbGato)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbPescado)
                    .addComponent(TxtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(RbVaca)
                .addGap(18, 18, 18)
                .addComponent(RbElefante)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Group;
    private javax.swing.JRadioButton RbElefante;
    private javax.swing.JRadioButton RbGato;
    private javax.swing.JRadioButton RbPerro;
    private javax.swing.JRadioButton RbPescado;
    private javax.swing.JRadioButton RbVaca;
    private javax.swing.JTextField TxtResult;
    // End of variables declaration//GEN-END:variables
}
