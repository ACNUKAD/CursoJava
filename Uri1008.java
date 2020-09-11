import java.util.Scanner;

public class Uri1003{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);

        int NUMBER, HTRABALHADAS;
        float SALARY, VALORH;

        NUMBER = teclado.nextInt();
        HTRABALHADAS = teclado.nextInt();
        VALORH = teclado.nextFloat();

        SALARY = HTRABALHADAS * VALORH;

        System.out.println("NUMBER = "+NUMBER);
        System.out.printf("SALARY = U$ %.2f\n",SALARY);
        

    }
}