import java.util.Scanner;

/**En una hosteria de la ciudad de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días, del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días. Elaborar un solución que pida como datos de entrada el número de días y el precio diario de la habitación y luego calcule e imprima el subtotal por pagar, el descuento y el total por pagar;
 *
 * @author JUAN QUIZHPE
 */
public class Ejercisio13 {
    public static void main(String[] args) {
          int dias;            
        double prec;       
        Scanner tlc = new Scanner(System.in);
       
        // INGRESAR NUMERO DE DIAS
        System.out.print("INGRESA LOS DIAS QUE SE HOSPEDARA EL CLIENTE: ");
        dias = tlc.nextInt();
       
        // INGRESA EL PRECIO DE LA HABITACION POR DIA
        System.out.print("INGRESA EL PRECIO DE LA HABITACION POR DIAS: ");
        prec = tlc.nextDouble();

        // SI SE HOSPEDA MAS DE 15 DIAS, APLICA 20% DE DESCUENTO
        if (dias >= 15) {
            System.out.println("Descuento aplicado: 20%");
            System.out.println("Total a pagar: " + ((dias * prec) * 0.80));
        }
        // SI SE HOSPEDA MAS DE 10 DIAS, APLICA 15% DE DESCUENTO
        else if (dias >= 10) {
            System.out.println("Descuento aplicado: 15%");
            System.out.println("Total a pagar: " + ((dias * prec) * 0.85));
        }
        // Si se hospeda más de 5 días, se aplica un 10% de descuento
        else if (dias >= 5) {
            System.out.println("Descuento aplicado: 10%");
            System.out.println("Total a pagar: " + ((dias * prec) * 0.90));
        }
        // SI NO CUMPLE LA CONDICION DE DIAS ANTERIORES DE ANULA EL DESCUENTO
        else 
        {
            System.out.println("DESCUENTO APLICADO: 0%");
            System.out.println("TOTAL A PAGAR: " + (dias * prec));
            }
        /***
         * debug:
         * SI SE HOSPEDA MENOS DE 5 DIAS SE ANULA EL DESCUENTO 
         * INGRESA LOS DIAS QUE SE HOSPEDARA EL CLIENTE: 3
           INGRESA EL PRECIO DE LA HABITACION POR DIAS: 15
           DESCUENTO APLICADO: 0%
           TOTAL A PAGAR: 45.0
         */
        /***
         * debug:
         * SI SE HOSPEDA MAS DE 5 DIAS, APLICA 10% DE DESCUENTO
         * INGRESA LOS DIAS QUE SE HOSPEDARA EL CLIENTE: 8
           INGRESA EL PRECIO DE LA HABITACION POR DIAS: 15
           Descuento aplicado: 10%
           Total a pagar: 108.0
         */
        /***
         * debug:
         * Si se hospeda más de 10 días, se aplica un 15% de descuento
         * INGRESA LOS DIAS QUE SE HOSPEDARA EL CLIENTE: 12
           INGRESA EL PRECIO DE LA HABITACION POR DIAS: 15
           Descuento aplicado: 15%
           Total a pagar: 153.0
         */
        /***
         * debug:
         * INGRESA LOS DIAS QUE SE HOSPEDARA EL CLIENTE: 18
           EL PRECIO DE LA HABITACION POR DIAS: 15
           Descuento aplicado: 20%
           Total a pagar: 216.0
         */
        }
            
        }
    

