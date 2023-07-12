package practicacaso2;

public class NodoSC {

    private Persona elemento;
    private NodoSC siguiente;

    public NodoSC() {
        this.siguiente = null;
    }

    public Persona getElemento() {
        return elemento;
    }

    public void setElemento(Persona elemento) {
        this.elemento = elemento;
    }

    public NodoSC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSC siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
