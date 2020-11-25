package Vista;

public class Menu extends javax.swing.JFrame {
    public Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPedidos = new javax.swing.JButton();
        btnAlmacenMateriaPrima = new javax.swing.JButton();
        btnProductosDisponibles = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programa de Gestión de Compras y ventas de la Empresa Textil NyK's SAC");
        setFocusable(false);
        setResizable(false);

        btnPedidos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPedidos.setText("Pedidos");
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });

        btnAlmacenMateriaPrima.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAlmacenMateriaPrima.setText("Almacén Matería Prima");
        btnAlmacenMateriaPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenMateriaPrimaActionPerformed(evt);
            }
        });

        btnProductosDisponibles.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnProductosDisponibles.setText("Productos Disponibles");
        btnProductosDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosDisponiblesActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnRegistrarCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegistrarCliente.setText("Registrar Cliente");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlmacenMateriaPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProductosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarCliente)
                    .addComponent(btnPedidos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlmacenMateriaPrima)
                    .addComponent(btnProductosDisponibles))
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnProductosDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosDisponiblesActionPerformed
        ProductosDisponibles prod_dispo = new ProductosDisponibles();
        prod_dispo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProductosDisponiblesActionPerformed

    private void btnAlmacenMateriaPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenMateriaPrimaActionPerformed
        AlmacenMateriaPrima almacen = new AlmacenMateriaPrima();
        almacen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAlmacenMateriaPrimaActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        ConsultarPedidos consultarPedidos = new ConsultarPedidos();
        consultarPedidos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        RegistrarCliente registrarCliente = new RegistrarCliente();
        registrarCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlmacenMateriaPrima;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProductosDisponibles;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}
