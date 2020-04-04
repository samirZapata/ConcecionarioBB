package view;

import controller.Listas;
import controller.userCreate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yonier
 */
public class mostrarUser extends javax.swing.JPanel {

    public mostrarUser() {
        initComponents();
    }

    private void mostrar() {
        //Listas<userCreate> lista = new Listas<>();
        ArrayList<Object> lista = new ArrayList<>();
        DefaultTableModel modelo = new DefaultTableModel();

        lista.add("Nombres & Apellidos");
        lista.add("Direccion");
        lista.add("Telefono");
        lista.add("Email");
        lista.add("Cedula");
        lista.add("Ciudad");
        lista.add("Usuario");
        lista.add("Contraseña");
        lista.forEach((columna) -> {
            modelo.addColumn(columna);
        });
        tabla.setModel(modelo);
        
        Listas<userCreate[]> d = new Listas<>();
       Object[] inf= new Object[]{d.imprimir()};
       d.agregar((userCreate[]) inf);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

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
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
