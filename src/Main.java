import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        //System.out.println("Película Matrix");

        //declaracion de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                Matrix, la mejor pelicula del fin del milenio
                """;
        double mediaEvalucionUsuario = 0;

        System.out.println("Pelicula: "+nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvalucacion = (4.5 + 4.8 +3) /3;
        System.out.println("Media de la Evalución de Matrix: "+mediaEvalucacion);

        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Pelicula Popular en el momento");
        }else{
            System.out.println("Pelicula retro que vale la pena ver");
        }


        //evaluacion de la pelicula forrest Gump
        System.out.println("Ahora vamos a evaluar la pelicula Forrest Gump");
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese nota que le darias a Forrest Gump: ");
            double notaForrestGump = teclado.nextDouble();
            mediaEvalucionUsuario = (mediaEvalucionUsuario + notaForrestGump);
        }
        System.out.println("La media de la pelicula Forrest Gump, calculada por el usuario es: " + (mediaEvalucionUsuario/3) );
    }
}