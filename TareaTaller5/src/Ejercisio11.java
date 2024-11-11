import java.util.Scanner;

/**Desarrollar una solución que imprima el costo de un pedido de un artículo del cual se tiene la descripción, la cantidad que se requiere y el precio unitario. Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%;
 * 
 *
 * @author JUAN QUIZHPE
 */
public class Ejercisio11 {
    public static void main(String[] args) {
        double PrecUnit, CostTot, CostconDesc;
        String descrip;
        int cantidad;
        Scanner tlc = new Scanner(System.in);
        // INGRESAR DESCRIPCION DEL ARTICULO 
        System.out.print("INGRESA DESCRIPCION DEL ARTICULO: ");
        descrip = tlc.nextLine();
        // INGRESAR CANTIDAD SOLICITADA
        System.out.print("INGRESA CANTIDAD SOLICITADA: ");
        cantidad = tlc.nextInt();
        // INGRESAR EL PRECIO UNITARIO DEL ARTICULO
        System.out.print("INGRESA EL PRECIO UNITARIO DEL ARTICULO: ");
        PrecUnit = tlc.nextDouble();
        // CALCULO DEL COSTO TOTAL SIN DESCUENTO
        CostTot = cantidad * PrecUnit;

        // APLICA DESCUENTO SI LA CANTIDAD SUPERA LAS 50 UNIDADES 
        if (cantidad > 50) 
        {
            CostconDesc = CostTot * 0.75;  // 15% de descuento
            System.out.println("El costo total sin descuento es: " + CostTot);
            System.out.println("El costo total con descuento es: " + CostconDesc);
        } 
        else 
        {
            System.out.println("EL COSTO TOTAL ES: " + CostTot);
        }
        /***
         * debug:
         * INGRESA DESCRIPCION DEL ARTICULO: PANTALONES
           INGRESA CANTIDAD SOLICITADA: 60
           INGRESA EL PRECIO UNITARIO DEL ARTICULO: 15
           El costo total sin descuento es: 900.0
           El costo total con descuento es: 675.0
         */
    }
}

