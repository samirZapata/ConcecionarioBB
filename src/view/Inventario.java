package view;

import controller.userCreate;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.registro;

/**
 *
 * @author Karen Espitia
 */
public class Inventario extends javax.swing.JPanel {

    private main main;
    private userCreate dt;
    registro rg = new registro();

    public Inventario(main main, userCreate dt) {
        this.main = main;
        this.dt = dt;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRound1 = new LIB.JPanelRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtimagen = new javax.swing.JTextField();
        tipoc = new javax.swing.JComboBox<>();
        txtmarca = new javax.swing.JTextField();
        txtciudad = new javax.swing.JTextField();
        txtnomotor = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        txtplaca = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        btn_seleccionar = new keeptoo.KButton();
        kButton1 = new keeptoo.KButton();
        imagen = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(21, 24, 68));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRound1.setColorPrimario(new java.awt.Color(66, 7, 133));
        jPanelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Color");
        jPanelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 20));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Placa");
        jPanelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modelo");
        jPanelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NoMotor");
        jPanelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ciudad");
        jPanelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Marca");
        jPanelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo de carro");
        jPanelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 100, 20));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Imagen");
        jPanelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 20));

        txtimagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtimagenActionPerformed(evt);
            }
        });
        jPanelRound1.add(txtimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 150, 20));

        tipoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "deportivo", "clasico", "todoterreno", "pickup", "city car" }));
        jPanelRound1.add(tipoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 100, 30));

        txtmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarcaActionPerformed(evt);
            }
        });
        jPanelRound1.add(txtmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 150, 20));
        jPanelRound1.add(txtciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 150, 20));
        jPanelRound1.add(txtnomotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 150, 20));
        jPanelRound1.add(txtmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 150, 20));
        jPanelRound1.add(txtplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 150, 20));
        jPanelRound1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 150, 20));

        btn_seleccionar.setText("Seleccionar");
        btn_seleccionar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_seleccionar.setkAllowGradient(false);
        btn_seleccionar.setkBackGroundColor(new java.awt.Color(255, 79, 90));
        btn_seleccionar.setkHoverColor(new java.awt.Color(153, 255, 153));
        btn_seleccionar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_seleccionar.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btn_seleccionar.setkPressedColor(new java.awt.Color(102, 255, 102));
        btn_seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionarActionPerformed(evt);
            }
        });
        jPanelRound1.add(btn_seleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 90, 40));

        kButton1.setText("Registrar Automovil");
        kButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        kButton1.setkAllowGradient(false);
        kButton1.setkBackGroundColor(new java.awt.Color(255, 79, 90));
        kButton1.setkHoverColor(new java.awt.Color(153, 255, 153));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton1.setkSelectedColor(new java.awt.Color(255, 0, 0));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanelRound1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 170, 40));

        imagen.setForeground(new java.awt.Color(0, 0, 0));
        jPanelRound1.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 160, 170));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Registrar inventario");
        jPanelRound1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        add(jPanelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 470, 440));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/izquierda.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addCar.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void txtimagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtimagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtimagenActionPerformed

    private void txtmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarcaActionPerformed

    private void btn_seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionarActionPerformed
        //CLase JFileChooser
        //Filtro para buscar imagen
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de Archivos JPEG(*.JPG; *.JPEG)", "jpg", "jpeg");

        JFileChooser img = new JFileChooser();
        img.addChoosableFileFilter(filtro);
        img.setDialogTitle("Abrir Archivo");
        //Declaro para que se abra la ventana del buscador
        int ventana = img.showOpenDialog(null);
        //Condicional para ver si se seleccionó un archivo
        if (ventana == JFileChooser.APPROVE_OPTION) {
            File fl = img.getSelectedFile();
            //Mostrar la ruta del archivo
            txtimagen.setText(String.valueOf(fl));
            //Imprimir imagen  seleccionada en el label
            Image imag = getToolkit().getImage(txtimagen.getText());
            imag = imag.getScaledInstance(110, 110, Image.SCALE_DEFAULT);
            imagen.setIcon(new ImageIcon(imag));

        }


    }//GEN-LAST:event_btn_seleccionarActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        agregarinv();
        limpiar();
    }//GEN-LAST:event_kButton1ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        main.irmenu(this, dt);
    }//GEN-LAST:event_jLabel9MouseClicked

    public void agregarinv() {

        FileInputStream archivarfoto = null;
        String placa = txtplaca.getText();
        String modelo = txtmodelo.getText();
        String NoMotor = txtnomotor.getText();
        String ciudad = txtciudad.getText();
        String Marca = txtmarca.getText();
        String tipoca = tipoc.getSelectedItem().toString();
        String color = txtColor.getText();
        try {
            archivarfoto = new FileInputStream(txtimagen.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (placa.equals("") || modelo.equals("") || NoMotor.equals("") || ciudad.equals("") || Marca.equals("") || txtimagen.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor llena todos los campos!");
        }
        //rg.registrarInventario(placa, modelo, NoMotor, NoMotor, ciudad, Marca, tipoca, archivarfoto);
        boolean registro = rg.registrarInventario(placa, modelo, color, NoMotor, ciudad, Marca, tipoca, archivarfoto);
        if (registro != false) {
            JOptionPane.showMessageDialog(null, "Registro Exitoso!!");
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear el inventario, estamos trabajando el ello...!");

        }
    }

    public void limpiar() {
        txtplaca.setText("");
        txtmodelo.setText("");
        txtnomotor.setText("");
        txtciudad.setText("");
        txtmarca.setText("");
        txtimagen.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btn_seleccionar;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private LIB.JPanelRound jPanelRound1;
    private keeptoo.KButton kButton1;
    private javax.swing.JComboBox<String> tipoc;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtimagen;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtnomotor;
    private javax.swing.JTextField txtplaca;
    // End of variables declaration//GEN-END:variables
}