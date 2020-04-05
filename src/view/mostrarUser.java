package view;

import controller.Listas;
import controller.logicaMostrar;
import controller.userCreate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.registro;

/**
 *
 * @author yonier
 */
public class mostrarUser extends javax.swing.JPanel {

    logicaMostrar m = new logicaMostrar();
    registro r = new registro();

    public mostrarUser() {
        initComponents();

    }

    public void mostrar(String nombresYapellidos) {
        Listas<userCreate> lista = r.mostrar(nombresYapellidos);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombres & Apellidos");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Email");
        modelo.addColumn("Cedula");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        tabla.setModel(modelo);
        if (lista != null) {
            try {
                for (int i = 0; i < lista.tamanio(); i++) {
                    
                }
            } catch (Exception e) {
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jTextFieldRound1 = new jtextfieldround.JTextFieldRound();
        btn_Mostrar = new LIB.FSButtonMD();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 235, 813, 198));
        add(jTextFieldRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        btn_Mostrar.setText("Mostrar");
        add(btn_Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 70, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSButtonMD btn_Mostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private jtextfieldround.JTextFieldRound jTextFieldRound1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
