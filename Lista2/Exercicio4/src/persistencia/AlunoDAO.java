package persistencia;

import java.util.List;

import dados.Aluno;

public class AlunoDAO {
	private ArquivoAlunoDAO arquivoAlunoDAO = new ArquivoAlunoDAO();
	
	public List<Aluno> getAll() {
		return arquivoAlunoDAO.leAlunos();
	}
}
