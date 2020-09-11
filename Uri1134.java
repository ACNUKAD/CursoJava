import java.util.Scanner;

public class Uri1134{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);
        
        int valor, alcool, gasolina, diesel;

        alcool= 0;
        gasolina = 0;
        diesel = 0;


        do {
         valor = teclado.nextInt();
            switch (valor){
            case 1: 
            alcool = alcool +1;
            break;

            case 2:
            gasolina = gasolina +1;
            break;

            case 3:
            diesel = diesel +1;
            break;
            }

        }while (valor != 4);   

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);

    }
}