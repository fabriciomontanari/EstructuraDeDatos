package casoprac2ed;

import javax.swing.JOptionPane;

public class Rutina {

    private NodoDobleCircular inicio;
    private NodoDobleCircular fin;
    private NodoCola inicioC;
    private NodoCola finC;
    private NodoListaSimple inicioLS;
    private NodoListaSimple finLS;
    int vector[] = new int[5];

    public Rutina() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean esVaciaDC() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esVaciaC() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esVaciaLS() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregar() {
        for (int x = 0; x < 4; x++) {
            Dato d = new Dato();
            d.setNombre(JOptionPane.
                    showInputDialog(null, "Digite el nombre: "));
            d.setEdad(Integer.parseInt(JOptionPane.
                    showInputDialog(null,
                            "Digite la edad: ")));
            NodoDobleCircular nuevo = new NodoDobleCircular();
            nuevo.setElemento(d);
            if (esVaciaDC()) {
                inicio = nuevo;
                fin = nuevo;
                fin.setSiguiente(inicio);
                inicio.setAnterior(fin);
            } else if (d.getEdad() < inicio.getElemento().getEdad()) {
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
                fin.setSiguiente(inicio);
                inicio.setAnterior(fin);
            } else if (d.getEdad() >= fin.getElemento().getEdad()) {
                fin.setSiguiente(nuevo);
                fin = nuevo;
                fin.setSiguiente(inicio);
                inicio.setAnterior(fin);
            } else {
                NodoDobleCircular aux = inicio;
                while (aux.getSiguiente().getElemento().getEdad()
                        < d.getEdad()) {//Mientras la edad siguiente
                    //de aux, sea menor que la que voy a insertar
                    aux = aux.getSiguiente(); //Avance aux al siguiente
                }
                nuevo.setSiguiente(aux.getSiguiente());
                //coloque nuevo como el siguiente de aux
                nuevo.setAnterior(aux);
                //enlace nuevo en su parte anterior con aux
                aux.setSiguiente(nuevo);
                //aux en su enlace siguiente conéctelo con nuevo
                nuevo.getSiguiente().setAnterior(nuevo);
                //El elemento siguiente de nuevo en su parte anterior, 
                //enlácela con nuevo
            }
        }
    }

    public void copiarACola() {
        if (!esVaciaC()) {
            NodoDobleCircular aux = inicio;
            encolar(aux.getElemento());
            aux = aux.getSiguiente();
            while (aux != inicio) {
                encolar(aux.getElemento());
                aux = aux.getSiguiente();
            }
        }
    }

    public void encolar(Dato d) {
        NodoCola nuevo = new NodoCola();
        nuevo.setElemento(d);
        if (esVaciaC()) {
            inicioC = nuevo;
            finC = nuevo;
        } else {
            finC.setSiguiente(nuevo);
            finC = nuevo;
        }
    }

    public void copiarAListaSimple() {
        if (!esVaciaC()) {
            NodoCola aux = inicioC;
            while (aux != null) {
                llenarLista(aux.getElemento());
                aux = aux.getSiguiente();
            }
        }
    }

    public void llenarLista(Dato e) {
        NodoListaSimple nuevo = new NodoListaSimple();
        nuevo.setElemento(e);
        if (esVaciaLS()) {
            inicioLS = nuevo;
            finLS = nuevo;
            finLS.setSiguiente(inicioLS);
        } else if (e.getEdad() < inicio.getElemento().getEdad()) {
            nuevo.setSiguiente(inicioLS);
            inicioLS = nuevo;
            fin.setSiguiente(inicio);
        } else if (e.getEdad() >= finLS.getElemento().getEdad()) {
            finLS.setSiguiente(nuevo);
            finLS = nuevo;//fin=fin.getSiguiente();
            finLS.setSiguiente(inicioLS);
        } else {
            NodoListaSimple aux = inicioLS;
            while (aux.getSiguiente().getElemento().getEdad()
                    < e.getEdad()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }

    public void mostrarElementosDC() {
        if (!esVaciaDC()) {
            String s = "";
            NodoDobleCircular aux = inicio;
            s = s + aux.getElemento().getNombre() + "=="
                    + aux.getElemento().getEdad() + "<==>";
            aux = aux.getSiguiente();
            while (aux != inicio) {
                s = s + aux.getElemento().getNombre() + "=="
                        + aux.getElemento().getEdad() + "<==>";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se puede mostrar,lista vacía!");
        }
    }

    public void mostrarElementosLS() {
        if (!esVaciaC()) {
            String s = "";
            NodoListaSimple aux = inicioLS;
            s = s + aux.getElemento().getNombre() + "--"
                    + aux.getElemento().getEdad() + "-->";
            aux = aux.getSiguiente();
            while (aux != inicioLS) {
                s = s + aux.getElemento().getNombre() + "--"
                        + aux.getElemento().getEdad() + "-->";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,
                    "La lista simple circular contiene:\n"
                    + s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "¡No se puede mostrar, lista vacía!");
        }
    }

    public void mostrarElementosC() {
        if (!esVaciaC()) {
            String s = "";
            NodoCola aux = inicioC;
            while (aux != null) {
                s = s + aux.getElemento().getNombre()
                        + " " + aux.getElemento().getEdad() + "-->";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,
                    "La cola contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "¡No existen elementos para mostrar, cola vacía!");
        }
    }

    public void copiarAVector() {
        int vector[] = new int[5];
    }
}
