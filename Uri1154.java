import java.util.Scanner;

public class Uri1154{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);

        int idade;
        double media=0;
        int qtdeIdades=0;

        do{
            idade = teclado.nextInt();
            if (idade>0){
                media += idade;
                qtdeIdades++;
            }

        } while (idade >=0);
        media = media /qtdeIdades;
        System.out.printf("%.2f\n", media);
    }
}