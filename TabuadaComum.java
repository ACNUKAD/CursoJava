import java.util.Scanner;

public class TabuadaComum{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);
        
        int valor, resultado, contador;

        System.out.println("Digite o valor da tabuada");
        valor = teclado.nextInt();
        
        contador =1; // inicialização

        while (contador <= 10){ // condição logica para o código continuar executando
            System.out.println(valor + " x " +contador + " = " + (valor * contador));
            contador = contador + 1; // aqui eu modifico a variável uqe faz parte da condição
        }

       
   
    }
}