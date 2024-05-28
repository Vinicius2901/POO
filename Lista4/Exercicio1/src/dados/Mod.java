package dados;

public class Mod implements IOperacaoInteira {
	public int executar( int valor1, int valor2 ) {
		int maior = 0; int menor = 0;
		if( valor1 >= valor2 ) {
			maior = valor1;
			menor = valor2;
			int div = maior / menor;
			return maior - div*menor;
		}
		else {
			maior = valor2;
			menor = valor1;
			int div = maior / menor;
			return maior - div*menor;
		}
	}
}
