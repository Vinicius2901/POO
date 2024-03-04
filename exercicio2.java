import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pessoa[] = new String[5];
        int idade[] = new int[5];

        for( int i = 0; i < pessoa.length; i++ ) {
            System.out.println( "\nDigite o nome da pessoa - " + (i+1) + ": ");
            pessoa[i] = in.nextLine();
            System.out.println( "\nDigite a idade da pessoa - " + (i+1) + ": ");
            idade[i] = Integer.parseInt(in.nextLine());
        }
        in.close();
        int idadeTemp;
        String nomeTemp;
        for( int i = 0; i < pessoa.length; i++ ) {
            for( int j = 0; j < pessoa.length; j++ ) {
                if( idade[i] > idade[j] ) {
                    nomeTemp = pessoa[j];
                    idadeTemp = idade[j];
                    pessoa[j] = pessoa[i];
                    idade[j] = idade[i];
                    pessoa[i] = nomeTemp;
                    idade[i] = idadeTemp;
                }
            }
        }
        for( int i = 0; i < pessoa.length; i++ ) {
            System.out.println( "\nNome: " + pessoa[i] + " - Idade: " + idade[i] );
        }
    }
}