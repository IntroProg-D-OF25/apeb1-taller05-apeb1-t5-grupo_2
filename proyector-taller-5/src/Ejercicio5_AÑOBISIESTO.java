import java.util.Scanner;
/**
 *
 * @author Jonathan Moreno
 */
public class Ejercicio5_AÑOBISIESTO {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int año;
        System.out.println("ESCRIBA UN AÑO");
        año = tcl.nextInt();
        if((año % 4 ==0 &&año %100!=0) || (año% 400==0))
        {
            System.out.println("EL AÑO SI ES BISIESTO");
        }
        else
        {
            System.out.println("EL AÑO NO ES BISIESTO");
        }
    }
    
}
/***
 * ESCRIBA UN AÑO
 *  2016
 *  EL AÑO SI ES BISIESTO
 */