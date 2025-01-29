import java.util.Scanner;

/**
 * 
 * @autor diego
 */
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String contrasena;
    private String rol; 
    private ArrayList<Libro> librosPrestados;

    public Usuario(String nombre, String contrasena, String rol) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.rol = rol;
        this.librosPrestados = new ArrayList<>();
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getRol() {
        return rol;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    
    public static void registrarUsuario(ArrayList<Usuario> usuarios, Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario.getNombre());
    }

    public static void consultarUsuarios(ArrayList<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println("Usuario: " + usuario.getNombre() + " - Rol: " + usuario.getRol());
        }
    }

    
    public void prestarLibro(Libro libro) {
        if (libro.isDisponible()) {
            librosPrestados.add(libro);
            libro.setDisponible(false);
            System.out.println("Préstamo realizado: " + libro.getTitulo());
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.remove(libro)) {
            libro.setDisponible(true);
            System.out.println("Devolución realizada: " + libro.getTitulo());
        } else {
            System.out.println("El libro no pertenece a tus préstamos.");
        }
    }
}

