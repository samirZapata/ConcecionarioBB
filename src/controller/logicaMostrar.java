package controller;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yonier
 */
public class logicaMostrar {
      DefaultTableModel modelo = new DefaultTableModel();
    public void mostrar() {
        //Listas<userCreate> lista = new Listas<>();
    
      
        Listas<userCreate[]> d = new Listas<>();
       Object[] inf= new Object[]{d.imprimir()};
       d.agregar((userCreate[]) inf);
        for (int i = 0; i < 10; i++) {
            
        }
    }
}
