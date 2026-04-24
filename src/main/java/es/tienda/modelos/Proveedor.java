package es.tienda.modelos;


public class Proveedor extends Persona {


    public Proveedor(String nombre, String apellidos, String dni, String nombreEmpresa, String telefono) {
        super(nombre, apellidos, dni);

    }
    @Override
    public void mostrarDatos() {
        System.out.println("Proveedor: " + getNombre() + " " + getApellidos());
        System.out.println("DNI: " + getDni());
    }
}
