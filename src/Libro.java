import java.util.Scanner;

public class Libro {
    /*Agregar libros nuevos.(admin)
Eliminar libros existentes.(admin)
Buscar libros por título, autor o categoría.(todos)
Mostrar todos los libros disponibles.(todos) */

private String titulo;
private String autor;
private String categoria;
//private boolean prestado;


/*CONSTRUCTOR POR DEFECTO */

Libro(){
    titulo="";
    autor="";
    categoria="";
   

}
/*CONSTRUCTOR PARAMETRIZADO */

Libro(String titulo, String autor, String categoria){
    this.titulo=titulo;
    this.autor=autor;
    this.categoria=categoria;
   
}

/*GETTERS */

public String getTitulo(){
    return this.titulo;
}

public String getAutor(){
    return this.autor;
}

public String getCategoria(){
    return this.categoria;
}

//get de prestado


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

//set de prestado



/*MOSTRAR LIBROS */
@Override
public String toString(){
    return "Titulo: " + titulo + ", Autor: " + autor + ", Categoria: " + categoria;}

public void setPrestado(boolean b) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setPrestado'");
}

public void setLibrosPrestados(boolean b) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setLibrosPrestados'");
}
   
    
    


















}






