package es.tienda.modelos;

import java.util.ArrayList;

import org.iesalandalus.programacion.utilidades.Entrada;

/**
 * Clase principal de la aplicación.
 * <p>Gestiona la creación y visualización de clientes, proveedores y artículos.</p>
 */
public class Principal {

    private static final int NUM_CLIENTES = 1;
    private static final int NUM_PROVEEDORES = 2;
    private static final int NUM_ARTICULOS = 2;

    /**
     * Método principal de la aplicación.
     *
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        ArrayList<Articulos> articulos = new ArrayList<>();

        crearClientes(clientes);

        crearProveedores(proveedores);

        crearArticulos(articulos);

        mostrarDatos(clientes, proveedores, articulos);
    }

    /**
     * Crea clientes mediante entrada por teclado.
     *
     * @param clientes Lista donde se añaden los clientes
     */
    private static void crearClientes(ArrayList<Cliente> clientes) {
        System.out.println("=== CREACIÓN DE CLIENTES ===");
        for (int i = 1; i <= NUM_CLIENTES; i++) {
            System.out.println("\nCliente #" + i);
            System.out.print("Nombre: ");
            String nombre = Entrada.cadena();
            System.out.print("Apellidos: ");
            String apellidos = Entrada.cadena();
            System.out.print("DNI: ");
            String dni = Entrada.cadena();
            System.out.print("Tipo Cliente (POTENCIAL, NUEVO, VIP, MOROSO): ");
            String tipoStr = Entrada.cadena().toUpperCase();
            Cliente.TipoCliente tipo = Cliente.TipoCliente.valueOf(tipoStr);

            Cliente cliente = Cliente.darDeAlta(nombre, apellidos, dni, tipo);
            clientes.add(cliente);
        }
    }

    /**
     * Crea proveedores mediante entrada por teclado.
     *
     * @param proveedores Lista donde se añaden los proveedores
     */
    private static void crearProveedores(ArrayList<Proveedor> proveedores) {
        System.out.println("\n=== CREACIÓN DE PROVEEDORES ===");
        for (int i = 1; i <= NUM_PROVEEDORES; i++) {
            System.out.println("\nProveedor #" + i);
            System.out.print("Nombre: ");
            String nombre = Entrada.cadena();
            System.out.print("Apellidos: ");
            String apellidos = Entrada.cadena();
            System.out.print("DNI: ");
            String dni = Entrada.cadena();
            System.out.print("Tipo Proveedor (SERVICIO, RECURSOS, FABRICANTE): ");
            String tipoStr = Entrada.cadena().toUpperCase();
            Proveedor.TipoProveedor tipo = Proveedor.TipoProveedor.valueOf(tipoStr);

            Proveedor proveedor = Proveedor.darDeAlta(nombre, apellidos, dni, tipo);
            proveedores.add(proveedor);
        }
    }

    /**
     * Crea artículos mediante entrada por teclado.
     *
     * @param articulos Lista donde se añaden los artículos
     */
    private static void crearArticulos(ArrayList<Articulos> articulos) {
        System.out.println("\n=== CREACIÓN DE ARTÍCULOS ===");
        for (int i = 1; i <= NUM_ARTICULOS; i++) {
            System.out.println("\nArtículo #" + i);
            System.out.print("Código: ");
            String codigo = Entrada.cadena();
            System.out.print("Descripción: ");
            String descripcion = Entrada.cadena();
            System.out.print("Precio: ");
            double precio = Entrada.realDoble();

            Articulos articulo = new Articulos();
            articulo = articulo.alta(codigo, descripcion, precio);
            articulos.add(articulo);
        }
    }

    /**
     * Muestra los datos de clientes, proveedores y artículos.
     *
     * @param clientes    Lista de clientes
     * @param proveedores Lista de proveedores
     * @param articulos   Lista de artículos
     */
    private static void mostrarDatos(ArrayList<Cliente> clientes, ArrayList<Proveedor> proveedores, ArrayList<Articulos> articulos) {
        System.out.println("\n\n=== VISUALIZACIÓN DE DATOS CREADOS ===");

        System.out.println("\n--- LISTA DE CLIENTES ---");
        for (Cliente cliente : clientes) {
            cliente.mostrarDatos();
            System.out.println();
        }

        System.out.println("\n--- LISTA DE PROVEEDORES ---");
        for (Proveedor proveedor : proveedores) {
            proveedor.mostrarDatos();
            System.out.println();
        }

        System.out.println("\n--- LISTA DE ARTÍCULOS ---");
        for (Articulos articulo : articulos) {
            articulo.visualizarDatos();
        }
    }
}
