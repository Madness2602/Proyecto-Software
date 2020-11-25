package Vista;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet rs;

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

    public Registro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblContra = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        lblUsuario1 = new javax.swing.JLabel();
        pnlAdmin = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();

        setTitle("Registrarse");
        setPreferredSize(new java.awt.Dimension(260, 170));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        lblContra.setText("Contraseña");
        getContentPane().add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        getContentPane().add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 150, -1));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 150, -1));

        lblUsuario1.setText("Usuario");
        getContentPane().add(lblUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pnlAdmin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAdmin.setText("Para Admin presione aquí");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        pnlAdmin.add(btnAdmin);

        getContentPane().add(pnlAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Connection con;
        if (txtContra.getPassword().length == 0 || txtUsuario.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
        } else if (txtUsuario.getText().length() < 4) {
            JOptionPane.showMessageDialog(null, "El usuario debe tener como mínimo 4 letras");
        } else if (txtUsuario.getText().length() < 4) {
            JOptionPane.showMessageDialog(null, "El usuario debe tener como mínimo 4 letras");
        } else if (txtContra.getPassword().length < 4) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener como mínimo 4 letras");
        } else {
            try {
                con = getConection();
                ps = con.prepareStatement("INSERT INTO usuario (usuario_usuario,usuario_contra,usuario_privilegio) VALUES (?,?,?)");
                ps.setString(1, txtUsuario.getText());
                String valorPass = new String(txtContra.getPassword());
                ps.setString(2, valorPass);
                ps.setString(3, "usuario");
                int res = ps.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }
                con.close();
                Login login = new Login();
                login.setVisible(true);
                this.dispose();
            } catch (HeadlessException | SQLException e) {
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        RegistroAdmins registroAdmins = new RegistroAdmins();
        registroAdmins.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAdminActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Registro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JPanel pnlAdmin;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
