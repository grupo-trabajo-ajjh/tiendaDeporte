package es.tienda.modelos;


public class Proveedor extends Persona {
    public enum TipoProveedor {
        SERVICIO,
        RECURSOS,
        FABRICANTE
    }

    private TipoProveedor tipoProveedor;

    public Proveedor(String nombre, String apellidos, String dni, TipoProveedor tipoProveedor) {
        super(nombre, apellidos, dni);
        this.tipoProveedor = tipoProveedor;
    }

    public Proveedor(String nombre, String apellidos, String dni) {
        this(nombre, apellidos, dni, TipoProveedor.SERVICIO);
    }

    public Proveedor() {
        this("", "", "", TipoProveedor.SERVICIO);
    }

    public TipoProveedor getTipoProveedor() {
        return tipoProveedor;
    }

    public void setTipoProveedor(TipoProveedor tipoProveedor) {
        this.tipoProveedor = tipoProveedor;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Proveedor: " + getNombre() + " " + getApellidos());
        System.out.println("DNI: " + getDni());
        System.out.println("Tipo: " + tipoProveedor);
    }
}
