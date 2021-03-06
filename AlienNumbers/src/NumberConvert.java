import java.util.ArrayList;
import java.util.Scanner;


public class NumberConvert 
{
	String simbolsAlvo;
	
	public NumberConvert() 
	{
		simbolsAlvo="";
	}
	
	public void getNumber(Scanner data) 
	{
		
		
		int cases= data.nextInt();
		
		for(int i=1;i<=cases;i++)
		{
			//mostra na tela
			
			
			
			char[] sourceNum=data.next().toCharArray();  
			
			Language sourceLang= new Language(data.next());
			
			
			
			
			int number= getNumber(sourceNum,sourceLang);
			
			
			Language targetLang= new Language(data.next());
			
			simbolsAlvo=TargetNumber(number,targetLang);
			
			//exibindo na tela
			System.out.format("%s\n",simbolsAlvo);
		}
	}

	private String TargetNumber(int num, Language lang) 
	{
		
		String finalNumber = null;
		ArrayList<Integer> characters= baseConversion(num, lang.getSystemBase());
		
		finalNumber= symbolicForm(characters, lang);
		
		return finalNumber;
	}

	private String symbolicForm(ArrayList<Integer> charSet, Language lang) 
	{
		String alv = "";
		
		for(int i:charSet)
		{
			alv+=lang.charOf(i);
		}
		alv=new StringBuilder(alv).reverse().toString();//essa porte pode ser parada em qualquer lugar
		return alv;
	}

	private ArrayList<Integer> baseConversion(int num, int base) 
	{
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		
		while(base<=num)
			
			
			
		{
			int characterValue=num%base;
			numbers.add(characterValue);
			num=num/base;
		}
		numbers.add(num);
		
		
		return numbers;
	}

	private int getNumber(char[] number,Language lang) 
	{
		
		
		int numeric = 0;
		
		for(int i=0;i<number.length;i++)
		{
			numeric+=lang.valueOf(number[i])
					*Math.pow(lang.getSystemBase(), number.length-i-1);
			
		}
		return numeric;
	}

}
