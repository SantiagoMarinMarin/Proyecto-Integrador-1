
package com.mycompany.proyecto_integrador1.Sistema;

import static com.mycompany.proyecto_integrador1.clases.ConexionBD.GuardarVotante;
import javax.swing.JOptionPane;

public class RegistrarVotantes extends javax.swing.JFrame {

    public RegistrarVotantes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Tprimernombre = new javax.swing.JTextField();
        Tprimerapellido = new javax.swing.JTextField();
        TIdentificacion = new javax.swing.JTextField();
        Tcrearcodigo = new javax.swing.JTextField();
        TSegundonombre = new javax.swing.JTextField();
        Tsegundoapellido = new javax.swing.JTextField();
        Tcurso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1540, 810));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton_atras.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 70));

        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registra_votanates/sveazul.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 160));

        Tprimernombre.setBackground(new java.awt.Color(222, 227, 231));
        Tprimernombre.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        Tprimernombre.setBorder(null);
        Tprimernombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TprimernombreActionPerformed(evt);
            }
        });
        jPanel1.add(Tprimernombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 340, 60));

        Tprimerapellido.setBackground(new java.awt.Color(222, 227, 231));
        Tprimerapellido.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        Tprimerapellido.setBorder(null);
        Tprimerapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TprimerapellidoActionPerformed(evt);
            }
        });
        jPanel1.add(Tprimerapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 340, 60));

        TIdentificacion.setBackground(new java.awt.Color(222, 227, 231));
        TIdentificacion.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        TIdentificacion.setBorder(null);
        TIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIdentificacionActionPerformed(evt);
            }
        });
        jPanel1.add(TIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 340, 60));

        Tcrearcodigo.setBackground(new java.awt.Color(222, 227, 231));
        Tcrearcodigo.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        Tcrearcodigo.setBorder(null);
        Tcrearcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TcrearcodigoActionPerformed(evt);
            }
        });
        jPanel1.add(Tcrearcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 340, 60));

        TSegundonombre.setBackground(new java.awt.Color(222, 227, 231));
        TSegundonombre.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        TSegundonombre.setBorder(null);
        TSegundonombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TSegundonombreActionPerformed(evt);
            }
        });
        jPanel1.add(TSegundonombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 290, 340, 60));

        Tsegundoapellido.setBackground(new java.awt.Color(222, 227, 231));
        Tsegundoapellido.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        Tsegundoapellido.setBorder(null);
        Tsegundoapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TsegundoapellidoActionPerformed(evt);
            }
        });
        jPanel1.add(Tsegundoapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 380, 340, 60));

        Tcurso.setBackground(new java.awt.Color(222, 227, 231));
        Tcurso.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        Tcurso.setBorder(null);
        jPanel1.add(Tcurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 468, 340, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registra_votanates/segundos.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registra_votanates/primeros.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registra_votanates/registrar.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registra_votanates/Guardar_cambiosfghbjnkml,.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 710, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TprimernombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TprimernombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TprimernombreActionPerformed

    private void TcrearcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TcrearcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TcrearcodigoActionPerformed

    private void TsegundoapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TsegundoapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TsegundoapellidoActionPerformed

    private void TIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIdentificacionActionPerformed

    private void TSegundonombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TSegundonombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TSegundonombreActionPerformed

    private void TprimerapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TprimerapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TprimerapellidoActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        ConfigPanel atrasPanel= new ConfigPanel();
        atrasPanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       String nombre1 = Tprimernombre.getText();
    String nombre2 = TSegundonombre.getText();
    String apellido1 = Tprimerapellido.getText();
    String apellido2 = Tsegundoapellido.getText();
    int identificacion = Integer.parseInt(TIdentificacion.getText());
    String curso = Tcurso.getText();
    String codigo = Tcrearcodigo.getText();

    boolean exito = GuardarVotante(nombre1, nombre2, apellido1, apellido2, identificacion, curso, codigo);

    if (exito) {
        JOptionPane.showMessageDialog(this, "Estudiante registrado exitosamente.");
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo registrar el estudiante.");
    }
    }//GEN-LAST:event_jLabel14MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TIdentificacion;
    private javax.swing.JTextField TSegundonombre;
    private javax.swing.JTextField Tcrearcodigo;
    private javax.swing.JTextField Tcurso;
    private javax.swing.JTextField Tprimerapellido;
    private javax.swing.JTextField Tprimernombre;
    private javax.swing.JTextField Tsegundoapellido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
