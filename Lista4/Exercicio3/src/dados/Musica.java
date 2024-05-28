package dados;

import exceptions.NomeInvalidoException;

public class Musica extends Arquivo {
	private int duracao;
	
	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}


	public Musica( String nome ) throws NomeInvalidoException {
		super(nome);
		extensao = ".mp3";
	}
	
	public String toString() {
		return super.toString() + "\n\tDuracao: " + duracao + "\n\n";
	}
}
