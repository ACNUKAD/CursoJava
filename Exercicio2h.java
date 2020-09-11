import java.util.Scanner;

public class Exercicio2d{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);

        float raio, altura, area, pi;

        System.out.println("Digite o raio do cilindro");
        raio=teclado.nextFloar();
        Altura = teclado.nextFloat();
        pi= 3.14f;

        volume = raio * raio * pi * altura


        System.out.println("Volume ="+volume);




    }
}