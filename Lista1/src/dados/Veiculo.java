package dados;

import java.util.Objects;

public class Veiculo {
private String tipo;
private String marca;
private int ano;
private float precoAluguelMes;
private String caracteristicasTecnicas;
private String caracteristicasFisicas;
public Veiculo() {
	
}

public String getMarca() {
	return this.marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public float getPrecoAluguel() {
	return precoAluguelMes;
}
public void setPrecoAluguel(float precoAluguel) {
	this.precoAluguelMes = precoAluguel;
}
public String getCaracteristicasTecnicas() {
	return caracteristicasTecnicas;
}
public void setCaracteristicasTecnicas(String caracteristicasTecnicas) {
	this.caracteristicasTecnicas = caracteristicasTecnicas;
}
public String getCaracteristicasFisicas() {
	return caracteristicasFisicas;
}
public void setCaracteristicasFisicas(String caracteristicasFisicas) {
	this.caracteristicasFisicas = caracteristicasFisicas;
}

public String toString() {
	return "Veiculo [Tipo: " + tipo + ", Ano: " + ano + ", Marca: " + marca + "\n" + "Preco ao Mes = " + precoAluguelMes + "\n" +"Caracteristicas Tecnicas: " + "\n"
			+ caracteristicasTecnicas + "\n" +  "Caracteristicas Fisicas: " + "\n" + caracteristicasFisicas + "]";
}


public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Veiculo other = (Veiculo) obj;
	return ano == other.ano && Objects.equals(caracteristicasFisicas, other.caracteristicasFisicas)
			&& Objects.equals(caracteristicasTecnicas, other.caracteristicasTecnicas)
			&& Objects.equals(marca, other.marca)
			&& Float.floatToIntBits(precoAluguelMes) == Float.floatToIntBits(other.precoAluguelMes)
			&& Objects.equals(tipo, other.tipo);
}

}
