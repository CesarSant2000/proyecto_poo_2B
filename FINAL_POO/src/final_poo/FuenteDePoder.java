package final_poo;

/*
 * @author s-vel
 */


public class FuenteDePoder extends Producto{
    private String tipo;

    public FuenteDePoder(String tipo, String tipoComputador, String fabricante, String tienda, double precio) {
        super(tipoComputador, fabricante, tienda, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    @Override
    public String toString() {
        return "Producto: Fuente de poder\nTipo: "+tipo+"\nMarca: "+super.getFabricante()
                +"\nPrecio: "+super.getPrecio()+"\nTienda: "+super.getTienda()
                +"\nPara: "+super.tipoComputador+"\n\n";
    }
    
}
