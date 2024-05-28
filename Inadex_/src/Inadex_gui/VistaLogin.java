/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inadex_gui;


import javax.sound.sampled.Clip;
import javax.swing.JTextField;
import java.sql.SQLException;
import Controladores.ControladorLogin;
import Controladores.ControladorUpdate;
import Servicios.Servicios;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author zenca
 */
public class VistaLogin extends javax.swing.JFrame {
    Servicios servicios = new Servicios();
    private JTextField textField;
    private Clip clip;
    private VistaMusica musica;
    private VistaMenu menu;
    private static ControladorLogin usuario_login ;     
    private static ControladorLogin pass_login;
    private VistaSign_In sign_In;
    VistaDelete vDelete = new VistaDelete();
    ControladorLogin controlador = new ControladorLogin();
    
    /**
     * Creates new form Login
     */
    
    public VistaLogin() {
        initComponents();
        System.out.println("Inadex_gui.VistaLogin.<init>()");
        musica = new VistaMusica();

    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlabel1 = new javax.swing.JLabel();
        Login_Button = new javax.swing.JButton();
        Usuario_Text = new javax.swing.JTextField();
        Contrasena_Text = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SignIn_Button = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo_red_2.png"))); // NOI18N

        jlabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlabel1.setForeground(new java.awt.Color(255, 255, 255));
        jlabel1.setText("Usuario:");

        Login_Button.setBackground(new java.awt.Color(255, 102, 0));
        Login_Button.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Login_Button.setForeground(new java.awt.Color(255, 255, 255));
        Login_Button.setText("Iniciar Sesión");
        Login_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });

        Usuario_Text.setBackground(new java.awt.Color(255, 102, 0));
        Usuario_Text.setForeground(new java.awt.Color(255, 255, 255));
        Usuario_Text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Usuario_Text.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Usuario_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuario_TextActionPerformed(evt);
            }
        });

        Contrasena_Text.setBackground(new java.awt.Color(255, 102, 0));
        Contrasena_Text.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Contrasena_Text.setForeground(new java.awt.Color(255, 255, 255));
        Contrasena_Text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Contrasena_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contrasena_TextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");

        SignIn_Button.setBackground(new java.awt.Color(255, 102, 0));
        SignIn_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SignIn_Button.setForeground(new java.awt.Color(255, 255, 255));
        SignIn_Button.setText("Registrarse");
        SignIn_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SignIn_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignIn_ButtonActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(255, 102, 0));
        Delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Borrar Cuenta");
        Delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(255, 102, 0));
        Update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Actualizar Cuenta");
        Update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel2.setText("Pre Alpha 0.1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jlabel1)
                                    .addComponent(Contrasena_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Usuario_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SignIn_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                                        .addComponent(jLabel2)))))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jlabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Usuario_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Contrasena_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(Login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(SignIn_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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




    public void setContrasena_Text(javax.swing.JTextField contrasena_Text) {
        Contrasena_Text = contrasena_Text;
    }



    public javax.swing.JTextField getUsuario_Text() {
        return Usuario_Text;
    }



    public void setUsuario_Text(javax.swing.JTextField usuario_Text) {
        Usuario_Text = usuario_Text;
    }

    

    private void Usuario_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuario_TextActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_Usuario_TextActionPerformed

//botón de login funcional
    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
        // TODO add your handling code here:
        musica = new VistaMusica();
        menu = new VistaMenu();
        menu.setVisible(true);
        menu.setSize(1295, 900);
        menu.setTitle("Inadex");
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
        musica.playSound("src/resources_audio/OK.wav");
           String usuario = Usuario_Text.getText();
           String contrasena = Contrasena_Text.getText();
        try {
            
    // Intenta realizar el inicio de sesión
    boolean loginExitoso = controlador.login(usuario, contrasena);
    if (loginExitoso) {
        
    }  else {
        menu.dispose();
        JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
        
    }
} catch (HeadlessException ex) {
    JOptionPane.showMessageDialog(null, "Ocurrió un error durante el inicio de sesión", "Error", JOptionPane.ERROR_MESSAGE);
    
}       catch (SQLException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
/*
 * lectura y escritura de ficheros
 */
        File CheckLogin = new File("src/CheckLogin.txt");
        int cont = 0;
        try{
            Scanner lector = new Scanner(CheckLogin);

            while(lector.hasNextLine()){
                cont += 1;
                String linea = lector.nextLine();
               if(linea.equals("tercera")){
                    System.out.println( cont +"\t"+ linea);
                }
            }
            
            
        }catch(FileNotFoundException e){
            System.out.println(e);
        }

        FileWriter fichero = null;
        try {
            fichero = new FileWriter("src/CheckLogin.txt");
            String linea = "Has iniciado sesión correctamente " +  usuario ;
            fichero.write(linea);
            fichero.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    
    }//GEN-LAST:event_Login_ButtonActionPerformed
    
    public String obtenerPass(){
        return Contrasena_Text.getText();
    }
    public String obtenerUsuario(){
        return Usuario_Text.getText();
    }
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        musica.playSound("src/resources_audio/OK.wav");
        vDelete.setVisible(true);
        vDelete.setResizable(false);
        vDelete.setLocationRelativeTo(null);
        servicios.borrarUsuarios();
        dispose();
              
    
      
          
            
        
    }//GEN-LAST:event_DeleteActionPerformed
public void EscribirFichero() throws SQLException, IOException {
    String usuario = Usuario_Text.getText();
    String contrasena = Contrasena_Text.getText();

    
    LocalTime horaActual = LocalTime.now();

    
    System.out.println("Hora actual: " + horaActual);

    boolean loginExitoso = controlador.login(usuario, contrasena);

    try {
        try (FileWriter fichero = new FileWriter("src/CheckLogin.txt")) {
            if (loginExitoso) {
                fichero.write("Has iniciado sesión correctamente " + usuario + " a la hora " + horaActual);
            } else {
                fichero.write("Error al iniciar sesión para el usuario " + usuario + " a la hora " + horaActual);
            }
            
            fichero.close();
        }
    } catch (IOException e) {
        System.out.println("Error al escribir en el archivo: " + e.getMessage());
    }
}
    private void SignIn_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignIn_ButtonActionPerformed
        // TODO add your handling code here:
        sign_In = new VistaSign_In();
        sign_In.setVisible(true);
        sign_In.setSize(547, 768);
        sign_In.setTitle("Inadex");
        sign_In.setResizable(false);
        sign_In.setLocationRelativeTo(null);
        musica.playSound("src/resources_audio/OK.wav");
        dispose();
        
        

        
        
    }//GEN-LAST:event_SignIn_ButtonActionPerformed

    private void Contrasena_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contrasena_TextActionPerformed
      
    }//GEN-LAST:event_Contrasena_TextActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        String[] usuarios ={"1", "2", "3"}; // TODO Recoger lista usuarios de BBDD
        VistaUpdate vista = new VistaUpdate(usuarios);
        VistaLogin vistaL = new VistaLogin();
                musica.playSound("src/resources_audio/OK.wav");

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        
    /**
     *
     */
    public void run() {
                Servicios servicios = new Servicios();
                vista.setTitle("Actualizar Usuario y Contraseña");
                ControladorUpdate controller = new ControladorUpdate(servicios, vista);
                vista.setVisible(true);
                vista.setLocationRelativeTo(null);
                vista.setSize(619, 473);
            }
        });
       dispose();
    }//GEN-LAST:event_UpdateActionPerformed
  
    //Este metodo sirve para reproducir musica de fondo en bucle
    
    
  /**
     * @param args the command line arguments
     */

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Contrasena_Text;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Login_Button;
    private javax.swing.JButton SignIn_Button;
    private javax.swing.JButton Update;
    private javax.swing.JTextField Usuario_Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel jlabel1;
    // End of variables declaration//GEN-END:variables
}
