
package listasimplecircular;

import javax.swing.JOptionPane;

public class Menu {
       private int opcion;
   private ListaSC r=new ListaSC();
   public void mostrarMenu(){
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
        "***MENÚ PRINCIPAL***\n\n1.Agregar elemento"
        + "\n2.Extraer elemento al inicio\n"
                + "3.Mostrar elementos\n4.Salir\n\n"
        + "Digite su opción:"));
        switch(opcion){
           case 1:{
              r.agregar();
              mostrarMenu();
              break;
           }
           case 2:{
              r.eliminarAlInicio();
              mostrarMenu();
              break;
           }
           case 3:{
              r.mostrar();
              mostrarMenu();
              break;
           }
           case 4:{
              System.exit(0);
              break;
           }
           default:{
              JOptionPane.showMessageDialog(null,"Opción incorrecta!");
              mostrarMenu();
           }
        } 
   } 
}
