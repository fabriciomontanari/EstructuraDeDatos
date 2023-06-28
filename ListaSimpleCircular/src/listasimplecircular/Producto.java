
package listasimplecircular;

public class Producto {
    private int idProducto;
    private String descripcion;
    private double precio;
    
    public Producto(){
        this.idProducto=0;
        this.descripcion="";
        this.precio=0.00;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
