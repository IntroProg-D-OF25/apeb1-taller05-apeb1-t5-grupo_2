import java.util.Scanner;

/** Desarrollar una solución que permita calcular y mostrar el valor a cancelar de una planilla de luz. Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario tiene edad mayor a 65 años, se debe descontar el 10% por pertenecer a la tercera edad.
 *
 * @author JUAN QUIZHPE
 */
public class Ejercisio10 {
    public static void main(String[] args) {
      double cost_kilov, kilov_consum, prec_planilla;
        int edad;

        Scanner tlc = new Scanner(System.in);

        // INGRESAR COSTO DE KILOVATIO/HORA
        System.out.print("INGRESAR COSTO DE KILOVATIO/HORA: ");
        cost_kilov = tlc.nextDouble();

        // SOLICITAR LA CANTIDAD DE KILOVATIOS CONSUMIDOS
        System.out.print("Ingresa la cantidad de kilovatios consumidos: ");
        kilov_consum = tlc.nextDouble();

        // SOLICITAR LA EDAD DEL CLIENTE 
        System.out.print("¿Que edad tiene el cliente?: ");
        edad = tlc.nextInt();

        // CALCULAR PRECIO PLANILLA
        if (edad >= 65) {
            // SI EL CLIENTE TIEN 65 AÑOS O MAS APLICAR 10% DE DESCUENTO
            prec_planilla = (kilov_consum * cost_kilov) * 0.6;
        } else {
            // Si no, no se aplica descuento
            prec_planilla = kilov_consum * cost_kilov;
        }

       
        System.out.printf("TOTAL A PAGAR : %.2f%n", prec_planilla); 
        
        /***
         * debug:
         * INGRESAR COSTO DE KILOVATIO/HORA: 
          0,15
          Ingresa la cantidad de kilovatios consumidos: 
          1000
          ¿Que edad tiene el cliente?: 
          69
          TOTAL A PAGAR : 90,00
         */
    }
}
