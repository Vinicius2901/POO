package dados;

import exceptions.NomeInvalidoException;

public class Documento extends Arquivo {
	private String texto;
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	
	public Documento( String nome ) throws NomeInvalidoException {
		super(nome);
		extensao = ".txt";
	}
	
	public String toString() {
		return super.toString() + "\n\n";
	}
}
