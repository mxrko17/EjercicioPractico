public class Libro {

    private String autor;
    private String titulo;
    private int paginas;

    public Libro(String autor, String titulo, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println("-------------------");
    }
}
