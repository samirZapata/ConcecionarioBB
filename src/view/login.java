package view;

/**
 *
 * @author yonier
 */
public class login extends javax.swing.JPanel {

    private main main;
    public login(main main) {
        this.main = main;
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INICIAR SESION");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        user.setBackground(new java.awt.Color(40, 51, 65));
        user.setForeground(new java.awt.Color(255, 255, 255));
        add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 210, -1));

        pass.setBackground(new java.awt.Color(40, 51, 65));
        pass.setForeground(new java.awt.Color(255, 255, 255));
        add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 470));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
