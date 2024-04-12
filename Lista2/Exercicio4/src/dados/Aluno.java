package dados;

public class Aluno implements Comparable<Aluno> {
	private String nome;
	private int idade;
	private Double notas[] = new Double[5];
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Double[] getNotas() {
		return notas;
	}
	public void setNotas(Double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		double soma = 0;
		for( int i = 0; i < 5; i++ ) {
			soma += notas[i];
		}
		return soma/5;
	}
	
	public String toString() {
		String aluno = "";
		aluno += nome + ", " + idade + ", " + calcularMedia();
		return aluno;
	}

	@Override
	public int compareTo(Aluno o) {
		return Double.compare( this.calcularMedia(), o.calcularMedia() );
	}
	
}
