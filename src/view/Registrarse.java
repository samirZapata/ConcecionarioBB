package view;

import controller.Listas;
import controller.userCreate;
import javax.swing.JOptionPane;
import model.registro;

/**
 *
 * @author yonier
 */
public class Registrarse extends javax.swing.JPanel {

    private main main;
    private userCreate dt;
    registro reg = new registro();
    Listas l = new Listas();

    public Registrarse(main main) {
        this.main = main;
       // this.dt = dt;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombreYapellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtNombreYapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 180, -1));
        add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 180, -1));
        add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 180, -1));
        add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 180, -1));
        add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 170, -1));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 170, -1));
        add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 170, -1));
        add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 170, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        btnRegistrar.setFont(new java.awt.Font("Garuda", 0, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrarse");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 100, 20));

        jButton1.setText("mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registro.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 770, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        agregar();
        //l.imprimir(mos);
       // main.irmostrarUser(this);
       main.irmenu(this);
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        main.irmostrarUser(this);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void agregar() {
        String nombreYapellido = txtNombreYapellido.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String email = txtEmail.getText();
        String cedula = txtCedula.getText();
        String ciudad = txtCiudad.getText();
        String user = txtUser.getText();
        String pass = txtPass.getText();
        
        if (nombreYapellido.equals("") || direccion.equals("") || telefono.equals("") || email.equals("") || cedula.equals("") || ciudad.equals("") || user.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor llena todos los campos!");
        }
        boolean persona = reg.registrar(nombreYapellido, direccion, telefono, email, cedula, ciudad, user, pass);
        //Listas<userCreate> mos = reg.mostrar(nombreYapellido, direccion, telefono, email, cedula, ciudad, user, pass);
        // mos.imprimir();
        if (persona != false) {
            JOptionPane.showMessageDialog(null, "Registro Exitoso!!");
            txtNombreYapellido.setText(null);
            txtDireccion.setText(null);
            txtTelefono.setText(null);
            txtEmail.setText(null);
            txtCedula.setText(null);
            txtCiudad.setText(null);
            txtUser.setText(null);
            txtPass.setText(null);
            main.irlogin(this);
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear la cuenta, estamos trabajando el ello...!");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombreYapellido;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
