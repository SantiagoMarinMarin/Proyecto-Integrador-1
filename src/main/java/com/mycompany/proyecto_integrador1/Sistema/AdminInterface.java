
package com.mycompany.proyecto_integrador1.Sistema;
import javax.swing.JFrame;  // Importación necesaria para JFrame




public class AdminInterface extends javax.swing.JFrame {
    private InterfUsua iniciovotacion;

    public AdminInterface() {
        initComponents();
  
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnVotaciones = new javax.swing.JButton();
        btnCerrarVotaciones = new javax.swing.JButton();
        btnAbrirConfiguracion = new javax.swing.JButton();
        btnIniciarVotaciones = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1850, 845));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVotaciones.setBackground(new java.awt.Color(65, 90, 119));
        btnVotaciones.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btnVotaciones.setText("Resultados");
        btnVotaciones.setBorder(null);
        btnVotaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotacionesActionPerformed(evt);
            }
        });
        jPanel3.add(btnVotaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 640, 370, 90));

        btnCerrarVotaciones.setBackground(new java.awt.Color(65, 90, 119));
        btnCerrarVotaciones.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btnCerrarVotaciones.setText("Cerrar Votaciones");
        btnCerrarVotaciones.setBorder(null);
        btnCerrarVotaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrarVotaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarVotacionesActionPerformed(evt);
            }
        });
        jPanel3.add(btnCerrarVotaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 640, 370, 90));

        btnAbrirConfiguracion.setBackground(new java.awt.Color(65, 90, 119));
        btnAbrirConfiguracion.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btnAbrirConfiguracion.setText("Configuración");
        btnAbrirConfiguracion.setBorder(null);
        btnAbrirConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirConfiguracionActionPerformed(evt);
            }
        });
        jPanel3.add(btnAbrirConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 430, 370, 90));

        btnIniciarVotaciones.setBackground(new java.awt.Color(58, 134, 255));
        btnIniciarVotaciones.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btnIniciarVotaciones.setText("Iniciar Votaciones");
        btnIniciarVotaciones.setBorder(null);
        btnIniciarVotaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarVotacionesMouseClicked(evt);
            }
        });
        btnIniciarVotaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarVotacionesActionPerformed(evt);
            }
        });
        jPanel3.add(btnIniciarVotaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 370, 90));

        jPanel2.setBackground(new java.awt.Color(230, 243, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1850, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1850, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(619, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirConfiguracionActionPerformed
        JFrame frame = new JFrame("Configuración");
        frame.setContentPane(new ConfigPanel());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_btnAbrirConfiguracionActionPerformed

    private void btnIniciarVotacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarVotacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarVotacionesActionPerformed
  
    private void btnIniciarVotacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarVotacionesMouseClicked
         if (iniciovotacion == null) { // Si no está creada, la creamos
            iniciovotacion = new InterfUsua();
        }
        iniciovotacion.setVisible(true); // La mostramos
    }//GEN-LAST:event_btnIniciarVotacionesMouseClicked

    private void btnCerrarVotacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarVotacionesActionPerformed
        // TODO add your handling code here:
        if (iniciovotacion != null) { // Solo cerramos si existe una ventana abierta
            iniciovotacion.dispose(); // Cierra la ventana
            iniciovotacion = null; // Limpiamos la referencia
        }
    }//GEN-LAST:event_btnCerrarVotacionesActionPerformed

    private void btnVotacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVotacionesActionPerformed

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirConfiguracion;
    private javax.swing.JButton btnCerrarVotaciones;
    private javax.swing.JButton btnIniciarVotaciones;
    private javax.swing.JButton btnVotaciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
