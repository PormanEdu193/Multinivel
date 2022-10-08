
package Vista;

import javax.swing.JCheckBox;
import javax.swing.JTextField;


public class formulario extends javax.swing.JFrame {

    
    public formulario() {
        initComponents();
    }

    public JCheckBox getCheckFondo() {
        return CheckFondo;
    }

    public JCheckBox getCheckLetra() {
        return CheckLetra;
    }

    public JCheckBox getCheckTexto() {
        return CheckTexto;
    }

    public JTextField getTxtText() {
        return TxtText;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CheckTexto = new javax.swing.JCheckBox();
        CheckLetra = new javax.swing.JCheckBox();
        CheckFondo = new javax.swing.JCheckBox();
        TxtText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CheckTexto.setText("Color de texto");
        CheckTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckTextoActionPerformed(evt);
            }
        });

        CheckLetra.setText("Cambiar tipo de letra");
        CheckLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckLetraActionPerformed(evt);
            }
        });

        CheckFondo.setText("Color de fondo");

        TxtText.setText("Texto de prueba");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckLetra)
                    .addComponent(CheckFondo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CheckTexto)
                        .addGap(59, 59, 59)
                        .addComponent(TxtText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(CheckLetra)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckTexto)
                    .addComponent(TxtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CheckFondo)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckTextoActionPerformed

    private void CheckLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckLetraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckLetraActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckFondo;
    private javax.swing.JCheckBox CheckLetra;
    private javax.swing.JCheckBox CheckTexto;
    private javax.swing.JTextField TxtText;
    // End of variables declaration//GEN-END:variables
}
