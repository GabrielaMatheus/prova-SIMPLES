
public class PessoaFisica extends Pessoa{
	private String cpf;
	private Pessoa nome;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

	public String imprimir() {
		return super.imprimir()+ "\nCPF:" + this.getCpf();
	} 
	
	
	
	
	
	

}
