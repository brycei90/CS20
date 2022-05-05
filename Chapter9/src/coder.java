import java.util.Scanner;
//encode a message//
public class coder {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		char[] textLetter;
		String text;
		
		System.out.println("Enter a String: ");
		text = input.nextLine();
		
		textLetter = text.toCharArray();//converts to array of characters
		
		//encode text
		for(int i = 0; i < textLetter.length/*size of array */; i++)
		{
			if((textLetter[i/*if textletter at the specific index */] >= 'a' && textLetter[i] <= 'z') 
					|| textLetter[i] >= 'A' && textLetter[i] <= 'Z')
				{
					if(textLetter[i] == 'y') 
					{
						textLetter[i] = 'a';	
				    }else if(textLetter[i] == 'Y') 
					{
						textLetter[i] = 'A';	
				    }else if(textLetter[i] == 'z') 
					{
						textLetter[i] = 'b';	
				    }else if(textLetter[i] == 'Z') 
					{
						textLetter[i] = 'B';	
				    }else
				    {
				    	textLetter[i] = (char)(textLetter[i] + 2);
				    }
				}	
		}
		//reports to user
		System.out.println("Encoded message: ");
		for(int i = 0; i < textLetter.length/*size of array */; i++)
		{
			System.out.print(textLetter[i]);
		}
		System.out.println();
	}

}
/* screen dump
Enter a String: 
Calgary
Encoded message: 
Ecnicta
*/