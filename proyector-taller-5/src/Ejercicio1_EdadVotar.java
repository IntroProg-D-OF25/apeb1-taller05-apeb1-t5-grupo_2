
import java.util.Scanner;



/**
 *Edad para Votar: Determinar si una persona es elegible para votar en función de su edad (mayor o igual a 18 años).
 * @author Jonathan Moreno
 */
public class Ejercicio1_EdadVotar {
    public static void main(String[] args) {
        int edad;
        Scanner tcl = new Scanner(System.in);
        System.out.println("DAME UNA EDAD: ");
        edad = tcl.nextInt();
        if(edad>=18)
            System.out.println("VOTA");
        else
            System.out.println("NO VOTA");
        
    }
    
}
