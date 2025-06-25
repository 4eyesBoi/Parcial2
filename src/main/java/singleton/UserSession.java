/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author estudiantes
 */
public class UserSession {
    private static UserSession instancia;
    private String nombreUsuario;

    private UserSession(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public static UserSession iniciarSesion(String nombreUsuario) {
        if (instancia == null) {
            instancia = new UserSession(nombreUsuario);
        } else {
            System.out.println("Ya hay una sesión activa con el usuario: " + instancia.getNombreUsuario());
        }
        return instancia;
    }

    public static void cerrarSesion() {
        instancia = null;
    }

    public static UserSession getInstancia() {
        return instancia;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
}
