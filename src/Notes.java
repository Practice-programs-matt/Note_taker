
public class Notes {

	public static void trim(String text)
	{
		String wtr = 
		
		text = text.replaceAll("(the |by |of |great |and |as |that |,| )" , " ");
		text = text.replaceAll("  ", " ");
		format(text);
		System.out.println("the legnth is " + wordCount(text));
		System.out.println(text);		
	}
	
	public static String format(String text)
	{
		
		////////////////////////////
		int periods = 0;
		int m = 0;
		int k = 0;
		int i = 0;
		int p1 = 0;
		int p2 = 0;
		
		while (k <+ text.length() && i != 5) 
			{
			if (k >= text.length()- 2)
			{
				i = 5;
			}
			else
			{
				k = text.indexOf("." , k+1);
				System.out.println(text.substring(k,text.indexOf("." , k+1)));
				
				
			}
			
			System.out.println(periods);
			periods++;
			}
		////////////////////////////
		
		return text;
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
