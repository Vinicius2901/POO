package negocio;
import dados.Aluguel;
import dados.Endereco;
import dados.Pessoa;
import dados.Veiculo;

import java.util.Arrays;
import java.util.Objects;


public class Loja {
private Veiculo[] veiculosDisponiveis = new Veiculo[80];
private Aluguel[] carrosAlugados = new Aluguel[50];
private Pessoa[] vendedores = new Pessoa[20];
private Endereco enderecoLoja = new Endereco();
private Pessoa[] clientesComCarroAlugado = new Pessoa[30];
private int qntVeiculoDisponivel = 0, qntCarrosAlugados = 0, qntVendedores = 0, qntClientesComCarroAlugado = 0;
public Loja() {
	
}

public int getQntVeiculoDisponivel() {
	return qntVeiculoDisponivel;
}



public int getQntCarrosAlugados() {
	return qntCarrosAlugados;
}



public int getQntVendedores() {
	return qntVendedores;
}


public int getQntClientesComCarroAlugado() {
	return qntClientesComCarroAlugado;
}


public Veiculo[] getVeiculosDisponiveis() {
	return veiculosDisponiveis;
}
public void setVeiculosDisponiveis(Veiculo veiculosDisponiveis) {
	this.veiculosDisponiveis[this.qntVeiculoDisponivel] = veiculosDisponiveis;
	this.qntVeiculoDisponivel++;
}
public Aluguel[] getCarrosAlugados() {
	return carrosAlugados;
}
public void setCarrosAlugados(Aluguel carrosAlugados) {
	this.carrosAlugados[this.qntCarrosAlugados] = carrosAlugados;
	this.qntCarrosAlugados++;
}
public Pessoa[] getVendedores() {
	return vendedores;
}
public void setVendedores(Pessoa vendedores) {
	this.vendedores[this.qntVendedores] = vendedores;
	this.qntVendedores++;
}
public Endereco getEnderecoLoja() {
	return enderecoLoja;
}
public void setEnderecoLoja(Endereco enderecoLoja) {
	this.enderecoLoja = enderecoLoja;
}
public Pessoa[] getClientesComCarroAlugado() {
	return clientesComCarroAlugado;
}
public void setClientesComCarroAlugado(Pessoa clientesComCarroAlugado) {
	this.clientesComCarroAlugado[this.qntClientesComCarroAlugado] = clientesComCarroAlugado;
	this.qntClientesComCarroAlugado++;
}
@Override



public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Loja other = (Loja) obj;
	return Arrays.equals(carrosAlugados, other.carrosAlugados)
			&& Arrays.equals(clientesComCarroAlugado, other.clientesComCarroAlugado)
			&& Objects.equals(enderecoLoja, other.enderecoLoja) && qntCarrosAlugados == other.qntCarrosAlugados
			&& qntClientesComCarroAlugado == other.qntClientesComCarroAlugado
			&& qntVeiculoDisponivel == other.qntVeiculoDisponivel && qntVendedores == other.qntVendedores
			&& Arrays.equals(veiculosDisponiveis, other.veiculosDisponiveis)
			&& Arrays.equals(vendedores, other.vendedores);
}



