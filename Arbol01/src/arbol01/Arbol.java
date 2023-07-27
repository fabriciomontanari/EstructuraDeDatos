package arbol01;

import javax.swing.JOptionPane;

public class Arbol {
    private NodoA raiz;
    
    
    public Arbol(){
        this.raiz=null;
    }
    
    public boolean esVacio(){
        if(raiz==null){
            return true;
        }else{
            return false;
        }
    }
    
    public void insertarRaiz(){
        Dato d=new Dato();
        d.setNombre(JOptionPane.showInputDialog(null,"Inserte el nombre"));
        d.setNota(Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte la nota:")));
        
        NodoA nuevo=new NodoA();
        nuevo.setElemento(d);
        
        if(esVacio()){
            raiz=nuevo;
        }else{
            insertarNuevo(raiz,nuevo);
        }
    }
    
    public void insertarNuevo(NodoA raiz,NodoA nuevo){
        if(nuevo.getElemento().getNota()<=raiz.getElemento().getNota()){
            if(raiz.getEnlaceIzq()==null){
                raiz.setEnlaceIzq(nuevo);
                
            }else{
                insertarNuevo(raiz.getEnlaceIzq(),nuevo);
            }
        }else{
            if(raiz.getEnlaceDer()==null){
                raiz.setEnlaceDer(nuevo);
            }else{
                insertarNuevo(raiz.getEnlaceDer(),nuevo); 
            }
        }
    }
    
    public void eliminarTodo(){
        if(!esVacio()){
        raiz=null;
        JOptionPane.showMessageDialog(null,"¡Datos eliminados correctamente!");
        }else{
            JOptionPane.showMessageDialog(null,"¡No se puede eliminar, Datos inexistentes!");
        }
    }
    
    public void inOrden(){
        if(!esVacio()){
            inOrdenR(raiz);
        }else{
            JOptionPane.showMessageDialog(null,"¡No se puede mostrar, Datos Vacios!");
        }
    }
    
    public void inOrdenR(NodoA raiz){
        if(raiz!=null){
            inOrdenR(raiz.getEnlaceIzq());
            System.out.print("["+raiz.getElemento().getNombre()+"--"+raiz.getElemento().getNota()+"]");
            inOrdenR(raiz.getEnlaceDer());
            
        }
    }
}
