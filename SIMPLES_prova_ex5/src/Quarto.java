
public class Quarto {
	private String cor;
	private int numero ;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public String toString() {
		return getNumero() + " - " + getCor() + ", ";
	}
	
	
}
