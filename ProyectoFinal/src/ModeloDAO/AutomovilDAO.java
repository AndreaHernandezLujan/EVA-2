package ModeloDAO;

import GestorBD.Conexion;
import Modelo.Automovil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andyl
 */
public class AutomovilDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List listarAutomovil() {
        List<Automovil> automoviles = new ArrayList();
        String sql = "select * from automovil";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Automovil a = new Automovil();
                a.setId(rs.getInt(1));
                a.setModelo(rs.getString(2));
                a.setMarca(rs.getString(3));
                a.setMotor(rs.getString(4));
                a.setColor(rs.getString(5));
                a.setPatente(rs.getString(6));
                a.setCantPuertas(rs.getInt(7));
                automoviles.add(a);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return automoviles;
    }

    public int guardarAutomovil(Automovil auto) {
        int i = 0;
        String sql = "insert into automovil(modelo,marca,motor,color,patente,cantpuertas) values(?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, auto.getModelo());
            ps.setString(2, auto.getMarca());
            ps.setString(3, auto.getMotor());
            ps.setString(4, auto.getColor());
            ps.setString(5, auto.getPatente());
            ps.setInt(6, auto.getCantPuertas());

            i = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return i;
    }

    public int modificarAutomovil(Automovil auto) {
        int i = 0; //estoy agregarndo un entero para verificar si el se puedo modificar el registro
        String sql = "update automovil set modelo=?, marca=?, motor=?, color=?, patente=?, cantpuertas=? WHERE idAuto=?";

        try {

            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, auto.getModelo());
            ps.setString(2, auto.getMarca());
            ps.setString(3, auto.getMotor());
            ps.setString(4, auto.getColor());
            ps.setString(5, auto.getPatente());
            ps.setInt(6, auto.getCantPuertas());
            ps.setInt(7, auto.getId());
            i = ps.executeUpdate();    //Cuando ejecutas el executeUpdate y todo esta ok devuelve un valor entero de 1 y si no lo ejecuta devuelve 0
            // de igual manera puedes usar sin capturar su valor de retorno me refiero al execute Query solo que aqui lo modifique para que en la interfaz pueda manipularlo para crear un mensaje de confirmacion
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return i;
    }
 //Acceso valorRetorno nomMetodo(parametros){}
    public Automovil buscarAutomovil(int id) {
        Automovil a = null;// lo inicializo en null
        String sql = "SELECT * FROM automovil WHERE idAuto=" + id;//ejecuto todo el codigo

        try {

            con = cn.getConnection();// Devuelve la conexion    
            ps = con.prepareStatement(sql);//es para preparar la sentencia sql para que sea ejecutada
            rs = ps.executeQuery(); //y esta linea lo ejecuta como su nombre lo dice Execute (ejecutar) y al ejecutar va devolver un valor y ese valor se guarda en el RS 
            
            if (rs.next()) {
                //si lo encontro empieza a setear los valores del automovil
                a = new Automovil();
                a.setId(rs.getInt(1));
                a.setModelo(rs.getString(2));
                a.setMarca(rs.getString(3));
                a.setMotor(rs.getString(4));
                a.setColor(rs.getString(5));
                a.setPatente(rs.getString(6));
                a.setCantPuertas(rs.getInt(7));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        // si lo encontro hace lo que esta dentro del if y si no lo encontro simplemente queda con valor nulo
        return a;

    }

    public void eliminarAutomovil(int id) {
        String sql = "DELETE FROM automovil WHERE idAuto=" + id;

        try {

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



