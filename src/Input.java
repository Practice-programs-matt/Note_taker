import java.util.Scanner;


public class Input {

	public static void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your text >>>>>>>>");
		String text = scan.nextLine();
		
		System.out.println(lastWord(text));
		
		
	}
	
	
	
	public static int wordCount(String text)
	{
		int word_count = 0;
		int length = text.length();
		int m = 0;
		int k = 0;
		
		while (k <= length - lastWord(text) )
		{
			System.out.println(lastWord(text));
			
			k = text.indexOf(" ", k);
			k = text.indexOf(" ", k);
			
			
			word_count ++;
			m ++;
		}
		return word_count;
	}
	
	public static int lastWord(String text) // returns starting position of last word in phrase
	{
		int position = text.length();
		String m = "";
		int i = -1;
		
		if (i == text.indexOf( " "))
		{
			position = 0;
		}
		else 
		{
			while (!m.equals(" "))
			{
				m = text.substring(position-2 , position-1);
				position--;
			}
		}
		
		return position;
	}
}
