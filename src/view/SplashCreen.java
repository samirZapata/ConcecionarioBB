package view;

import com.sun.awt.AWTUtilities;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yonier
 */
public final class SplashCreen extends javax.swing.JPanel {
    
    private main main;
    private Thread hilo = null;
    
    public SplashCreen(main main) {
        this.main = main;
        initComponents();
        // hilo = new Thread(this);
        animacion();
    }
    
    public void animacion() {
        new java.util.Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                mensaje.setText("    ¡Iniciando!");
                principallogin();
            }
        }, 110000);
    }
    
    private void principallogin() {
        main.irlogin(this);
        //JOptionPane.showMessageDialog(null, "Bienvenido!!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cargar = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        labelMensaje = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ed (1).gif"))); // NOI18N
        cargar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cargarFocusGained(evt);
            }
        });
        add(cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 110, 120));

        mensaje.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        mensaje.setForeground(new java.awt.Color(153, 153, 153));
        mensaje.setText("Hay cosas que el dinero no puede comprar");
        add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 320, 20));

        labelMensaje.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        labelMensaje.setForeground(new java.awt.Color(153, 153, 153));
        labelMensaje.setText("Para todo lo demas, existe Burnz Buttly");
        add(labelMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 300, 20));

        jLabel2.setBackground(new java.awt.Color(24, 30, 90));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(58, 113, 224));
        jLabel2.setText("Burnz Buttly");
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/splashUno.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cargarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cargarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cargarFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JLabel mensaje;
    // End of variables declaration//GEN-END:variables

}
