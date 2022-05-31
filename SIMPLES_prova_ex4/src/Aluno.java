
public class Aluno extends Pessoa implements Avaliavel{
	private int matricula;
	
	public Aluno (String nome, int matricula) {
		super(nome);
		this.matricula = matricula;
	}
	
	public double calcularNota(double nota1, double nota2){
		double media = (nota1 + nota2)/2;
		System.out.println("Média: "+ media);
		return media;
	};
	
	
}
