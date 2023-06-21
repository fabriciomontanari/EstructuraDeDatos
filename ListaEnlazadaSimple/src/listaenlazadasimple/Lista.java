
package listaenlazadasimple;

import javax.swing.JOptionPane;

public class Lista {

    private NodoLES inicio;
    
    public Lista(){
        this.inicio=null;
    }
    public boolean esVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    public void agregar(){
        Agenda a=new Agenda();
        
        a.setIdContacto(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el id. del contacto:")));
        a.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre del contacto:"));
        a.setTelefono(JOptionPane.showInputDialog(null,"Digite el numero telefonico del contacto:"));
       
        NodoLES nuevo=new NodoLES();
        nuevo.setDato(a);
        if(esVacia()){
            inicio=nuevo;
            
        }else if(a.getIdContacto()<inicio.getDato().getIdContacto()){
            nuevo.setSiguiente(inicio);//coloque nuevo apuntando a inicio
            inicio=nuevo;//coloque inicio donde esta nuevo para actualizar
        }else if(inicio.getSiguiente()==null){
            inicio.setSiguiente(nuevo);
        }else{
            NodoLES aux=inicio;
            while((aux.getSiguiente()!=null)&&(aux.getSiguiente().getDato().getIdContacto()<a.getIdContacto())){
                aux=aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);//insertar elemento en medio
        }
        
    }
    public void eliminarAlInicio(){
        if(!esVacia()){
            inicio=inicio.getSiguiente();
            JOptionPane.showMessageDialog(null,"El elemento fue extraido!");
        }else{
            JOptionPane.showMessageDialog(null, "No se puede extraer, lista vacia!");
        }
    }
    public void eliminarEspecifico(){
        if(!esVacia()){
            String nombre=JOptionPane.showInputDialog(null,"Digite el nombre a eliminar:");
            if(nombre.equals(inicio.getDato().getNombre())){
                inicio=inicio.getSiguiente();
                JOptionPane.showMessageDialog(null,"Elemento extraido!");
            }else{
                NodoLES anterior;
                NodoLES auxiliar;
                anterior=inicio;
                auxiliar=inicio.getSiguiente();
                while((auxiliar!=null)&&(!auxiliar.getDato().getNombre().equals(nombre))){
                    anterior=anterior.getSiguiente();
                    auxiliar=auxiliar.getSiguiente();
                            
                }
                if(auxiliar!=null){
                    anterior.setSiguiente(auxiliar.getSiguiente());
                }
                JOptionPane.showMessageDialog(null,"Elemento extraido!");
                
            }
        }
    }
    public void mostrarElementos(){
        if(!esVacia()){
            String s="";
            NodoLES aux=inicio;
            while(aux!=null){
                s=s+aux.getDato().getIdContacto()+"--"+
                        aux.getDato().getNombre()+"--"+
                        aux.getDato().getTelefono()+"--";
                aux=aux.getSiguiente();
                        
            }
            JOptionPane.showMessageDialog(null,"La lista contiene: \n"+s);
    }else{
            JOptionPane.showMessageDialog(null,"No se puede mostrar, lista vacia!");
        }
    }
}
