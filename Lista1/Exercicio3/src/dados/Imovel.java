package dados;

public class Imovel {
	private float largura;
	private float comprimento;
	private float preco;
	public float getLargura() {
		return largura;
	}
	public void setLargura(float largura) {
		this.largura = largura;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float calculaArea() {
		float area = this.comprimento * this.largura;
		return area;
	}
	
	public String toString() {
		String imovel = "";
		imovel += "\nLargura: " + largura;
		imovel += "\nComprimento: " + comprimento;
		imovel += "\nArea: " + calculaArea();
		imovel += "\nPreco: " + preco + "\n";
		return imovel;
	}
	
}
