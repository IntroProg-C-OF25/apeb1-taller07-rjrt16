
/**
 *Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 5/10,10/12, 15/14, 20/16, 25/18, 30/20
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Problema2_Serie2 {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        int contador = 5, limite, contador2= 5;
        System.out.print("Deme el limite: ");
        limite = an.nextInt();
        while (contador <= (limite)*5) {
            System.out.print(contador2 + "/" + (contador + 5) + ", ");
            contador2 = contador2 +5;
            contador = contador + 2;
        }
        System.out.println("");
    }
}
/*
* run:
* Deme el limite: 6
* 5/10, 10/12, 15/14, 20/16, 25/18, 30/20, 35/22, 40/24, 45/26, 50/28, 55/30, 60/32, 65/34, 
*/