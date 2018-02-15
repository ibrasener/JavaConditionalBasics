import java.util.Scanner;

public class contains {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string ");
		String first=input.next();
		System.out.print("Enter string");
		String second=input.next();
		
		String first1="ABCD";
		String second2="ABCD";
		System.out.print(first1.contains(second2)); //? second + " is a substring of "+first : "YOK BISI");

	}

}
