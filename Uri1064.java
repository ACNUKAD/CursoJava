import java.util.Scanner;

public class Uri1064{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);
        
        double valor, contagem, contador, media;
        int numpos=0;

        contagem = 0;

        for (contador =1; contador <= 6; contador = contador +1){
        valor = teclado.nextDouble();
            if (valor >0){
                numpos = numpos + 1;
                contagem = contagem + valor;
            }
        }
        media = contagem/numpos;
        System.out.println(numpos+" valores positivos");
        System.out.printf("%.1f\n",media);
  
    }
}