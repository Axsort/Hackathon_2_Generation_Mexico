public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(10);
        Menu menu = new Menu();
        int opcion = 0;

        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (opcion != 5) {
            menu.mostrarMenu();
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            
            sc.nextLine(); 
            menu.ejecutarOpcion(opcion, agenda);
        }
    }
}
