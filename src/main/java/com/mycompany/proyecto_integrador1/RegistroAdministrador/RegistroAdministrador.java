
package com.mycompany.proyecto_integrador1.RegistroAdministrador;

import com.mycompany.proyecto_integrador1.LoginAdministrador.LoginAdministrador;
import com.mycompany.proyecto_integrador1.clases.ConexionBD;

import javax.swing.JOptionPane;

public class RegistroAdministrador extends javax.swing.JFrame {

    public RegistroAdministrador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Identificacionusuario = new javax.swing.JTextField();
        Nombreusuario = new javax.swing.JTextField();
        Contraseñausuario = new javax.swing.JPasswordField();
        Botonlogin = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        icongrisnombre2 = new javax.swing.JLabel();
        icongrisnombre3 = new javax.swing.JLabel();
        icongrisnombre4 = new javax.swing.JLabel();
        icongrisnombre1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 243, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(124, 131, 138));
        jLabel7.setText("Nombre de usuario");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 202, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(124, 131, 138));
        jLabel8.setText("Identificación");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 202, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(124, 131, 138));
        jLabel2.setText("Contraseña");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 202, -1));

        Identificacionusuario.setBackground(new java.awt.Color(222, 227, 231));
        Identificacionusuario.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        Identificacionusuario.setBorder(null);
        jPanel2.add(Identificacionusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 550, 65));

        Nombreusuario.setBackground(new java.awt.Color(222, 227, 231));
        Nombreusuario.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        Nombreusuario.setBorder(null);
        jPanel2.add(Nombreusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 550, 65));

        Contraseñausuario.setBackground(new java.awt.Color(222, 227, 231));
        Contraseñausuario.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        Contraseñausuario.setBorder(null);
        jPanel2.add(Contraseñausuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 550, 65));

        Botonlogin.setBackground(new java.awt.Color(65, 90, 119));
        Botonlogin.setFont(new java.awt.Font("Roboto", 0, 26)); // NOI18N
        Botonlogin.setForeground(new java.awt.Color(255, 255, 255));
        Botonlogin.setText("Registrarse");
        Botonlogin.setBorder(null);
        Botonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonloginActionPerformed(evt);
            }
        });
        jPanel2.add(Botonlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 710, 320, 50));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Registre su cuenta");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 880, 40));

        icongrisnombre2.setBackground(new java.awt.Color(0, 0, 0));
        icongrisnombre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_gris_claro.png"))); // NOI18N
        jPanel2.add(icongrisnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 610, -1));

        icongrisnombre3.setBackground(new java.awt.Color(0, 0, 0));
        icongrisnombre3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_gris_claro.png"))); // NOI18N
        jPanel2.add(icongrisnombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 610, -1));

        icongrisnombre4.setBackground(new java.awt.Color(0, 0, 0));
        icongrisnombre4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_gris_claro.png"))); // NOI18N
        jPanel2.add(icongrisnombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 610, -1));

        icongrisnombre1.setBackground(new java.awt.Color(0, 0, 0));
        icongrisnombre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_azul_pequeño.png"))); // NOI18N
        jPanel2.add(icongrisnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 700, 340, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_atras.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 810));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 30, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo_principal.png.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 295, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonloginActionPerformed
         // Capturar los datos ingresados por el usuario
    String usuario = Nombreusuario.getText();
    String identificacion = Identificacionusuario.getText();
    String contraseña = new String(Contraseñausuario.getPassword()); // Si usas JPasswordField

    // Llamar al método de registro
    boolean exito = ConexionBD.registrarAdmin(usuario, identificacion, contraseña);

    if (exito) {
        JOptionPane.showMessageDialog(null, "Administrador registrado con éxito.");
    } else {
        JOptionPane.showMessageDialog(null, "Error al registrar administrador.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BotonloginActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        LoginAdministrador login = new LoginAdministrador();
        login.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botonlogin;
    private javax.swing.JPasswordField Contraseñausuario;
    private javax.swing.JTextField Identificacionusuario;
    private javax.swing.JTextField Nombreusuario;
    private javax.swing.JLabel icongrisnombre1;
    private javax.swing.JLabel icongrisnombre2;
    private javax.swing.JLabel icongrisnombre3;
    private javax.swing.JLabel icongrisnombre4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
