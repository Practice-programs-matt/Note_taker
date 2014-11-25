import java.util.Scanner;


public class Input {

	public static void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the heading");
		String head = scan.nextLine();
		
		System.out.println("Enter your text >>>>>>>>");
		String text = scan.nextLine();
		text = text.toLowerCase();
		
		
		Notes.trim(text,head);
	
	}
	

	public static int wordCount(String text)
	{
		int word_count = 0;
		int length = text.length();
		int m = 0;
		int k = 0;
		int last_word_length =length - lastWord(text);
		
		while (k <= length - last_word_length  && m == 0)
		{
			if (k == length - last_word_length-1) 
			{
				m = 5;// ends loops
			}
			else
			{
				k = text.indexOf(" ", k + 1);
			}
			word_count ++;	
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
