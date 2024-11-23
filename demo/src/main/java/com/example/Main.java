/* package com.example;

import com.example.Entidad.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");

    public static void main(String[] args) {
        // Registrar un nuevo cliente
        registrarCliente("Johan Sanchez", "johan.sanchez@example.com", "123456789");
        
        Cliente cliente = consultarCliente(1L); 
        if (cliente != null) {
            System.out.println("Cliente encontrado:");
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("Teléfono: " + cliente.getTelefono());
        } else {
            System.out.println("Cliente no encontrado.");
        }

        emf.close();
    }

    public static void registrarCliente(String nombre, String email, String telefono) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setEmail(email);
        cliente.setTelefono(telefono);
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
        System.out.println("Cliente registrado con éxito.");
    }

    public static Cliente consultarCliente(Long id) {
        EntityManager em = emf.createEntityManager();
        Cliente cliente = em.find(Cliente.class, id);
        em.close();
        return cliente;
    }
} */

package com.example;

import com.example.Entidad.Producto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");

    public static void main(String[] args) {
        // Registrar un nuevo producto
        registrarProducto("samsungA50", 750.50, 10);

        Producto producto = consultarProducto(1L);
        if (producto != null) {
            System.out.println("Producto encontrado:");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Cantidad en Stock: " + producto.getCantidadEnStock());
        } else {
            System.out.println("Producto no encontrado.");
        }

        emf.close();
    }

    public static void registrarProducto(String nombre, double precio, int cantidadEnStock) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        producto.setCantidadEnStock(cantidadEnStock);
        em.persist(producto);
        em.getTransaction().commit();
        em.close();
        System.out.println("Producto registrado con éxito.");
    }

    public static Producto consultarProducto(Long id) {
        EntityManager em = emf.createEntityManager();
        Producto producto = em.find(Producto.class, id);
        em.close();
        return producto;
    }
}

