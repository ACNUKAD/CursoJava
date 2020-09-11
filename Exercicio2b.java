import java.util.Scanner;

public class Exercicio2b{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);

            int area, base, altura;

            System.out.println("Por favor, digite o valor da base e altura");
                base   = teclado.nextInt();
                altura = teclado.nextInt();      

                area = (base*altura)/2;

            System.out.println("A area do quadrado vale"+area);


    }
}