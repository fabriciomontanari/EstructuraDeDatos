package practicacaso2;

import javax.swing.JOptionPane;

public class Rutina {

    private NodoC inicio;
    private NodoC fin;
    private NodoSC inicioSC;
    private NodoSC finSC;

    public Rutina() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean esVaciaSC() {
        if (inicioSC == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void encolar() {
        for (int x = 0; x < 2; x++) {
            Persona p = new Persona();
            p.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre: "));

            NodoC nuevo = new NodoC();

            nuevo.setElemento(p);
            if (esVacia()) {
                inicio = nuevo;
                fin = nuevo;

            } else {
                fin.setSiguiente(nuevo);
                fin = nuevo;
            }
        }
    }

    public void mostrarCola() {
        if (!esVacia()) {
            String s = "";
            NodoC aux = inicio;
            while (aux != null) {
                s = s + aux.getElemento().getNombre();
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "- - - Lista de Nombres - - -\n\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "Cola vacia!");
        }
    }

    public void copiarColaAListaSC() {
        if (!esVacia()) {
            NodoC aux = inicio;
            while (aux != null) {
                llenarListaSC(aux.getElemento().getNombre());
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Se copió la pila...!");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo copiar, pila vacía...!");
        }
    }

    public void llenarListaSC(String nombre) {
        Persona p = new Persona();
        p.setNombre(nombre);
        NodoSC nuevo = new NodoSC();
        nuevo.setElemento(p);
        if (esVaciaSC()) {
            inicioSC = nuevo;
            finSC = nuevo;
            finSC.setSiguiente(inicioSC);
        } else if (p.getNombre().compareTo(inicioSC.getElemento().getNombre()) < 0) {
            nuevo.setSiguiente(inicioSC);
            inicioSC = nuevo;
            finSC.setSiguiente(inicioSC);
        } else if (p.getNombre().compareTo(finSC.getElemento().getNombre()) >= 0) {
            finSC.setSiguiente(nuevo);
            finSC = nuevo;
            finSC.setSiguiente(inicioSC);
        } else {
            NodoSC aux = inicioSC;
            while (aux.getSiguiente().getElemento().getNombre().compareTo(p.getNombre()) < 0) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }

    public void mostrarLSC() {
        if (!esVaciaSC()) {
            NodoSC aux = inicioSC;
            String s = "";
            s = s + aux.getElemento().getNombre() + "-->";
            aux = aux.getSiguiente();
            while (aux != inicioSC) {
                s = s + aux.getElemento().getNombre() + "-->";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,
                    "- - - Lista de nombres - - -\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar, lista simple circular vacía...!");
        }
    }
}
