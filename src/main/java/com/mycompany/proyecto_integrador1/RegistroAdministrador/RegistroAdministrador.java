
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Identificacionusuario = new javax.swing.JTextField();
        Nombreusuario = new javax.swing.JTextField();
        Contraseñausuario = new javax.swing.JPasswordField();
        Botonlogin = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 243, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<--");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

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
        jPanel2.add(Identificacionusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 570, 65));

        Nombreusuario.setBackground(new java.awt.Color(222, 227, 231));
        Nombreusuario.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        Nombreusuario.setBorder(null);
        jPanel2.add(Nombreusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 570, 65));

        Contraseñausuario.setBackground(new java.awt.Color(222, 227, 231));
        Contraseñausuario.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        Contraseñausuario.setBorder(null);
        jPanel2.add(Contraseñausuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 570, 65));

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

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Registre su cuenta");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1090, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 850));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1835, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        LoginAdministrador login = new LoginAdministrador();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        LoginAdministrador login = new LoginAdministrador();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel3MouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botonlogin;
    private javax.swing.JPasswordField Contraseñausuario;
    private javax.swing.JTextField Identificacionusuario;
    private javax.swing.JTextField Nombreusuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
