package dados;

import java.util.Arrays;

public class Veterinario {
	private String nome;
	private float salario;
	private Endereco endereco;
	private int quantidadeAnimais = 0;
	private Animais[] animais;
	
	public Veterinario( int tam ) {
		animais = new Animais[tam];
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getQuantidadeAnimais() {
		return quantidadeAnimais;
	}
	public void setQuantidadeAnimais(int quantidadeAnimais) {
		this.quantidadeAnimais = quantidadeAnimais;
	}
	public Animais[] getAnimais() {
		return animais;
	}
	public void setAnimais(Animais animais) {
		if( quantidadeAnimais < 5 ) {
			this.animais[quantidadeAnimais] = animais;
			quantidadeAnimais++;
		}
		else {
			System.out.println("A quantidade de animais para esse veterinario foi excedida");
		}
	}

	@Override
	public String toString() {
		return "Veterinario [nome=" + nome + ", salario=" + salario + ", endereco=" + endereco + ", quantidadeAnimais="
				+ quantidadeAnimais + ", animais=" + Arrays.toString(animais) + "]";
	}
	
	
}
