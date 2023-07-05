package listadoblecircular;

public class NodoDC {

    private JuegoStem dato;
    private NodoDC siguiente;
    private NodoDC anterior;

    public NodoDC() {
        this.siguiente = null;
        this.anterior = null;
    }

    public JuegoStem getDato() {
        return dato;
    }

    public void setDato(JuegoStem dato) {
        this.dato = dato;
    }

    public NodoDC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDC siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDC getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDC anterior) {
        this.anterior = anterior;
    }

}
