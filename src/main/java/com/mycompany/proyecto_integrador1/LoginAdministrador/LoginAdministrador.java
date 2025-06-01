
package com.mycompany.proyecto_integrador1.LoginAdministrador;

import com.mycompany.proyecto_integrador1.RegistroAdministrador.RegistroAdministrador;
import com.mycompany.proyecto_integrador1.Sistema.AdminInterface;
import static com.mycompany.proyecto_integrador1.clases.ConexionBD.registrarAcceso;
import static com.mycompany.proyecto_integrador1.clases.ConexionBD.validarLogin;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LoginAdministrador extends javax.swing.JFrame {

    public LoginAdministrador() {
    initComponents();
    
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ingreseasucuenta = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        nombreusario = new javax.swing.JLabel();
        Identificacionusuario = new javax.swing.JTextField();
        identificacion = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Contraseñausuario = new javax.swing.JPasswordField();
        ingresesucuenta = new javax.swing.JButton();
        Nombreusuario = new javax.swing.JTextField();
        Registrarse = new javax.swing.JLabel();
        sinotiene = new javax.swing.JLabel();
        icongrisnombre1 = new javax.swing.JLabel();
        icongrisnombre2 = new javax.swing.JLabel();
        icongrisnombre3 = new javax.swing.JLabel();
        icongrisnombre4 = new javax.swing.JLabel();
        iconpricipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setAutoscrolls(true);
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(230, 243, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel3.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel3.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel3.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 227, 231), 1, true));
        jPanel2.setMaximumSize(new java.awt.Dimension(2147483647, 1080));
        jPanel2.setMinimumSize(new java.awt.Dimension(820, 1080));
        jPanel2.setPreferredSize(new java.awt.Dimension(820, 1080));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingreseasucuenta.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        ingreseasucuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingreseasucuenta.setText("Ingrese a su cuenta");
        jPanel2.add(ingreseasucuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 880, 40));

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        contraseña.setForeground(new java.awt.Color(124, 131, 138));
        contraseña.setText("Contraseña");
        jPanel2.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 202, -1));

        nombreusario.setBackground(new java.awt.Color(255, 255, 255));
        nombreusario.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        nombreusario.setForeground(new java.awt.Color(124, 131, 138));
        nombreusario.setText("Nombre de usuario");
        jPanel2.add(nombreusario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 202, 20));

        Identificacionusuario.setBackground(new java.awt.Color(223, 227, 231));
        Identificacionusuario.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        Identificacionusuario.setBorder(null);
        Identificacionusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdentificacionusuarioActionPerformed(evt);
            }
        });
        jPanel2.add(Identificacionusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 550, 65));

        identificacion.setBackground(new java.awt.Color(255, 255, 255));
        identificacion.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        identificacion.setForeground(new java.awt.Color(124, 131, 138));
        identificacion.setText("Identificación");
        jPanel2.add(identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 202, -1));

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

        Contraseñausuario.setBackground(new java.awt.Color(223, 227, 231));
        Contraseñausuario.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        Contraseñausuario.setBorder(null);
        Contraseñausuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñausuarioActionPerformed(evt);
            }
        });
        jPanel2.add(Contraseñausuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 550, 65));

        ingresesucuenta.setBackground(new java.awt.Color(65, 90, 119));
        ingresesucuenta.setFont(new java.awt.Font("Roboto", 0, 26)); // NOI18N
        ingresesucuenta.setForeground(new java.awt.Color(255, 255, 255));
        ingresesucuenta.setText("Ingrese a su cuenta ");
        ingresesucuenta.setBorder(null);
        ingresesucuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresesucuentaActionPerformed(evt);
            }
        });
        jPanel2.add(ingresesucuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, 310, 30));

        Nombreusuario.setBackground(new java.awt.Color(223, 227, 231));
        Nombreusuario.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        Nombreusuario.setBorder(null);
        Nombreusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreusuarioActionPerformed(evt);
            }
        });
        jPanel2.add(Nombreusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 550, 65));

        Registrarse.setBackground(new java.awt.Color(0, 255, 204));
        Registrarse.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Registrarse.setForeground(new java.awt.Color(65, 90, 119));
        Registrarse.setText(" Registrarse");
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseMouseClicked(evt);
            }
        });
        jPanel2.add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 680, 300, -1));

        sinotiene.setBackground(new java.awt.Color(0, 255, 204));
        sinotiene.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        sinotiene.setText("Si no tiene una cuenta,");
        sinotiene.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sinotieneMouseClicked(evt);
            }
        });
        jPanel2.add(sinotiene, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 680, 300, -1));

        icongrisnombre1.setBackground(new java.awt.Color(0, 0, 0));
        icongrisnombre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_azul_pequeño.png"))); // NOI18N
        jPanel2.add(icongrisnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, 340, 70));

        icongrisnombre2.setBackground(new java.awt.Color(0, 0, 0));
        icongrisnombre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_gris_claro.png"))); // NOI18N
        jPanel2.add(icongrisnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 600, -1));

        icongrisnombre3.setBackground(new java.awt.Color(0, 0, 0));
        icongrisnombre3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_gris_claro.png"))); // NOI18N
        jPanel2.add(icongrisnombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 600, -1));

        icongrisnombre4.setBackground(new java.awt.Color(0, 0, 0));
        icongrisnombre4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_gris_claro.png"))); // NOI18N
        jPanel2.add(icongrisnombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 600, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 880, 810));

        iconpricipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo_principal.png.png"))); // NOI18N
        jPanel3.add(iconpricipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresesucuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresesucuentaActionPerformed
        String usuario = Nombreusuario.getText();
        String identificacion = Identificacionusuario.getText();
        String contraseña = new String(Contraseñausuario.getPassword());

        if (validarLogin(usuario, identificacion, contraseña)) {
            registrarAcceso(usuario, identificacion);
            AdminInterface admin = new AdminInterface();
            admin.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ingresesucuentaActionPerformed

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

    private void sinotieneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sinotieneMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sinotieneMouseClicked

    private void IdentificacionusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdentificacionusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdentificacionusuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contraseñausuario;
    private javax.swing.JTextField Identificacionusuario;
    private javax.swing.JTextField Nombreusuario;
    private javax.swing.JLabel Registrarse;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel icongrisnombre1;
    private javax.swing.JLabel icongrisnombre2;
    private javax.swing.JLabel icongrisnombre3;
    private javax.swing.JLabel icongrisnombre4;
    private javax.swing.JLabel iconpricipal;
    private javax.swing.JLabel identificacion;
    private javax.swing.JLabel ingreseasucuenta;
    private javax.swing.JButton ingresesucuenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nombreusario;
    private javax.swing.JLabel sinotiene;
    // End of variables declaration//GEN-END:variables
}
