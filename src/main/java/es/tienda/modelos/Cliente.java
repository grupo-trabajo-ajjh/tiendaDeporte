package es.tienda.modelos;

public class Cliente extends Persona {

    public enum TipoCliente {
        POTENCIAL,
        NUEVO,
        VIP,
        MOROSO
    }

    private String email;
    private String direccion;
    private TipoCliente tipoCliente;

    public Cliente(String nombre, String apellidos, String dni, String email, String direccion, TipoCliente tipoCliente) {
        super(nombre, apellidos, dni);
        this.tipoCliente = tipoCliente;
    }

    public TipoCliente getTipoCliente() { return tipoCliente; }
    public void setTipoCliente(TipoCliente tipoCliente) { this.tipoCliente = tipoCliente; }

    @Override
    public void mostrarDatos() {
        System.out.println("Cliente: " + getNombre() + " " + getApellidos());
        System.out.println("DNI: " + getDni());
        System.out.println("Tipo Cliente: " + tipoCliente);
    }
}
    
