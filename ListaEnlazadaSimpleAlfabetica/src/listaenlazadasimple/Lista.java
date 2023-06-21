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
      a.setIdContacto(Integer.parseInt(JOptionPane.
        showInputDialog(null,"Digite el id. del contacto:")));
      a.setNombre(JOptionPane.showInputDialog(null,
              "Digite el nombre del contacto:"));
      a.setTelefono(JOptionPane.showInputDialog(null,
              "Digite el número telefónico del contacto:"));
      NodoLES nuevo=new NodoLES();
      nuevo.setDato(a);
      if(esVacia()){
         inicio=nuevo;
      }else if(a.getNombre().compareTo(inicio.getDato().getNombre())<0){
         nuevo.setSiguiente(inicio);//Coloque nuevo apuntado a inicio.
         inicio=nuevo;//Coloque inicio donde está nuevo para actualizarlo.         
      }else if(inicio.getSiguiente()==null){
         inicio.setSiguiente(nuevo);
      }else{
         NodoLES aux=inicio;
         while((aux.getSiguiente()!=null)&&(
                 aux.getSiguiente().getDato().
                         getNombre().compareTo(a.getNombre())<0)){
             aux=aux.getSiguiente();
         }
         nuevo.setSiguiente(aux.getSiguiente());
         aux.setSiguiente(nuevo);
      }
   }
   public void eliminarAlInicio(){
      if(!esVacia()){
         inicio=inicio.getSiguiente();
         JOptionPane.showMessageDialog(null,
                 "El elemento fue extraído!");
      }else{
         JOptionPane.showMessageDialog(null,
                 "¡No se puede extraer, lista vacía!");
      }
   }
   public void eliminarEspecifico(){
      if(!esVacia()){
         String nombre=JOptionPane.showInputDialog(null,
                 "Digite el nombre a eliminar:");
         if(nombre.equals(inicio.getDato().getNombre())){
            inicio=inicio.getSiguiente();
            JOptionPane.showMessageDialog(null,
                 "El elemento fue extraído!");
         }else{
            NodoLES anterior;
            NodoLES auxiliar;
            anterior=inicio;
            auxiliar=inicio.getSiguiente();
            while((auxiliar!=null)&&(!auxiliar.getDato().
                    getNombre().equals(nombre))){
                anterior=anterior.getSiguiente();
                auxiliar=auxiliar.getSiguiente();
            }
            if(auxiliar!=null){
               anterior.setSiguiente(
                       auxiliar.getSiguiente());
            }
            JOptionPane.showMessageDialog(null,
                 "¡El elemento fue extraído!");
         }
      }else{
         JOptionPane.showMessageDialog(null,
                 "¡No se puede extraer, lista vacía!");
      }
   }
   public void mostrarElementos(){
      if(!esVacia()){
         String s="";
         NodoLES aux=inicio;
         while(aux!=null){
            s=s+aux.getDato().getIdContacto()+"--"+
                    aux.getDato().getNombre()+"--"+
                    aux.getDato().getTelefono()+"<--";
            aux=aux.getSiguiente();
         }
         JOptionPane.showMessageDialog(null,
                 "La lista contiene:\n"+s);
      }else{
         JOptionPane.showMessageDialog(null,
                 "¡No se puede mostrar, lista vacía!");
      }   
   }
}







