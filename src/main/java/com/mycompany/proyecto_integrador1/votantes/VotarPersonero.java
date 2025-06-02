/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_integrador1.votantes;

import com.mycompany.proyecto_integrador1.clases.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VotarPersonero extends javax.swing.JFrame {

    public VotarPersonero() {
        initComponents();     
        cargarCandidatos(); 
    }
    private void cargarCandidatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Número");
        modelo.addColumn("Nombre");
        modelo.addColumn("Partido");
        // Agrega más columnas si tienes

        jTable1.setModel(modelo); // Asegúrate de que este sea el nombre de tu JTable

    Connection conexion = ConexionBD.conectar();
    String sql = "SELECT * FROM personeria ORDER BY tarjeton ASC";

    try {
        PreparedStatement ps = conexion.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            int numero = rs.getInt("tarjeton");
            String nombre = rs.getString("nombre");
            String partido = rs.getString("cargo");
            // Agrega más datos si tienes más columnas

            modelo.addRow(new Object[]{numero, nombre, partido});
        }

        rs.close();
        ps.close();
        conexion.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "❌ Error al cargar candidatos: " + e.getMessage());
    }
}




    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1562, 850));
        jPanel1.setPreferredSize(new java.awt.Dimension(1540, 810));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/votantes/LogoPrincipal.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable1.setBackground(new java.awt.Color(230, 243, 255));
        jTable1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 1400, 180));

        jButton1.setBackground(new java.awt.Color(58, 134, 255));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 32)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Personero");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 250, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/votantes/Personero.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/votantes/Azul.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/votantes/Boton_azul_grande.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/votantes/Canditos.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/votantes/Registrar_voto.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 630, -1, -1));

        jTextField1.setBackground(new java.awt.Color(58, 134, 255));
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, 180, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/votantes/Voto.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
         String votoStr = jTextField1.getText().trim();

    if (votoStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor ingrese un número válido.");
        return;
    }

    int voto;
    try {
        voto = Integer.parseInt(votoStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El voto debe ser un número.");
        return;
    }

    // Obtener todos los tarjetones válidos desde la base de datos
    List<Integer> tarjetonesValidos = new ArrayList<>();
    String sql = "SELECT tarjeton FROM personeria";

    try (Connection conexion = ConexionBD.conectar();
         PreparedStatement pst = conexion.prepareStatement(sql);
         ResultSet rs = pst.executeQuery()) {

        while (rs.next()) {
            tarjetonesValidos.add(rs.getInt("tarjeton"));
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al obtener los tarjetones válidos: " + e.getMessage());
        return;
    }

    // Validar que el voto esté en la lista de tarjetones válidos
    if (!tarjetonesValidos.contains(voto)) {
        JOptionPane.showMessageDialog(this, "Por favor ingrese un número de tarjetón válido.");
        return;
    }

    // Insertar el voto si es válido
    String sqlInsert = "INSERT INTO votospersoneria (votado) VALUES (?)";

    try (Connection conexion = ConexionBD.conectar();
         PreparedStatement pstInsert = conexion.prepareStatement(sqlInsert)) {

        pstInsert.setInt(1, voto);
        pstInsert.executeUpdate();

        JOptionPane.showMessageDialog(this, "Voto registrado correctamente.");

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "❌ Error al registrar el voto: " + e.getMessage());
        return;
    }
        
        VotarContralor contralor = new VotarContralor();
        contralor.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
