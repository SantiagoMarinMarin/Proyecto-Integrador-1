
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVotaciones = new javax.swing.JButton();
        btnCerrarVotaciones = new javax.swing.JButton();
        btnAbrirConfiguracion = new javax.swing.JButton();
        btnIniciarVotaciones = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1850, 845));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icon_resultados.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 670, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icon_iniciar_votaciones.png"))); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icon_de_configuracion.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo_Segundario.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 470, 370));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_cerrar_votaciones.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 670, -1, -1));

        btnVotaciones.setBackground(new java.awt.Color(65, 90, 119));
        btnVotaciones.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btnVotaciones.setText("Resultados");
        btnVotaciones.setBorder(null);
        btnVotaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnVotaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotacionesActionPerformed(evt);
            }
        });
        jPanel3.add(btnVotaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 660, 330, 90));

        btnCerrarVotaciones.setBackground(new java.awt.Color(65, 90, 119));
        btnCerrarVotaciones.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btnCerrarVotaciones.setText("Cerrar Votaciones");
        btnCerrarVotaciones.setBorder(null);
        btnCerrarVotaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnCerrarVotaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrarVotaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarVotacionesActionPerformed(evt);
            }
        });
        jPanel3.add(btnCerrarVotaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, 370, 90));

        btnAbrirConfiguracion.setBackground(new java.awt.Color(65, 90, 119));
        btnAbrirConfiguracion.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btnAbrirConfiguracion.setText("Configuración");
        btnAbrirConfiguracion.setBorder(null);
        btnAbrirConfiguracion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnAbrirConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirConfiguracionActionPerformed(evt);
            }
        });
        jPanel3.add(btnAbrirConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 400, 340, 90));

        btnIniciarVotaciones.setBackground(new java.awt.Color(58, 134, 255));
        btnIniciarVotaciones.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btnIniciarVotaciones.setText("Iniciar Votaciones");
        btnIniciarVotaciones.setBorder(null);
        btnIniciarVotaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
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
        jPanel3.add(btnIniciarVotaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 320, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_azul_oscuro_GRANDE_2.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 650, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_azul_claro_Gramde.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_azul_oscuro_GRANDE_2.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_azul_oscuro_GRANDE_2.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 650, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo_azul_tamaño_1540.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
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
        dispose();
    }//GEN-LAST:event_btnAbrirConfiguracionActionPerformed

    private void btnIniciarVotacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarVotacionesActionPerformed
     
    }//GEN-LAST:event_btnIniciarVotacionesActionPerformed
  
    private void btnIniciarVotacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarVotacionesMouseClicked
         if (iniciovotacion == null) { // Si no está creada, la creamos
            iniciovotacion = new InterfUsua();
        }
        iniciovotacion.setVisible(true); // La mostramos
        dispose();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
