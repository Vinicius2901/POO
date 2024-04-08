package dados;

public class Viveiro {
	protected String nome;
	protected float comprimento, largura;
	protected Animal[] animais;
	protected int quantAnimais;
	
	public Viveiro( int maxAnimais ) {
		this.animais = new Animal[maxAnimais];
		quantAnimais = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}
	
	public float calculaEspaco() {
		return comprimento * largura;
	}
	
	private float espacoOcupado() {
		float ocp = 0;
		for( int i = 0; i < quantAnimais; i++ ) {
			ocp += animais[i].calculaEspacoOcupado();
		}
		return ocp;
	}
	
	public float espacoDisponivel() {
		return calculaEspaco() - espacoOcupado();
	}

	public boolean adicionaAnimal( Animal animal ) {
		if( (espacoDisponivel() * 0.7) >= animal.calculaEspacoOcupado() ) {
			if( !(animal instanceof Peixe) ) {
				animais[quantAnimais] = animal;
				quantAnimais++;
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		StringBuffer string = new StringBuffer();
		string.append("Viveiro\n");
		string.append("Nome: " + nome + "\n");
		for( int i = 0; i < quantAnimais; i++ ) {
			string.append("\t" + animais[i].toString() + "\n");
		}
		return string.toString();
	}
	
}
