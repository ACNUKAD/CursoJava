import java.util.Scanner;

public class Uri1043{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);
        
        int hinicial, hfinal, minicial, mfinal, tinicial,tfinal, duracaoi, duracaof, duracao, ajuste ;

        hinicial = teclado.nextInt();
        hfinal = teclado.nextInt();
        minicial = teclado.nextInt();
        mfinal = teclado.nextInt();

       tinicial= hinicial * 60; /*transformando h em minutos*/
       tfinal= hfinal * 60;   /*transformando h em minutos*/

       duracaoi = tinicial + mininicial;
       duracaof = tfinal + minfinal;

            if (duracaof > duracaoi){
                duracao= (duracaof - duracaoi)/60;  /*transformando novamente para h*/
                System.out.println("O JOGO DUROU"+duracao);
            }
                else if (duracaof < duracaoi){
                   ajuste = duracaof + 1440; 
                }

    }
}