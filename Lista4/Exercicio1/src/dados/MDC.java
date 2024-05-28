package dados;

public class MDC implements IOperacaoInteira {

	@Override
	public int executar(int valor1, int valor2) {
		int valorMaior = 0, valorMenor = 0, i = 2, mult = 1;
		if( valor1 >= valor2 ) {
			valorMaior = valor1;
			valorMenor = valor2;
			while( valorMaior != 1 && valorMenor != 1 ) {
				if( valorMaior % i == 0 && valorMenor % i == 0 ) {
					valorMaior /= i;
					valorMenor /= i;
					mult *= i;
				}
				else if( valorMaior % i == 0 && valorMenor % i != 0 ) {
					valorMaior /= i;
				}
				else if( valorMaior % i != 0 && valorMenor % i == 0 ) {
					valorMenor /= i;
				}
				else {
					i++;
				}
			}
		}
		else {
			valorMaior = valor2;
			valorMenor = valor1;
			while( valorMaior != 1 && valorMenor != 1 ) {
				if( valorMaior % i == 0 && valorMenor % i == 0 ) {
					valorMaior /= i;
					valorMenor /= i;
					mult *= i;
				}
				else if( valorMaior % i == 0 && valorMenor % i != 0 ) {
					valorMaior /= i;
				}
				else if( valorMaior % i != 0 && valorMenor % i == 0 ) {
					valorMenor /= i;
				}
				else {
					i++;
				}
			}
		}
		return mult;
	}
	
}
