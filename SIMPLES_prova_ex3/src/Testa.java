
public class Testa {
	
	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setNome("Maria");
		pf.setCpf("111.111.111-11");
		
		System.out.println(pf.imprimir());
		
		pj.setNome("Simples");
		pj.setCnpj("XX.XXX.XXX/YYYY-ZZ");
		
		System.out.println(pj.imprimir());
		
	}

}
