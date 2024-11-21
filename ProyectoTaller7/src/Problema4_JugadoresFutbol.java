
/**
 *Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
 * Nombre el jugador
 * Posición en el campo de juego
 * Edad
 * Estatura
 * El ciclo de ingreso de información deberá terminar cuando el usuario lo decida.
 * Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Problema4_JugadoresFutbol {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        String nombre, posicion;
        int edad, contador = 1, limite;
        double estatura, promedioEdad = 0, promedioEstatura = 0;
        System.out.print("Ingrese cuantos jugadores va a ingresar: ");
        limite = an.nextInt();
        while (contador <= limite) {
            System.out.print("Ingrese el nombre del jugador, posicion en el campo, edad y estatura: ");
            nombre = an.next();
            posicion = an.next();
            edad = an.nextInt();
            estatura = an.nextDouble();
            contador++;

            promedioEdad += edad;
            promedioEstatura += estatura;
            System.out.printf("| %s | %s | %s | %s |\n", "Nombre", "Posicion", "Edad", "Estatura");
            System.out.printf("| %s | %s | %d | %.2f |\n", nombre, posicion, edad, estatura);

        }
        promedioEdad = promedioEdad / limite;
        promedioEstatura = promedioEstatura / limite;
        System.out.println("Promedio de estatura: " + promedioEstatura);
        System.out.println("Promedio de edad: " + promedioEdad);
    }
}
/*
* run:
* Ingrese cuantos jugadores va a ingresar: 2
* Ingrese el nombre del jugador, posicion en el campo, edad y estatura: Ricardo Arquero 15 1.56
* | Nombre | Posicion | Edad | Estatura |
* | Ricardo | Arquero | 15 | 1.56 |
* Ingrese el nombre del jugador, posicion en el campo, edad y estatura: Alex Defensa 17 1.60
* | Nombre | Posicion | Edad | Estatura |
* | Alex | Defensa | 17 | 1.60 |
* Promedio de estatura: 1.58
* Promedio de edad: 16.0
*/
