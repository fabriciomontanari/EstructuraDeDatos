package recursividad03;
import javax.swing.JOptionPane;
public class Arreglo {
   public void llenarVector(char vector[],int x){
      if(x<4){
         vector[x]=JOptionPane.
          showInputDialog(null,
                  "Digite una letra:").charAt(0);
         llenarVector(vector,x+1);
      }
   }    
   public String mostrarVector(char vector[],int x,String s){
      if(x<4){
         s=s+vector[x]+" ";
         s=mostrarVector(vector,x+1,s);
      }
      return s;
   }
}
