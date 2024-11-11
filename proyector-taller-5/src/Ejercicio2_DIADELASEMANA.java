import java.util.Scanner;
/**
 *
 * @author Jonathan Moreno
 */
public class Ejercicio2_DIADELASEMANA {
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        int numdia;
        System.out.println("dame el numero del dia");
        numdia = tcl.nextInt();
        //STRUCTURA DE CONTROL SELECETIVA MULTIPLE segun<==>switch
        switch(numdia)
        {//incio del switch
            case 1:System.out.print("LUNES");
                   break;
            case 2:System.out.println("MARTES");
                   break;
            case 3:System.out.println("MIERCOLES");
                   break;
            case 4:System.out.println("JUEVES");
                   break;
            case 5:System.out.println("VIERNES");
                   break;
            case 6:System.out.println("SABADO");
                   break;
            case 7:System.out.println("DOMINGO");
                   break;
            default : System.out.println("ERROR DE NUMERO"); 
        }
    }
}          