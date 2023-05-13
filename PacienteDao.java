package hep.tramarefminsa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PacienteDao {
    //variables

    Connection cn;
//    PreparedStatement ps;
    ResultSet rs;
    Paciente linea;
    String sql;
    String nroexp;

//    PacienteDao pacdao;
//    CallableStatement cs;
    Statement stm;
//    String sp;

    public List<Paciente> readAll() throws Exception {
        List<Paciente> listar = new ArrayList<>();
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rpaciente";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            linea = null;
            while (rs.next()) {
                linea = new Paciente(rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getString(9), rs.getString(10),
                        rs.getString(11), rs.getString(12), rs.getString(13));
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

    public Paciente findReg() throws Exception {
        linea = null;
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rpaciente";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                linea = new Paciente(rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getString(9), rs.getString(10),
                        rs.getString(11), rs.getString(12), rs.getString(13));
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

    public String findNro() throws Exception {
        nroexp = null;
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from rpaciente";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                nroexp = rs.getString(1);
//                System.out.println("cogio Expediente: " + nroexp);
            }
            rs.close();
            stm.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return nroexp;
    }

}
