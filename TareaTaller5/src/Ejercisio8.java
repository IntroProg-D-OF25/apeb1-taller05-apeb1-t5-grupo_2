import java.util.Scanner;

/** Rango de valores: Calcular el índice de masa corporal (IMC) de una persona y clasificarla en función de su valor (bajo peso, peso normal, sobrepeso);
 *
 * @author JUAN QUIZHPE
 */
public class Ejercisio8 {
    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner teclado = new Scanner(System.in);
        //SOLICITAR EL PESO EN KG
        System.out.println("INGRESAR PESO EN KG");
        peso = teclado.nextDouble();
        // SOLICITAR ALTURA EN METROS
        System.out.println("INGRESAR ALTURA EN METROS");
        altura = teclado.nextDouble();
        //CALCULAR EL IMC
        imc = peso / (altura * altura);
        // INDICAR EL CALCULO DEL IMC 
        System.out.println("SU IMC ES:" + imc);
           // Clasificar el IMC
        if (imc < 18.5) 
        {
            System.out.println("CLASIFICACION: PESO BAJO ");
        } 
        else if (imc >= 18.5 && imc < 24.9)
        {
            System.out.println("CLASIFICACION: PESO NORMAL");
        } 
        else if (imc >= 25 && imc < 29.9) 
        {
            System.out.println("CLASIFICACION: SOBRE PESO");
        } 
        else 
        {
            System.out.println("CLASIFICACION: OBESIDAD");
        } 
        
        /***
         * debug:
         * INGRESAR PESO EN KG
           50
           INGRESAR ALTURA EN METROS
           1,78
           SU IMC ES:15.780835753061481
           CLASIFICACION: PESO BAJO
         */
                
    }
}
