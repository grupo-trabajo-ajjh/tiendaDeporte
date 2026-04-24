package es.tienda.modelos;

/**
 * Representa un proveedor de la tienda.
 * <p>Extiende de Persona y añade un tipo de proveedor.</p>
 */
public class Proveedor extends Persona {
    /**
     * Tipos de proveedor disponibles.
     */
    public enum TipoProveedor {
        SERVICIO,
        RECURSOS,
        FABRICANTE
    }

    private TipoProveedor tipoProveedor;

    /**
     * Constructor con tipo de proveedor.
     * @param nombre Nombre del proveedor
     * @param apellidos Apellidos del proveedor
     * @param dni DNI del proveedor
     * @param tipoProveedor Tipo de proveedor
     */
    public Proveedor(String nombre, String apellidos, String dni, TipoProveedor tipoProveedor) {
        super(nombre, apellidos, dni);
        this.tipoProveedor = tipoProveedor;
    }

    /**
     * Constructor con tipo por defecto SERVICIO.
     * @param nombre Nombre del proveedor
     * @param apellidos Apellidos del proveedor
     * @param dni DNI del proveedor
     */
    public Proveedor(String nombre, String apellidos, String dni) {
        this(nombre, apellidos, dni, TipoProveedor.SERVICIO);
    }

    /**
     * Constructor por defecto.
     */
    public Proveedor() {
        this("", "", "", TipoProveedor.SERVICIO);
    }

    /**
     * Obtiene el tipo de proveedor.
     * @return Tipo de proveedor
     */
    public TipoProveedor getTipoProveedor() {
        return tipoProveedor;
    }

    /**
     * Establece el tipo de proveedor.
     * @param tipoProveedor Nuevo tipo de proveedor
     */
    public void setTipoProveedor(TipoProveedor tipoProveedor) {
        this.tipoProveedor = tipoProveedor;
    }

    /**
     * Muestra los datos del proveedor.
     */
    @Override
    public void mostrarDatos() {
        System.out.println("Proveedor: " + getNombre() + " " + getApellidos());
        System.out.println("DNI: " + getDni());
        System.out.println("Tipo: " + tipoProveedor);
    }

    /**
     * Da de alta un nuevo proveedor.
     * @param nombre Nombre del proveedor
     * @param apellidos Apellidos del proveedor
     * @param dni DNI del proveedor
     * @param tipoProveedor Tipo de proveedor
     * @return Nueva instancia de Proveedor
     */
    public static Proveedor darDeAlta(String nombre, String apellidos, String dni, TipoProveedor tipoProveedor) {
        Proveedor nuevoProveedor = new Proveedor(nombre, apellidos, dni, tipoProveedor);
        System.out.println("Proveedor dado de alta correctamente:");
        nuevoProveedor.mostrarDatos();
        return nuevoProveedor;
    }
}
