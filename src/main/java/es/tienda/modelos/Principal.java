package es.tienda.modelos;

import java.util.ArrayList;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        ArrayList<Articulos> articulos = new ArrayList<>();

        System.out.println("=== CREACIÓN DE CLIENTES ===");
        for (int i = 1; i <= 4; i++) {
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

        System.out.println("\n=== CREACIÓN DE PROVEEDORES ===");
        for (int i = 1; i <= 3; i++) {
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

        System.out.println("\n=== CREACIÓN DE ARTÍCULOS ===");
        for (int i = 1; i <= 2; i++) {
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
