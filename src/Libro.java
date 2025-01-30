

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

    public static int agregarLibro(Libro[] libros, int cantidadLibros, Libro libro) {
        if (cantidadLibros < libros.length) {
            libros[cantidadLibros] = libro;
            System.out.println("Libro agregado: " + libro.getTitulo());
            return cantidadLibros + 1;
        } else {
            System.out.println("No hay espacio para más libros.");
            return cantidadLibros;
        }
    }

    public static int eliminarLibro(Libro[] libros, int cantidadLibros, String titulo) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Libro eliminado: " + libros[i].getTitulo());
                for (int j = i; j < cantidadLibros - 1; j++) {
                    libros[j] = libros[j + 1];
                }
                libros[cantidadLibros - 1] = null;
                return cantidadLibros - 1;
            }
        }
        System.out.println("Libro no encontrado: " + titulo);
        return cantidadLibros;
    }

    public static void buscarLibro(Libro[] libros, String criterio) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(criterio) ||
                libro.getAutor().equalsIgnoreCase(criterio) ||
                libro.getCategoria().equalsIgnoreCase(criterio)) {
                System.out.println("Encontrado: " + libro.getTitulo() + " - " + libro.getAutor());
            }
        }
    }

    public static void mostrarLibros(Libro[] libros, int cantidadLibros) {
        for (int i = 0; i < cantidadLibros; i++) {
            System.out.println(libros[i].getTitulo() + " - " + libros[i].getAutor() +
                               " (" + (libros[i].isDisponible() ? "Disponible" : "Prestado") + ")");
       }
}


}				