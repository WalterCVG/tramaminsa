package hep.tramarefminsa;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReferHepDao {
    //variables

    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    ReferHep linea;
    String sql;
//    Cita pac;
    CallableStatement cs;
    Statement stm;
    String sp;
    String nroexp;

    public List<ReferHep> readAll() throws Exception {
        List<ReferHep> listar = new ArrayList<>();
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from Ref_nroExped";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            linea = null;
            while (rs.next()) {
                linea = new ReferHep(rs.getString(1), rs.getString(2), rs.getString(3));
                listar.add(linea);

                //toma valor expediente
                nroexp = rs.getString(2);
                System.out.println("Expediente: " + nroexp);
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

    public ReferHep findReg() throws Exception {
        linea = null;
        try {
            cn = AccesoDb.getConnection();
            sql = "select * from Ref_nroExped";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                linea = new ReferHep(rs.getString(1), rs.getString(2), rs.getString(3));
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

    public void UpdNroref(String idref, String nroref, String nroexp) throws Exception {
        try {

        int i = 0 ; 
        while (i < 2) {
                switch (i) {
                    case 0:  
                    sql = "Update ref_nroexped set idrefrencia =?, nro_referencia=?  where nroExped=?";
                    cn = AccesoDb.getConnection();
                    break;
                    case 1:
                    sql = "Update refregistro set idrefrencia =?, nro_referencia=?  where nroExped=?";
                    cn = AccesoDb.getConnectionDatos();
                    break;
                }
                System.out.println(i+"-"+sql);
                i++;  // CONTADOR, VARIABLE ENTERA DE CONTROL
                
                cn.setAutoCommit(false); //inicia la transaccion
//---            sql = "Update ref_nroexped set idrefrencia =?, nro_referencia=?  where nroExped=?";
                ps = cn.prepareStatement(sql);
                //preparar valores de los parametros       
                ps.setString(1, idref);
                ps.setString(2, nroref);
                ps.setString(3, nroexp);
                //ejecutar el sp
                ps.executeUpdate();
                ps.close();
                cn.commit(); //confirma q la trx se ejecuto ok
            }

        } catch (SQLException e) {
            try {
                cn.rollback(); //deshace la trx
            } catch (SQLException e1) {
            }
            throw e;
        } finally {
            cn.close();
        }

    }

}
