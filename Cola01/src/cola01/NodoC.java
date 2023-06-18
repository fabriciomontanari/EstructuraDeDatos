package cola01;

public class NodoC {
    private Pasajero elemento;
    private NodoC siguiente;
    
    public NodoC(){
        this.siguiente=null;
    }

    public Pasajero getElemento() {
        return elemento;
    }

    public void setElemento(Pasajero elemento) {
        this.elemento = elemento;
    }

    public NodoC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoC siguiente) {
        this.siguiente = siguiente;
    }
    
}
