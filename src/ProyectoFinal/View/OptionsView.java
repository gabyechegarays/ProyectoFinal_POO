/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal.View;

import ProyectoFinal.UI;

/**
 *
 * @author gabyt
 */
public class OptionsView extends javax.swing.JFrame {

    /**
     * Creates new form OptionsView
     */
    public OptionsView() {
        initComponents();
        setSize(400, 590);
        setTitle("panel de opciones");
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        button_return = new javax.swing.JButton();
        button_AgregarAlumno = new javax.swing.JButton();
        button_AgregarEmpleado = new javax.swing.JButton();
        CapturarMaterias = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        button_return.setText("Regresar");
        button_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_returnActionPerformed(evt);
            }
        });

        button_AgregarAlumno.setText("Agregar Alumno");
        button_AgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_AgregarAlumnoActionPerformed(evt);
            }
        });

        button_AgregarEmpleado.setText("Agregar Empleado");
        button_AgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_AgregarEmpleadoActionPerformed(evt);
            }
        });

        CapturarMaterias.setText("Capturar Materias");
        CapturarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapturarMateriasActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Visualizar Datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button_AgregarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_AgregarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(CapturarMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(button_return)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(button_AgregarAlumno)
                .addGap(18, 18, 18)
                .addComponent(button_AgregarEmpleado)
                .addGap(18, 18, 18)
                .addComponent(CapturarMaterias)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addGap(33, 33, 33)
                .addComponent(button_return)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_AgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AgregarAlumnoActionPerformed
        // TODO add your handling code here:
        motorInteface.goToOpAgregarAlumno();
        hide();
              
    }

    /**
     
     */
    public void setMotor(UI mot) {
        motorInteface = mot;


    }//GEN-LAST:event_button_AgregarAlumnoActionPerformed

    private void button_AgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AgregarEmpleadoActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        motorInteface.GoToEmpleado();
        hide();

    }//GEN-LAST:event_button_AgregarEmpleadoActionPerformed

    private void button_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_returnActionPerformed
        // TODO add your handling code here:
        motorInteface.goToLogIn();
        hide();
    }//GEN-LAST:event_button_returnActionPerformed

    private void CapturarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapturarMateriasActionPerformed
        // TODO add your handling code here:
       motorInteface.GoToCrearMaterias();
       hide();
    }//GEN-LAST:event_CapturarMateriasActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(OptionsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CapturarMaterias;
    private javax.swing.JButton button_AgregarAlumno;
    private javax.swing.JButton button_AgregarEmpleado;
    private javax.swing.JButton button_return;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
   
    private UI motorInteface;
}
