import java.util.Scanner;

/**Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden ascendente.
 *
 * @author JUAN QUIZHPE
 */
public class Ejercisio9 {
    public static void main(String[] args) {
        int nm1, nm2, nm3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESA UN NUMERO: ");
        nm1 = teclado.nextInt();
        System.out.println("INGRESE UN NUMERO: ");
        nm2 = teclado.nextInt();
        System.out.println("INGRESE UN NUMERO: ");
        nm3 = teclado.nextInt();
        if (nm1 > nm2)
        {
            nm1 = nm1 + nm2;
            nm2 = nm1 - nm2;
            nm1 = nm1 - nm2;
        }
        if (nm1 > nm3) 
        {
           nm1 = nm1 + nm3;
           nm3 = nm1 - nm3;
           nm1 = nm1 - nm3;
        }
        if (nm2 > nm3)
        {
           nm2 = nm2 + nm3;
           nm3 = nm2 - nm3;
           nm2 = nm2 - nm3;
        }
        System.out.println("NUMEROS ORDENADOS EN ORDEN ASCENDENTE SON:" + nm1 + "," + nm2 + "," + nm3);
            
        /***
         * debug:
         * INGRESA UN NUMERO: 
           6
           INGRESE UN NUMERO: 
           13
          INGRESE UN NUMERO: 
           23
          NUMEROS ORDENADOS EN ORDEN ASCENDENTE SON:6,13,23
         */
    }
}
