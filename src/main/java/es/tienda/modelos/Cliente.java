package es.tienda.modelos;

public class Cliente extends Persona {

    public Cliente(String nombre, String apellidos, String dni, String email, String direccion) {
        super(nombre, apellidos, dni);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Cliente: " + getNombre() + " " + getApellidos());
        System.out.println("DNI: " + getDni());
    }
}
    
