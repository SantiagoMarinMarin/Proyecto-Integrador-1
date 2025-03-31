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

        LabelRegistrarcandidato = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        LabelCargo = new javax.swing.JLabel();
        LabelTarjetón = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cbCargo = new javax.swing.JComboBox<>();
        txtTarjeton = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelRegistrarcandidato.setText("Registrar Candidato");

        LabelNombre.setText("Nombre");

        LabelCargo.setText("Cargo:");

        LabelTarjetón.setText("Tarjetón:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personero", "Mediador", "Contralor", "Representante" }));
        cbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargoActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(LabelRegistrarcandidato))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LabelTarjetón)
                                    .addGap(34, 34, 34)
                                    .addComponent(txtTarjeton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(LabelNombre)
                                    .addGap(33, 33, 33)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelCargo)
                                .addGap(44, 44, 44)
                                .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LabelRegistrarcandidato)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCargo)
                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTarjeton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTarjetón))
                .addGap(37, 37, 37)
                .addComponent(btnRegistrar)
                .addContainerGap(109, Short.MAX_VALUE))
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
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTarjeton;
    // End of variables declaration//GEN-END:variables
}
