import java.util.ArrayList;
import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private String categoria;
    private boolean disponible;



/*CONSTRUCTOR POR DEFECTO */

Libro(){
    titulo="";
    autor="";
    categoria="";
   

}
/*CONSTRUCTOR PARAMETRIZADO */

public Libro(String titulo, String autor, String categoria) {
    this.titulo = titulo;
    this.autor = autor;
    this.categoria = categoria;
    this.disponible = true; 
}


/*GETTERS */

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





/*SETTERS */

public void setTitulo(String titulo){
    this.titulo=titulo;
}

public void setAutor(String autor){
    this.autor=autor;
}

public void setCategoria(String categoria){
    this.categoria=categoria;
}

public void setDisponible(boolean disponible) {
    this.disponible = disponible;
}



/*METODOS */
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






