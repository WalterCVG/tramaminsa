package hep.tramarefminsa;

public class Motivo_Referencia {

    private Integer idmotivoref;
    private String obsmotivoref;

    public Motivo_Referencia() {
    }

    public Motivo_Referencia(Integer idmotivoref, String obsmotivoref) {
        this.idmotivoref = idmotivoref;
        this.obsmotivoref = obsmotivoref;
    }

    public Integer getIdmotivoref() {
        return idmotivoref;
    }

    public void setIdmotivoref(Integer idmotivoref) {
        this.idmotivoref = idmotivoref;
    }

    public String getObsmotivoref() {
        return obsmotivoref;
    }

    public void setObsmotivoref(String obsmotivoref) {
        this.obsmotivoref = obsmotivoref;
    }
    
}
