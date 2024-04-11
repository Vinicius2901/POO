package dados;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private int idade;
	private String cpf;
	private String cidade;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String toString() {
		String pessoa = "";
		pessoa += "- " + nome + ", " + idade + ", " + cpf + ", " + cidade + "\n";
		return pessoa;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Pessoa))
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf);
	}
	@Override
	public int compareTo(Pessoa o) {
		return this.nome.compareTo(o.nome);
	}
	
}