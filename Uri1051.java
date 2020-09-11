import java.util.Scanner;

public class Uri1051{
    public static void main (String args[]){
        Scanner teclado;
            teclado= new Scanner (System.in);
        
        double salario, imposto;

        salario = teclado.nextDouble();

        if (salario >= 0 && salario <= 2000){
            System.out.println("Isento");
        }
            else if (salario >= 2000.01 && salario <=3000.00){
                imposto = 0.08*1000 + 0.18*2.00;
                System.out.printf("Salario = %.2f\n",salario);
            }
                else if (salario >= 3001.01 && salario <= 4500.00){

                }
   
    }
}