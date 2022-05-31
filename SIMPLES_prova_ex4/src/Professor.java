
public class Professor extends Pessoa implements Avaliavel {
	private String materia;
	
	public Professor (String nome, String materia) {
		super(nome);
		this.materia = materia;
	}
	
	public double calcularNota(double nota1, double nota2){
		double media = nota1 + nota2;
		return media;
	};
	
	public String avaliar(Avaliavel avaliavel, double nota1, double nota2) {
		
		double resuldado = avaliavel.calcularNota(nota1, nota2);
		if(resuldado >= 6) {
			System.out.println("Aprovado");
			return "Aprovado";
			
		}else {
			System.out.println("Reprovado");
			return "Reprovado";
		}
	}

}
