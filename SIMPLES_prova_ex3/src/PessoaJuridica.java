
public class PessoaJuridica extends Pessoa{
	private String cnpj;
	private Pessoa nome;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpf) {
		this.cnpj = cnpf;
	}
	
	
	public String imprimir() {
		return super.imprimir()+ "\nCNPJ: " + this.getCnpj();
	} 
	
	

}
