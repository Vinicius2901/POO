package exceptions;

public class PilhaVaziaException extends Exception {
	public PilhaVaziaException() {
		
	}
	public PilhaVaziaException(String mensagem) {
		super(mensagem);
	}
}
