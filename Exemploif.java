import java.util.Scanner;

public class Uri1014{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);

            float n1, n2, media;

            System.out.println("Digite a nota da p1");
            n1=teclado.nextoFloat();

            System.out.println("Digite a nota da p2");
            n2=teclado.nextoFloat();

            media = (n1+n2)/2;

            System.out.println("sua nota foi"+media);

            if (media >= 6) {
                System.out.println("Parabens aprovado");
            }

            else {
                System.out.println("Estude mais, nao desista")
            }

            System.out.println("Fim do problema");

    }

}

