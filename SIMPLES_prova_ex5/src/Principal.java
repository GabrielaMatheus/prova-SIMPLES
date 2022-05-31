
public class Principal {

	public static void main(String[] args) {
		Casa casa = new Casa();
		Casa casa2 = new Casa();
		Quarto quarto = new Quarto();
		Quarto quarto2 = new Quarto();
		Quarto quarto3 = new Quarto();
		Quarto quarto4 = new Quarto();
		Quarto quarto5 = new Quarto();
		
		quarto.setNumero(1);
		quarto.setCor("verde");
		
		try {
			casa.adicionaQuarto(quarto);
		}catch(QuartoJaExisteException e){
			e.getMessage();
			
		}
		
		
		quarto2.setNumero(1);
		quarto2.setCor("azul");
		
		try {
			casa.adicionaQuarto(quarto2);
		}catch(QuartoJaExisteException e2){
			e2.getMessage();
			
		}
		
		quarto3.setNumero(2);
		quarto3.setCor("branco");
		
		try {
			casa.adicionaQuarto(quarto3);
		}catch(QuartoJaExisteException e3){
			e3.getMessage();
			
		}
		
		
		casa.setDonoDaCasa("Fulano");
		
		System.out.println(casa.toString());
		
		
		
		
		//
		
		quarto4.setNumero(1);
		quarto4.setCor("verde");
		
		
		
		try {
			casa2.adicionaQuarto(quarto4);
		}catch(QuartoJaExisteException e4){
			e4.getMessage();
			
		}
		
		quarto5.setNumero(2);
		quarto5.setCor("amarelo");
		
		try {
			casa2.adicionaQuarto(quarto5);
		}catch(QuartoJaExisteException e5){
			e5.getMessage();
			
		}
		
		
		casa2.setDonoDaCasa("Ciclano");
		
		System.out.println(casa2.toString());
		
	
		
	}
}
