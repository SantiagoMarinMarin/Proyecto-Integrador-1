
package com.mycompany.proyecto_integrador1.Sistema;
import javax.swing.JFrame;  // Importación necesaria para JFrame
import javax.swing.JOptionPane;


public class AdminInterface extends javax.swing.JFrame {

    public AdminInterface() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAbrirConfiguracion = new javax.swing.JButton();
        btnVotaciones = new javax.swing.JButton();
        btnIniciarVotaciones = new javax.swing.JButton();
        btnCerrarVotaciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAbrirConfiguracion.setText("Abrir Configuración");
        btnAbrirConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirConfiguracionActionPerformed(evt);
            }
        });

        btnVotaciones.setText("Votaciones");

        btnIniciarVotaciones.setText("Iniciar Votaciones");

        btnCerrarVotaciones.setText("Cerrar Votaciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrarVotaciones)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnIniciarVotaciones)
                            .addGap(46, 46, 46))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnVotaciones)
                            .addGap(126, 126, 126)
                            .addComponent(btnAbrirConfiguracion)
                            .addGap(20, 20, 20)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnIniciarVotaciones)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVotaciones)
                    .addComponent(btnAbrirConfiguracion))
                .addGap(46, 46, 46)
                .addComponent(btnCerrarVotaciones)
                .addContainerGap(121, Short.MAX_VALUE))
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

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirConfiguracion;
    private javax.swing.JButton btnCerrarVotaciones;
    private javax.swing.JButton btnIniciarVotaciones;
    private javax.swing.JButton btnVotaciones;
    // End of variables declaration//GEN-END:variables
}
