
package listasimplecircular;

import javax.swing.JOptionPane;

public class ListaSC {
    private NodoSC inicio;
    private NodoSC fin;
    
    public ListaSC(){
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
    
    public void agregar(){
        Producto p=new Producto();
        p.setIdProducto(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el id del producto:")));
        p.setDescripcion(JOptionPane.showInputDialog(null,"Digite la descripcion del producto"));
        p.setPrecio(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el precio del producto:")));
        
        NodoSC nuevo= new NodoSC();
        nuevo.setElemento(p);
        if(esVacia()){
            inicio=nuevo;
            fin=nuevo;
            fin.setSiguiente(inicio);
        }else if(p.getDescripcion().compareTo(inicio.getElemento().getDescripcion())<0){
            nuevo.setSiguiente(inicio);
            inicio=nuevo;//colocar datos al inicio
            fin.setSiguiente(inicio);
        }else if(p.getDescripcion().compareTo(fin.getElemento().getDescripcion())>=0){
            fin.setSiguiente(nuevo);
            fin=nuevo; //colocar datos al final
            fin.setSiguiente(inicio);
        }else{
            NodoSC aux=inicio;
            while(aux.getSiguiente().getElemento().getDescripcion().compareTo(p.getDescripcion())<0){
                aux=aux.getSiguiente();//agregar los datos al medio
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }
    
    public void eliminarAlInicio(){
        int cant=contarElementos();
        if((!esVacia())&&(cant>1)){
            inicio=inicio.getSiguiente();
            fin.setSiguiente(inicio);
            JOptionPane.showMessageDialog(null,"Elemento extraido!");
        }else if((!esVacia())&&(cant==1)){
            inicio=null;
            fin=null;
            JOptionPane.showMessageDialog(null,"Elemento extraido!");
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Lista Vacia!");
        }
    }
    public int contarElementos(){
        int cantElementos=0;
        if(!esVacia()){
            
            NodoSC aux=inicio;
            cantElementos=cantElementos+1;
            aux=aux.getSiguiente();
            while(aux!=inicio){
                cantElementos=cantElementos+1;
                aux=aux.getSiguiente();
            }
        }
        return cantElementos;
    }
    
    public void mostrar(){
        if(!esVacia()){
            String s="";
            NodoSC aux=inicio;
            s=s+aux.getElemento().getIdProducto()+"\n"+
                    aux.getElemento().getDescripcion()+"\n"+
                    aux.getElemento().getPrecio()+"\n-------------\n";
            aux=aux.getSiguiente();
            while(aux!=inicio){
                s=s+aux.getElemento().getIdProducto()+"\n"+
                    aux.getElemento().getDescripcion()+"\n"+
                    aux.getElemento().getPrecio()+"\n-------------\\n";
            aux=aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,"La lista contiene:\n"+s);
        }
    }
    
    
}

