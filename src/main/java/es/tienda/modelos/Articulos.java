package es.tienda.modelos;

public class Articulos {

    private String codigo;
    private String descripcion;
    private double precio;

    public Articulos() {
        this.codigo = "";
        this.descripcion = "";
        this.precio = 0.0;
    }

    public Articulos(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void visualizarDatos() {
        System.out.println("\n--- Datos del Artículo ---");
        System.out.println("Código:      " + this.codigo);
        System.out.println("Descripción: " + this.descripcion);
        System.out.println("Precio:      $" + this.precio);
        System.out.println("--------------------------");
    }

    public Articulos alta(String codigo, String descripcion, double precio) {
        Articulos nuevoArticulo = new Articulos(codigo, descripcion, precio);
        System.out.println("Articulo dado de alta correctamente");
        nuevoArticulo.visualizarDatos();
        return nuevoArticulo;
    }

}
