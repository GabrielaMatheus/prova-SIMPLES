import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileInput 
{
	//deixando o construtor publico
	public FileInput()
	{
	}
	
	public void runFile(String DataSet)
	{
		File f= new File(DataSet);
		try {
			
			Scanner fileContents= new Scanner(f);
			
			NumberConvert calculator= new NumberConvert();
			calculator.getNumber(fileContents);
			fileContents.close();
			
			
			
		} catch (FileNotFoundException e) {
			
			System.out.format("%s não foi encontrado em %s\n",f, System.getProperty("user.dir"));
			e.printStackTrace();
		}
	}
}
