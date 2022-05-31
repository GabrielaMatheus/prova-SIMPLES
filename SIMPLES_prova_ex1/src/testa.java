import java.util.*;

public class testa {
	
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		ArrayList ItensDeSerie = new ArrayList();
		Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();
		
		Motor motor = new Motor();
		
		
		carro.setModelo("Gol");
		carro.setMarca("Volkswagen");
		carro.setAno(2000);
		carro.setCor("Preto ");

		item1.setDescricao("Ar condicionado ");
		carro.adicionaItemDeSerie(item1);
		
		item2.setDescricao("vidro elétrico ");
		carro.adicionaItemDeSerie(item2);
		
		item3.setDescricao("trava elétrica ");
		carro.adicionaItemDeSerie(item3);

		motor.setPotencia(110);
		motor.setQtdCilindros(4);
		
		System.out.println("Descrição do carro: " + carro.getMarca() + ", " + carro.getModelo() + ", " + carro.getAno() + ", " + carro.getCor());
		System.out.println("Itens de série: " + carro.toString());
		System.out.println("Motor: " + motor.getPotencia() + " cv, " + motor.getQtdCilindros() + " cilindros");
		
		
	}

}
