package final_poo;

/*
 * @author s-vel
 */


public class Ventilacion extends Producto{
    private String tipo;

    public Ventilacion(String tipo, String tipoComputador, String fabricante, String tienda, double precio) {
        super(tipoComputador, fabricante, tienda, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    } 
    
    @Override
    public String toString() {
        return "Producto: Ventilacion\nTipo: "+tipo+"\nMarca: "+super.getFabricante()
                +"\nPrecio: "+super.getPrecio()+"\nTienda: "+super.getTienda()
                +"\nPara: "+super.tipoComputador+"\n\n";
    }
}
