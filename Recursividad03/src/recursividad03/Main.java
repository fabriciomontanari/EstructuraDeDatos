package recursividad03;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
       Arreglo arr=new Arreglo(); 
       char vector[]=new char[4];
       String s="";
       int x=0;
       arr.llenarVector(vector,x);
       s=arr.mostrarVector(vector,x,s);
       JOptionPane.showMessageDialog(null,
               "El vector contiene:\n"+s);
    }    
}
