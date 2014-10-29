import java.util.*;
import java.io.*;

public class WordList 
{
	private ArrayList<String>words;
	
	public WordList(String fileName) throws IOException
	{
		this.words=new ArrayList <String>();
		FileReader file= new FileReader(fileName);
		BufferedReader br=new BufferedReader (file);
		String line=br.readLine();
		while(line!=null)
		{
			this.words.add(line);
			line=br.readLine();
		}
		br.close();
	}
	
	public String getRandomWord()
	{
		Random r=new Random();
		int index=r.nextInt(this.words.size());
		return this.words.get(index);
	}
	
}
