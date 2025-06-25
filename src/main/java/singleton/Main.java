/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton;

/**
 *
 * @author estudiantes
 */


public class Main {
    public static void main(String[] args) {
        
        UserSession.iniciarSesion("david123");
        UserSession.iniciarSesion("juanito456"); 
        System.out.println("Usuario actual: " + UserSession.getInstancia().getNombreUsuario());

        
        MusicPlayer player = MusicPlayer.getInstancia();
        player.reproducir("Imagine - John Lennon");

        
        PlaybackQueue cola = PlaybackQueue.getInstancia();
        cola.agregarCancion("Just the Two of Us - Grover Washington Jr");
        cola.agregarCancion("Bohemian Rhapsody - Queen");
        cola.mostrarCola();

        
        VolumeManager volumen = VolumeManager.getInstancia();
        volumen.setVolumen(75);
        System.out.println("Volumen actual: " + volumen.getVolumen());

        
        System.out.println("\nVerificación de Singleton:");
        System.out.println("Volumen aún es: " + VolumeManager.getInstancia().getVolumen());
        System.out.println("Reproduciendo aún: " + MusicPlayer.getInstancia().getCancionActual());
    }
}

