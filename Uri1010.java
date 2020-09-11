import java.util.Scanner;

public class Uri1003{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);

        int CODPECA1, NUMPECA1, CODPECA2, NUMPECA2;
        double VALORPECA1, VALORPECA2, VALORAPAGAR, V1, V2;
 
        CODPECA1 = teclado.nextInt();
        CODPECA2 = teclado.nextInt();
        NUMPECA1 = teclado.nextInt();
        NUMPECA2 = teclado.nextInt();
        VALORPECA1 = teclado.nextDouble();
        VALORPECA2 = teclado.nextDouble();


        V1=NUMPECA1*VALORPECA1;
        V2=NUMPECA2*VALORPECA2;
        VALORAPAGAR = V2 + V2;

        System.out.printf("VALOR A PAGAR = R$ %.2f\n",VALORAPAGAR);
       

    }
}