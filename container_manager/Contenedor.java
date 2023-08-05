package container_manager;
import java.util.Random;

public class Contenedor {
    private static int lastId = 0;
    private int id;
    private float altura;
    private float profundidad;
    private float peso;
    private boolean empty;

    public Contenedor(float altura, float profundidad) {
        this.id = ++lastId;
        this.altura = altura;
        this.profundidad = profundidad;
        this.empty = false;
        this.peso = 2300;
    }

    public int getId() {
        return id;
    }

    public float getAltura() {
        return altura;
    }

    public float getProfundidad() {
        return profundidad;
    }

    public float getPeso() {
        return peso;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public void fillContainer() {
        if (!empty) {
            Random rand = new Random();
            int randomWeight = rand.nextInt(5000); // Generate a random weight between 0 and 4999
            if (peso + randomWeight <= 325000) {
                peso += randomWeight;
            }
        }
    }

    @Override
    public String toString() {
        return "Contenedor " + id + " - Empty: " + empty;
    }
}

