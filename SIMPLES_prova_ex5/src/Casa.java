import java.util.*;




public class Casa {
	
	private String donoDaCasa;
	private List<Quarto> quartos;
	private Quarto quartoo = null;
	
	public Casa() {
		this.quartos = new ArrayList<Quarto>();
	}
	
	public void adicionaQuarto(Quarto quarto) throws QuartoJaExisteException{
		
		for(Quarto quartoDaLista: this.quartos) {
			if(quartoDaLista.getNumero() == quarto.getNumero()) {
				throw new QuartoJaExisteException();
				
			}
			
			
		}
		this.quartos.add(quarto);
		
		
		
		
	}
	
	
	
	
	
	public String getDonoDaCasa() {
		return donoDaCasa;
	}

	public void setDonoDaCasa(String donoDaCasa) {
		this.donoDaCasa = donoDaCasa;
	}

	public List<Quarto> getQuartos() {
		return quartos;
	}

	public void setQuartos(List<Quarto> quartos) {
		this.quartos = quartos;
	}

	public String toString() {
		String dados = "Casa do " + getDonoDaCasa() + " tem o(s) quarto(s):" + "\n" ;
		
		for(int aux = 0; aux < quartos.size(); aux++) {
			//dados+= quartoo.getNumero();
			dados += this.quartos.get(aux);   
		   } 

		
		return dados;
		
	}

}
