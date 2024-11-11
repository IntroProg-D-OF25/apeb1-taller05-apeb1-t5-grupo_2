import java.util.Scanner;

/***
 * Rango de notas: Asignar a una letra (A,B,C,D) a una calificacion en funcion de su rango (A para 90-100, B para 80-89, C para 70-79);
 * 
 * @author JUAN QUIZHPE
 */
public class Ejercisio7 {
    public static void main(String[] args) {
        int Calificacion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESA CALIFICACION");
        Calificacion = teclado.nextInt();
        if ((Calificacion >=90 ) && (Calificacion <=100))
        {
            System.out.println("Nota de: A"); 
        }
            else if ((Calificacion >=80) && (Calificacion <=89))
                System.out.println("Nota de: B");
            else if ((Calificacion >=70) && (Calificacion <=79))
                System.out.println("Nota de: C");
            else System.out.println("Nota de: D");
    }
}
/***
 * debug
 * INGRESA CALIFICACION
   70
   Nota de: C
 */