package es.tienda.modelos;

/**
 * Representa un cliente de la tienda.
 * <p>Extiende de Persona y añade un tipo de cliente.</p>
 */
public class Cliente extends Persona {

    /**
     * Tipos de cliente disponibles.
     */
    public enum TipoCliente {
        POTENCIAL,
        NUEVO,
        VIP,
        MOROSO
    }

    private TipoCliente tipoCliente;

    /**
     * Constructor de Cliente.
     * @param nombre Nombre del cliente
     * @param apellidos Apellidos del cliente
     * @param dni DNI del cliente
     * @param tipoCliente Tipo de cliente
     */
    public Cliente(String nombre, String apellidos, String dni, TipoCliente tipoCliente) {
        super(nombre, apellidos, dni);
        this.tipoCliente = tipoCliente;
    }

    /**
     * Obtiene el tipo de cliente.
     * @return Tipo de cliente
     */
    public TipoCliente getTipoCliente() { return tipoCliente; }

    /**
     * Establece el tipo de cliente.
     * @param tipoCliente Nuevo tipo de cliente
     */
    public void setTipoCliente(TipoCliente tipoCliente) { this.tipoCliente = tipoCliente; }

    /**
     * Da de alta un nuevo cliente.
     * @param nombre Nombre del cliente
     * @param apellidos Apellidos del cliente
     * @param dni DNI del cliente
     * @param tipoCliente Tipo de cliente
     * @return Nueva instancia de Cliente
     */
    public static Cliente darDeAlta(String nombre, String apellidos, String dni, TipoCliente tipoCliente) {
        return new Cliente(nombre, apellidos, dni, tipoCliente);
    }

    /**
     * Muestra los datos del cliente.
     */
    @Override
    public void mostrarDatos() {
        System.out.println("Cliente: " + getNombre() + " " + getApellidos());
        System.out.println("DNI: " + getDni());
        System.out.println("Tipo Cliente: " + tipoCliente);
    }
}
