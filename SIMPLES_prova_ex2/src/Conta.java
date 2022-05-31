
public class Conta {
	private String numero;
	private double saldo;
	private Cliente cliente;
	
	public Conta (Cliente cliente) {
		this.cliente = cliente;
	}

	
	
	
	public String getNumero() {
		return numero;
	}




	public void setNumero(String numero) {
		this.numero = numero;
	}




	public double getSaldo() {
		return saldo;
	}




	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}




	public Cliente getCliente() {
		return cliente;
	}




	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}




	public String toString() {
		System.out.println("Dados da Conta: ");
		String dados = "Número da Conta: " + this.getNumero() + "\nSaldo: " + this.getSaldo() + "\n"+"\nDados do cliente: " + "\n" + getCliente();
		return dados;
	}

}
