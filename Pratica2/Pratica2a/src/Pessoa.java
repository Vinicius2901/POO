
public class Pessoa {
	private String nome;
	private int idade;
	private float altura;
	private float massa;
	
	public Pessoa() {
		
	}
	
	public void setNome( String nome ) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade( int idade ) {
		if( idade >= 0 ) {
			this.idade = idade;
		}
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setAltura( float altura ) {
		this.altura = altura;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	public void setMassa( float massa ) {
		this.massa = massa;
	}
	
	public float getMassa() {
		return this.massa;
	}
	
	public float calculaImc() {
		return this.massa / ( this.altura * this.altura );
	}
	
}
