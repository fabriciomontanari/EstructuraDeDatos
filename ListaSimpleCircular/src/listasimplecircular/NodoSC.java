
package listasimplecircular;

public class NodoSC {
    private Producto elemento;
    private NodoSC siguiente;
    
    
    public NodoSC(){
        this.siguiente=null;
    }

    public Producto getElemento() {
        return elemento;
    }

    public void setElemento(Producto elemento) {
        this.elemento = elemento;
    }

    public NodoSC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSC siguiente) {
        this.siguiente = siguiente;
    }
    
}
