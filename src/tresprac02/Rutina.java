package tresprac02;

import javax.swing.JOptionPane;

public class Rutina {
   private int vec[]=new int[4];
   private int mat[][]=new int[2][2];
   private int vec02[]=new int[12];
   private NodoP cima;
   private NodoSC inicioSC;
   private NodoSC finSC;
   private NodoDC inicioDC;
   private NodoDC finDC;
   
   public boolean esVaciaP(){
      if(cima==null){
         return true;
      }else{
         return false;
      }
   }
   public boolean esVaciaSC(){
      if(inicioSC==null){
         return true;
      }else{
         return false;
      }
   }
   public boolean esVaciaDC(){
      if(inicioDC==null){
         return true;
      }else{
         return false;
      }
   }
   public void llenarVector(){
      int x;
      for(x=0;x<4;x++){
         vec[x]=Integer.parseInt(JOptionPane.showInputDialog(null,
                 "Digite un número:"));
      }
   }
   public void llenarMatriz(){
      int x,y;
      for(x=0;x<mat.length;x++){
        for(y=0;y<mat.length;y++){
           mat[x][y]=Integer.parseInt(JOptionPane.showInputDialog(null,
                 "Digite un número:"));
        }
      }
   }
   public void llenarPila(){
      int x;
      for(x=0;x<4;x++){
         Dato d=new Dato();
         d.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null,
                 "Digite un número:")));
         NodoP nuevo=new NodoP();
         nuevo.setElemento(d);
         if(esVaciaP()){
            cima=nuevo;
         }else{
            nuevo.setSiguiente(cima);
            cima=nuevo;
         }
      }
   }
   public void copiarVectorAListaSC(){
      int x;
      for(x=0;x<4;x++){
          llenarListaSC(vec[x]);
      }
      JOptionPane.showMessageDialog(null,"Se copió el vector...!");
   }
   public void copiarMatrizAListaSC(){
      int x,y;
      for(x=0;x<2;x++){
        for(y=0;y<2;y++){  
           llenarListaSC(mat[x][y]);
        }   
      }
      JOptionPane.showMessageDialog(null,"Se copió la matriz...!");
   }
   public void copiarPilaAListaSC(){
      if(!esVaciaP()){
         NodoP aux=cima;
         while(aux!=null){
             llenarListaSC(aux.getElemento().getNumero());
             aux=aux.getSiguiente();
         }
         JOptionPane.showMessageDialog(null,"Se copió la pila...!");
      }else{
         JOptionPane.showMessageDialog(null,"No se pudo copiar, pila vacía...!");
      }
   }
   public void llenarListaSC(int num){
      Dato d=new Dato();
      d.setNumero(num);
      NodoSC nuevo=new NodoSC();
      nuevo.setElemento(d);
      if(esVaciaSC()){
         inicioSC=nuevo;
         finSC=nuevo;
         finSC.setSiguiente(inicioSC);
      }else if(d.getNumero()<inicioSC.getElemento().getNumero()){
         nuevo.setSiguiente(inicioSC);
         inicioSC=nuevo;
         finSC=nuevo;
         finSC.setSiguiente(inicioSC);
      }else if(d.getNumero()>=finSC.getElemento().getNumero()){
         finSC.setSiguiente(nuevo);
         finSC=nuevo;
         finSC.setSiguiente(inicioSC);
      }else{
         NodoSC aux=inicioSC;
         while(aux.getSiguiente().getElemento().getNumero()<d.getNumero()){
            aux=aux.getSiguiente();
         }
         nuevo.setSiguiente(aux.getSiguiente());
         aux.setSiguiente(nuevo);
      }
   }
   public void mostrarLSC(){
      if(!esVaciaSC()){
         NodoSC aux=inicioSC;
         String s="";
         s=s+aux.getElemento().getNumero()+"-->";
         aux=aux.getSiguiente();
         while(aux!=inicioSC){
            s=s+aux.getElemento().getNumero()+"-->";
            aux=aux.getSiguiente();
         }
         JOptionPane.showMessageDialog(null,
                 "La lista simple circular contiene:\n"+s);
      }else{
         JOptionPane.showMessageDialog(null,"No se pudo mostrar, lista simple circular vacía...!");
      }
   }
   public void copiarListaSCAVector02(){
      int x=0; 
      if(!esVaciaSC()){
         NodoSC aux=inicioSC;
         llenarVector02(aux.getElemento().getNumero(),x);
         x++;
         aux=aux.getSiguiente();
         while(aux!=inicioSC){
            llenarVector02(aux.getElemento().getNumero(),x);
            x++;
            aux=aux.getSiguiente(); 
         }
         JOptionPane.showMessageDialog(null,"Lista simple circular fue copiada...!");
      }else{
         JOptionPane.showMessageDialog(null,"No se pudo mostrar, lista simple circular vacía...!");
      }   
   }
   public void llenarVector02(int num,int x){
      vec02[x]=num;
   }
   public void mostrarVector02(){
      int x;
      String s="";
      for(x=0;x<12;x++){
          s=s+vec02[x]+" ";
      }
      JOptionPane.showMessageDialog(null,"El vector contiene:\n"+s);
   }
   public void copiarVectorALDC(){
      int x;
      for(x=0;x<12;x++){
          llenarListaDC(vec02[x]);
      }
   }
   public void llenarListaDC(int num) {
        Dato d=new Dato();
        d.setNumero(num);
        NodoDC nuevo = new NodoDC();
        nuevo.setElemento(d);
        if (esVaciaDC()) {
            inicioDC = nuevo;
            finDC = nuevo;
            finDC.setSiguiente(inicioDC);
            inicioDC.setAnterior(finDC);
        } else if (d.getNumero()< inicioDC.getElemento().getNumero()) {
            nuevo.setSiguiente(inicioDC);
            inicioDC = nuevo;
            finDC.setSiguiente(inicioDC);
            inicioDC.setAnterior(finDC);
        } else if (d.getNumero()>= finDC.getElemento().getNumero()) {
            finDC.setSiguiente(nuevo);
            finDC = nuevo; //finDC=finDC.getSiguiente();
            finDC.setSiguiente(inicioDC);
            inicioDC.setAnterior(finDC);
        } else {
            NodoDC aux = inicioDC;
            while (aux.getSiguiente().getElemento().getNumero()
                    < d.getNumero()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);
        }
    }
    public void mostrarLDC() {
        if (!esVaciaDC()) {
            String s = "";
            NodoDC aux = inicioDC;
            s = s + aux.getElemento().getNumero() + "<==>";
            aux = aux.getSiguiente();
            while (aux != inicioDC) {
                s = s + aux.getElemento().getNumero() + "<==>";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,
                    "La lista doble circular contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se puede mostrar,lista doble circular vacía!");
        }
    }
}




















