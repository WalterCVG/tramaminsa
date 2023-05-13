package hep.tramarefminsa;

public class Persona_Establecimiento {

    private String idtipodoc;
    private String numdoc;
    private String apelpata;
    private String apelmata;
    private String nombper;
    private String fechanac;
    private String idcolegio;
    private String idprofesion;
    private String idsexo;

    public Persona_Establecimiento() {
    }

    public Persona_Establecimiento(String idtipodoc, String numdoc, String apelpata, String apelmata, String nombper, String fechanac, String idcolegio, String idprofesion, String idsexo) {
        this.idtipodoc = idtipodoc;
        this.numdoc = numdoc;
        this.apelpata = apelpata;
        this.apelmata = apelmata;
        this.nombper = nombper;
        this.fechanac = fechanac;
        this.idcolegio = idcolegio;
        this.idprofesion = idprofesion;
        this.idsexo = idsexo;
    }

    public String getIdtipodoc() {
        return idtipodoc;
    }

    public void setIdtipodoc(String idtipodoc) {
        this.idtipodoc = idtipodoc;
    }

    public String getNumdoc() {
        return numdoc;
    }

    public void setNumdoc(String numdoc) {
        this.numdoc = numdoc;
    }

    public String getApelpata() {
        return apelpata;
    }

    public void setApelpata(String apelpata) {
        this.apelpata = apelpata;
    }

    public String getApelmata() {
        return apelmata;
    }

    public void setApelmata(String apelmata) {
        this.apelmata = apelmata;
    }

    public String getNombper() {
        return nombper;
    }

    public void setNombper(String nombper) {
        this.nombper = nombper;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public String getIdcolegio() {
        return idcolegio;
    }

    public void setIdcolegio(String idcolegio) {
        this.idcolegio = idcolegio;
    }

    public String getIdprofesion() {
        return idprofesion;
    }

    public void setIdprofesion(String idprofesion) {
        this.idprofesion = idprofesion;
    }

    public String getIdsexo() {
        return idsexo;
    }

    public void setIdsexo(String idsexo) {
        this.idsexo = idsexo;
    }
    
}
