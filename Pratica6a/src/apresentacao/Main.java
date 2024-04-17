package apresentacao;

import java.util.Scanner;

import negocio.Fabrica;

public class Main {
	public static void main(String[] args) {
		int cont = -1;
		Fabrica fabrica = new Fabrica();
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println(fabrica.fabricar().info());
			System.out.println("Digite 0 para interromper a producao ou qualquer numero para continuar:");
			cont = scan.nextInt();
		} while(cont != 0);
		scan.close();
	}
}
