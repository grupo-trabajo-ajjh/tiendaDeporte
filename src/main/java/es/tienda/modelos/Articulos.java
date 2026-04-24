package es.tienda.modelos;

/**
 * Representa un artículo de la tienda.
 * <p>Contiene código, descripción y precio.</p>
 */
public class Articulos {

    private String codigo;
    private String descripcion;
    private double precio;

    /**
     * Constructor por defecto.
     */
    public Articulos() {
        this.codigo = "";
        this.descripcion = "";
        this.precio = 0.0;
    }

    /**
     * Constructor con parámetros.
     * @param codigo Código del artículo
     * @param descripcion Descripción del artículo
     * @param precio Precio del artículo
     */
    public Articulos(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    /**
     * Obtiene el código.
     * @return Código del artículo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece el código.
     * @param codigo Nuevo código
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene la descripción.
     * @return Descripción del artículo
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción.
     * @param descripcion Nueva descripción
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el precio.
     * @return Precio del artículo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio.
     * @param precio Nuevo precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Visualiza los datos del artículo.
     */
    public void visualizarDatos() {
        System.out.println("\n--- Datos del Artículo ---");
        System.out.println("Código:      " + this.codigo);
        System.out.println("Descripción: " + this.descripcion);
        System.out.println("Precio:      $" + this.precio);
        System.out.println("--------------------------");
    }

    /**
     * Da de alta un nuevo artículo.
     * @param codigo Código del artículo
     * @param descripcion Descripción del artículo
     * @param precio Precio del artículo
     * @return Nueva instancia de Articulos
     */
    public Articulos alta(String codigo, String descripcion, double precio) {
        Articulos nuevoArticulo = new Articulos(codigo, descripcion, precio);
        System.out.println("Articulo dado de alta correctamente");
        nuevoArticulo.visualizarDatos();
        return nuevoArticulo;
    }
}
