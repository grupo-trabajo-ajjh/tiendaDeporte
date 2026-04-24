package es.tienda.modelos;

/**
 * Clase base para todos los miembros de la organización.
 * <p>Representa una persona con nombre, apellidos y DNI.</p>
 */
public abstract class Persona {
    private String nombre;
    private String apellidos;
    private String dni;

    /**
     * Constructor de Persona.
     * @param nombre Nombre de la persona
     * @param apellidos Apellidos de la persona
     * @param dni DNI de la persona
     */
    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    /**
     * Obtiene el nombre.
     * @return Nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre.
     * @param nombre Nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene los apellidos.
     * @return Apellidos de la persona
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos.
     * @param apellidos Nuevos apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtiene el DNI.
     * @return DNI de la persona
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el DNI.
     * @param dni Nuevo DNI
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Muestra los datos de la persona.
     * <p>Debe ser implementado por las clases hijas.</p>
     */
    public abstract void mostrarDatos();
}
