/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafinanciera;

/**
 *
 * @author jhon
 */
public class InteresCompuesto extends javax.swing.JFrame {

    /**
     * Creates new form InteresCompuesto
     */
    public InteresCompuesto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textI = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        textResultado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textVF = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboxCalculo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        textVA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textNper = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbtnEfectiva = new javax.swing.JRadioButton();
        rbtnNominal = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtNper2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtI2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnInteres = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Financiera");

        textI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIActionPerformed(evt);
            }
        });

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textResultado.setEditable(false);

        jLabel6.setText("Valor Futuro (M):");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Interes Compuesto");

        jLabel2.setText("Elija una opcion de calculo:");

        comboxCalculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Interes Compuesto (C)", "Interes Compuesto (M)", "Interes Compuesto(n)", "Interes Compuesto (i)", " " }));
        comboxCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxCalculoActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor Actual (C):");

        textVA.setEnabled(false);

        jLabel4.setText("Periodo (n):");

        textNper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNperActionPerformed(evt);
            }
        });

        jLabel5.setText("Tasa de Interes (i):");

        rbtnEfectiva.setText("Tasa Efectiva");
        rbtnEfectiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEfectivaActionPerformed(evt);
            }
        });

        rbtnNominal.setText("Tasa Nominal");
        rbtnNominal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNominalActionPerformed(evt);
            }
        });

        jLabel7.setText("Periodo de Capitalizacion (m):");

        jLabel8.setText("Tasa Nominal (j):");

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnInteres.setText("Tasa Equvalente");
        btnInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInteresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtnEfectiva)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textVA, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addComponent(textVF)
                                    .addComponent(comboxCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(textI, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(textNper, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8)
                                            .addComponent(txtI2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(txtNper2))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addComponent(btnInteres)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(rbtnNominal)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(32, 32, 32))))
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnEfectiva)
                    .addComponent(rbtnNominal))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboxCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(textResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNper2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInteres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtI2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textVF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch(this.comboxCalculo.getSelectedIndex()){
            case 0:
                double va = 0;
                if(this.rbtnEfectiva.isSelected()){
                    va = Double.parseDouble(this.textVF.getText())/Math.pow((1+Double.parseDouble(this.textI.getText())),Double.parseDouble(this.textNper.getText()));
                }
                if(this.rbtnNominal.isSelected()){
                    va = Double.parseDouble(this.textVF.getText())/Math.pow((1+(Double.parseDouble(this.txtI2.getText())/Double.parseDouble(this.txtNper2.getText()))),Double.parseDouble(this.textNper.getText())*Double.parseDouble(this.txtNper2.getText()));
                }
                this.textResultado.setText(String.format("%.2f",va));
            break;
            case 1:
                double vf = 0;
                if(this.rbtnEfectiva.isSelected()){
                    vf = Double.parseDouble(this.textVA.getText())*Math.pow((1+Double.parseDouble(this.textI.getText())),Double.parseDouble(this.textNper.getText()));
                }
                if(this.rbtnNominal.isSelected()){
                    vf = Double.parseDouble(this.textVA.getText())*Math.pow((1+(Double.parseDouble(this.txtI2.getText())/Double.parseDouble(this.txtNper2.getText()))),Double.parseDouble(this.textNper.getText())*Double.parseDouble(this.txtNper2.getText()));
                }
                this.textResultado.setText(String.format("%.2f",vf));
            break;
            case 2:
                double nper = 0;
                if(this.rbtnEfectiva.isSelected()){
                    nper = Math.log(Double.parseDouble(this.textVF.getText())/Double.parseDouble(this.textVA.getText()))/Math.log(1+Double.parseDouble(this.textI.getText()));
                }
                if(this.rbtnNominal.isSelected()){
                    nper = Math.log(Double.parseDouble(this.textVF.getText())/Double.parseDouble(this.textVA.getText()))/(Double.parseDouble(this.txtNper2.getText())*Math.log(1+(Double.parseDouble(this.txtI2.getText())/Double.parseDouble(this.txtNper2.getText()))));
                }
                this.textResultado.setText(String.format("%.2f",nper));
            break;
            case 3:
                double i = 0;
                if(this.rbtnEfectiva.isSelected()){
                    i = Math.pow((Double.parseDouble(this.textVF.getText())/Double.parseDouble(this.textVA.getText())), (1/Double.parseDouble(this.textNper.getText())))-1;
                }
                if(this.rbtnNominal.isSelected()){
                    i = Double.parseDouble(this.txtNper2.getText())*(Math.pow((Double.parseDouble(this.textVF.getText())/Double.parseDouble(this.textVA.getText())), (1/(Double.parseDouble(this.textNper.getText())*Double.parseDouble(this.txtNper2.getText()))))-1);
                }
                this.textResultado.setText(String.format("%.2f",i));
            break;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        VentanaPrincipal vPrincipal = new VentanaPrincipal();
        vPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void comboxCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxCalculoActionPerformed
        switch(this.comboxCalculo.getSelectedIndex()){
            case 0:
                this.textVF.setEnabled(true);
                this.textVA.setEnabled(false);
                if(this.rbtnEfectiva.isSelected()){
                  this.textI.setEnabled(true);
                  this.textNper.setEnabled(true);
                  this.txtI2.setEnabled(false);
                  this.txtNper2.setEnabled(false);
                }
                if(this.rbtnNominal.isSelected()){
                    this.txtI2.setEnabled(true);
                    this.txtNper2.setEnabled(true);
                    this.textI.setEnabled(false);
                    this.textNper.setEnabled(true);
                }
            break;
            case 1:
                this.textVF.setEnabled(false);
                this.textVA.setEnabled(true);
                if(this.rbtnEfectiva.isSelected()){
                  this.textI.setEnabled(true);
                  this.textNper.setEnabled(true);
                  this.txtI2.setEnabled(false);
                  this.txtNper2.setEnabled(false);
                }
                if(this.rbtnNominal.isSelected()){
                    this.txtI2.setEnabled(true);
                    this.txtNper2.setEnabled(true);
                    this.textI.setEnabled(false);
                    this.textNper.setEnabled(true);
                }
            break;
            case 2:
                this.textVF.setEnabled(true);
                this.textVA.setEnabled(true);
                if(this.rbtnEfectiva.isSelected()){
                  this.textI.setEnabled(true);
                  this.textNper.setEnabled(false);
                  this.txtI2.setEnabled(false);
                  this.txtNper2.setEnabled(false);
                }
                if(this.rbtnNominal.isSelected()){
                    this.txtI2.setEnabled(true);
                    this.txtNper2.setEnabled(true);
                    this.textI.setEnabled(false);
                    this.textNper.setEnabled(false);
                }
            break;
            case 3:
                this.textVF.setEnabled(true);
                this.textVA.setEnabled(true);
                if(this.rbtnEfectiva.isSelected()){
                  this.textI.setEnabled(false);
                  this.textNper.setEnabled(true);
                  this.txtI2.setEnabled(false);
                  this.txtNper2.setEnabled(false);
                }
                if(this.rbtnNominal.isSelected()){
                    this.txtI2.setEnabled(false);
                    this.txtNper2.setEnabled(true);
                    this.textI.setEnabled(false);
                    this.textNper.setEnabled(true);
                }
            break;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxCalculoActionPerformed

    private void textNperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNperActionPerformed

    private void rbtnEfectivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEfectivaActionPerformed
        this.rbtnNominal.setSelected(false);
    }//GEN-LAST:event_rbtnEfectivaActionPerformed

    private void rbtnNominalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNominalActionPerformed
        this.rbtnEfectiva.setSelected(false);
    }//GEN-LAST:event_rbtnNominalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.textI.setText("");
        this.textNper.setText("");
        this.textResultado.setText("");
        this.textVA.setText("");
        this.textVF.setText("");
        this.txtI2.setText("");
        this.txtNper2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInteresActionPerformed
        VentanaTasa tasa = new VentanaTasa();
        tasa.setVisible(true);
    }//GEN-LAST:event_btnInteresActionPerformed

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
            java.util.logging.Logger.getLogger(InteresCompuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InteresCompuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InteresCompuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InteresCompuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InteresCompuesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInteres;
    private javax.swing.JToggleButton btnRegresar;
    private javax.swing.JComboBox<String> comboxCalculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rbtnEfectiva;
    private javax.swing.JRadioButton rbtnNominal;
    private javax.swing.JTextField textI;
    private javax.swing.JTextField textNper;
    private javax.swing.JTextField textResultado;
    private javax.swing.JTextField textVA;
    private javax.swing.JTextField textVF;
    private javax.swing.JTextField txtI2;
    private javax.swing.JTextField txtNper2;
    // End of variables declaration//GEN-END:variables
}
