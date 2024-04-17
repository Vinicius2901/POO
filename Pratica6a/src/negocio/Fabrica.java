package negocio;

import java.util.Random;

import dados.Bicicleta;
import dados.Carro;
import dados.Combustivel;
import dados.Cor;
import dados.Veiculo;

public class Fabrica {
	public Veiculo fabricar() {
		Random r = new Random();
		
		if(r.nextInt(2) == 1) {
			Carro c = new Carro();
			c.setCor(Cor.values()[r.nextInt(Cor.values().length)]);
			c.setNumPortas(2 + 2 * r.nextInt(2));
			c.setCombustivel(Combustivel.values()[r.nextInt(Combustivel.values().length)]);
			return c;
		}
		Bicicleta b = new Bicicleta();
		b.setCor(Cor.values()[r.nextInt(Cor.values().length)]);
		b.setNumMarchas(r.nextInt(28));
		return b;
	}
}
