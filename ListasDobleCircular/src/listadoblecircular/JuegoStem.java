package listadoblecircular;
public class JuegoStem {
   private String nombreJuego;  
   private double precio;
   
   public JuegoStem(){
      this.nombreJuego="";
      this.precio=0.00;
   }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
}
