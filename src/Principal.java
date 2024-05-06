import modelo.Documental;
import modelo.Pelicula;
import modelo.Serie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public void mostrarMenu(){
        int opcion = 0;
        String tipo;
        Scanner teclado = new Scanner(System.in);
        int totalMaraton = 0;
        while (opcion != 9){


            String menu = """
                    Bienvenid(a) a ScreenMatch
                    1) Registrar Nueva Pelicula 
                    2) Registrar Nueva Serie
                    3) Registrar Documental
                    4) Calculadora de maratones
                    9) Salir
                    """;
            System.out.println(menu);
            try {
                opcion = teclado.nextInt();
                teclado.nextLine();
                switch (opcion) {
                    case 1:
                        tipo = "la Pelicula";
                        totalMaraton +=capturarDatos(tipo);
                        break;

                    case 2:
                        tipo = "la Serie";
                        totalMaraton +=capturarDatos(tipo);
                        break;

                    case 3:
                        tipo = "el Documental";
                        totalMaraton +=capturarDatos(tipo);
                        break;

                    case 4:
                        System.out.println("lo registrado hasta el momento suma un total de "+totalMaraton+" minutos");
                        System.out.println("\n");
                        break;

                    case 9:
                        System.out.println("Terminado");
                        break;


                    default:
                        System.out.println("Opción no válida \n");
                        break;

                }



            }catch (InputMismatchException e){
                System.out.println("Se debe ingresar un numero entero \n");
                teclado.nextLine();
            }
        }
    }

    public int capturarDatos(String tipo){

        int duracion = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Registrando "+tipo);
        System.out.println("Ingrese el nombre de "+ tipo);
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el año de lanzamiento de "+tipo);
        int fechaDeLanzamiento = teclado.nextInt();
        teclado.nextLine();


        if (tipo == "la Pelicula"){
            Pelicula peliculaUsuario = new Pelicula();
            peliculaUsuario.setNombre(nombre);
            peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);

            System.out.println("Ingrese la duracion en minutos de "+tipo);
            int duracionEnMinutos = teclado.nextInt();
            teclado.nextLine();
            peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
            System.out.println("Ingrese el director de la Pelicula");
            String director = teclado.nextLine();
            System.out.println("\n");
            peliculaUsuario.setDirector(director);

            peliculaUsuario.mostrarFichaTecnica();
            System.out.println("Director: " + director);
            System.out.println("\n");

            duracion = duracionEnMinutos;
        }

        if (tipo == "la Serie"){
            Serie serieUsuario = new Serie();
            serieUsuario.setNombre(nombre);
            serieUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
            System.out.println("Ingrese la cantidad de temporadas de "+tipo);
            int cantidadDeTemporadas = teclado.nextInt();
            teclado.nextLine();
            serieUsuario.setTemporadas(cantidadDeTemporadas);
            System.out.println("Ingrese la cantidad de episodios por temporadas de "+tipo);
            int episodiosPorTemporada = teclado.nextInt();
            teclado.nextLine();
            serieUsuario.setEpisodiosPorTemporada(episodiosPorTemporada);
            System.out.println("Ingrese la duracio de cada episodio de "+tipo);
            int DuracionEnMinutosPorEpisodio = teclado.nextInt();
            teclado.nextLine();
            serieUsuario.setDuracionEnMinutosPorEpisodio(DuracionEnMinutosPorEpisodio);
            System.out.println("\n");
            serieUsuario.mostrarFichaTecnica();
            System.out.println("\n");

            duracion = serieUsuario.getTiempoDeDuracionEnMinutos();
        }

        if (tipo == "el Documental"){
            Documental documentalUsuario = new Documental();
            documentalUsuario.setNombre(nombre);
            documentalUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
            System.out.println("Ingrese la duracion en minutos de "+tipo);
            int duracionEnMinutos = teclado.nextInt();
            teclado.nextLine();
            documentalUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
            System.out.println("Ingrese el director de el Documental");
            String director = teclado.nextLine();
            System.out.println("\n");
            documentalUsuario.setDirector(director);

            documentalUsuario.mostrarFichaTecnica();
            System.out.println("Director: " + director);
            System.out.println("\n");

            duracion = duracionEnMinutos;
        }

        return duracion;


    }
}
