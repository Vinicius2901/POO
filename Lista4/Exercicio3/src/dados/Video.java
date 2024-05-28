package dados;

import exceptions.NomeInvalidoException;

public class Video extends Arquivo {
	private Qualidade qualidade;
	
	public Qualidade getQualidade() {
		return qualidade;
	}

	public void setQualidade(Qualidade qualidade) {
		this.qualidade = qualidade;
	}

	public Video( String nome ) throws NomeInvalidoException {
		super(nome);
		extensao = ".mp4";
	}
	
	public String toString() {
		return super.toString() + "\n\tQualidade: " + qualidade + "\n\n";
	}
}
