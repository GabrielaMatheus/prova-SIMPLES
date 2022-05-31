import java.util.Scanner;


public class Runner {

	public static void main(String[] args) 
	{
		//parte tirada da internet e implementada aqui, de um cara no gitHub chamado @marcos07pereira
		
		FileInput f= new FileInput();
		System.out.println("Rodar losta grande ou pequena?");
		System.out.println("Insira 'small' para pequena ou 'large' para grande");
		
		Scanner s =new Scanner(System.in);
		String filePick=s.next();
		if(filePick.equals("small"))
		{
			f.runFile("A-small-practice.in");
		}
		if(filePick.equals("large"))
		{
			f.runFile("A-large-practice.in");
		}
		
		s.close();

	}

}
