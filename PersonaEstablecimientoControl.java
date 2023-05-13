

package hep.tramarefminsa;

import java.util.List;

public class PersonaEstablecimientoControl {
    //variable de clase Dao
    Persona_EstablecimientoDao persestdao;
    
    //constructor
    public PersonaEstablecimientoControl() {
        persestdao = new Persona_EstablecimientoDao();
      }   
        //metodos de negocio
    public List<Persona_Establecimiento> PersEstListar() throws Exception {
        return persestdao.readAll();
    }
    
  public Persona_Establecimiento PersEstLeer() throws Exception {
        return persestdao.findReg();
    }  
}
