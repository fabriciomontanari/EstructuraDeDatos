
package pilas01;

public class Dato {
    private int codProducto;
    private String descrip;
    private double precio;
    
    public Dato(){
        this.codProducto=0;
        this.descrip="";
        this.precio=0.00;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
