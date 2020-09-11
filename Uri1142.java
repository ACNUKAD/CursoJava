import java.util.Scanner;

public class Uri1142{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);

        int valor, contagem,a, b, c, pulador;

        valor = teclado.nextInt();

        a=0;
        b=0;
        c=0;
        pulador = 0 ;

        for (contagem=0; contagem<valor; contagem = contagem +1){
                a= pulador +1;
                b= pulador +2;
                c= pulador +3;
                System.out.println(a+" "+b+" "+c+" PUM"); // dava para ter colocado ao inves de a = +(valor+1)+
                pulador = pulador +4;
        } 
    }
}