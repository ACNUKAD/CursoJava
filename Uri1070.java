import java.util.Scanner;

public class Uri1070{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);
        
        int contador, valor;

        valor = teclado.nextInt();

        for (contador=1; contador <=6 ; contador = contador +1){
            if (valor %2 == 0){  // par
            valor = valor +1;
            System.out.println(valor);
            valor = valor +1;
            } 

            else{  //impar
            System.out.println(valor);
            valor = valor +2;
            }
        } 
    }
}