
public class Testa {
	
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setCpf("111.111.111-11");
		cliente.setRg("44.444.444-4");
		cliente.setNome("José da silva");
		
		Conta conta = new Conta(cliente);
		
		conta.setNumero("00000002-1");
		conta.setSaldo(20.00);
		
		System.out.println(conta.toString());
	}

}
