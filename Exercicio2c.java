import java.util.Scanner;

public class Exercicio2c{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);

            int lado, area, base, altura;

            System.out.println("Por favor, digite o valor do lado, base e altura");
                lado = teclado.nextInt();
                base = teclado.nextInt();
                altura = teclado.nextInt();      

                area = (base*altura)/2;

            System.out.println("A area do quadrado vale"+area);
    }
}


/*
 c. área de um triângulo, dados sua base e sua altura
 Área = (base * altura)/2 

 */