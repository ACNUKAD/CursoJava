import java.util.Scanner;

public class TesteWhile{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);
        
        int valor=0;

        while (valor <= 10){
            System.out.println("Valor = "+valor);
            valor = valor +1;
        }
    }
}