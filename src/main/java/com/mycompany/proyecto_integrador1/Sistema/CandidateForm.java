package com.mycompany.proyecto_integrador1.Sistema;

import com.mycompany.proyecto_integrador1.clases.ConexionBD;


public class CandidateForm extends javax.swing.JFrame {

    public CandidateForm() {
        initComponents();        
       setTitle("Registrar Candidato");
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelNombre1 = new javax.swing.JLabel();
        LabelRegistrarcandidato1 = new javax.swing.JLabel();
        LabelRegistrarcandidato = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        LabelCargo = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        cbCargo = new javax.swing.JComboBox<>();
        LabelTarjetón = new javax.swing.JLabel();
        txtTarjeton = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelNombre1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelNombre1.setText("Apellido");
        jPanel1.add(LabelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 460, -1, -1));

        LabelRegistrarcandidato1.setFont(new java.awt.Font("Roboto", 1, 32)); // NOI18N
        LabelRegistrarcandidato1.setForeground(new java.awt.Color(255, 255, 255));
        LabelRegistrarcandidato1.setText("Registrar Candidato");
        jPanel1.add(LabelRegistrarcandidato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, -1, -1));

        LabelRegistrarcandidato.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        LabelRegistrarcandidato.setForeground(new java.awt.Color(255, 255, 255));
        LabelRegistrarcandidato.setText("Candidato:");
        jPanel1.add(LabelRegistrarcandidato, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        LabelNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelNombre.setText("Nombre");
        jPanel1.add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 460, 270, 50));

        LabelCargo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelCargo.setText("Cargo:");
        jPanel1.add(LabelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, -1, -1));

        txtNombre1.setBackground(new java.awt.Color(222, 227, 231));
        txtNombre1.setBorder(null);
        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 443, 340, 60));

        cbCargo.setBackground(new java.awt.Color(222, 227, 231));
        cbCargo.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personero", "Mediador", "Contralor", "Representante" }));
        cbCargo.setBorder(null);
        cbCargo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbCargo.setKeySelectionManager(null);
        cbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargoActionPerformed(evt);
            }
        });
        jPanel1.add(cbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 360, 65));

        LabelTarjetón.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelTarjetón.setText("Tarjetón:");
        jPanel1.add(LabelTarjetón, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 540, -1, -1));
        jPanel1.add(txtTarjeton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 542, 270, 50));

        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registra_votanates/sveazul.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 160));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registar_candidatos/Group 19.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, 170));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registar_candidatos/candidato_l.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registar_candidatos/registrar.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 700, -1, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registar_candidatos/candidato.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 295, -1, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCargoActionPerformed
 
    }//GEN-LAST:event_cbCargoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
    
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
String nombre1 = txtNombre1.getText().trim();
String nombre2 = txtNombre.getText().trim();

String nombreCompleto = nombre1 + " " + nombre2;  // Nombres separados con espacio
String cargo = cbCargo.getSelectedItem().toString();
int tarjeton = Integer.parseInt(txtTarjeton.getText());

ConexionBD.guardarEnTablaPorCargo(nombreCompleto, cargo, tarjeton);
    }//GEN-LAST:event_jLabel6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCargo;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelNombre1;
    private javax.swing.JLabel LabelRegistrarcandidato;
    private javax.swing.JLabel LabelRegistrarcandidato1;
    private javax.swing.JLabel LabelTarjetón;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtTarjeton;
    // End of variables declaration//GEN-END:variables
}
