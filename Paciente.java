package hep.tramarefminsa;

public class Paciente {

    private String idtipodoc;
    private String numdoc;
    private String apelpatpac;
    private String apelpatmac;
    private String nombpac;
    private String direccion;
    private String fechnacpac;
    private String idsexo;
    private String nrohis;
    private String ubigeoreniec;
    private String ubigeoactual;
    private String celularpac;

    public Paciente() {
    }

    public Paciente(String idtipodoc, String numdoc, String apelpatpac, String apelpatmac, String nombpac, String direccion, String fechnacpac, String idsexo, String nrohis, String ubigeoreniec, String ubigeoactual, String celularpac) {
        this.idtipodoc = idtipodoc;
        this.numdoc = numdoc;
        this.apelpatpac = apelpatpac;
        this.apelpatmac = apelpatmac;
        this.nombpac = nombpac;
        this.direccion = direccion;
        this.fechnacpac = fechnacpac;
        this.idsexo = idsexo;
        this.nrohis = nrohis;
        this.ubigeoreniec = ubigeoreniec;
        this.ubigeoactual = ubigeoactual;
        this.celularpac = celularpac;
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

    public String getApelpatpac() {
        return apelpatpac;
    }

    public void setApelpatpac(String apelpatpac) {
        this.apelpatpac = apelpatpac;
    }

    public String getApelpatmac() {
        return apelpatmac;
    }

    public void setApelpatmac(String apelpatmac) {
        this.apelpatmac = apelpatmac;
    }

    public String getNombpac() {
        return nombpac;
    }

    public void setNombpac(String nombpac) {
        this.nombpac = nombpac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechnacpac() {
        return fechnacpac;
    }

    public void setFechnacpac(String fechnacpac) {
        this.fechnacpac = fechnacpac;
    }

    public String getIdsexo() {
        return idsexo;
    }

    public void setIdsexo(String idsexo) {
        this.idsexo = idsexo;
    }

    public String getNrohis() {
        return nrohis;
    }

    public void setNrohis(String nrohis) {
        this.nrohis = nrohis;
    }

    public String getUbigeoreniec() {
        return ubigeoreniec;
    }

    public void setUbigeoreniec(String ubigeoreniec) {
        this.ubigeoreniec = ubigeoreniec;
    }

    public String getUbigeoactual() {
        return ubigeoactual;
    }

    public void setUbigeoactual(String ubigeoactual) {
        this.ubigeoactual = ubigeoactual;
    }

        public String getCelularPac() {
        return celularpac;
    }

    public void setCelularPac(String celularpac) {
        this.celularpac = celularpac;
    }
}
