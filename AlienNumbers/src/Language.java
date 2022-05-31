import java.util.Arrays;


public class Language 
{
	private char[] characterSet;
	public Language()
	{	
	}
	
	public Language(String s)
	{
		//seta o método com uma única correspondencia
		characterSet=s.toCharArray();
	}
	public int getSystemBase()
	{
		//da a base numerica pro sistema converter em diferentes bases
		return characterSet.length;
	}
	public char charOf(int i)
	{
		//da o simbolo numerico do valor do numero pra calcular nas conversoes
		return characterSet[i];
	}
	public int valueOf(char c)
	{
		//da o valor numerico do simbolo dado (do metodo anterios) pra usar no inicio e final da conversao 
		for(int i=0;i<=characterSet.length;i++)
		{
			if(characterSet[i]==c)
			{
				return i;// retorna o valor do simbolo dado
			}
		}
		System.out.format("%c was not found", c);
		return -1; //vai retornar um erro porque o caracter não faz parte dos caracteres da linguagem
	}
	
	public @Override String toString() //metodo usado pra debbug (ajuda/dica tirada da internet)
	{
		return Arrays.toString(characterSet);
	}
}
