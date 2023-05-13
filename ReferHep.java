package hep.tramarefminsa;

public class ReferHep {

    private String nroexped;
    private String idreferencia;
    private String nro_referencia;

    public ReferHep() {
    }

    public ReferHep(String nroexped, String idreferencia, String nro_referencia) {
        this.nroexped = nroexped;
        this.idreferencia = idreferencia;
        this.nro_referencia = nro_referencia;
    }

    public String getNroexped() {
        return nroexped;
    }

    public void setNroexped(String nroexped) {
        this.nroexped = nroexped;
    }

    public String getIdreferencia() {
        return idreferencia;
    }

    public void setIdreferencia(String idreferencia) {
        this.idreferencia = idreferencia;
    }

    public String getNro_referencia() {
        return nro_referencia;
    }

    public void setNro_referencia(String nro_referencia) {
        this.nro_referencia = nro_referencia;
    }

    @Override
    public String toString() {
        return "ReferHep{" + "nroexped=" + nroexped + ", idreferencia=" + idreferencia + ", nro_referencia=" + nro_referencia + '}';
    }

}
