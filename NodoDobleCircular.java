/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoprac2ed;

/**
 *
 * @author fabsj
 */
public class NodoDobleCircular {
    private Dato elemento;
    private NodoDobleCircular siguiente;
    private NodoDobleCircular anterior;

    public NodoDobleCircular() {
        this.siguiente = null;
        this.anterior = null;
    }

    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    public NodoDobleCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDobleCircular siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDobleCircular getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDobleCircular anterior) {
        this.anterior = anterior;
    }
}
