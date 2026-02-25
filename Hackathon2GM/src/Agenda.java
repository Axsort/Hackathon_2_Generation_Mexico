import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;
    private int capacidadMaxima;

    public Agenda(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.contactos = new ArrayList<>();
    }

    
    public void añadirContacto(String nombre, String telefono) {
        if (agendaLlena()) {
            System.out.println("La agenda está llena. No se pueden añadir más contactos.");
            return;
        }
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El contacto '" + nombre + "' ya existe en la agenda.");
                return;
            }
        }
        contactos.add(new Contacto(nombre, telefono));
        System.out.println("Contacto añadido correctamente.");
    }

    
    public void eliminarContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                contactos.remove(c);
                System.out.println("Contacto eliminado.");
                return;
            }
        }
        System.out.println("No se encontró el contacto '" + nombre + "'.");
    }

    
    public Contacto buscarContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

   
    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
        } else {
            for (Contacto c : contactos) {
                System.out.println(c); 
            }
        }
    }

    
    public boolean agendaLlena() {
        return contactos.size() >= capacidadMaxima;
    }

    
    public int espaciosLibres() {
        return capacidadMaxima - contactos.size();
        
    }
}
