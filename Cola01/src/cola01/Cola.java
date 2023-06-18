
package cola01;

import javax.swing.JOptionPane;

public class Cola {
    private NodoC inicio;//frente
    private NodoC fin;//ultimo
    
    public Cola(){
        this.inicio=null;
        this.fin=null;
    }
    
    public boolean esVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    public void encolar(){
        Pasajero p=new Pasajero();
        p.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre del pasajero: "));
        p.setDestino(JOptionPane.showInputDialog(null,"Digite el nombre del destino: "));
        p.setCosto(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el costo del viaje: ")));
        
        NodoC nuevo = new NodoC();
        
        nuevo.setElemento(p);
        if(esVacia()){
            inicio=nuevo;
            fin=nuevo;
        }else{
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
    }
    public void desencolar(){
        if(!esVacia()){
            inicio=inicio.getSiguiente();
            JOptionPane.showMessageDialog(null, "¡Elemento extraido!");
        }else{
            JOptionPane.showMessageDialog(null,"¡No se puede extraer, cola vacia!");
        }
    }
    public void mostrarElementos(){
        if(!esVacia()){
            String s="";
            NodoC aux=inicio;
            while(aux!=null){
                s =s+aux.getElemento().getNombre()+"--"+
                        aux.getElemento().getDestino()+"--"+
                        aux.getElemento().getCosto()+"-->";
                aux=aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,"La cola contiene:\n"+s);
        }else{
            JOptionPane.showMessageDialog(null,"¡No se puede mostrar, cola vacia!");
        }
    }
        
}


