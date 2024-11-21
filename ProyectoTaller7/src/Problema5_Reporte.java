
/**
 *Generar un programa Java que permita ingresar 4 estudiantes;
 * por cada uno de ellos ingresar el nombre del estudiante,
 * el promedio de ciclo.
 * Presentar el siguiente reporte
 * Estudiante 1	10	Aprobado
 * Estudiante 2	6.9	Reprobado
 * Estudiante 3	7	Aprobado
 * Estudiante 4	5	Reprobado
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Problema5_Reporte {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        String nombre, estado;
        double nota;
        int contador = 1;
        while (contador <= 4) {
            System.out.print("Ingrese el nombre del estudiante y el promedio del EST_ " + contador + ": ");
            nombre = an.next();
            nota = an.nextDouble();
            if (nota < 6.5) {
                estado = "Reprobado";
            } else {
                estado = "Aprobado";
            }
            contador++;
            System.out.printf("| %s | %s | %s |\n", "Nombre", "Promedio", "Estado");
            System.out.printf("| %s | %.2f    | %s |\n", nombre, nota, estado);
            //El estudiante fue  = " + estado );

        }
    }
}
/*
* run:
* Ingrese el nombre del estudiante y el promedio del EST_ 1: pepe 5
* | Nombre | Promedio | Estado |
* | pepe | 5.00    | Reprobado |
* Ingrese el nombre del estudiante y el promedio del EST_ 2: carlo 6
* | Nombre | Promedio | Estado |
* | carlo | 6.00    | Reprobado |
* Ingrese el nombre del estudiante y el promedio del EST_ 3: federico 6
* | Nombre | Promedio | Estado |
* | federico | 6.00    | Reprobado |
* Ingrese el nombre del estudiante y el promedio del EST_ 4: camilo 7
* | Nombre | Promedio | Estado |
* | camilo | 7.00    | Aprobado |
*/
