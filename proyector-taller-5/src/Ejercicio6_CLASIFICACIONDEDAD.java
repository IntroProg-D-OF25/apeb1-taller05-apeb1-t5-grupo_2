import java.util.Scanner;
/**
 *
 * @author Jonathan Moreno
 */
public class Ejercicio6_CLASIFICACIONDEDAD {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad= 0,categ= 0;
        System.out.println("ESCRIBA LA EDAD DE LA PERSONA");
        edad = tcl.nextInt();
        if(edad >=0 && edad<=12)
        {
           categ = 1;
            System.out.println("LA CATEGORIA ES LA DE NIÑO, LA NUMERO "+categ);
        }
        else
        {
           if(edad>=13 && edad <=17)
           {
              categ = 2;
              System.out.println("LA CATEGORIA ES LA DE ADOLECENTE, LA NUMERO "+categ);
           }
           else
           {
              if (edad>=18)
              {
                  categ = 3;
                  System.out.println("LA CATEGORIA ES LA DE ADULTO, LA NUMERO "+categ);
              }
              else
              {
                 categ = -1; 
                  System.out.println("EDAD ERRONEA");
              }
           }
        }
    }    
}
/***
 * ESCRIBA LA EDAD DE LA PERSONA
 * 16
 * LA CATEGORIA ES LA DE ADOLECENTE, LA NUMERO 2
 */