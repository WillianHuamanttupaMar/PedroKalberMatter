package modelo;

public class EventoTO {
    int idEvento, idPeriodo;
    String  nombreevento,
            lugarevento,
            tiempotolerancia,
            estado;
    double longitud;
    double latitud;

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public String getNombreevento() {
        return nombreevento;
    }

    public void setNombreevento(String nombreevento) {
        this.nombreevento = nombreevento;
    }

    public String getLugarevento() {
        return lugarevento;
    }

    public void setLugarevento(String lugarevento) {
        this.lugarevento = lugarevento;
    }

    public String getTiempotolerancia() {
        return tiempotolerancia;
    }

    public void setTiempotolerancia(String tiempotolerancia) {
        this.tiempotolerancia = tiempotolerancia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
}
