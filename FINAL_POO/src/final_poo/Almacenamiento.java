package proyecto;

/*
 * @author s-vel
 */


public class Almacenamiento {
    private String tipo;
    private int size;

    public Almacenamiento(String tipo, int size) {
        this.tipo = tipo;
        this.size = size;
    }

    public String getTipo() {
        return tipo;
    }

    public int getSize() {
        return size;
    }
    
}
