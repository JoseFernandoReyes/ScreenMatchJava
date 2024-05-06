import modelo.Pelicula;

import java.util.Scanner;

public class Principal {
    public void mostrarMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu = """
                    Bienvenid(a) a ScreenMatch
                    1) Registrar Nueva Pelicula 
                    2) Registrar Nueva Serie
                    9) Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("ingrese el nombre de la Pelicula");
                    String nombre = teclado.nextLine();
                    System.out.println("ingrese el año de lanzamiento de la Pelicula");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("ingrese la duracion en minutos de la Pelicula");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.mostrarFichaTecnica();
                    break;


                case 9:
                    System.out.println("Terminado");
                    break;



                default:
                    System.out.println("Opción no válida \n");
                    break;




            }
        }
    }
}