package view;

import controller.Listas;
import controller.userCreate;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.registro;

/**
 *
 * @author yonier
 */
public final class mostrarUser extends javax.swing.JPanel {

    private final main main;
    registro r = new registro();
    //private final userCreate dt;
    registro mensajero = new registro();
    DefaultTableModel model = new DefaultTableModel();
    TableRowSorter trs; // Clasificar las filas de una tabla

    public mostrarUser(main main) {
        this.main = main;
        //this.dt = dt;
        initComponents();
        mostrar();
    }

    private void filtro() {
        txtSearch.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtSearch.getText(), 1));
            }

        });
        trs = new TableRowSorter(model);
        tabla.setRowSorter(trs);
    }

    private void mostrar() {
        this.model.addColumn("Nombre Y apellido");
        this.model.addColumn("Direccion");
        this.model.addColumn("Telefono");
        this.model.addColumn("Email");
        this.model.addColumn("Cedula");
        this.model.addColumn("Ciudad");
        this.model.addColumn("Usuario");
        this.model.addColumn("Contraseña");
        tabla.setModel(model);
        Listas<userCreate> dato = mensajero.mostrar();
        if (dato != null) {
            Object[] filas = new Object[8];
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
                    model.addRow(filas);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al consultar los datos!!");
                e.printStackTrace();
                e.getLocalizedMessage();
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Mostrar = new LIB.FSButtonMD();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Mostrar.setText("Mostrar");
        btn_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MostrarActionPerformed(evt);
            }
        });
        add(btn_Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 70, 30));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });
        add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 220, -1));

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
        jScrollPane1.setViewportView(tabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 610, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MostrarActionPerformed
        // mostrar();
    }//GEN-LAST:event_btn_MostrarActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        filtro();
    }//GEN-LAST:event_txtSearchKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSButtonMD btn_Mostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
