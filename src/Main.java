import java.util.Scanner;
import java.text.DecimalFormat;

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


        System.out.println("Pelicula: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvalucacion = (4.5 + 4.8 +3) /3;
        System.out.println("Media de la Evalución de Matrix: " + mediaEvalucacion);

        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Pelicula Popular en el momento");
        }else{
            System.out.println("Pelicula retro que vale la pena ver \n");
        }


        //evaluacion de la pelicula forrest Gump

        double mediaEvalucionUsuario = 0;

        System.out.println("Ahora vamos a evaluar la pelicula Forrest Gump");
        int i  = 0;
        while (i<3){

            Scanner teclado = new Scanner(System.in);//instancia teclado como clase Scanner
            double notaForrestGump = 0;
            do {
                System.out.println("la nota # "+ (i+1));
                System.out.println("Ingrese nota que le darias a Forrest Gump: ");
                try {
                    notaForrestGump = teclado.nextDouble();
                    if (notaForrestGump < 0 || notaForrestGump > 5) {
                        System.out.println("solo se recibe valores para calificar entre 0 y 5");
                    }
                } catch (Exception e) {
                    System.out.println("Por favor, ingrese solo valores numericos.");
                    teclado.next(); // Limpiar teclado
                    notaForrestGump = 6; // Asignar un valor inválido para repetir el bucle do while
                }
            } while (notaForrestGump < 0 || notaForrestGump > 5);

            mediaEvalucionUsuario = mediaEvalucionUsuario + notaForrestGump;
            i++;
        }
        double mediaFinal = mediaEvalucionUsuario / 3;
        DecimalFormat formatoDosDecimales = new DecimalFormat("#.##");
        System.out.println("La media de la pelicula Forrest Gump, calculada por el usuario es:\n " + formatoDosDecimales.format(mediaFinal) +"\n Gracias por participar");

    }
}