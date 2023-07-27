package arbol01;
import javax.swing.JOptionPane;

public class Menu {

    private byte opc;
    private Arbol a = new Arbol();

    public void mostrarMenu() {
        opc = Byte.parseByte(JOptionPane.showInputDialog(null,
                "***MENÚ PRINCIPAL***\n\n"
                + "1.Agregar elemento\n"
                + "2.Mostrar árbol\n"
                + "3.Eliminar todo\n"
                + "4.Salir del sistema\n\n"
                + "Digite su opción:"));
        switch (opc) {
            case 1: {
                a.insertarRaiz();
                mostrarMenu();
                break;
            }
            case 2: {
                a.inOrden();
                mostrarMenu();
                break;
            }
            case 3: {
                a.eliminarTodo();
                mostrarMenu();
                break;
            }
            case 4: {
                System.exit(0);
                break;
            }
            default: {
            }
        }
    }
}
