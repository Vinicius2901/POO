package apresentacao;

import java.util.Scanner;

import dados.Matriz;
import dados.Quadrante;

public class Questao2 {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int linha, coluna;
		System.out.println("Digite a quantidade de linhas da matriz:");
		linha = Integer.parseInt(scan.nextLine());
		System.out.println("Digite a quantidade de colunas da matriz:");
		coluna = Integer.parseInt(scan.nextLine());
		
		Matriz<Integer> matriz = new Matriz<Integer>(linha, coluna);
		
		for( int i = 0; i < linha; i++ ) {
			for(int j = 0; j < coluna; j++ ) {
				System.out.println("Digite um valor da matriz:");
				matriz.set(Integer.parseInt(scan.nextLine()), i, j);
			}
		}
		
		System.out.println("Testando get para um termo da matriz:");
		for( int i = 0; i < linha; i++ ) {
			for( int j = 0; j < coluna; j++ ) {
				System.out.print(matriz.get(i, j) + " ");
			}
			System.out.println();
		}
		
		System.out.println("Testando get de linhas:");
		for( int i = 0; i < linha; i++ ) {
			System.out.println(matriz.getLinha(i));
		}
		
		System.out.println("Testando get de colunas:");
		for( int i = 0; i < coluna; i++ ) {
			System.out.println(matriz.getColuna(i));
		}
		
		System.out.println("Testando get de quadrantes:");
		System.out.println("Primeiro quadrante: " + matriz.getElementosQuadrante(Quadrante.PRIMEIRO)+"\n");
        System.out.println("Segundo quadrante: " + matriz.getElementosQuadrante(Quadrante.SEGUNDO)+"\n");
        System.out.println("Terceiro quadrante: " + matriz.getElementosQuadrante(Quadrante.TERCEIRO)+"\n");
        System.out.println("Quarto quadrante: " + matriz.getElementosQuadrante(Quadrante.QUARTO)+"\n");}
		
}
