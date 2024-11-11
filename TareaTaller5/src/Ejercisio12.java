import java.util.Scanner;

/**Desarrollar una solución que permita leer los datos de un automóvil (marca, origen y costo) imprima el impuesto por pagar y el precio de venta (incluido el impuesto). Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%;
 *
 * @author JUAN QUIZHPE
 */
public class Ejercisio12 {
    public static void main(String[] args) {
        String marc, orig;
        double cost, impuest, PrecVent;

        Scanner tlc = new Scanner(System.in);

        // INGRESAR MARCA DEL AUTOMOVIL
        System.out.print("INGRESA LA MARCA DEL AUTOMOVIL: ");
        marc = tlc.nextLine();

        // INGRESAR ORIGEN DEL AUTOMOVIL
        System.out.print("INGRES EL ORIGEN EL AUTOMOVIL (ALEMANIA, JAPON, ITALIA, USA): ");
        orig = tlc.nextLine();

        // PEDIR COSTO DEL AUTOMOVIL
        System.out.print("INGRESA EL COSTO DEL AUTOMOVIL: ");
        cost = tlc.nextDouble();

        // CALCULO DEL IMPUESTO BASADO EN EL ORIGEN DEL AUTOMOVIL
        switch (orig.toLowerCase()) {
            case "alemania" -> impuest = cost * 0.20;
            case "japon" -> impuest = cost * 0.30;
            case "italia" -> impuest = cost * 0.15;
            case "usa" -> impuest = cost * 0.08;
            default -> {
                impuest = 0; 
                System.out.println("ORIGEN ERRONEO.");
            }
        }

        PrecVent = cost + impuest;

        System.out.println("IMPUESTO QUE DEBE PAGAR:" + impuest);
        System.out.println("PRECIO DE LA VENTA CON IMPUESTO:" + PrecVent);
        /***
         * debug:
         * INGRESA LA MARCA DEL AUTOMOVIL: TOYOTA
           INGRES EL ORIGEN EL AUTOMOVIL (ALEMANIA, JAPON, ITALIA, USA): JAPON
           INGRESA EL COSTO DEL AUTOMOVIL: 9000
           IMPUESTO QUE DEBE PAGAR:2700.0
           PRECIO DE LA VENTA CON IMPUESTO:11700.0
         */
    }
}
