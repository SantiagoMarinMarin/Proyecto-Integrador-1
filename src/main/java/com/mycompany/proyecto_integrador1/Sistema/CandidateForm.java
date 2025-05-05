package com.mycompany.proyecto_integrador1.Sistema;

import com.mycompany.proyecto_integrador1.clases.ConexionBD;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


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
        LabelRegistrarcandidato = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        LabelCargo = new javax.swing.JLabel();
        cbCargo = new javax.swing.JComboBox<>();
        LabelTarjetón = new javax.swing.JLabel();
        txtTarjeton = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelRegistrarcandidato.setText("Registrar Candidato");
        jPanel1.add(LabelRegistrarcandidato, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, -1, -1));

        LabelNombre.setText("Nombre");
        jPanel1.add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 71, -1));

        LabelCargo.setText("Cargo:");
        jPanel1.add(LabelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personero", "Mediador", "Contralor", "Representante" }));
        cbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargoActionPerformed(evt);
            }
        });
        jPanel1.add(cbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        LabelTarjetón.setText("Tarjetón:");
        jPanel1.add(LabelTarjetón, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
        jPanel1.add(txtTarjeton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 71, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1845, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarCandidato() {
        Connection conexion = ConexionBD.conectar();
        if (conexion == null) {
            JOptionPane.showMessageDialog(this, "❌ Error: No se pudo conectar a la base de datos.");
            return;
        }
        
        int tarjeton;
        try {
            tarjeton = Integer.parseInt(txtTarjeton.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "❌ Error: El Tarjetón debe ser un número.");
            return;
        }
        
        String sql = "INSERT INTO candidatos (nombre, id_cargo, id_tarjeton) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, txtNombre.getText());
            ps.setInt(2, cbCargo.getSelectedIndex() + 1);
            ps.setInt(3, tarjeton);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(this, "✅ Candidato registrado con éxito.");
                txtNombre.setText("");
                txtTarjeton.setText("");
                cbCargo.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(this, "⚠️ Error al registrar el candidato.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "❌ Error en la BD: " + e.getMessage());
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
                                  
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCargoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        String nombre = txtNombre.getText();
    String cargo = cbCargo.getSelectedItem().toString();  
    int tarjeton = Integer.parseInt(txtTarjeton.getText());

    ConexionBD.guardarCandidato(nombre, cargo, tarjeton);
    }//GEN-LAST:event_btnRegistrarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCargo;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelRegistrarcandidato;
    private javax.swing.JLabel LabelTarjetón;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTarjeton;
    // End of variables declaration//GEN-END:variables
}
