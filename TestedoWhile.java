import java.util.Scanner;

public class TestedoWhile{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);
        
        int valor=0;

        do{
            System.out.println("valor = "+valor);
            valor = valor +1;
        } while (valor<10);



    }
}