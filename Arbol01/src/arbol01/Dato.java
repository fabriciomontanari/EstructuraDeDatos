package arbol01;

public class Dato {
    private String nombre;
    private double nota;
    
    public Dato(){
        this.nombre="";
        this.nota=0.00;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
}
