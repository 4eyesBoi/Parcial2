/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author estudiantes
 */
import java.util.LinkedList;
import java.util.List;

public class PlaybackQueue {
    private static PlaybackQueue instancia;
    private List<String> cola;

    private PlaybackQueue() {
        cola = new LinkedList<>();
    }

    public static PlaybackQueue getInstancia() {
        if (instancia == null) {
            instancia = new PlaybackQueue();
        }
        return instancia;
    }

    public void agregarCancion(String cancion) {
        cola.add(cancion);
        System.out.println("Añadido a la cola: " + cancion);
    }

    public void mostrarCola() {
        System.out.println("Cola actual:");
        for (String cancion : cola) {
            System.out.println("- " + cancion);
        }
    }

    public void limpiarCola() {
        cola.clear();
    }

    public List<String> getCola() {
        return cola;
    }
}

