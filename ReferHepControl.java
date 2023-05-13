
package hep.tramarefminsa;
import java.util.List;

public class ReferHepControl {
   
    //variable de clase ReferHepDao
    ReferHepDao refhepdao;
    
    //constructor
    public ReferHepControl() {
        refhepdao = new ReferHepDao();
    }
       //metodos de negocio
    public List<ReferHep> ReferHepListar() throws Exception {
        return refhepdao.readAll();
    }
    
  public ReferHep ReferHepLeer() throws Exception {
        return refhepdao.findReg();
    }
}
