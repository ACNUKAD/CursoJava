import java.util.Scanner;

public class Uri1060{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);
        
        double valor;
        int contador;
        int numpos=0;

        for (contador =1; contador <= 6; contador = contador +1){
        valor = teclado.nextDouble();
            if (valor >0){
                numpos = numpos + 1;
            }
        }
        System.out.println(numpos+" Numeros positivos");
  
    }
}