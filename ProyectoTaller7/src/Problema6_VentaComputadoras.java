
/**
 * Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento por tipo de cliente:
 * Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20% En caso que sea otro tipo de cliente,
 * no hay descuento. Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Problema6_VentaComputadoras {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        String cliente;
        double costo;
        int contador = 1;
        while (contador <= 7) {
            System.out.print("Ingrese el nombre del cliente y el costo: ");
            cliente = an.next();
            costo = an.nextDouble();
            if (costo <= 100) {
                System.out.println("Usted es cliente tipo1 y obtiene un descuento del 10% ");
                costo = costo * 0.9;
            } else {
                System.out.println("Usted es cliente tipo2 y obtiene un descuento del 20% ");
                costo = costo * 0.8;
            }
            contador++;
            System.out.printf("| %s | %s |\n", "Nombre", "Costo");
            System.out.printf("| %s | %.2f |\n", cliente, costo);

        }
    }
}
/*
* run:
* Ingrese el nombre del cliente y el costo: Pedro 1000
* Usted es cliente tipo2 y obtiene un descuento del 20% 
* | Nombre | Costo |
* | Pedro | 800.00 |
* Ingrese el nombre del cliente y el costo: Carlos 50
* Usted es cliente tipo1 y obtiene un descuento del 10% 
* | Nombre | Costo |
* | Carlos | 45.00 |
* Ingrese el nombre del cliente y el costo: Alexander 500
* Usted es cliente tipo2 y obtiene un descuento del 20% 
* | Nombre | Costo |
* | Alexander | 400.00 |
* Ingrese el nombre del cliente y el costo: Mikael 200
* Usted es cliente tipo2 y obtiene un descuento del 20% 
* | Nombre | Costo |
* | Mikael | 160.00 |
* Ingrese el nombre del cliente y el costo: Ricardo 20
* Usted es cliente tipo1 y obtiene un descuento del 10% 
* | Nombre | Costo |
* | Ricardo | 18.00 |
* Ingrese el nombre del cliente y el costo: Jorge 300
* Usted es cliente tipo2 y obtiene un descuento del 20% 
* | Nombre | Costo |
* | Jorge | 240.00 |
* Ingrese el nombre del cliente y el costo: Daniela 30
* Usted es cliente tipo1 y obtiene un descuento del 10% 
* | Nombre | Costo |
* | Daniela | 27.00 |
*/
