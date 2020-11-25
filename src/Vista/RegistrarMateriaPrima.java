package Vista;

import Conector.Conexion2;
import Modelo.Materia_Prima;
import dao.matpriDao;
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

public class RegistrarMateriaPrima extends javax.swing.JFrame {

    private List<Materia_Prima> listaMateria;
    private Materia_Prima matpri;
    private matpriDao dao;
    PreparedStatement ps;
    int cod;

    public RegistrarMateriaPrima() {
        initComponents();
        listaMateria = new ArrayList<>();
        dao = new matpriDao();
        refrescarTabla();
    }

    public void iniciar(Materia_Prima p) {
        this.matpri = p;
        txtNombre.setText(p.getNombre());
        txtCosto.setText(String.valueOf(p.getPrecio()));
        txtCantidad.setText(String.valueOf(p.getCantidad()));
    }

    private void refrescarTabla() {
        DefaultTableModel tm = (DefaultTableModel) tblMateriaPrima.getModel();
        tm.setRowCount(0);
        listaMateria = dao.listarTodos();
        for (Materia_Prima p : listaMateria) {
            Object[] obj = {p.getID(), p.getNombre(), p.getPrecio(), p.getCantidad()};
            tm.addRow(obj);
        }
    }

    private void limpiarCampos() {
        txtCantidad.setText("");
        txtCosto.setText("");
        txtNombre.setText("");
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
        lblCosto = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMateriaPrima = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Materia Prima");
        setResizable(false);

        lblNombre.setText("Nombre");

        lblCosto.setText("Costo");

        lblCantidad.setText("Cantidad");

        tblMateriaPrima.setAutoCreateRowSorter(true);
        tblMateriaPrima.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Precio por Kg", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMateriaPrima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMateriaPrimaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMateriaPrima);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblCosto)
                            .addComponent(lblCantidad))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtCosto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCosto)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCantidad))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnEditar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegresar)
                            .addComponent(btnEliminar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        AlmacenMateriaPrima almacen = new AlmacenMateriaPrima();
        almacen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Connection con;
        if (txtNombre.getText().length() == 0 || txtCosto.getText().length() == 0 || txtCantidad.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
        } else {
            try {
                con = getConection();
                ps = con.prepareStatement("INSERT INTO materia_prima (matpri_nom,matpri_costo,matpri_cant) VALUES (?,?,?)");
                ps.setString(1, txtNombre.getText());
                ps.setDouble(2, Double.parseDouble(txtCosto.getText()));
                ps.setInt(3, Integer.parseInt(txtCantidad.getText()));
                int res = ps.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }
                con.close();
            } catch (HeadlessException | SQLException e) {
                System.err.println(e);
            }
            refrescarTabla();
            limpiarCampos();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Connection con;
        if (txtNombre.getText().length() == 0 || txtCosto.getText().length() == 0 || txtCantidad.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");
        } else {
            try {
                con = getConection();
                ps = con.prepareStatement("UPDATE materia_prima SET matpri_nom = ?, matpri_costo = ?, matpri_cant = ? WHERE matpri_id = ?");
                ps.setString(1, txtNombre.getText());
                ps.setDouble(2, Double.parseDouble(txtCosto.getText()));
                ps.setInt(3, Integer.parseInt(txtCantidad.getText()));
                ps.setInt(4, cod);
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

            int Fila = tblMateriaPrima.getSelectedRow();
            String codigo = tblMateriaPrima.getValueAt(Fila, 0).toString();
            ps = conn.prepareStatement("DELETE FROM materia_prima WHERE matpri_ID=?");
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

    private void tblMateriaPrimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMateriaPrimaMouseClicked
        ps = null;
        ResultSet rs;
        try {
            Conexion2 objCon2 = new Conexion2();
            Connection conn = objCon2.getConexion();

            int Fila = tblMateriaPrima.getSelectedRow();
            String codigo = tblMateriaPrima.getValueAt(Fila, 0).toString();
            ps = conn.prepareStatement("SELECT matpri_nom,matpri_costo,matpri_cant FROM materia_prima WHERE matpri_ID=?");
            ps.setString(1, codigo);
            cod = Integer.parseInt(tblMateriaPrima.getValueAt(Fila, 0).toString());
            rs = ps.executeQuery();

            while (rs.next()) {
                txtNombre.setText(rs.getString("matpri_nom"));
                txtCosto.setText(rs.getString("matpri_costo"));
                txtCantidad.setText(rs.getString("matpri_cant"));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_tblMateriaPrimaMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarMateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new RegistrarMateriaPrima().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblMateriaPrima;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
