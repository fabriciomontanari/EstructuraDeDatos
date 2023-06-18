package recursividad01;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Imprime imp=new Imprime();
        int num=Integer.parseInt(JOptionPane.
                showInputDialog(null,
                        "Digite un número:"));
        imp.imprimir(num);
    }    
}
