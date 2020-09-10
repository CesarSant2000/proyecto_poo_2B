package final_poo;

import java.util.LinkedList;

/*
 * @author s-vel
 */
public class Tiendas {
    String nombre;
    String provincia;
    String ciudad;
    LinkedList<Producto> productos;
    
    public Tiendas(String nombre, String provincia, String ciudad, LinkedList<Producto> productos) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.productos = productos;
    }
    
    public static double totalFactura(LinkedList<Producto> productosComprados){
        double total = 0;
        for (Producto productoComprado : productosComprados) {
            total += productoComprado.getPrecio();
        }
        return total;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }   
    
}
