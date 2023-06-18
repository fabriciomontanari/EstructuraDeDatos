package recursividad02;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Factorial fac=new Factorial();
        long num=Long.parseLong(JOptionPane.
         showInputDialog(null,
                 "Digite un número:"));
        JOptionPane.showMessageDialog(null,
                "El factorial de "+num+" es "+
                        fac.calcularFactorial(num));
    }    
}
