
package com.mycompany.proyecto_integrador1.LoginAdministrador;

import com.mycompany.proyecto_integrador1.RegistroAdministrador.RegistroAdministrador;
import com.mycompany.proyecto_integrador1.Sistema.AdminInterface;
import static com.mycompany.proyecto_integrador1.clases.ConexionBD.registrarAcceso;
import static com.mycompany.proyecto_integrador1.clases.ConexionBD.validarLogin;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class LoginAdministrador extends javax.swing.JFrame {

    public LoginAdministrador() {
        initComponents();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Logo_principal_Login.png"));
        Icono.setIcon(icon);
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Identificacionusuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Contraseñausuario = new javax.swing.JPasswordField();
        Botonlogin = new javax.swing.JButton();
        Nombreusuario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Registrarse = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Icono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(720, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(230, 243, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel3.setMinimumSize(new java.awt.Dimension(458, 495));
        jPanel3.setPreferredSize(new java.awt.Dimension(1440, 1024));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 227, 231), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 620, -1));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 610, -1));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 610, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingrese a su cuenta");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1090, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(124, 131, 138));
        jLabel2.setText("Contraseña");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 202, -1));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 202, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(124, 131, 138));
        jLabel6.setText("Nombre de usuario");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 202, -1));

        Identificacionusuario.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        Identificacionusuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Identificacionusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdentificacionusuarioActionPerformed(evt);
            }
        });
        jPanel2.add(Identificacionusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 540, 65));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(124, 131, 138));
        jLabel7.setText("Identificación");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 202, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, 350));

        Contraseñausuario.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        Contraseñausuario.setBorder(null);
        Contraseñausuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñausuarioActionPerformed(evt);
            }
        });
        jPanel2.add(Contraseñausuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 540, 65));

        Botonlogin.setBackground(new java.awt.Color(65, 90, 119));
        Botonlogin.setFont(new java.awt.Font("Roboto", 0, 26)); // NOI18N
        Botonlogin.setForeground(new java.awt.Color(255, 255, 255));
        Botonlogin.setText("Ingrese a su cuenta ");
        Botonlogin.setBorder(null);
        Botonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonloginActionPerformed(evt);
            }
        });
        jPanel2.add(Botonlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 680, 320, 40));

        Nombreusuario.setBackground(new java.awt.Color(223, 227, 231));
        Nombreusuario.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        Nombreusuario.setBorder(null);
        Nombreusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreusuarioActionPerformed(evt);
            }
        });
        jPanel2.add(Nombreusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 540, 50));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 670, -1, -1));

        Registrarse.setBackground(new java.awt.Color(0, 255, 204));
        Registrarse.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Registrarse.setForeground(new java.awt.Color(65, 90, 119));
        Registrarse.setText(" Registrarse");
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseMouseClicked(evt);
            }
        });
        jPanel2.add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 780, 300, -1));

        jLabel11.setBackground(new java.awt.Color(0, 255, 204));
        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setText("Si no tiene una cuenta,");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 780, 300, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 1090, 850));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        Icono.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nicol Alejandra\\Documents\\NetBeansProjects\\Proyecto-Integrador-1\\src\\main\\java\\Imagenes_Niki\\Imagenes_p\\Logo_principal_Login.png")); // NOI18N
        jPanel3.add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1840, 850));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1839, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonloginActionPerformed
        String usuario = Nombreusuario.getText();
        String identificacion = Identificacionusuario.getText();
        String contraseña = new String(Contraseñausuario.getPassword());

        if (validarLogin(usuario, identificacion, contraseña)) {
            JOptionPane.showMessageDialog(this, "¡Login exitoso!", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);

            registrarAcceso(usuario, identificacion);
            AdminInterface admin = new AdminInterface();
            admin.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonloginActionPerformed

    private void RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseClicked
        RegistroAdministrador registroVentana = new RegistroAdministrador(); // Llama a la ventana de registro
        registroVentana.setVisible(true); // Muestra la ventana de registro
        dispose(); // Cierra la ventana de Login
    }//GEN-LAST:event_RegistrarseMouseClicked

    private void NombreusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreusuarioActionPerformed

    private void ContraseñausuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñausuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñausuarioActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void IdentificacionusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdentificacionusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdentificacionusuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botonlogin;
    private javax.swing.JPasswordField Contraseñausuario;
    private javax.swing.JLabel Icono;
    private javax.swing.JTextField Identificacionusuario;
    private javax.swing.JTextField Nombreusuario;
    private javax.swing.JLabel Registrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
