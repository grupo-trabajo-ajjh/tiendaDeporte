package es.tienda.modelos;

public class Cliente extends Persona {

    public enum TipoCliente {
        POTENCIAL,
        NUEVO,
        VIP,
        MOROSO
    }

    private TipoCliente tipoCliente;

    public Cliente(String nombre, String apellidos, String dni, TipoCliente tipoCliente) {
        super(nombre, apellidos, dni);
        this.tipoCliente = tipoCliente;
    }

    public TipoCliente getTipoCliente() { return tipoCliente; }
    public void setTipoCliente(TipoCliente tipoCliente) { this.tipoCliente = tipoCliente; }

    public static Cliente darDeAlta(String nombre, String apellidos, String dni, TipoCliente tipoCliente) {
        return new Cliente(nombre, apellidos, dni, tipoCliente);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Cliente: " + getNombre() + " " + getApellidos());
        System.out.println("DNI: " + getDni());
        System.out.println("Tipo Cliente: " + tipoCliente);
    }
}
    
