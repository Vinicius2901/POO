import java.util.Scanner;

public class Pratica1 {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );
        float valores[] = new float[5];
        float soma = 0;

        for( int i = 0; i < valores.length; i++ ) {
            System.out.println("\nDigite o valor - " + (i+1) + ": ");
            valores[i] = Float.parseFloat(in.nextLine());
        }
        in.close();
        for( int i = 0; i < valores.length; i++ ) {
            soma += valores[i];
        }
        System.out.println("\nA média é: " + soma/valores.length );
    }
}