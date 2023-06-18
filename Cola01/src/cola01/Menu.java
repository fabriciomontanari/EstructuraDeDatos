
package cola01;

import javax.swing.JOptionPane;

public class Menu {
    private byte opc;    
   private Cola c=new Cola();
   public void mostrarMenu(){
      opc=Byte.parseByte(JOptionPane.
              showInputDialog(null,
            "***MENÚ PRINCIPAL***\n\n"
                    + "1.Encolar elemento\n"
                    + "2.Desencolar elemento\n"
                    + "3.Mostrar elementos\n"
                    + "4.Salir\n\n"
                    + "Digite su opción:"));
      switch(opc){
          case 1:{
             c.encolar();
             mostrarMenu();
             break;
          }
          case 2:{
             c.desencolar();
             mostrarMenu();
             break;
          }
          case 3:{
             c.mostrarElementos();
             mostrarMenu();
             break;
          }
          case 4:{
             System.exit(0);
             break;
          }
          default:{
             JOptionPane.showMessageDialog(null,
                     "¡Opción incorrecta!");
             mostrarMenu();
          }
      }
   }
    
    
}
