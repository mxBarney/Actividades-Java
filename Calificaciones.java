import java.util.Scanner;
public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitud del nombre del alumno
        System.out.println("Indique el nombre del alumno");
        String nombre = scanner.nextLine();

        System.out.println("Indique las calificaciones de: " + nombre);

        Integer[] arregloCalificaciones = new Integer[5];

        for (int k = 0; k < arregloCalificaciones.length; k++) {
            System.out.print("Calificación " + (k +1) + ": ");
            arregloCalificaciones[k] = scanner.nextInt();
        }

        double promedio = CalcularPromedio(arregloCalificaciones);

        char clasificacion = Clasifica(promedio);

        Despliega(nombre,clasificacion, promedio,arregloCalificaciones);
    }

    public static double CalcularPromedio (Integer[] arregloCalificaciones) //throws IOException
    //Calculará el promedio de las 5 calificaciones
    {
        double sumaCalificaciones = 0;
        double promedio;

        for (Integer elemento : arregloCalificaciones) {
            sumaCalificaciones = sumaCalificaciones + elemento;
        }
        promedio = sumaCalificaciones/ arregloCalificaciones.length;
        return promedio;
    }

    public static char Clasifica(double promedio){
        char clasificacion ='X';
        if (promedio<=50){
            clasificacion='F';
        } else if (promedio>50 && promedio<=60){
            clasificacion='E';
        } else if (promedio>60 && promedio<=70){
            clasificacion='D';
        } else if (promedio>70 && promedio<=80) {
            clasificacion = 'C';
        } else if (promedio>80 && promedio<=90){
            clasificacion='B';
        } else if (promedio>90 && promedio<=100){
            clasificacion='A';
        }
        return clasificacion;
    }

    public static void Despliega(String nombre, char clasificacion, double promedio, Integer[] arregloCalificaciones)
    // Despliega la información recolectada del alumno
    {
        System.out.println();
        System.out.println("  RESULTADOS FINALES ");
        System.out.println("Nombre del estudiante." + nombre);

        System.out.println("Calificación 1:" + arregloCalificaciones[0]);
        System.out.println("Calificación 2:" + arregloCalificaciones[1]);
        System.out.println("Calificación 3:" + arregloCalificaciones[2]);
        System.out.println("Calificación 4:" + arregloCalificaciones[3]);
        System.out.println("Calificación 5:" + arregloCalificaciones[4]);
        System.out.println("Promedio:" + promedio);

        System.out.println("Calificación: " + clasificacion);
    }
}
