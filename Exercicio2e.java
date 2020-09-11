import java.util.Scanner;

public class Exercicio2d{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);

            int baseMaior, baseMenor, altura;

            System.out.println("Por favor, digite o valor da basemaior, basemenor, altura");
                baseMaior = teclado.nextInt();
                baseMenor = teclado.nextInt();   
                altura    = teclado.nextInt();    

                area = (baseMaior + baseMenor)*altura/2;

            System.out.println("A area do quadrado vale"+area);


    }
}