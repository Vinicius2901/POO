package dados;

import java.util.Objects;

public class Aluguel {
private String dataInicio;
private String dataFim;
private Pessoa cliente = new Pessoa();
private Veiculo carro = new Veiculo();
private float totalAPagar;
private String statusPagamento;
public Aluguel() {
	
}
public String getDataInicio() {
	return dataInicio;
}
public void setDataInicio(String dataInicio) {
	this.dataInicio = dataInicio;
}
public String getDataFim() {
	return dataFim;
}
public void setDataFim(String dataFim) {
	this.dataFim = dataFim;
}
public Pessoa getCliente() {
	return cliente;
}
public void setCliente(Pessoa cliente) {
	this.cliente = cliente;
}
public Veiculo getCarro() {
	return carro;
}
public void setCarro(Veiculo carro) {
	this.carro = carro;
}
public float getTotalAPagar() {
	return totalAPagar;
}
public void setTotalAPagar(float totalAPagar) {
	this.totalAPagar = totalAPagar;
}
public String getStatusPagamento() {
	return statusPagamento;
}
public void setStatusPagamento(String statusPagamento) {
	this.statusPagamento = statusPagamento;
}

public String toString() {
	return "Aluguel [Inicio: " + dataInicio + "\n" + "Fim: " + dataFim + "\n" +  "Cliente: " + cliente.toString() + "\n" + "Carro: " + carro.toString()
			+ "\n" + "Total a Pagar = " + totalAPagar + ", Status do Pagamento: " + statusPagamento + "]";
}

public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Aluguel other = (Aluguel) obj;
	return Objects.equals(carro, other.carro) && Objects.equals(cliente, other.cliente)
			&& Objects.equals(dataFim, other.dataFim) && Objects.equals(dataInicio, other.dataInicio)
			&& Objects.equals(statusPagamento, other.statusPagamento)
			&& Float.floatToIntBits(totalAPagar) == Float.floatToIntBits(other.totalAPagar);
}


}
