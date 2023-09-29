package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class consultas extends conexion{

    public boolean registrar(producto pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "        String sql = \"UPDATE producto SET codigo=?, nombre=?, precio=?, cantidad=? WHERE id=? \";\n producto(id, nombre, apellido, fecha, sueldo, sexo, edad, comentarios)VALUES()?,?,?,?,?,?,?,?";
        try {
            ps.setInt(1, pro.getId());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getApellido());
            ps.setString(4, pro.getFecha());
            ps.setDouble(5, pro.getSueldo());
            ps.setString(6, pro.getSexo());
            ps.setInt(7, pro.getEdad());
            ps.setString(8, pro.getComentarios());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean modificar(producto pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE producto SET codigo=?, nombre=?, precio=?, cantidad=? WHERE id=? ";

        try {
            ps.setInt(1, pro.getId());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getApellido());
            ps.setString(4, pro.getFecha());
            ps.setDouble(5, pro.getSueldo());
            ps.setString(6, pro.getSexo());
            ps.setInt(7, pro.getEdad());
            ps.setString(8, pro.getComentarios());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    public boolean eliminar(producto pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM producto WHERE id=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }



}//llave final



