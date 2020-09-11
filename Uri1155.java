import java.util.Scanner;

public class Uri1155{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);

        double S, result;

        result = 0;

        for (int contagem=1; contagem<=100; contagem++){
            result = result + 1.0/(contagem);
        }


        System.out.printf("%.2f\n",result);
    }
}