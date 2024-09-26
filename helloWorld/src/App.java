import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

            System.out.println("Hello World");

    }


    public void CalcularSoma(){
        
        int soma,valorA,valorB;
        Scanner input = new Scanner (System.in);

            System.out.println("'Digite um valor inteiro para A:'");
            valorA = input.nextInt();
            System.out.println("Digite um valor inteiro para B: ");
            valorB = input.nextInt();

            soma = valorA + valorB;

            input.close();
            System.out.println("resultado da soma é:" + soma);
    }
    
}
