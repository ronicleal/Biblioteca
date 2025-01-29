import java.util.ArrayList;

public class Libro {
    private String titulo;
    private String autor;
    private String categoria;
    private boolean disponible;

    public Libro(String titulo, String autor, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponible = true; 
    }

    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    
    public static void agregarLibro(ArrayList<Libro> libros, Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    public static void eliminarLibro(ArrayList<Libro> libros, String titulo) {
        libros.removeIf(libro -> libro.getTitulo().equalsIgnoreCase(titulo));
        System.out.println("Libro eliminado: " + titulo);
    }

    public static void buscarLibro(ArrayList<Libro> libros, String criterio) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(criterio) ||
                libro.getAutor().equalsIgnoreCase(criterio) ||
                libro.getCategoria().equalsIgnoreCase(criterio)) {
                System.out.println("Encontrado: " + libro.getTitulo() + " - " + libro.getAutor());
            }
        }
    }

    public static void mostrarLibros(ArrayList<Libro> libros) {
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor() +
                               " (" + (libro.isDisponible() ? "Disponible" : "Prestado") + ")");
        }
    }
}