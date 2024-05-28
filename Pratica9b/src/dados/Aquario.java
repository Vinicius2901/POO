package dados;

public class Aquario extends Viveiro {
	private float altura;
	private float temperatura;
	
	public Aquario(int maxAnimais) {
		super(maxAnimais);
		// TODO Auto-generated constructor stub
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	
	public float calculaEspaco() {
		return super.calculaEspaco() * altura;
	}
	
	public void adicionaAnimal( Animal animal ) {
		if( animal instanceof Peixe ) {
			Peixe p = (Peixe) animal;
			if((p.getTemperaturaIdeal() - temperatura < -3) || (p.getTemperaturaIdeal() - temperatura > 3)) {
			}
			animais[quantAnimais] = animal;
			quantAnimais++;
		}
	}
	
	public String toString() {
		return super.toString() + "Temperatura: " + temperatura;
	}
}
