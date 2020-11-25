package Vista;

public class Comprobante extends javax.swing.JFrame {

    public Comprobante() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComprobante = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comprobante");
        setResizable(false);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtComprobante.setEditable(false);
        txtComprobante.setColumns(20);
        txtComprobante.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        txtComprobante.setRows(5);
        txtComprobante.setText("Empresa Textil NyK's SAC\n\t \nBoleta de Venta Electrónica\nBOLETA-N°001\n-------------------------------------------------------\nItem                       Cant         P.Unit         Tot S/\n-------------------------------------------------------\nGuantes Pablito         1            20.00           20.00\nPantalón Dolge Gab.   2            75.30           150.60\n                                                              170.60\n-------------------------------------------------------\nOp. Gravada\t                         139.89\nIGV (18%)\t                         30.71\nImporte Total\t       170.60\n-------------------------------------------------------\nEfectivo S/200.00 Vuelto: S/29.40\n\nFecha 24/11/20\n-------------------------------------------------------\n-------------------------------------------------------\n¡Regrese Pronto sr(a). Raul Mendiola!");
        jScrollPane1.setViewportView(txtComprobante);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnRegresar)
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comprobante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Comprobante().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtComprobante;
    // End of variables declaration//GEN-END:variables
}
