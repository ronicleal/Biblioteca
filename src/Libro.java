public class Libro {
    /*Agregar libros nuevos.(admin)
Eliminar libros existentes.(admin)
Buscar libros por título, autor o categoría.(todos)
Mostrar todos los libros disponibles.(todos) */

private String titulo;
private String autor;
private String categoria;
private boolean prestado;


Libro(){
    titulo="";
    autor="";
    categoria="";
    prestado=false;

}

Libro(String titulo, String autor, String categoria, boolean prestado){
    this.titulo=titulo;
    this.autor=autor;
    this.categoria=categoria;
    this.prestado=prestado;
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

public boolean getPrestado(){
    return this.prestado;
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

public void setPrestado(boolean prestado){
    this.prestado=prestado;
}

    
}
