package listadoblecircular;

import javax.swing.JOptionPane;

public class ListaDC {

    private NodoDC inicio;
    private NodoDC fin;

    public ListaDC() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean esVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregar() {
        JuegoStem js = new JuegoStem();
        js.setNombreJuego(JOptionPane.
                showInputDialog(null,
                        "Digite el nombre del juego:"));
        js.setPrecio(Double.parseDouble(JOptionPane.
                showInputDialog(null,
                        "Digite el precio:")));
        NodoDC nuevo = new NodoDC();
        nuevo.setDato(js);
        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else if (js.getPrecio() < inicio.getDato().getPrecio()) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else if (js.getPrecio() >= fin.getDato().getPrecio()) {
            fin.setSiguiente(nuevo);
            fin = nuevo; //fin=fin.getSiguiente();
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else {
            NodoDC aux = inicio;
            while (aux.getSiguiente().getDato().getPrecio()
                    < js.getPrecio()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);
        }
    }

    public void extraerAlInicio() {
        if (!esVacia()) {
            inicio = inicio.getSiguiente();
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
            JOptionPane.showMessageDialog(null,
                    "Elemento extraído!");
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se puede extraer, lista vacía!");
        }
    }

    public void mostrar() {
        if (!esVacia()) {
            String s = "";
            NodoDC aux = inicio;
            s = s + aux.getDato().getNombreJuego() + "--"
                    + aux.getDato().getPrecio() + "<==>";
            aux = aux.getSiguiente();
            while (aux != inicio) {
                s = s + aux.getDato().getNombreJuego() + "--"
                        + aux.getDato().getPrecio() + "<==>";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,
                    "La lista contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se puede mostrar,lista vacía!");
        }
    }
    
    public int contarNodos() {
        int contador=0;
        if (!esVacia()) {
            String s = "";
            NodoDC aux = inicio;
            contador++;
            aux = aux.getSiguiente();
            while (aux != inicio) {
                contador++;
                aux = aux.getSiguiente();
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se puede contar,lista vacía!");
        }
        return contador;
    }

    public void mostrarInversa() {
        if (!esVacia()) {
            int x;
            String s="";
            NodoDC aux=fin;
            while(aux.getAnterior()!=inicio){
              s = s + aux.getDato().getNombreJuego() + "--"
                    + aux.getDato().getPrecio() + "<==>";
              aux=aux.getAnterior();
            }
            JOptionPane.showMessageDialog(null,
                    "La lista contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se puede mostrar,lista vacía!");
        }

    }
}
