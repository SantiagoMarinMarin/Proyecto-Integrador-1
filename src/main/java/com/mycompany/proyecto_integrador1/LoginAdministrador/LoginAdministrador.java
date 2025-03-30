
package com.mycompany.proyecto_integrador1.LoginAdministrador;

import com.mycompany.proyecto_integrador1.RegistroAdministrador.RegistroAdministrador;
import com.mycompany.proyecto_integrador1.Sistema.AdminInterface;
import static com.mycompany.proyecto_integrador1.clases.ConexionBD.registrarAcceso;
import static com.mycompany.proyecto_integrador1.clases.ConexionBD.validarLogin;
import javax.swing.JOptionPane;

public class LoginAdministrador extends javax.swing.JFrame {

    public LoginAdministrador() {
        initComponents();
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botonlogin = new javax.swing.JButton();
        Nombreusuario = new javax.swing.JTextField();
        Identificacionusuario = new javax.swing.JTextField();
        Contraseñausuario = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Botonlogin.setText("Login ");
        Botonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonloginActionPerformed(evt);
            }
        });

        jLabel1.setText("Contraseña:");

        jLabel2.setText("Nombre de usuario:");

        jLabel3.setText("Identificación:");

        jLabel4.setText("Bienvenido al SVE.");

        jLabel5.setText("Registrarse.");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Nombreusuario)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Identificacionusuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Contraseñausuario, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botonlogin))
                .addGap(0, 86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Nombreusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(19, 19, 19)
                .addComponent(Identificacionusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Contraseñausuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addComponent(Botonlogin)
                .addGap(42, 42, 42))
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

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        RegistroAdministrador registroVentana = new RegistroAdministrador(); // Llama a la ventana de registro
        registroVentana.setVisible(true); // Muestra la ventana de registro
        dispose(); // Cierra la ventana de Login
    }//GEN-LAST:event_jLabel5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botonlogin;
    private javax.swing.JPasswordField Contraseñausuario;
    private javax.swing.JTextField Identificacionusuario;
    private javax.swing.JTextField Nombreusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
