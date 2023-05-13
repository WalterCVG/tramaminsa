package hep.tramarefminsa;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CitaDao {

    //variables
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    Cita linea;
    String sql;
//    Cita pac;
    CallableStatement cs;
    Statement stm;
    String sp;

    public List<Cita> readAll() throws Exception {
        List<Cita> listar = new ArrayList<>();
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rpaciente";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            linea = null;
            while (rs.next()) {
                linea = new Cita(rs.getString(32).trim(), rs.getString(33).trim(), rs.getString(34).trim(),
                        rs.getString(35).trim(), rs.getDouble(36), rs.getDouble(37),
                        rs.getDouble(38), Integer.parseInt(rs.getString(39)), Integer.parseInt(rs.getString(40)),
                        Integer.parseInt(rs.getString(41)), Integer.parseInt(rs.getString(42)), rs.getString(43).trim());
                listar.add(linea);
            }
            rs.close();
            stm.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return listar;
    }

    public Cita findReg() throws Exception {
        linea = null;
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rpaciente";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                linea = new Cita(rs.getString(32).trim(), rs.getString(33).trim(), rs.getString(34).trim(),
                        rs.getString(35).trim(), rs.getDouble(36), rs.getDouble(37),
                        rs.getDouble(38), Integer.parseInt(rs.getString(39)), Integer.parseInt(rs.getString(40)),
                        Integer.parseInt(rs.getString(41)), Integer.parseInt(rs.getString(42)), rs.getString(43).trim());

            }
            rs.close();
            stm.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return linea;
    }

}
