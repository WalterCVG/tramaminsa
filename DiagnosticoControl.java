
package hep.tramarefminsa;

import java.util.List;


public class DiagnosticoControl {
         //variable de clase HistoriaDao
    DiagnosticoDao diagdao;
    
    //constructor
    public DiagnosticoControl() {
        diagdao = new DiagnosticoDao();
    }
   //metodos de negocio
    public List<Diagnostico> DiagListar() throws Exception {
        return diagdao.readAll();
    }
    
  public Diagnostico DiagLeer() throws Exception {
        return diagdao.findReg();
    } 
}
