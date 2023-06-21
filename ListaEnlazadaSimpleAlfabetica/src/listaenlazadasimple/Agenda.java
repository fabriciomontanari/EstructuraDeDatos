package listaenlazadasimple;

public class Agenda {

    private int idContacto;
    private String nombre;
    private String telefono;

    public Agenda() {
        this.idContacto = 0;
        this.nombre = "";
        this.telefono = "";
    }

    public int getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
