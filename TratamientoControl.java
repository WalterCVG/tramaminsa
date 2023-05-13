
package hep.tramarefminsa;

import java.util.List;


public class TratamientoControl {
        //variable de clase HistoriaDao
    TratamientoDao tradao;
    
    //constructor
    public TratamientoControl() {
        tradao = new TratamientoDao();
    }
       //metodos de negocio
    public List<Tratamiento> TrataListar() throws Exception {
        return tradao.readAll();
    }
    
  public Tratamiento TrataLeer() throws Exception {
        return tradao.findReg();
    }

  
}
