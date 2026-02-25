import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;
    private int capacidadMaxima;

    public Agenda(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.contactos = new ArrayList<>();
    }//Agenda

<<<<<<< HEAD
    
=======
>>>>>>> 1a9ba602f3b6fc78dd50891ac3ef2cc46ca6ad5c
    public void añadirContacto(String nombre, String telefono) {
        if (agendaLlena()) {
            System.out.println("La agenda está llena. No se pueden añadir más contactos.");
            return;
        }//primer if 
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El contacto '" + nombre + "' ya existe en la agenda.");
                return;
            }//segundo if xd
        }//for
        contactos.add(new Contacto(nombre, telefono));
        System.out.println("Contacto añadido correctamente.");
<<<<<<< HEAD
    }

=======
    }//añadirContacto
>>>>>>> 1a9ba602f3b6fc78dd50891ac3ef2cc46ca6ad5c
    
    public void eliminarContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                contactos.remove(c);
                System.out.println("Contacto eliminado.");
                return;
            }//if
        }//for
        System.out.println("No se encontró el contacto '" + nombre + "'.");
    }//eliminarContacto

    
    public Contacto buscarContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }//if
        }//for
        return null;
    }//buscarContacto

   
    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
        } else {
            for (Contacto c : contactos) {
<<<<<<< HEAD
                System.out.println(c); 
            }
        }
    }

    
=======
                System.out.println(c); // usa toString()
            }//for
        }//if Else
    }//mostrarContactos

>>>>>>> 1a9ba602f3b6fc78dd50891ac3ef2cc46ca6ad5c
    public boolean agendaLlena() {
        return contactos.size() >= capacidadMaxima;
    }//agendaLLena

<<<<<<< HEAD
    
    public int espaciosLibres() {
        return capacidadMaxima - contactos.size();
        
    }
}
=======
    public int espaciosLibres() {
        return capacidadMaxima - contactos.size();
    }//espaciosLibres
}//Class Agenda
>>>>>>> 1a9ba602f3b6fc78dd50891ac3ef2cc46ca6ad5c
