

package hep.tramarefminsa;

import java.util.List;


public class CptControl {
     //variable de clase HistoriaDao
    CptDao pacdao;
    
    //constructor
    public CptControl() {
        pacdao = new CptDao();
    }
       //metodos de negocio
    public List<Cpt> CptListar() throws Exception {
        return pacdao.readAll();
    }
    
  public Cpt CptLeer() throws Exception {
        return pacdao.findReg();
    }  
}
