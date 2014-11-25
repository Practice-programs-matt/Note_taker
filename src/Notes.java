
public class Notes {

	public static void trim(String text,String head)
	{ 
		int og_word_count = wordCount(text);
		text = text.replaceAll(" and ", " + ");  // adds + symol eveywhere there is an and
		text = text.replaceAll(" became ", " = ");
		
		int h = 0;
		while (h<10)
		{
			text = text.replaceAll("(the | the |by | also | more | than | observed |moreover | about |admitted | done |who | its | are | it's | of |great| which | at | in | indeed | however | did | his | she | her | as | lay | an | so | not |these | both | between | but | all | marked | mark |most |basis | this |who | quickly | that | or |,| how | had | it | so | noted | in | began | to | asked | it | was |noted | is | just | later | by | theier | they | felt | now | were | especially | be |about | had | close | recently | fellow | on | made | other | specific | a | well | turn | turned | after | long | was | rapid | most )" , " ");
			text = text.replaceAll("(  |   )", " "); // replaces double and triple spaces with a single space to eliminated odd spacing
			
			h++;
		}
		
		System.out.print(head);
		format(text);
		
		System.out.println("The original legnth is " + og_word_count);
		int end_length = wordCount(text);
		System.out.println("The end legnth is " + end_length);
		//System.out.println(text);		
	}
	
	public static void format(String text)
	{
		int periods = 0;

		int k = 0;
		int i = 0;
		
		System.out.println();
		while (k <+ text.length() && i != 5) 
			{
			if (k >= text.length()- 2)
			{
				i = 5;
			}
			else if (text.indexOf(".") == -1)
			{
				i = 5;
			}
			else
			{
				System.out.println("\t-"+ text.substring(k + 1 ,text.indexOf("." , k+1)) );	
				k = text.indexOf("." , k+1) + 1;
			}
			periods++;
			}
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
