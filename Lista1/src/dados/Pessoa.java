package dados;

import java.util.Arrays;
import java.util.Objects;

public class Pessoa {
private String nome;
private int idade;
private String cpf;
private Aluguel[] carrosAlugadosAtivo = new Aluguel[2];
private Veiculo[] historicoCarrosAlugados = new Veiculo[50];
private Endereco enderecoPessoa;
private boolean clienteOuVendedor;
private int qntCarroAlugadoAtivo = 0, qntHistoricoCarros = 0;
public Pessoa() {
	
}

public int getQntCarroAlugadoAtivo() {
	return qntCarroAlugadoAtivo;
}

public int getQntHistoricoCarros() {
	return qntHistoricoCarros;
}

public String getNome() {
	return nome;
}
public int getIdade() {
	return idade;
}
public String getCpf() {
	return cpf;
}
public Aluguel[] getCarrosAlugadosAtivo() {
	return carrosAlugadosAtivo;
}
public Veiculo[] getHistoricoCarrosAlugados() {
	return historicoCarrosAlugados;
}
public Endereco getEnderecoPessoa() {
	return enderecoPessoa;
}
public boolean isClienteOuVendedor() {
	return clienteOuVendedor;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public void setCarrosAlugadosAtivo(Aluguel carrosAlugadosAtivo) {
	this.qntCarroAlugadoAtivo++;
	this.carrosAlugadosAtivo[this.qntCarroAlugadoAtivo-1] = carrosAlugadosAtivo;
}
public void setHistoricoCarrosAlugados(Veiculo historicoCarrosAlugados) {
	this.qntHistoricoCarros++;
	this.historicoCarrosAlugados[this.qntHistoricoCarros-1] = historicoCarrosAlugados;
}
public void setEnderecoPessoa(Endereco enderecoPessoa) {
	this.enderecoPessoa = enderecoPessoa;
}
public void setClienteOuVendedor(boolean clienteOuVendedor) {
	this.clienteOuVendedor = clienteOuVendedor;
}
@Override



public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Pessoa other = (Pessoa) obj;
	return Arrays.equals(carrosAlugadosAtivo, other.carrosAlugadosAtivo) && clienteOuVendedor == other.clienteOuVendedor
			&& Objects.equals(cpf, other.cpf) && Objects.equals(enderecoPessoa, other.enderecoPessoa)
			&& Arrays.equals(historicoCarrosAlugados, other.historicoCarrosAlugados) && idade == other.idade
			&& Objects.equals(nome, other.nome) && qntCarroAlugadoAtivo == other.qntCarroAlugadoAtivo
			&& qntHistoricoCarros == other.qntHistoricoCarros;
}
@Override
public String toString() {
	if(this.clienteOuVendedor) {
	return "Pessoa [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", vendedor."+ "\n" + enderecoPessoa.toString() + "]";
}
	return "Pessoa [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", cliente."+ "\n" + enderecoPessoa + "]";

}


}
