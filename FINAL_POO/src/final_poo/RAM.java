package final_poo;

/**
 *
 * @author s-vel
 */


public class RAM extends Producto{
    private int size;
    private String type;
    private double NBFrequency;

    public RAM(int size, String type, double NBFrequency, String tipoComputador, String fabricante, double precio) {
        super(tipoComputador, fabricante, precio);
        this.size = size;
        this.type = type;
        this.NBFrequency = NBFrequency;
    }  
    
    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public double getNBFrequency() {
        return NBFrequency;
    }   
    
    @Override
    public String toString() {
        return "Producto: RAM\nTamaño: "+size+"GB\nTipo: "+type+"\nFrecuencia: "
                +NBFrequency+"\nMarca: "+super.getFabricante()+"\nPrecio: "
                +super.getPrecio()+"\nPara: "+super.tipoComputador+"\n\n";
    }
}
