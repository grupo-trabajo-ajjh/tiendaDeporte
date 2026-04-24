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
        this.email = email;
        this.direccion = direccion;
        this.tipoCliente = tipoCliente;
    }

    public Cliente(String nombre, String apellidos, String dni, TipoCliente tipoCliente) {
        super(nombre, apellidos, dni);
        this.tipoCliente = tipoCliente;
        this.email = "";
        this.direccion = "";
    }

    public Cliente(String nombre, String apellidos, String dni, String email, String direccion) {
        super(nombre, apellidos, dni);
        this.email = email;
        this.direccion = direccion;
        this.tipoCliente = TipoCliente.POTENCIAL;
    }

    public Cliente(String nombre, String apellidos, String dni) {
        super(nombre, apellidos, dni);
        this.email = "";
        this.direccion = "";
        this.tipoCliente = TipoCliente.POTENCIAL;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public TipoCliente getTipoCliente() { return tipoCliente; }
    public void setTipoCliente(TipoCliente tipoCliente) { this.tipoCliente = tipoCliente; }

    @Override
    public void mostrarDatos() {
        System.out.println("Cliente: " + getNombre() + " " + getApellidos());
        System.out.println("DNI: " + getDni());
        System.out.println("Email: " + email);
        System.out.println("Dirección: " + direccion);
        System.out.println("Tipo Cliente: " + tipoCliente);
    }
}
    
