package recursividad01;
public class Imprime {
   public void imprimir(int x){
      if(x>0){
         System.out.print(x+" ");
         imprimir(x-1);
      }
   }    
}
