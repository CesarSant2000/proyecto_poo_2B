package proyecto;

/**
 *
 * @author s-vel
 */


public class Producto {
    String tipoComputador;
    String fabricante;
    private double precio;

    public Producto(String tipoComputador, String fabricante, double precio) {
        this.tipoComputador = tipoComputador;
        this.fabricante = fabricante;
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
    
    
}
