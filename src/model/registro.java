package model;

import controller.Listas;
import controller.userCreate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author yonier
 */
public class registro {

    private Listas<userCreate> lista;
    Conexion c = new Conexion();
    Statement sta;
    String sql;
    Connection cn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public boolean registrar(String nombresYapellidos, String direccion, String telefono, String email, String cedula, String ciudad, String user, String pass) {
        
        sql = "INSERT INTO Registrar(NombresyApellidos, direccion, telefono, email, Cedula, ciudad, usuario, contraseña)" + "VALUES(?,?,?,?,?,?,?,?)";

        try {
            cn = c.getConnection();
            ps = cn.prepareStatement(sql);
            ps.setString(1, nombresYapellidos);
            ps.setString(2, direccion);
            ps.setString(3, telefono);
            ps.setString(4, email);
            ps.setString(5, cedula);
            ps.setString(6, ciudad);
            ps.setString(7, user);
            ps.setString(8, pass);
            //lista.agregar(ps);
            boolean prueba = ps.execute();
            if (prueba == true) {
                JOptionPane.showMessageDialog(null, "Registro Completo!!");
            } else {

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Uppss, Datos Erroneos, intenta de nuevo!");
            System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
            return false;
        }
        return true;
    }

    public String validarUser(String user) {
        String resultado = null;
        sql = "SELECT usuario FROM Registrar WHERE usuario=?";
        try {
            cn = c.getConnection();
            ps = cn.prepareStatement(sql);
            ps.setString(7, user);
            rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    resultado = rs.getString(7);
                }
            }
            return resultado;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Uppss, Datos no encontrados!");
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
        return null;
    }
}
