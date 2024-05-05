package apresentacao;

import dados.Animal;
import dados.Cachorro;
import dados.Gato;
import dados.Vaca;

public class Main {
	
	public static void main(String[] args) {
		Animal animal;
		animal = new Cachorro();
		animal.setNome("Zeus");
		System.out.println( animal );
		
		animal = new Cachorro();
		animal.setNome("Nina");
		System.out.println( animal );
		
		animal = new Gato();
		animal.setNome( "Bella" );
		System.out.println( animal );
		
		animal = new Gato();
		animal.setNome( "Eve" );
		System.out.println( animal );
		
		animal = new Vaca();
		animal.setNome( "Joca" );
		System.out.println( animal );
		
		animal = new Vaca();
		animal.setNome( "Merla" );
		System.out.println( animal );
	}

}
