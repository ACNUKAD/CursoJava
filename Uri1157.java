import java.util.Scanner;

public class Uri1157{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);

        int valor, divisores;

        valor = teclado.nextInt();

        for (divisores=1; divisores <=10; divisores++){
            if (valor % divisores == 0);
                System.out.println(divisores);        
        }
    }
}