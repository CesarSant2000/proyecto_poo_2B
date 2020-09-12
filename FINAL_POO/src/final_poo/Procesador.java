package final_poo;

/*
 * @author s-vel
 */


public class Procesador extends Producto{
    private String modelo;

    public Procesador(String modelo, String tipoComputador, String fabricante, String tienda, double precio) {
        super(tipoComputador, fabricante, tienda, precio);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    } 
    
    @Override
    public String toString() {
        return "Producto: Procesador\nModelo: "+modelo+"\nTipo: "+super.getFabricante()
                +"\nPrecio: "+super.getPrecio()+"\nTienda: "+super.getTienda()
                +"\nPara: "+super.tipoComputador+"\n\n";
    }
}
