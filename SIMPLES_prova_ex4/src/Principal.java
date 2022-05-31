
public class Principal {
	
	public static void main(String[] args) {
		
		SalaDeAula salaDeAula = new SalaDeAula();
		Professor professor = new Professor("João", "Física");
		
		Aluno a = new Aluno("Pedro",111);
		Aluno b = new Aluno("Paulo",222);
		Aluno c = new Aluno("Roberto",333);
		Aluno d = new Aluno("Jessica",444);
		Aluno e = new Aluno("Carol",555);
		
		salaDeAula.setProfessor(professor);
		
		try {
			salaDeAula.adicionarAluno(a);
		}catch(LimiteDeAlunosPorSalaException e1) {
			e1.getMessage();
		}
		
		try {
			salaDeAula.adicionarAluno(b);
		}catch(LimiteDeAlunosPorSalaException e2) {
			e2.getMessage();
		}
		
		try {
			salaDeAula.adicionarAluno(c);
		}catch(LimiteDeAlunosPorSalaException e3) {
			e3.getMessage();
		}
		
		try {
			salaDeAula.adicionarAluno(d);
		}catch(LimiteDeAlunosPorSalaException e4) {
			e4.getMessage();
		}
		
		try {
			salaDeAula.adicionarAluno(e);
		}catch(LimiteDeAlunosPorSalaException e5) {
			e5.getMessage();
		}
		
		
		professor.avaliar(a, 5, 6);
		professor.avaliar(b, 10, 6);
		professor.avaliar(c, 1, 10);
		professor.avaliar(d, 9, 6);
		professor.avaliar(e, 10, 10);
		
		
		
		
		
	}

}
