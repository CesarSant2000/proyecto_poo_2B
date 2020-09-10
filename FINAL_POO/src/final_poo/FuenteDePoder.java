package final_poo;

/*
 * @author s-vel
 */


public class FuenteDePoder extends Producto{
    private String tipo;

    public FuenteDePoder(String tipo, String TIPO_COMPUTADOR, String fabricante, double precio) {
        super(TIPO_COMPUTADOR, fabricante, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
}
