
public class CharacterDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char letter=52;
		System.out.println(letter);
	// return 4	
		char letter1= '4';
		System.out.println(letter1);
	// return 4
		char letter2= '\u0034';
		System.out.println(letter2);
	//return 4


	byte b = 'a';
	int i = 'a';
	System.out.println(i+" is and "+b);
	
	char ch=  'a';
	
	if (ch >= 'A' && ch <= 'Z') 
		  System.out.println(ch + " is an uppercase letter"); 
	else if (ch >= 'a' && ch <= 'z') 
		  System.out.println(ch + " is a lowercase letter"); 
	else if (ch >= '0' && ch <= '9') 
		  System.out.println(ch + " is a numeric character"); 
	
	System.out.println("  Welcome           ".trim()); 

	
	System.out.println("Welcome to Java".startsWith("We")) ;
	}

}