public static void main(String[] args) {
	Loja loja1 = new Loja();
	Endereco endLoja1 = new Endereco(), endVendedor = new Endereco(), endCliente = new Endereco();
	Pessoa vendedor = new Pessoa();
	Pessoa cliente = new Pessoa();
	Veiculo carro1 = new Veiculo(), carro2 = new Veiculo(), carro3 = new Veiculo();
	Aluguel aluguel1 = new Aluguel(), aluguel2 = new Aluguel();
	//endereco lojas
	endLoja1.setNumero(1065);
	endLoja1.setRua("Avenida Rio Branco");
	endLoja1.setBairro("Centro");
	endLoja1.setCidade("Rio de Janeiro");
	endLoja1.setEstado("RJ");
	endLoja1.setCep("20040002");
	loja1.setEnderecoLoja(endLoja1);
	endVendedor.setNumero(815);
	endVendedor.setRua("Rua Cafelândia");
	endVendedor.setBairro("Santa Cruz");
	endVendedor.setCidade("Rio de Janeiro");
	endVendedor.setEstado("RJ");
	endVendedor.setCep("23525-252");
	vendedor.setClienteOuVendedor(true);
	vendedor.setEnderecoPessoa(endVendedor);
	endCliente.setNumero(434);
	endCliente.setRua("Antônio de Albuquerque");
	endCliente.setBairro("Jardim América");
	endCliente.setCidade("Rio de Janeiro");
	endCliente.setEstado("RJ");
	endCliente.setCep("21240-410");
	cliente.setClienteOuVendedor(false);
	cliente.setEnderecoPessoa(endCliente);
	//pessoa
	vendedor.setNome("Marina Juliana Isabelle Campos");
	vendedor.setIdade(34);
	vendedor.setCpf("816.300.087-29");
	cliente.setNome("Danilo José Augusto Carvalho");
	cliente.setIdade(61);
	cliente.setCpf("293.170.127-01");
	//carro
	carro1.setTipo("S70 2.5 Aut.");
	carro1.setMarca("Volvo");
	carro1.setAno(1997);
	carro1.setPrecoAluguel(5500.65f);
	carro1.setCaracteristicasFisicas("Vermelho");
	carro1.setCaracteristicasTecnicas("Placa: KMT-7297 e RENAVAM: 47257995559");
	carro2.setTipo("Trans-AM 5.7 V8");
	carro2.setMarca("Pontiac");
	carro2.setAno(1991);
	carro2.setPrecoAluguel(4962.86f);
	carro2.setCaracteristicasFisicas("Dourado");
	carro2.setCaracteristicasTecnicas("Placa: KSQ-4125; RENAVAM: 27932325493");
	carro3.setTipo("COOPER Country. John Works ALL4 1.6 Aut.");
	carro3.setMarca("MINI");
	carro3.setAno(2014);
	carro3.setPrecoAluguel(10056.35f);
	carro3.setCaracteristicasFisicas("Dourado");
	carro3.setCaracteristicasTecnicas("Placa: KQR-1428 | RENAVAM: 31519150910 ");
	//aluguel
	aluguel1.setCarro(carro1);
	aluguel1.setCliente(cliente);
	aluguel1.setDataFim("23/11/2030");
	aluguel1.setDataInicio("23/05/2030");
	float totAPagar = carro1.getPrecoAluguel() * 6;
	aluguel1.setTotalAPagar(totAPagar);
	aluguel1.setStatusPagamento("4 parcelas a pagar");
	cliente.setCarrosAlugadosAtivo(aluguel1);
	cliente.setHistoricoCarrosAlugados(carro1);
	aluguel2.setCarro(carro2);
	aluguel2.setCliente(vendedor);
	aluguel2.setDataInicio("14/02/2029");
	aluguel2.setDataFim("14/02/2030");
	totAPagar = carro2.getPrecoAluguel() *12;
	aluguel2.setTotalAPagar(totAPagar);
	aluguel2.setStatusPagamento("Pago");
	vendedor.setCarrosAlugadosAtivo(aluguel2);
	vendedor.setHistoricoCarrosAlugados(carro2);
	//loja
	loja1.setCarrosAlugados(aluguel1);
	loja1.setCarrosAlugados(aluguel2);
	loja1.setClientesComCarroAlugado(cliente);
	loja1.setClientesComCarroAlugado(vendedor);
	loja1.setVendedores(vendedor);
	loja1.setVeiculosDisponiveis(carro3);
	System.out.println("LOJA: " + "\n\n\n");
	System.out.println(loja1.getEnderecoLoja().toString() + "\n\n");
	System.out.println("Veículos disponiveis: " + "\n" );
for (int i = 0; i < loja1.getQntVeiculoDisponivel(); i++) {
	System.out.println(loja1.getVeiculosDisponiveis()[i].toString() + "\n");
}	
System.out.println("Veiculos alugados: " + "\n");
for (int i = 0; i < loja1.getQntCarrosAlugados(); i++) {
	System.out.println( loja1.getCarrosAlugados()[i].toString()+ "\n");
}
System.out.println("Clientes com carros alugados:" + "\n");
for (int i = 0; i < loja1.getQntClientesComCarroAlugado(); i++) {
	System.out.println(loja1.getClientesComCarroAlugado()[i].toString() + "\n");
}
System.out.println("Vendedores: " + "\n");
for (int i = 0; i < loja1.getQntVendedores(); i++) {
	System.out.println(loja1.getVendedores()[i].toString() + "\n");
}
System.out.println("\n\n");
System.out.println("Informacoes gerais sobre os clientes:" + "\n");
for(int j = 0; j < loja1.getQntClientesComCarroAlugado();j++) {
System.out.println(loja1.getClientesComCarroAlugado()[j].toString() + "\n");
System.out.println("Carros atualmente alugados:" + "\n");
for (int i = 0; i < loja1.getClientesComCarroAlugado()[j].getQntCarroAlugadoAtivo(); i++) {
	System.out.println(loja1.getClientesComCarroAlugado()[j].getCarrosAlugadosAtivo()[i].toString() + "\n");
}
System.out.println("Historico:" + "\n");
for (int i = 0; i < loja1.getClientesComCarroAlugado()[j].getQntHistoricoCarros(); i++) {
	System.out.println(loja1.getClientesComCarroAlugado()[j].getHistoricoCarrosAlugados()[i].toString() + "\n");
}
}
}
}
