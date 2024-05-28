package dados;

public class Animal {
	private String nome, cor, especie;
	private int idade;
	protected float comprimento, largura, altura;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
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
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float calculaEspacoOcupado() {
		return comprimento * largura;
	}
	
	public String toString() {
		String animal = "";
		animal += "Nome: " + nome;
		animal += " Cor: " + cor;
		animal += " Especie: " + especie;
		animal += " Idade: " + idade;
		return animal;
	}
	
}
