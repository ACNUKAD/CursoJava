import java.util.Scanner;

public class Exercicio2d{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);

            int diagonal1, diagonal2;

            System.out.println("Por favor, digite o valor da diagonal1");
                diagonal1 = teclado.nextInt();

            System.out.println("Por favor, digite o da diagonal2");
                diagonal2 = teclado.nextInt();    

                area = (diagonal1*diagonal2);

            System.out.println("A area do quadrado vale"+area);


    }
}
