import java.util.Scanner;

public class Uri1066{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);

        int valor, contador, numpar, numpos, numneg,impar;

        numpar = 0;
        numpos = 0;
        numneg = 0;
        impar  = 0;

        for (contador =1; contador <= 5; contador = contador +1){
        valor = teclado.nextInt();
            if (valor % 2 == 0){
                numpar = numpar + 1;
            }  
            else {
                impar = impar + 1;
            } 

            if (valor > 0){
            numpos=numpos +1;
            }

            else if(valor < 0 ){
            numneg= numneg+1;
            }
        }

        System.out.println(numpar+" valor(es) par(es)");   
        System.out.println(impar+" valor(es) impar(es)"); 
        System.out.println(numpos+" valor(es) positivo(s)"); 
        System.out.println(numneg+" valor(es) negativo(s)");       

    }
}