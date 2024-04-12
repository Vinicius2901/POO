package dados;

public class Aluno {
	private String nome;
	private int idade;
	private double notas[] = new double[5];
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
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double notas, int i) {
		this.notas[i] = notas;
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
	
}
