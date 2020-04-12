package view;

import controller.userCreate;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author yonier
 */
public class main extends javax.swing.JFrame {

    private SplashCreen principal;
    private Registrarse registro;
    private login login;
    private mostrarUser mostrar;
    private userCreate dt;
    private menu menu;
    private modificarUser mod;
    private Inventario inventario;

    public main() {
        setUndecorated(true);
        setName("Principal");
        setResizable(true);
        pack();
        setIconImage(getIconImage());
        setLocationRelativeTo(null);
        iniciar(dt);
    }

    private void iniciar(userCreate dt) {
        principal = new SplashCreen(this, dt);
        principal.setVisible(true);
        add(principal);
        pack();
        setLocationRelativeTo(null);
    }

    protected void irSplashCreen(JPanel jPanel, userCreate dt) {
        remove(jPanel);
        principal = new SplashCreen(this, dt);
        principal.setVisible(true);
        add(principal);
        pack();
        setLocationRelativeTo(null);
    }

    protected void redirectSplashCreen(JPanel jPanel, userCreate dt) {
        remove(jPanel);
        principal = new SplashCreen(this, dt);
        principal.setVisible(true);
        add(principal);
        pack();
        setLocationRelativeTo(null);
    }

    protected void irRegistrarse(JPanel jPanel, userCreate dt) {
        remove(jPanel);
        registro = new Registrarse(this, dt);
        registro.setVisible(true);
        add(registro);
        pack();
        setLocationRelativeTo(null);
        jPanel.setBackground(new Color(0, 0, 0, 0));
    }

    protected void irlogin(JPanel jPanel, userCreate dt) {
        remove(jPanel);
        login = new login(this, dt);
        login.setVisible(true);
        add(login);
        pack();
        setLocationRelativeTo(null);
    }

    protected void irmostrarUser(JPanel jPanel, userCreate dt) {
        remove(jPanel);
        mostrar = new mostrarUser(this, dt);
        mostrar.setVisible(true);
        add(mostrar);
        pack();
        setLocationRelativeTo(null);
    }

    protected void irmenu(JPanel jPanel, userCreate dt) {
        remove(jPanel);
        menu = new menu(this, dt);
        menu.setVisible(true);
        add(menu);
        pack();
        setLocationRelativeTo(null);
    }

    protected void irmodificarUser(JPanel jPanel, userCreate dt) {
        remove(jPanel);
        mod = new modificarUser(this, dt);
        mod.setVisible(true);
        add(mod);
        pack();
        setLocationRelativeTo(null);
    }
    protected void irInventario(JPanel jPanel, userCreate dt) {
        remove(jPanel);
        inventario = new Inventario(this, dt);
        inventario.setVisible(true);
        add(inventario);
        pack();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
