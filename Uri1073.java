import java.util.Scanner;

public class Uri1073{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);
        
    int valor, contagem;

    valor = teclado.nextInt();

    for (contagem=2; contagem <= valor; contagem = contagem +2)
        System.out.println(contagem+"^2 = "+(contagem*contagem));


    }
}