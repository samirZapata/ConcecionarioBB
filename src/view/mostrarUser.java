package view;

import controller.Listas;
import controller.userCreate;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import lib.TextPrompt;
import model.registro;
//import Utilidades.TextPrompt;

/**
 *
 * @author yonier
 */
public final class mostrarUser extends javax.swing.JPanel {

    private final main main;
    registro r = new registro();
    private final userCreate dt;
    registro mensajero = new registro();
    DefaultTableModel model = new DefaultTableModel();
    TableRowSorter trs; // Clasificar las filas de una tabla

    public mostrarUser(main main, userCreate dt) {
        this.main = main;
        this.dt = dt;
        initComponents();
        mostrar();
        TextPrompt filtrar = new TextPrompt("  Filtrar", txtSearch);
        TextPrompt buscar = new TextPrompt("  Buscar", txtBuscar);
    }

    private void filtro() {
        txtSearch.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?!)" + txtSearch.getText(), 1));
            }

        });
        trs = new TableRowSorter(model);
        tabla.setRowSorter(trs);
    }

    //Metodo para mostrar los usuarios a la tabla
    private void mostrar() {
        this.model.addColumn("Nombre Y apellido");
        this.model.addColumn("Direccion");
        this.model.addColumn("Telefono");
        this.model.addColumn("Email");
        this.model.addColumn("Cedula");
        this.model.addColumn("Ciudad");
        this.model.addColumn("Usuario");
        this.model.addColumn("Contraseña");
        this.model.addColumn("Rol");
        tabla.setModel(model);
        Listas<userCreate> dato = mensajero.mostrar();
        if (dato != null) {
            Object[] filas = new Object[9];
            try {
                for (int i = 0; i < dato.tamanio(); i++) {
                    filas[0] = (dato.obtener(i).getNombresYapellidos());
                    filas[1] = (dato.obtener(i).getDireccion());
                    filas[2] = (dato.obtener(i).getTelefono());
                    filas[3] = (dato.obtener(i).getEmail());
                    filas[4] = (dato.obtener(i).getCedula());
                    filas[5] = (dato.obtener(i).getCiudad());
                    filas[6] = (dato.obtener(i).getUser());
                    filas[7] = (dato.obtener(i).getPass());
                    filas[8] = (dato.obtener(i).getRol());
                    model.addRow(filas);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al consultar los datos!!");
                e.printStackTrace();
                e.getLocalizedMessage();
            }
        }

    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(86, 70, 117));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(65, 48, 100));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btn_modificar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tabla.setForeground(new java.awt.Color(51, 51, 51));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setInheritsPopupMenu(true);
        tabla.setSelectionBackground(new java.awt.Color(102, 255, 102));
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 760, 480));

        jPanel1.setBackground(new java.awt.Color(54, 38, 87));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Burnz Buttly");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/izquierda.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btn_modificar.setBackground(new java.awt.Color(86, 70, 117));
        btn_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarMouseClicked(evt);
            }
        });
        btn_modificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modificar");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_modificar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 190, 40));

        btn_eliminar.setBackground(new java.awt.Color(65, 48, 100));
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });
        btn_eliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Eliminar");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 190, 40));

        txtSearch.setBackground(new java.awt.Color(54, 38, 87));
        txtSearch.setForeground(new java.awt.Color(0, 0, 0));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 80, -1));

        txtBuscar.setBackground(new java.awt.Color(54, 38, 87));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 140, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        filtro();
    }//GEN-LAST:event_txtSearchKeyTyped

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        main.irmenu(this, dt);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btn_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseClicked
        setColor(btn_modificar);
        resetColor(btn_eliminar);
        main.irmodificarUser(jPanel1, dt);
    }//GEN-LAST:event_btn_modificarMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        setColor(btn_eliminar);
        resetColor(btn_modificar);
    }//GEN-LAST:event_btn_eliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_eliminar;
    private javax.swing.JPanel btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
