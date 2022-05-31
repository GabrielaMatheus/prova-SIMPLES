
import java.util.*;

public class Carro {
	private int ano;
	private String marca;
	private String modelo;
	private String cor;
	private List<Item> itensDeSerie;
	private Motor motos;
	
	
	public void adicionaItemDeSerie(Item item) {
		
		if(this.itensDeSerie==null) {
			itensDeSerie = new ArrayList<Item>();
		}
		
		this.itensDeSerie.add(item);
		
	}

	//getters e setters

	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public List<Item> getItensDeSerie() {
		return itensDeSerie;
	}


	public void setItensDeSerie(List<Item> itensDeSerie) {
		this.itensDeSerie = itensDeSerie;
	}


	public Motor getMotor() {
		return motos;
	}


	public void setMotor(Motor motos) {
		this.motos = motos;
	}
	
	
	//sobrescrevendo o método toString
		public String toString() {
			String dados = "";
			for (Item nome : itensDeSerie) {
				 dados += nome.getDescricao();
			}
			
			return  dados ;
			
		}
	
	
	

}
