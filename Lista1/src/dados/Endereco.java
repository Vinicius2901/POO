package dados;

import java.util.Objects;

public class Endereco {
private int numero;
private String rua;
private String bairro;
private String cep;
private String estado;
private String cidade;
public Endereco() {
	
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getRua() {
	return rua;
}
public void setRua(String rua) {
	this.rua = rua;
}
public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}
public String getCep() {
	return cep;
}
public void setCep(String cep) {
	this.cep = cep;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}

public String toString() {
	return "Endereco [numero " + numero + ", rua " + rua + ", bairro " + bairro + ", cidade: " + cidade  + ", estado: " + estado
			+ ", CEP: " + cep + "]";
}


public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Endereco other = (Endereco) obj;
	return Objects.equals(bairro, other.bairro) && Objects.equals(cep, other.cep)
			&& Objects.equals(cidade, other.cidade) && Objects.equals(estado, other.estado) && numero == other.numero
			&& Objects.equals(rua, other.rua);
}


}
