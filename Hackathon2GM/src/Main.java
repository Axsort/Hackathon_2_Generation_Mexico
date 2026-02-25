<<<<<<< HEAD
=======
import java.util.Scanner;

>>>>>>> 1a9ba602f3b6fc78dd50891ac3ef2cc46ca6ad5c
public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(10);
        Menu menu = new Menu();
        int opcion = 0;

<<<<<<< HEAD
        java.util.Scanner sc = new java.util.Scanner(System.in);
=======
        Scanner sc = new Scanner(System.in);
>>>>>>> 1a9ba602f3b6fc78dd50891ac3ef2cc46ca6ad5c

        while (opcion != 5) {
            menu.mostrarMenu();
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
<<<<<<< HEAD
            
            sc.nextLine(); 
            menu.ejecutarOpcion(opcion, agenda);
        }
    }
}
=======
            sc.nextLine(); 
            menu.ejecutarOpcion(opcion, agenda);
        }//While
        sc.close();
    }//main
}//Class main
>>>>>>> 1a9ba602f3b6fc78dd50891ac3ef2cc46ca6ad5c
