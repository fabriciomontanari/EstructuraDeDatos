package listaenlazadasimple;
import javax.swing.JOptionPane;
public class Menu {
   private int opcion;
   private Lista l=new Lista();
   public void mostrarMenu(){
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
        "***MENÚ PRINCIPAL***\n\n1.Agregar elemento"
        + "\n2.Extraer elemento al inicio\n"
                + "3.Extraer elemento específico\n"
                + "4.Mostrar elementos\n5.Salir\n\n"
        + "Digite su opción:"));
        switch(opcion){
           case 1:{
              l.agregar();
              mostrarMenu();
              break;
           }
           case 2:{
              l.eliminarAlInicio();
              mostrarMenu();
              break;
           }
           case 3:{
              l.eliminarEspecifico();
              mostrarMenu();
              break;
           }
           case 4:{
              l.mostrarElementos();
              mostrarMenu();
              break;
           }
           case 5:{
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
