package view;

import controller.userCreate;

/**
 *
 * @author yonier
 */
public class login extends javax.swing.JPanel {

    private main main;
    private userCreate dt;

    public login(main main, userCreate dt) {
        this.main = main;
        this.dt = dt;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        fSButtonMD1 = new LIB.FSButtonMD();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Umpush", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INICIAR SESION");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, 30));

        user.setBackground(new java.awt.Color(40, 51, 65));
        user.setForeground(new java.awt.Color(255, 255, 255));
        add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 210, -1));

        pass.setBackground(new java.awt.Color(40, 51, 65));
        pass.setForeground(new java.awt.Color(255, 255, 255));
        add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 210, -1));

        fSButtonMD1.setText("Ingresar");
        add(fSButtonMD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 90, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(27, 20, 100));
        jLabel3.setText("Registrarse");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        main.irRegistrarse(this, dt);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    main.irmenu(this, dt);

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSButtonMD fSButtonMD1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
