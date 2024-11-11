
import java.util.Scanner;


/**
 *Mayor de tres números: Dados tres números, determinar cuál es el mayor. Si son iguales, mostrar un mensaje.
 * @author Jonathan Moreno
 */
public class Ejercicio3_MAYORDETRESNUMEROS {
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        int numA,numB,numC;
        System.out.println("ESCRIBA EL PRIMER NUMERO ");
        numA = tcl.nextInt();
        System.out.println("ESCRIBA EL SEGUNDO NUMERO ");
        numB= tcl.nextInt();
        System.out.println("ESCRIBA EL TERCER NUMERO ");
        numC=tcl.nextInt();
        if((numA==numB)&& (numA==numC))
           System.out.println("LOS NUMEROS SON IGUALES ");
        else
        {
            if ((numA>=numB))
            {
                if (numA>=numC)
                System.out.println("EL PRIMER NUMERO ES MAYOR = " +numA);
                
                else 
                {
                System.out.println("EL TERCER NUMERO ES MAYOR = " +numC);
            
                }
           }
            else
            {
                if (numB >= numC)
                {
                    System.out.println("EL SEGUNDO NUMERO ES MAYOR = " +numB);
                    
                }
                else
                {
                    System.out.println("EL  TERCER NUMERO ES MAYOR = " +numC);
                }
            }
        }                           
    }
}
/***
 * ESCRIBA EL PRIMER NUMERO 
 * 100
 *  ESCRIBA EL SEGUNDO NUMERO 
 *  50
 *  ESCRIBA EL TERCER NUMERO 
 *  40
 *  EL PRIMER NUMERO ES MAYOR = 100
 */
