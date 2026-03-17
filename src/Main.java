import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos libros hay?");
        int cantLibro = sc.nextInt();

        Libro libros[] = new Libro[cantLibro];

        for (int i=0; i<cantLibro; i++){
            System.out.println("Ingrese el nombre del autor: ");
            String nombreAutor = sc.next();

            System.out.println("Ingrese el titulo del libro: ");
            String nombreLibro = sc.next();

            System.out.println("Ingrese el nro de paginas: ");
            int cantidadPaginas = sc.nextInt();

            libros[i] = new Libro(nombreAutor, nombreLibro, cantidadPaginas);
        }

        for (int i=0; i<cantLibro; i++) {
            libros[i].mostrarInfo();
        }
    }
}