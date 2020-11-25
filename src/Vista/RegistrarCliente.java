package Vista;

import Conector.Conexion2;
import Modelo.Cliente;
import dao.clienteDao;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistrarCliente extends javax.swing.JFrame {

    private List<Cliente> listaCliente;
    private Cliente cli;
    private clienteDao dao;
    PreparedStatement ps;
    int cod;

    public RegistrarCliente() {
        initComponents();
        listaCliente = new ArrayList<>();
        dao = new clienteDao();
        refrescarTabla();
    }

    public void iniciar(Cliente p) {
        this.cli = p;
        txtNombre.setText(p.getNombre());
        txtDNI.setText(p.getDni());
        txtTelf.setText(p.getTelf());
        txtDir.setText(p.getDireccion());
        txtEmail.setText(p.getEmail());
    }

    private void refrescarTabla() {
        DefaultTableModel tm = (DefaultTableModel) tblCliente.getModel();
        tm.setRowCount(0);
        listaCliente = dao.listarTodos();
        for (Cliente p : listaCliente) {
            Object[] obj = {p.getId(), p.getNombre(), p.getDni(), p.getTelf(), p.getDireccion(), p.getEmail()};
            tm.addRow(obj);
        }
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtDNI.setText("");
        txtTelf.setText("");
        txtDir.setText("");
        txtEmail.setText("");
    }

    public static Connection getConection() {
        Connection con = null;
        String URL = "jdbc:mysql://localhost:3306/moason?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String USERNAME = "root";
        String PASSWORD = "Contingencia2532";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDNI = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        lblTelf = new javax.swing.JLabel();
        txtTelf = new javax.swing.JTextField();
        lblDir = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Cliente");
        setResizable(false);

        lblNombre.setText("Nombre");

        lblDNI.setText("DNI/RUC");

        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });

        lblTelf.setText("Teléfono");

        lblDir.setText("Dirección");

        lblEmail.setText("E-mail");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Nombre", "DNI/RUC", "Teléfono", "Dirección", "E-mail"
            }
        ));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblNombre)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail)
                                    .addComponent(lblDNI)
                                    .addComponent(lblTelf)
                                    .addComponent(lblDir))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEmail)
                                            .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(19, 19, 19)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 4, Short.MAX_VALUE))
                                                .addComponent(txtDNI))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRegistrar))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRegresar)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDNI)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelf)
                            .addComponent(txtTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDir)
                            .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar)
                            .addComponent(btnRegresar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Connection con;
        if (txtNombre.getText().length() == 0 || txtDNI.getText().length() == 0 || txtTelf.getText().length() == 0 || txtDir.getText().length() == 0 || txtEmail.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
        } else {
            try {
                con = getConection();
                ps = con.prepareStatement("INSERT INTO cliente(cliente_nombre , cliente_DNI , cliente_telf,cliente_direccion,cliente_email) VALUES (?,?,?,?,?)");
                ps.setString(1, txtNombre.getText());
                ps.setString(2, txtDNI.getText());
                ps.setString(3, txtTelf.getText());
                ps.setString(4, txtDir.getText());
                ps.setString(5, txtEmail.getText());
                int res = ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro exitoso");
                con.close();
            } catch (HeadlessException | SQLException e) {
                System.err.println(e);
            }
            refrescarTabla();
            limpiarCampos();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        ps = null;
        ResultSet rs;
        try {
            Conexion2 objCon2 = new Conexion2();
            Connection conn = objCon2.getConexion();

            int Fila = tblCliente.getSelectedRow();
            String codigo = tblCliente.getValueAt(Fila, 0).toString();
            ps = conn.prepareStatement("SELECT cliente_nombre,cliente_DNI,cliente_telf,cliente_direccion,cliente_email FROM cliente WHERE cliente_id=?");
            ps.setString(1, codigo);
            cod = Integer.parseInt(tblCliente.getValueAt(Fila, 0).toString());
            rs = ps.executeQuery();

            while (rs.next()) {
                txtNombre.setText(rs.getString("cliente_nombre"));
                txtDNI.setText(rs.getString("cliente_DNI"));
                txtTelf.setText(rs.getString("cliente_telf"));
                txtDir.setText(rs.getString("cliente_direccion"));
                txtEmail.setText(rs.getString("cliente_email"));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_tblClienteMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Connection con;
        if (txtNombre.getText().length() == 0 || txtDNI.getText().length() == 0 || txtTelf.getText().length() == 0 || txtDir.getText().length() == 0 || txtEmail.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");
        } else {
            try {
                con = getConection();
                ps = con.prepareStatement("UPDATE cliente SET cliente_nombre = ?, cliente_DNI = ?, cliente_telf = ?, cliente_direccion = ?, cliente_email = ? WHERE cliente_id = ?");
                ps.setString(1, txtNombre.getText());
                ps.setString(2, txtDNI.getText());
                ps.setString(3, txtTelf.getText());
                ps.setString(4, txtDir.getText());
                ps.setString(5, txtEmail.getText());
                ps.setInt(6, cod);
                int res = ps.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Edición exitosa");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al editar");
                }
                con.close();
            } catch (HeadlessException | SQLException e) {
                System.err.println(e);
            }
            refrescarTabla();
            limpiarCampos();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ps = null;
        try {
            Conexion2 objCon = new Conexion2();
            Connection conn = objCon.getConexion();

            int Fila = tblCliente.getSelectedRow();
            String codigo = tblCliente.getValueAt(Fila, 0).toString();
            ps = conn.prepareStatement("DELETE FROM cliente WHERE cliente_id=?");
            ps.setInt(1, Integer.parseInt(codigo));
            ps.execute();
            refrescarTabla();
            limpiarCampos();
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Borrado exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "Error al borrar");
            }
        } catch (NumberFormatException | SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new RegistrarCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblDir;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelf;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelf;
    // End of variables declaration//GEN-END:variables
}
