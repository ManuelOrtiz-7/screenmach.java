import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Buenas nooooches, llego el tigueron¡¡¡¡!");
        //System.out.println("Pelicula Soy leyenda");
        //Delaracion de variables
        int fechaDeLanzamiento = 2024;
        double evaluacion = 9.5;
        boolean incluidoEnElPlan = true;
        String nombre = "Soy Leyenda";
        String sinopsis = """
                Un virus fatal ataca la humanidad y un militar sera el unico sobreviviente la catastrofe generada por el mismo ser humano 
                """;


        double mediaEvaluacionUsuario = 0;
        System.out.println("Titulo:  " + nombre);
        System.out.println("fecha: " + fechaDeLanzamiento);
        System.out.println("Puntuacion: " + evaluacion);
        System.out.println("Plan basico: " + incluidoEnElPlan);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("El promedio de evaluacion es:  " + mediaEvaluacion);

        if (fechaDeLanzamiento > 2020){
            System.out.println("Esta pelicula de moda actualmente");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");
        }


        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Que puntuacion le das  la pelicula?:");
            double notaSoyLeyenda = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaSoyLeyenda;
            }
        System.out.println("la calificacion promedio de la pelicula es de: " + mediaEvaluacionUsuario / 3);
        }
    }
