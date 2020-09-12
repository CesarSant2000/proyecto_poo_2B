package final_poo;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * @author s-vel
 */
public class Tiendas {
    
    private String nombre;
    private String provincia;
    private String ciudad;
    LinkedList<Producto> productos;
    
    public Tiendas(String nombre, String provincia, String ciudad, LinkedList<Producto> productos) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.productos = productos;
    }
    
    public static ArrayList<Producto> obtenerProductos(ArrayList<Tiendas> tiendas, String provincia, int producto, String caracteristica, String tipoComputador) {
        ArrayList<Producto> productosDeseados = new ArrayList<>();
        ArrayList<Tiendas> tiendasDeseadas = new ArrayList<>();

        for (Tiendas tienda : tiendas) {
            if (tienda.getProvincia().equalsIgnoreCase(provincia)) {
                tiendasDeseadas.add(tienda);
            }
        }

        switch (producto) {
            case 1:
                for (Tiendas tiendaDeseada : tiendasDeseadas) {
                    for (Producto producto1 : tiendaDeseada.getProductos()) {
                        if (producto1 instanceof RAM) {
                            try {
                                int capacidad = Integer.parseInt(caracteristica);
                                boolean deseable = ((RAM) producto1).getSize() == capacidad
                                        && (((RAM) producto1).tipoComputador.equalsIgnoreCase(tipoComputador)
                                        || ((RAM) producto1).tipoComputador.equalsIgnoreCase("ambas"));
                                if (deseable) {
                                    productosDeseados.add(producto1);
                                }
                            } catch (Exception e) {
                                System.err.println("Error en la capacidad RAM");
                                System.exit(1);
                            }
                        }
                    }
                }
                break;
            case 2:
                for (Tiendas tiendaDeseada : tiendasDeseadas) {
                    for (Producto producto1 : tiendaDeseada.getProductos()) {
                        if (producto1 instanceof Almacenamiento) {
                            boolean deseable = ((Almacenamiento) producto1).getTipo().equalsIgnoreCase(caracteristica)
                                    && (((Almacenamiento) producto1).tipoComputador.equalsIgnoreCase(tipoComputador)
                                    || ((Almacenamiento) producto1).tipoComputador.equalsIgnoreCase("ambas"));
                            if (deseable) {
                                productosDeseados.add(producto1);
                            }
                        }
                    }
                }
                break;
            case 3:
                for (Tiendas tiendaDeseada : tiendasDeseadas) {
                    for (Producto producto1 : tiendaDeseada.getProductos()) {
                        if (producto1 instanceof Procesador) {
                            try {
                                int ryzen = Integer.parseInt(caracteristica);
                                boolean deseable = ((Procesador) producto1).getModelo().equals(caracteristica)
                                        && (((Procesador) producto1).tipoComputador.equalsIgnoreCase(tipoComputador)
                                        || ((Procesador) producto1).tipoComputador.equalsIgnoreCase("ambas"));
                                if (deseable) {
                                    productosDeseados.add(producto1);
                                }
                            } catch (Exception e) {
                                if (((Procesador) producto1).getModelo().length() > 1) {
                                    String procesador = ((Procesador) producto1).getModelo().substring(0, 2);
                                    boolean deseable = procesador.equalsIgnoreCase(caracteristica)
                                        && (((Procesador) producto1).tipoComputador.equalsIgnoreCase(tipoComputador)
                                        || ((Procesador) producto1).tipoComputador.equalsIgnoreCase("ambas"));
                                    if (deseable) {
                                        productosDeseados.add(producto1);
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 4:
                for (Tiendas tiendaDeseada : tiendasDeseadas) {
                    for (Producto producto1 : tiendaDeseada.getProductos()) {
                        if (producto1 instanceof FuenteDePoder) {
                            String poderDeseado = caracteristica.substring(0, 1);
                            String poder = ((FuenteDePoder) producto1).getTipo().substring(0, 1);
                            boolean deseable = poder.equalsIgnoreCase(poderDeseado);
                            
                            if (deseable) {
                                productosDeseados.add(producto1);
                            }
                        }
                    }
                }
                break;
            case 5:
                for (Tiendas tiendaDeseada : tiendasDeseadas) {
                    for (Producto producto1 : tiendaDeseada.getProductos()) {
                        if (producto1 instanceof Ventilacion) {
                            if (caracteristica.equalsIgnoreCase("Liquida")) {
                                if (((Ventilacion) producto1).getTipo().equalsIgnoreCase("Liquida")) {
                                    productosDeseados.add(producto1);
                                }
                            } else {
                                if (!((Ventilacion) producto1).getTipo().equalsIgnoreCase("Liquida")) {
                                    productosDeseados.add(producto1);
                                }
                            }
                        }
                    }
                }
                break;
        }

        return productosDeseados;
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
