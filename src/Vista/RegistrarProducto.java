package Vista;

import Conector.Conexion2;
import Modelo.Producto;
import dao.productoDao;
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

public class RegistrarProducto extends javax.swing.JFrame {
    private List<Producto> listaProducto;
    private Producto prod;
    private productoDao dao;
    PreparedStatement ps;
    int cod;

    public RegistrarProducto() {
        initComponents();
        listaProducto = new ArrayList<>();
        dao = new productoDao();
        refrescarTabla();
    }
    public void iniciar(Producto p) {
        this.prod = p;
        txtNombre.setText(p.getNombre());
        txtStock.setText(String.valueOf(p.getStock()));
        txtMarca.setText(p.getMarca());
        txtPrecio.setText(String.valueOf(p.getPrecio()));
    }

    private void refrescarTabla() {
        DefaultTableModel tm = (DefaultTableModel) tblProducto.getModel();
        tm.setRowCount(0);
        listaProducto = dao.listarTodos();
        for (Producto p : listaProducto) {
            Object[] obj = {p.getID(), p.getNombre(), p.getStock(),p.getMarca(), p.getPrecio()};
            tm.addRow(obj);
        }
    }
    private void limpiarCampos() {
        txtNombre.setText("");
        txtStock.setText("");
        txtMarca.setText("");
        txtPrecio.setText("");
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
        lblStock = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Producto");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setText("Nombre");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblStock.setText("Stock");
        getContentPane().add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        lblMarca.setText("Marca");
        getContentPane().add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 113, -1));
        getContentPane().add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 113, -1));
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 113, -1));

        tblProducto.setAutoCreateRowSorter(true);
        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Producto", "Stock", "Marca", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 282, 170));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 91, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 91, -1));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 91, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 89, 20));

        lblPrecio.setText("Precio");
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 113, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Connection con;
        if (txtNombre.getText().length() == 0 || txtStock.getText().length() == 0 || txtMarca.getText().length() == 0 || txtPrecio.getText().length() == 0 ) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");
        } else {
            try {
                con = getConection();
                ps = con.prepareStatement("UPDATE producto SET producto_nombre= ?, producto_stock = ?, producto_marca= ? ,producto_precio=? WHERE producto_id = ?");
                ps.setString(1, txtNombre.getText());
                ps.setInt(2, Integer.parseInt(txtStock.getText()));
                ps.setString(3, txtMarca.getText());
                ps.setDouble(4, Double.parseDouble(txtPrecio.getText()));                
                ps.setInt(5, cod);
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

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ProductosDisponibles prod_dispo= new ProductosDisponibles();
        prod_dispo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Connection con;
        if (txtNombre.getText().length() == 0 || txtStock.getText().length() == 0 || txtMarca.getText().length() == 0 || txtPrecio.getText().length() == 0 ) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
        } else {
            try {
                con = getConection();
                ps = con.prepareStatement("INSERT INTO producto (producto_nombre,producto_stock,producto_marca,producto_precio) VALUES (?,?,?,?)");
                ps.setString(1, txtNombre.getText());
                ps.setInt(2, Integer.parseInt(txtStock.getText()));
                ps.setString(3, txtMarca.getText());
                ps.setDouble(4, Double.parseDouble(txtPrecio.getText()));  
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

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void tblProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductoMouseClicked
        ps = null;
        ResultSet rs;
        try{
            Conexion2 objCon2 = new Conexion2();
            Connection conn = objCon2.getConexion();

            int Fila = tblProducto.getSelectedRow();
            String codigo = tblProducto.getValueAt(Fila, 0).toString();
            ps = conn.prepareStatement("SELECT producto_nombre , producto_stock , producto_marca , producto_precio FROM producto WHERE producto_id=?");
            ps.setString(1, codigo);
            cod=Integer.parseInt(tblProducto.getValueAt(Fila, 0).toString());
            rs = ps.executeQuery();

            while (rs.next()) {
                txtNombre.setText(rs.getString("producto_nombre"));
                txtStock.setText(rs.getString("producto_stock"));
                txtMarca.setText(rs.getString("producto_marca"));
                txtPrecio.setText(rs.getString("producto_precio"));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_tblProductoMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ps = null;
        try {
            Conexion2 objCon = new Conexion2();
            Connection conn = objCon.getConexion();
            
            int Fila = tblProducto.getSelectedRow();
            String codigo=tblProducto.getValueAt(Fila, 0).toString();
            ps=conn.prepareStatement("DELETE FROM producto WHERE producto_id=?");
            ps.setInt(1, Integer.parseInt(codigo));
            ps.execute();
            refrescarTabla();
            limpiarCampos();
            int res = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Borrado exitoso");
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
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new RegistrarProducto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
