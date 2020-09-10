package final_poo;

/*
 * @author s-vel
 */


public class Ventilacion extends Producto{
    private String tipo;

    public Ventilacion(String tipo, String tipoComputador, String fabricante, double precio) {
        super(tipoComputador, fabricante, precio);
        super.tipoComputador = "Escritorio";
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }    
}
