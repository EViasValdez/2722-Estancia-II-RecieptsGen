/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package recieptsgen;

import javax.swing.ImageIcon;

/**
 *
 * @author Eduardo
 */
public class RecieptsGenPreferenciasJustificante extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public RecieptsGenPreferenciasJustificante() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logonuevo.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        FramePreferencias = new javax.swing.JPanel();
        PanelPreferencias = new javax.swing.JPanel();
        LabelOpciones = new javax.swing.JLabel();
        CheckBoxNombres = new javax.swing.JCheckBox();
        CheckBoxFirmas = new javax.swing.JCheckBox();
        LabelLogo = new javax.swing.JLabel();
        CheckBoxLogoNormal = new javax.swing.JCheckBox();
        CheckBoxLogoVeda = new javax.swing.JCheckBox();
        CheckBoxLogoEdomex = new javax.swing.JCheckBox();
        LabelFormato = new javax.swing.JLabel();
        ComboBoxFormatoDocumento = new javax.swing.JComboBox<>();
        ButtonCancelar = new javax.swing.JButton();
        ButtonAceptar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Preferencias del justificante");

        PanelPreferencias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preferencias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        LabelOpciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelOpciones.setText("Opciones");

        CheckBoxNombres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBoxNombres.setText("Nombres");

        CheckBoxFirmas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBoxFirmas.setText("Firmas");

        LabelLogo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelLogo.setText("Logo");

        CheckBoxLogoNormal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBoxLogoNormal.setText("Estado de Mexico (Normal)");

        CheckBoxLogoVeda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBoxLogoVeda.setText("Estado de Mexico (Veda)");

        CheckBoxLogoEdomex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBoxLogoEdomex.setText("Estado de Mexico (EDOMEX)");

        LabelFormato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelFormato.setText("Formato grafico de documento");

        ComboBoxFormatoDocumento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBoxFormatoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout PanelPreferenciasLayout = new javax.swing.GroupLayout(PanelPreferencias);
        PanelPreferencias.setLayout(PanelPreferenciasLayout);
        PanelPreferenciasLayout.setHorizontalGroup(
            PanelPreferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPreferenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPreferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelOpciones)
                    .addComponent(CheckBoxNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CheckBoxFirmas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(PanelPreferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBoxLogoNormal)
                    .addComponent(CheckBoxLogoVeda)
                    .addComponent(CheckBoxLogoEdomex))
                .addGap(14, 14, 14)
                .addGroup(PanelPreferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelFormato)
                    .addComponent(ComboBoxFormatoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        PanelPreferenciasLayout.setVerticalGroup(
            PanelPreferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPreferenciasLayout.createSequentialGroup()
                .addGroup(PanelPreferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelOpciones)
                    .addComponent(LabelLogo)
                    .addComponent(LabelFormato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPreferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBoxNombres)
                    .addComponent(CheckBoxLogoNormal)
                    .addComponent(ComboBoxFormatoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPreferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBoxFirmas)
                    .addComponent(CheckBoxLogoVeda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBoxLogoEdomex)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        ButtonCancelar.setText("Cancelar");

        ButtonAceptar.setText("Aceptar");

        javax.swing.GroupLayout FramePreferenciasLayout = new javax.swing.GroupLayout(FramePreferencias);
        FramePreferencias.setLayout(FramePreferenciasLayout);
        FramePreferenciasLayout.setHorizontalGroup(
            FramePreferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FramePreferenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FramePreferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelPreferencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FramePreferenciasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonAceptar)))
                .addContainerGap())
        );
        FramePreferenciasLayout.setVerticalGroup(
            FramePreferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FramePreferenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPreferencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FramePreferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FramePreferencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FramePreferencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("RecieptsGenPreferenciasJustificante");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RecieptsGenPreferenciasJustificante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecieptsGenPreferenciasJustificante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecieptsGenPreferenciasJustificante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecieptsGenPreferenciasJustificante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecieptsGenPreferenciasJustificante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAceptar;
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JCheckBox CheckBoxFirmas;
    private javax.swing.JCheckBox CheckBoxLogoEdomex;
    private javax.swing.JCheckBox CheckBoxLogoNormal;
    private javax.swing.JCheckBox CheckBoxLogoVeda;
    private javax.swing.JCheckBox CheckBoxNombres;
    private javax.swing.JComboBox<String> ComboBoxFormatoDocumento;
    private javax.swing.JPanel FramePreferencias;
    private javax.swing.JLabel LabelFormato;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JLabel LabelOpciones;
    private javax.swing.JPanel PanelPreferencias;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}