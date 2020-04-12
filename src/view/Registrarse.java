package view;

import controller.Listas;
import controller.userCreate;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lib.TextPrompt;
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
    
    public Registrarse(main main, userCreate dt) {
        this.main = main;
        this.dt = dt;
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setBackground(new Color(0, 0, 0, 0));
        //JPanel.setBackground(new Color(0,0,0,0));
        placeholders();
    }

    public void placeholders() {
        TextPrompt nombre = new TextPrompt(" Nombres & Apellidos", txtNombreYapellido);
        TextPrompt direccion = new TextPrompt(" Direccion", txtDireccion);
        TextPrompt telefono = new TextPrompt(" Telefono", txtTelefono);
        TextPrompt email = new TextPrompt(" Email", txtEmail);
        TextPrompt cedula = new TextPrompt(" Cedula", txtCedula);
        TextPrompt ciudad = new TextPrompt(" Ciudad", txtCiudad);
        TextPrompt user = new TextPrompt(" Usuario", txtUser);
        TextPrompt pass = new TextPrompt(" Contraseña", txtPass);
        TextPrompt rol = new TextPrompt(" Rol", txtRol);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelRound1 = new LIB.JPanelRound();
        txtRol = new javax.swing.JTextField();
        txtNombreYapellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrar = new keeptoo.KButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(21, 24, 68));

        jPanel1.setBackground(new java.awt.Color(21, 24, 68));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRound1.setBackground(new java.awt.Color(66, 7, 133));
        jPanelRound1.setColorPrimario(new java.awt.Color(66, 7, 133));
        jPanelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelRound1.add(txtRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 60, -1));
        jPanelRound1.add(txtNombreYapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, -1));
        jPanelRound1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 150, -1));
        jPanelRound1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 160, -1));
        jPanelRound1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 150, -1));
        jPanelRound1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, -1));
        jPanelRound1.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 150, -1));
        jPanelRound1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 160, -1));
        jPanelRound1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 150, -1));

        jLabel1.setBackground(new java.awt.Color(53, 197, 221));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(53, 197, 221));
        jLabel1.setText("Registrarse");
        jPanelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        btnRegistrar.setText("Aceptar");
        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrar.setkHoverForeGround(new java.awt.Color(102, 255, 51));
        btnRegistrar.setkHoverStartColor(new java.awt.Color(255, 0, 102));
        btnRegistrar.setkSelectedColor(new java.awt.Color(204, 0, 0));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanelRound1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 150, 40));

        jPanel1.add(jPanelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 390, 440));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/image (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        agregar();
        main.irmenu(this, dt);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public void agregar() {
        String nombreYapellido = txtNombreYapellido.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String email = txtEmail.getText();
        String cedula = txtCedula.getText();
        String ciudad = txtCiudad.getText();
        String user = txtUser.getText();
        String pass = txtPass.getText();
        String rol = txtRol.getText();
        if (nombreYapellido.equals("") || direccion.equals("") || telefono.equals("") || email.equals("") || cedula.equals("") || ciudad.equals("") || user.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor llena todos los campos!");
        }
        boolean persona = reg.registrar(nombreYapellido, direccion, telefono, email, cedula, ciudad, user, pass, rol);
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
            txtRol.setText(null);
            //main.irlogin(this);
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear la cuenta, estamos trabajando el ello...!");
        }
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private LIB.JPanelRound jPanelRound1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombreYapellido;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtRol;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
