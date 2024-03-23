package dados;

public class Aluguel {
	private String inicioAluguel;
	private String retornoAluguel;
	private Cliente cliente;
	private Moto moto;
	private Carro carro;
	private boolean eCarro = false;
	private boolean eMoto = false;
	
	public String getInicioAluguel() {
		return inicioAluguel;
	}
	public void setInicioAluguel(String inicioAluguel) {
		this.inicioAluguel = inicioAluguel;
	}
	public String getRetornoAluguel() {
		return retornoAluguel;
	}
	public void setRetornoAluguel(String retornoAluguel) {
		this.retornoAluguel = retornoAluguel;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Moto getMoto() {
		return moto;
	}
	public void setMoto(Moto moto) {
		this.moto = moto;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public boolean iseCarro() {
		return eCarro;
	}
	public void seteCarro(boolean eCarro) {
		this.eCarro = eCarro;
	}
	public boolean iseMoto() {
		return eMoto;
	}
	public void seteMoto(boolean eMoto) {
		this.eMoto = eMoto;
	}
	@Override
	public String toString() {
		String aluguel = "";
		aluguel += "\nCliente: " + cliente;
		aluguel += "\nData de inicio: " + inicioAluguel;
		aluguel += "\nData de fim: " + retornoAluguel;
		
		if( eCarro == true ) {
			aluguel += "\nCarro: " + carro;
 		}
		if( eMoto == true ) {
			aluguel += "\nMoto: " + moto;
		}
		return aluguel;
	}
	
	
	
	
}
