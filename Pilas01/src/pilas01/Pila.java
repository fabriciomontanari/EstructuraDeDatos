
package pilas01;

import javax.swing.JOptionPane;
public class Pila {
    private NodoP cima;
    public Pila(){
        this.cima=null;
    }
    public boolean esVacia(){
        if(cima==null){
            return true;
            
        }else{
            return false;
        }
    }
    public void apilar(){
        Dato d=new Dato();
        d.setCodProducto(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el codigo del producto: ")));
        d.setDescrip(JOptionPane.showInputDialog(null,"Digite la descripcion: "));
        d.setPrecio(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el precio: ")));
        
        NodoP nuevo = new NodoP();
        nuevo.setElemento(d);
        if(esVacia()){ //enlace nuevo con el siguiente de cima
            cima=nuevo;
            
        }else{
            nuevo.setSiguiente(cima); //coloque cima donde esta nuevo
            cima=nuevo; 
        }
    }
    public void desapilar(){
        if(!esVacia()){
            cima=cima.getSiguiente();
            JOptionPane.showMessageDialog(null, "¡El elemento fue extraido!");
        }else{
            JOptionPane.showMessageDialog(null,"¡No se pudo extraer, pila vacia!");
        }
    }
    public void mostrar(){
        if(!esVacia()){
            String s= "";
            NodoP aux=cima;
            while(aux!=null){
                s=s+aux.getElemento().getCodProducto()+"--"+
                        aux.getElemento().getDescrip()+"--"+
                        aux.getElemento().getPrecio()+"\n";
                aux=aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,"La pila contiene: \n"+s);
        }else{
            JOptionPane.showMessageDialog(null,"¡No se puede mostrar, pila vacia!");
        }
    }
}
