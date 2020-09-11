import java.util.Scanner;

public class Uri1014{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);

        int X;
        double Y;

        X = teclado.nextInt();
        Y = teclado.nextFloat();

        float consumo = X/Y;

        System.out.printf("%.3f km\n", consumo);
       

    }
}