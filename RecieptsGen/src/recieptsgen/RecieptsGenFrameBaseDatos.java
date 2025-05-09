/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package recieptsgen;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo
 */
public class RecieptsGenFrameBaseDatos extends javax.swing.JFrame {

    DefaultTableModel model;
    
    /**
     * Creates new form RecieptsGenFrameBaseDatos
     */
    public RecieptsGenFrameBaseDatos() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logonuevo.png")).getImage());
    }

    public void CargarBase() {
        String[] Titulos = {"ID", "Nombre(s)", "Apellidos", "Genero", "Fecha de nacimiento", "Matricula"};
        String[] Registros = new String[9];
        
        String SQL = "SELECT * FROM grupo";
        
        model = new DefaultTableModel(null, Titulos);
        Conectar cc = new Conectar();
        Connection Conect = cc.Conexion();
        
        try {
            Statement st = (Statement) Conect.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            
            while (rs.next()) {
                Registros[0] = rs.getString("grupo_ID");
                Registros[1] = rs.getString("grupo_Nombre(s)");
                Registros[2] = rs.getString("grupo_Apellidos(s)");
                Registros[3] = rs.getString("grupo_Genero");
                Registros[4] = rs.getString("grupo_Fecha de nacimiento");
                Registros[5] = rs.getString("grupo_Genero");
                
                model.addRow(Registros);
            }
            
            TableBaseDatos.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrameBaseDatos = new javax.swing.JPanel();
        TextFieldBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableBaseDatos = new javax.swing.JTable();
        ButtonBuscarDatos = new javax.swing.JButton();
        ButtonIngresarInformacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar desde base de datos");

        TextFieldBusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TableBaseDatos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TableBaseDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre(s)", "Apellido(s)", "Genero", "Fecha de nacimiento", "Matricula"
            }
        ));
        jScrollPane1.setViewportView(TableBaseDatos);

        ButtonBuscarDatos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonBuscarDatos.setText("Buscar datos");
        ButtonBuscarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarDatosActionPerformed(evt);
            }
        });

        ButtonIngresarInformacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonIngresarInformacion.setText("Ingresar");

        javax.swing.GroupLayout FrameBaseDatosLayout = new javax.swing.GroupLayout(FrameBaseDatos);
        FrameBaseDatos.setLayout(FrameBaseDatosLayout);
        FrameBaseDatosLayout.setHorizontalGroup(
            FrameBaseDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameBaseDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrameBaseDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonIngresarInformacion)
                    .addGroup(FrameBaseDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameBaseDatosLayout.createSequentialGroup()
                            .addComponent(TextFieldBusqueda)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ButtonBuscarDatos))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FrameBaseDatosLayout.setVerticalGroup(
            FrameBaseDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameBaseDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrameBaseDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBuscarDatos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonIngresarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FrameBaseDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FrameBaseDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBuscarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarDatosActionPerformed
       
    }//GEN-LAST:event_ButtonBuscarDatosActionPerformed

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
            java.util.logging.Logger.getLogger(RecieptsGenFrameBaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecieptsGenFrameBaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecieptsGenFrameBaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecieptsGenFrameBaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecieptsGenFrameBaseDatos().setVisible(true);
            }
        
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscarDatos;
    private javax.swing.JButton ButtonIngresarInformacion;
    private javax.swing.JPanel FrameBaseDatos;
    private javax.swing.JTable TableBaseDatos;
    private javax.swing.JTextField TextFieldBusqueda;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}