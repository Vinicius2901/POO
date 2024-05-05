package dados;

public abstract class Animal {
	private String nome;
	
	public Animal( String nome ) {
		this.nome = nome;
	}
	
	public Animal() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract String emitirSom();
	
	public String toString() {
		String animal = "";
		animal += nome + ": " + emitirSom();
		return animal;
	}
}
