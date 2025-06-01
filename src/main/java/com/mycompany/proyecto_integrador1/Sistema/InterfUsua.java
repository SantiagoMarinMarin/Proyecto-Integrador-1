/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_integrador1.Sistema;

import static com.mycompany.proyecto_integrador1.clases.ConexionBD.validarLoginParaEstudiantes;
import com.mycompany.proyecto_integrador1.votantes.VotarPersonero;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class InterfUsua extends javax.swing.JFrame {

    /**
     * Creates new form fInterfUsua
     */
    public InterfUsua() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        codigo = new javax.swing.JPasswordField();
        identificacion = new javax.swing.JTextField();
        icongrisnombre4 = new javax.swing.JLabel();
        icongrisnombre5 = new javax.swing.JLabel();
        icongrisnombre1 = new javax.swing.JLabel();
        iconpricipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 243, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1540, 810));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingrese a su cuenta");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 880, 40));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 202, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(124, 131, 138));
        jLabel6.setText("Ingrese ID");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 202, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(124, 131, 138));
        jLabel7.setText("Ingrese el código");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 202, -1));

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

        jButton1.setBackground(new java.awt.Color(65, 90, 119));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingrese para votar");
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 640, 320, 40));

        codigo.setBackground(new java.awt.Color(222, 227, 231));
        codigo.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        codigo.setBorder(null);
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        jPanel2.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 560, 65));

        identificacion.setBackground(new java.awt.Color(222, 227, 231));
        identificacion.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        identificacion.setBorder(null);
        jPanel2.add(identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 560, 65));

        icongrisnombre4.setBackground(new java.awt.Color(0, 0, 0));
        icongrisnombre4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_gris_claro.png"))); // NOI18N
        jPanel2.add(icongrisnombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 600, -1));

        icongrisnombre5.setBackground(new java.awt.Color(0, 0, 0));
        icongrisnombre5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_gris_claro.png"))); // NOI18N
        jPanel2.add(icongrisnombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 600, -1));

        icongrisnombre1.setBackground(new java.awt.Color(0, 0, 0));
        icongrisnombre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_azul_pequeño.png"))); // NOI18N
        icongrisnombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icongrisnombre1MouseClicked(evt);
            }
        });
        jPanel2.add(icongrisnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, 340, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 880, 810));

        iconpricipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo_principal.png.png"))); // NOI18N
        jPanel1.add(iconpricipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Identificacion = identificacion.getText();
        String Codigo = new String(codigo.getPassword());
        
        if (validarLoginParaEstudiantes(Identificacion, Codigo)) {
            System.out.println("Login correcto, abriendo interfaz de votación...");
            VotarPersonero votar = new VotarPersonero();
            votar.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
             JOptionPane.showMessageDialog(null, "Datos incorrectos.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String Identificacion = identificacion.getText();
        String Codigo = new String(codigo.getPassword());
        
        if (validarLoginParaEstudiantes(Identificacion, Codigo)) {
            System.out.println("Login correcto, abriendo interfaz de votación...");
            VotarPersonero votar = new VotarPersonero();
            votar.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
             JOptionPane.showMessageDialog(null, "Datos incorrectos.");
        }
        
       
    }//GEN-LAST:event_jButton1MouseClicked

    private void icongrisnombre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icongrisnombre1MouseClicked
        String Identificacion = identificacion.getText();
        String Codigo = new String(codigo.getPassword());
        
        if (validarLoginParaEstudiantes(Identificacion, Codigo)) {
            System.out.println("Login correcto, abriendo interfaz de votación...");
            VotarPersonero votar = new VotarPersonero();
            votar.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
             JOptionPane.showMessageDialog(null, "Datos incorrectos.");
        }
        
    }//GEN-LAST:event_icongrisnombre1MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField codigo;
    private javax.swing.JLabel icongrisnombre1;
    private javax.swing.JLabel icongrisnombre4;
    private javax.swing.JLabel icongrisnombre5;
    private javax.swing.JLabel iconpricipal;
    private javax.swing.JTextField identificacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
