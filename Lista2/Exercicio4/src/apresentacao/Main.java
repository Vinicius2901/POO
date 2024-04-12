package apresentacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dados.Aluno;
import negocio.Equipe;
import negocio.Turma;

public class Main {
	private static Turma turma = new Turma();
	private static Scanner scan = new Scanner(System.in);
	private static List<Equipe<Aluno>> equipes = new ArrayList<Equipe<Aluno>>();
	
	public static void imprimeMenu() {
		System.out.println("Digite uma das opcoes abaixo:");
		System.out.println("(0) Encerrar programa");
		System.out.println("(1) Adicionar alunos");
		System.out.println("(2) Separar em grupos");
		System.out.println("(3) Mostrar alunos");
		System.out.println("(4) Mostrar grupos");
	}
	
	public static void main(String[] args) {
		turma.listarAlunos();
		int opt = -1;
		while( opt != 0 ) {
			imprimeMenu();
			opt = Integer.parseInt(scan.nextLine());
			switch( opt ) {
			case 0:
				System.out.println("Encerrando programa...");
				break;
			case 1:
				adicionarAlunos();
				break;
			case 2:
				separarEquipes();
				break;
			case 3:
				exibirAlunos();
				break;
			case 4:
				exibirEquipes();
				break;
			}
		}
	}
	
	public static Aluno novoAluno() {
		Aluno a = new Aluno();
		Double nota[] = new Double[5]; 
		System.out.println("Digite o nome do aluno:");
		a.setNome(scan.nextLine());
		System.out.println("Digite a idade do aluno:");
		a.setIdade(Integer.parseInt(scan.nextLine()));
		for( int i = 0; i < 5; i++) {
			System.out.println("Digite a nota '" + i + "' do aluno:");
			nota[i] = Double.parseDouble(scan.nextLine());
		}
		a.setNotas(nota);
		
		return a;
	}
	
	public static void adicionarAlunos() {
		turma.adicionarAluno(novoAluno());
	}
	
	public static void criarGrupos() {
		turma.separarEmEquipes();
	}
	
	public static void exibirAlunos() {
		turma.buscarAlunos().forEach( aluno -> {
			System.out.println( aluno );
		});
	}
	
	public static void separarEquipes() {
		equipes = turma.separarEmEquipes();
	}
	
	public static void exibirEquipes() {
		equipes.forEach( equipe -> {
			System.out.println( equipe );
		});
	}
	
}
