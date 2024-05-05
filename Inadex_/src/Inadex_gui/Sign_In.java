/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inadex_gui;

import BBDD.conexion_BBDD;
import Inadex_gui.Login;
import inadex_.main;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Popup;

/**
 *
 * @author Carlos Marban
 */
public class Sign_In extends javax.swing.JFrame {
private static Clip clip;
         

    /**
     * Creates new form Sign_In
     */
    public Sign_In() {
        initComponents();
        
         main.playBackgroundMusic("src/resources_audio/Login_Background.wav");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Apellido_SignIn = new javax.swing.JTextField();
        Nombre_SignIn = new javax.swing.JTextField();
        Usuario_SignIn = new javax.swing.JTextField();
        Correo_SigIn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SigIn_SigIn = new javax.swing.JButton();
        Pass_SignIn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jTextField1.setBackground(new java.awt.Color(255, 102, 0));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Registrarse");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo_red_2.png"))); // NOI18N

        Apellido_SignIn.setBackground(new java.awt.Color(255, 102, 0));
        Apellido_SignIn.setForeground(new java.awt.Color(255, 255, 255));
        Apellido_SignIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Apellido_SignIn.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Apellido_SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apellido_SignInActionPerformed(evt);
            }
        });

        Nombre_SignIn.setBackground(new java.awt.Color(255, 102, 0));
        Nombre_SignIn.setForeground(new java.awt.Color(255, 255, 255));
        Nombre_SignIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Nombre_SignIn.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Nombre_SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre_SignInActionPerformed(evt);
            }
        });

        Usuario_SignIn.setBackground(new java.awt.Color(255, 102, 0));
        Usuario_SignIn.setForeground(new java.awt.Color(255, 255, 255));
        Usuario_SignIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Usuario_SignIn.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Usuario_SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuario_SignInActionPerformed(evt);
            }
        });

        Correo_SigIn.setBackground(new java.awt.Color(255, 102, 0));
        Correo_SigIn.setForeground(new java.awt.Color(255, 255, 255));
        Correo_SigIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Correo_SigIn.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Correo_SigIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Correo_SigInActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo electrónico:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Usuario:");

        SigIn_SigIn.setBackground(new java.awt.Color(255, 102, 0));
        SigIn_SigIn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        SigIn_SigIn.setForeground(new java.awt.Color(255, 255, 255));
        SigIn_SigIn.setText("Registrarse");
        SigIn_SigIn.setActionCommand("");
        SigIn_SigIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SigIn_SigIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigIn_SigInActionPerformed(evt);
            }
        });

        Pass_SignIn.setBackground(new java.awt.Color(255, 102, 0));
        Pass_SignIn.setForeground(new java.awt.Color(255, 255, 255));
        Pass_SignIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pass_SignIn.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Pass_SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pass_SignInActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contraseña:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(Usuario_SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Apellido_SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombre_SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(Correo_SigIn, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pass_SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(SigIn_SigIn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre_SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(Apellido_SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Usuario_SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(Correo_SigIn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pass_SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SigIn_SigIn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void Correo_SigInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Correo_SigInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Correo_SigInActionPerformed

    private void Usuario_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuario_SignInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Usuario_SignInActionPerformed

    private void Nombre_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre_SignInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre_SignInActionPerformed

    private void Apellido_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apellido_SignInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Apellido_SignInActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    main.stopBackgroundMusic();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SigIn_SigInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigIn_SigInActionPerformed
        // TODO add your handling code here:
         main.playSound("src/resources_audio/OK.wav");
         dispose();
         Login login = new Login();
         login.setVisible(true);
          login.setLocationRelativeTo(null);
        login.setResizable(false);
        login.setTitle("Inadex Login");
        JFrame framel = new JFrame();
         main.stopBackgroundMusic();
         
         String nombre = Nombre_SignIn.getText();
         String apellido = Apellido_SignIn.getText();
         String contrasena = Pass_SignIn.getText();
         String usuario = Usuario_SignIn.getText();
         String correo = Correo_SigIn.getText();
         String insertQuery = "INSERT INTO usuarios (Nombre, Apellido, Usuario, Contrasena, Correo) VALUES ('" + nombre + "', '" + apellido + "', '" + usuario + "', '" + contrasena + "', '" + correo + "')";

        if (correo.isEmpty() || usuario.isEmpty() || contrasena.isEmpty() || nombre.isEmpty() || apellido.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "No se ha rellenado ningún campo");
            conexion_BBDD.CerrarConexion();
        } else{
             try {
                 conexion_BBDD.Conectar();
                 JOptionPane.showMessageDialog(null, "Se ha registrado correctamente");
                 conexion_BBDD.EjecutarUpdate(insertQuery);
             } catch (SQLException ex) {
                 Logger.getLogger(Sign_In.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }//GEN-LAST:event_SigIn_SigInActionPerformed

    private void Pass_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pass_SignInActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Pass_SignInActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido_SignIn;
    private javax.swing.JTextField Correo_SigIn;
    private javax.swing.JTextField Nombre_SignIn;
    private javax.swing.JTextField Pass_SignIn;
    private javax.swing.JButton SigIn_SigIn;
    private javax.swing.JTextField Usuario_SignIn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
