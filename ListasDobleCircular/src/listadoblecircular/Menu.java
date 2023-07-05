package listadoblecircular;
import javax.swing.JOptionPane;
public class Menu {
   private int opc;
   private ListaDC ldc=new ListaDC();
   public void mostrarMenu(){
      opc=Integer.parseInt(JOptionPane.
              showInputDialog(null,
                      "MENÚ PRINCIPAL\n\n"
       + "1.Agregar\n2.Extraer al Inicio\n3.Mostrar\n4.Salir\n\n"
     + "Digite su opción:"));
      switch(opc){
          case 1:{
             ldc.agregar();
             mostrarMenu();
             break;
          }
          case 2:{
             ldc.extraerAlInicio();
             mostrarMenu();
             break;
          }
          case 3:{
             ldc.mostrar();
             //ldc.mostrarInversa();
             mostrarMenu();
             break;
          }
          case 4:{
             System.exit(0);
             break;
          }
          default:{
             JOptionPane.showMessageDialog(null,
                     "Opción incorrecta!");
             mostrarMenu();
          }
      }
   }
}
