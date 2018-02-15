import java.util.Scanner;
public class chartrainning {

	public static void main(String[] args) {
		byte b = (byte)'\uFFF4';
				System.out.println(b);
				
		int i = (int)'B'; // The Unicode of character B is assigned to i 
		System.out.println(i); // i (A) is 65 B is 66
 		
		

			int t = '2' + '3'; // (int)'2' is 50 and (int)'3' is 51 
			System.out.println("t is " + t); // i is 101
			int j = 2 + 'a'; // (int)'a' is 97 
			System.out.println("j is " + j); // j is 99
			System.out.println(j + " is the Unicode for character "
					+ (char)j); // 99 is the Unicode for character c 
			
			
			Scanner input= new Scanner(System.in);
			char ch=input.next().charAt(0);
			
			if (ch >= 'A' && ch <= 'Z') {
					System.out.println(ch + " is an uppercase letter");}
			else if (ch >= 'a' && ch <= 'z') {
					System.out.println(ch + " is a lowercase letter"); }
			else if (ch >= '0' && ch <= '9') {
					System.out.println(ch + " is a numeric character");
	}
			
		System.out.println("isDigit('a') is " + Character.isDigit('5')); 
		System.out.println("isLetter('a') is " + Character.isLetter('a')); 
		System.out.println("isLowerCase('a') is "
					+ Character.isLowerCase('a'));
		System.out.println("isUpperCase('a') is "
					+ Character.isUpperCase('a')); 
		System.out.println("toLowerCase('T') is "
					+ Character.toLowerCase('T')); 
		System.out.println("toUpperCase('q') is "
					+ Character.toUpperCase('q')); 
			//displays
			//		  isDigit('a') is false
			//		  isLetter('a') is true
			//		  isLowerCase('a') is true
			//		isUpperCase('a') is false
			//		toLowerCase('T') is t
			//		toUpperCase('q') is Q

	}

}
