import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("1. Añadir contacto");
        System.out.println("2. Eliminar contacto");
        System.out.println("3. Buscar contacto");
        System.out.println("4. Mostrar todos");
        System.out.println("5. Espacio en agenda");
        System.out.println("6. Salir");
    }

    public void ejecutarOpcion(int opcion, Agenda agenda) {
        switch(opcion) {
            case 1:
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Teléfono: ");
                String telefono = sc.nextLine();
                agenda.añadirContacto(nombre, telefono);
                break;
            case 2:
                System.out.print("Nombre a eliminar: ");
                nombre = sc.nextLine();
                agenda.eliminarContacto(nombre);
                break;
            case 3:
                System.out.print("Nombre a buscar: ");
                nombre = sc.nextLine();
                Contacto c = agenda.buscarContacto(nombre);
                if (c != null) {
                    System.out.println("Encontrado: " + c);
                } else {
                    System.out.println("No existe ese contacto.");
                }
                break;
            case 4:
                agenda.mostrarContactos();
                break;
            case 5:
            	System.out.println("Tienes "+ agenda.espaciosLibres()+ " espacios libres en la agenda.");
            	break;
            case 6:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}
