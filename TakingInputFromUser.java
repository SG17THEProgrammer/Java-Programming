import java.io. BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class TakingInputFromUser 
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		String name=br.readLine();
		System.out.println("entered name is "+name);
	}
}