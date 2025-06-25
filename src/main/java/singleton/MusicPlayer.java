/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author estudiantes
 */
public class MusicPlayer {
    private static MusicPlayer instancia;
    private String cancionActual;

    private MusicPlayer() {}

    public static MusicPlayer getInstancia() {
        if (instancia == null) {
            instancia = new MusicPlayer();
        }
        return instancia;
    }

    public void reproducir(String cancion) {
        this.cancionActual = cancion;
        System.out.println("Reproduciendo: " + cancion);
    }

    public void detener() {
        System.out.println("Reproducción detenida.");
        this.cancionActual = null;
    }

    public String getCancionActual() {
        return cancionActual;
    }
}

