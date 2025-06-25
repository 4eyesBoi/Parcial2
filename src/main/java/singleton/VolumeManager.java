/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author estudiantes
 */
public class VolumeManager {
    private static VolumeManager instancia;
    private int volumen; 

    private VolumeManager() {
        volumen = 50; 
    }

    public static VolumeManager getInstancia() {
        if (instancia == null) {
            instancia = new VolumeManager();
        }
        return instancia;
    }

    public void setVolumen(int valor) {
        if (valor >= 0 && valor <= 100) {
            volumen = valor;
            System.out.println("Volumen ajustado a: " + volumen);
        } else {
            System.out.println("Valor inválido de volumen.");
        }
    }

    public int getVolumen() {
        return volumen;
    }
}
