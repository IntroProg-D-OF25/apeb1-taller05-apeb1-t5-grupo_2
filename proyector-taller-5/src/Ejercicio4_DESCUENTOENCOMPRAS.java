import java.util.Scanner;
/**
 *
 * @author Jonathan Moreno
 */
public class Ejercicio4_DESCUENTOENCOMPRAS 
{
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        double precioOrig, preciofin;
        double descuento = 0;
        System.out.println("ESCRIBA EL PRECIO ORIGINAL DEL PRODUCTO");
        precioOrig = tcl.nextDouble();
        if(precioOrig>100)
        {
           descuento = precioOrig * 0.10;
           preciofin = precioOrig - descuento;
        }
        else
        {
            preciofin = precioOrig;
        }
        System.out.println("EL PRECIO FINAL ES = "+preciofin);     
    }
}
/***
 * ESCRIBA EL PRECIO ORIGINAL DEL PRODUCTO
 *  200
 *  EL PRECIO FINAL ES = 180.0
 */