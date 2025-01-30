import java.util.Scanner;

/**
 * 
 * @autor Diego
 */

public class Usuario {
    private String nombre;
    private String contrasena;
    private String rol; 
    private Libro[] librosPrestados;
    private int numLibrosPrestados;

    public Usuario(String nombre, String contrasena, String rol) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.rol = rol;
        this.librosPrestados = new Libro[100]; 
        this.numLibrosPrestados = 0;
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

    public Libro[] getLibrosPrestados() {
        return librosPrestados;
    }

    
    public static int registrarUsuario(Usuario[] usuarios, int cantidadUsuarios, Usuario usuario) {
        if (cantidadUsuarios < usuarios.length) {
            usuarios[cantidadUsuarios] = usuario;
            System.out.println("Usuario registrado: " + usuario.getNombre());
            return cantidadUsuarios + 1;
        } else {
            System.out.println("No hay espacio para más usuarios.");
            return cantidadUsuarios;
        }
    }

    public static void consultarUsuarios(Usuario[] usuarios, int numUsuarios) {
        for (int i = 0; i < numUsuarios; i++) {
            System.out.println("Usuario: " + usuarios[i].getNombre() + " - Rol: " + usuarios[i].getRol());
        }
    }

    
    public void prestarLibro(Libro libro) {
        if (libro.isDisponible() && numLibrosPrestados < librosPrestados.length) {
            librosPrestados[numLibrosPrestados++] = libro;
            libro.setDisponible(false);
            System.out.println("Préstamo realizado: " + libro.getTitulo());
        } else {
            System.out.println("El libro no está disponible o has alcanzado el límite de préstamos.");
        }
    }

    public void devolverLibro(Libro libro) {
        boolean encontrado = false;
        for (int i = 0; i < numLibrosPrestados; i++) {
            if (librosPrestados[i] == libro) {
                
                for (int j = i; j < numLibrosPrestados - 1; j++) {
                    librosPrestados[j] = librosPrestados[j + 1];
                }
                numLibrosPrestados--;
                libro.setDisponible(true);
                System.out.println("Devolución realizada: " + libro.getTitulo());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El libro no pertenece a tus préstamos.");
        }
    }


    
}