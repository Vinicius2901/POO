package apresentacao;

import dados.Qualidade;
import exceptions.NomeInvalidoException;
import negocio.SistemaArquivos;

public class Main {
	private static SistemaArquivos sistema = new SistemaArquivos();
	
	public static void main(String[] args) {
		// Teste de erros
		try {
			sistema.criarDocumento("Nome", "Downloads", "ABUDBA");
		}
		catch( NomeInvalidoException e ) {
			System.out.println( e.getMessage() );
		}
		try {
			sistema.criarDocumento("RedacaoImportante'", "Area de trabalho", "SFSADFASEFV");
		}
		catch( NomeInvalidoException e ) {
			System.out.println( e.getMessage() );
		}
		try {
			sistema.criarDocumento("RedacaoImportante\"", "Area de trabalho", "SFSADFASEFV");
		}
		catch( NomeInvalidoException e ) {
			System.out.println( e.getMessage() );
		}
		try {
			sistema.criarDocumento("RedacaoImportante(", "Area de trabalho", "SFSADFASEFV");
		}
		catch( NomeInvalidoException e ) {
			System.out.println( e.getMessage() );
		}
		try {
			sistema.criarDocumento("RedacaoImportante)", "Area de trabalho", "SFSADFASEFV");
		}
		catch( NomeInvalidoException e ) {
			System.out.println( e.getMessage() );
		}
		try {
			sistema.criarDocumento("RedacaoImportante[", "Area de trabalho", "SFSADFASEFV");
		}
		catch( NomeInvalidoException e ) {
			System.out.println( e.getMessage() );
		}
		try {
			sistema.criarDocumento("RedacaoImportante]", "Area de trabalho", "SFSADFASEFV");
		}
		catch( NomeInvalidoException e ) {
			System.out.println( e.getMessage() );
		}
		try {
			sistema.criarDocumento("RedacaoImportante'", "Area de trabalho", "SFSADFASEFV");
		}
		catch( NomeInvalidoException e ) {
			System.out.println( e.getMessage() );
		}
		
		System.out.println();
		// Arquivos com nomenclatura correta:
		try {
			sistema.criarDocumento("RedacaoImportante", "Downloads", "SFSADFASEFV");
		}
		catch( NomeInvalidoException e ) {
			System.out.println( e.getMessage() );
		}
		try {
			sistema.criarMusica("Imagine Dragons - Radioactive", "Area de trabalho", 276);
		}
		catch( NomeInvalidoException e ) {
			System.out.println( e.getMessage() );
		}
		try {
			sistema.criarVideo("Em busca da casa automatica", "Downloads",  Qualidade.P720);
		}
		catch( NomeInvalidoException e ) {
			System.out.println( e.getMessage() );
		}
		try {
			sistema.criarVideo("HIMYM S01E01", "Area de trabalho",  Qualidade.P1080);
		}
		catch( NomeInvalidoException e ) {
			System.out.println( e.getMessage() );
		}
		try {
			sistema.criarDocumento("Lista de compras", "Area de trabalho",  "-Tomate\n"
					+ "-Arroz\n-Feijao\n");
		}
		catch( NomeInvalidoException e ) {
			System.out.println( e.getMessage() );
		}
		
		System.out.println( sistema );
	}
}
