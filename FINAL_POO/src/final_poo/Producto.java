package final_poo;

/*
 * @author s-vel
 */
public class Producto {

    String tipoComputador;
    String fabricante;
    private String tienda;
    private double precio;

    public Producto(String tipoComputador, String fabricante, String tienda, double precio) {
        this.tipoComputador = tipoComputador;
        this.fabricante = fabricante;
        this.tienda = tienda;
        this.precio = precio;
    }
    
    public String getTipoComputador() {
        return tipoComputador;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTienda() {
        return tienda;
    }
}
