package negocio;

import java.util.Arrays;
import java.util.Scanner;

import dados.Imobiliaria;
import dados.Imovel;

public class Main {
	private static Imovel[] areaMaior = new Imovel[10];
	private static Imobiliaria imobiliaria = new Imobiliaria();
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		imobiliaria.setNome("Robba");
		Imovel imovel1 = new Imovel();
		imovel1.setComprimento(30f);
		imovel1.setLargura(10f);
		imovel1.setPreco(1500000f);
		imobiliaria.adcImovel(imovel1);
		
		Imovel imovel2 = new Imovel();
		imovel2.setComprimento(10f);
		imovel2.setLargura(10f);
		imovel2.setPreco(500000f);
		imobiliaria.adcImovel(imovel2);
		
		Imovel imovel3 = new Imovel();
		imovel3.setComprimento(20f);
		imovel3.setLargura(10f);
		imovel3.setPreco(750000f);
		imobiliaria.adcImovel(imovel3);
		
		System.out.println(imobiliaria);
		
		System.out.println("Digite a area que deseja:");
		float area = Float.parseFloat(scan.nextLine());
		areaMaior = imobiliaria.filtrarPorArea(area);
		System.out.println("Imoveis com area >= a " + area );
		System.out.println(Arrays.toString(areaMaior));
	}
}
