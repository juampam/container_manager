package container_manager;
import java.util.Scanner;

public class Vista {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 3) {
            System.out.println("\nMenu:");
            System.out.println("1. Ver contenedores");
            System.out.println("2. Llenar un contenedor");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    controlador.verContenedores();
                    break;
                case 2:
                    System.out.print("Ingrese el ID del contenedor que desea llenar: ");
                    int contenedorId = scanner.nextInt();
                    controlador.llenarContenedor(contenedorId);
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo nuevamente.");
            }
        }

        scanner.close();
    }
}

