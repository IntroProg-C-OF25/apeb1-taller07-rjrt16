
/**
 *Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados.
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo.
 * Calcular el valor a cancelar por la empresa para cada empleado.
 * Presentar un reporte como el siguiente:
 * Nombre 1	10	$2.5	$25
 * Nombre 2	11	$2	$22
 * Nombre 3	9	$3	$27
 * Nombre 4	5	$4	$20
 * Nombre 5	12	$2	$24
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Problema3_tabla1 {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        String nombre;
        double costo, total;
        int contador = 1, dias;
        while (contador <= 5) {
            System.out.print("Ingrese el nombre del empleado, numero de dias trabajados y costo del dia:  " + contador + ": ");
            nombre = an.next();
            dias = an.nextInt();
            costo = an.nextDouble();
            total = dias * costo;
            contador++;
            System.out.printf("| %s | %s | %s | %s |\n", "Nombre", "Dias", "Costo", "Total");
            System.out.printf("| %s | %d | %.2f | %.2f | \n", nombre, dias, costo, total);

        }
    }
}
/*run:
* Ingrese el nombre del empleado, numero de dias trabajados y costo del dia:  1: Jose 5 2.0
* | Nombre | Dias | Costo | Total |
* | Jose | 5 | 2.00 | 10.00 | 
* Ingrese el nombre del empleado, numero de dias trabajados y costo del dia:  2: Jorge 10 5.0
* | Nombre | Dias | Costo | Total |
* | Jorge | 12 | 5.00 | 60.00 | 
* Ingrese el nombre del empleado, numero de dias trabajados y costo del dia:  3: Jesus 5 5.0
* | Nombre | Dias | Costo | Total |
* | Jesus | 5 | 5.00 | 25.00 | 
* Ingrese el nombre del empleado, numero de dias trabajados y costo del dia:  4: Daniela 6 3.0
* | Nombre | Dias | Costo | Total |
* | Daniela | 6 | 3.00 | 18.00 | 
* Ingrese el nombre del empleado, numero de dias trabajados y costo del dia:  5: Andres 2 .5
* | Nombre | Dias | Costo | Total |
* | Andres | 2 | 0.50 | 1.00 |
*/