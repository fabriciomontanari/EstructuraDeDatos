
package practicacaso2;

public class NodoC {
    private Persona elemento;
    private NodoC siguiente;
    
    public NodoC(){
        this.siguiente=null;
    }

    public Persona getElemento() {
        return elemento;
    }

    public void setElemento(Persona elemento) {
        this.elemento = elemento;
    }

    public NodoC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoC siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
