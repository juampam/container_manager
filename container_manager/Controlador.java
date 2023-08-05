package container_manager;
import java.util.Random;

public class Controlador {
    private Contenedor contenedor1;
    private Contenedor contenedor2;
    private Contenedor contenedor3;
    private Contenedor contenedor4;
    private Contenedor contenedor5;

    public Controlador() {
        contenedor1 = new Contenedor(10.0f, 20.0f);
        contenedor2 = new Contenedor(15.0f, 25.0f);
        contenedor3 = new Contenedor(12.0f, 22.0f);
        contenedor4 = new Contenedor(8.0f, 18.0f);
        contenedor5 = new Contenedor(14.0f, 28.0f);
    }

    public void llenarContenedor(int contenedorId) {
        Contenedor contenedor = getContenedorById(contenedorId);
        if (contenedor != null) {
            contenedor.setEmpty(true);
            contenedor.fillContainer();
        }
    }

    public void verContenedores() {
        System.out.println(contenedor1);
        System.out.println(contenedor2);
        System.out.println(contenedor3);
        System.out.println(contenedor4);
        System.out.println(contenedor5);
    }

    private Contenedor getContenedorById(int contenedorId) {
        switch (contenedorId) {
            case 1:
                return contenedor1;
            case 2:
                return contenedor2;
            case 3:
                return contenedor3;
            case 4:
                return contenedor4;
            case 5:
                return contenedor5;
            default:
                System.out.println("Contenedor ID not found.");
                return null;
        }
    }
}

