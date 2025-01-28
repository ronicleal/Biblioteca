public class App {
    /**
     * @autor Diego y Ronic
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Biblioteca GuerreroLeal = new Biblioteca(50, 50);

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", "Literatura");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "Novela");
        Libro libro3 = new Libro("Juegos del hambre", "Suzanne Collins", "Novela");
        Libro libro4 = new Libro("Harry Potter y la piedra filosofal ", "Harry Potter", "Fantasia");
        Libro libro5 = new Libro("El código Da Vinci", "Dan Brown", "Novela");

        GuerreroLeal.agrearLibro(libro1);
        GuerreroLeal.agrearLibro(libro2);
        GuerreroLeal.agrearLibro(libro3);
        GuerreroLeal.agrearLibro(libro4);
        GuerreroLeal.agrearLibro(libro5);

     

        

        

        



        

       
        


      



    }
}
