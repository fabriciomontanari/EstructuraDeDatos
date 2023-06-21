package listaenlazadasimple;
public class NodoLES {
   private Agenda dato;
   private NodoLES siguiente;
   
   public NodoLES(){
      this.siguiente=null;
   }

    public Agenda getDato() {
        return dato;
    }

    public void setDato(Agenda dato) {
        this.dato = dato;
    }

    public NodoLES getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLES siguiente) {
        this.siguiente = siguiente;
    }
   
}
