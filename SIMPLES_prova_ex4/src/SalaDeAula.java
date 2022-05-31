import java.util.*;


public class SalaDeAula {
	private Professor professor;
	private Map<Integer,Aluno> mapaDeAlunos ;
	private int numeroChamada = 1;
	
	public SalaDeAula() {
		
		this.mapaDeAlunos = new HashMap<Integer,Aluno>();
	}
	
	
	public void adicionarAluno(Aluno a) throws LimiteDeAlunosPorSalaException{
		
		if(this.mapaDeAlunos.size()<30) {
			this.mapaDeAlunos.put(numeroChamada,a);
			numeroChamada++;
		}else {
			throw new LimiteDeAlunosPorSalaException();
		}
	}
	

	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Map<Integer, Aluno> getMapaDeAlunos() {
		return mapaDeAlunos;
	}


	public void setMapaDeAlunos(Map<Integer, Aluno> mapaDeAlunos) {
		this.mapaDeAlunos = mapaDeAlunos;
	}

	public int getNumeroChamada() {
		return numeroChamada;
	}


	public void setNumeroChamada(int numeroChamada) {
		this.numeroChamada = numeroChamada;
	}
	
	
	public String toString() {
		
		String dados = "Professor: "+ getProfessor() + "\nQuantidade de alunos na sala: " + getMapaDeAlunos();
		return  dados;
		//nome professor
		//mapa da sala
		//nome alunos e media - aprovado ou reprovado
		
		
	}
	
	

}
