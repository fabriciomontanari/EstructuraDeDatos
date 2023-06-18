package cola01;

public class Pasajero {
    private String nombre;
    private String destino;
    private double costo;
    
    public Pasajero(){
        this.nombre="";
        this.destino="";
        this.costo=0.00;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
}
