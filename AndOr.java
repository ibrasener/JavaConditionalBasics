
public class AndOr {
	public static void main(String[] args) {
		java.util.Scanner input= new java.util.Scanner(System.in);
		// TODO Auto-generated method stu
		/*int x;
		x=1;
		
		System.out.println((x>1) & (x++<10));
		System.out.println(x);
		
		System.out.println((1>x) && (x++<10));
		System.out.println(x);
		
		System.out.println((1 == x) || (10 < x++));
		System.out.println(x);
		
		System.out.println((1 == x) | (10 > x++));
		System.out.println(x);
		*/
		/*int a= 10, b = 7;
		int c = 10 & 7;
		System.out.print(10 & 7);
		System.out.print(10 && 7);*/
		
			System.out.println("1- Say Hi\n"
					+ "2- Say Bye\n"
					+ "3- Say Goodday\n"
					+ "4- Say Bonjour\n"
					+ "5- Exit");
		
		
			System.out.println("Choice: ");
			String choice = input.nextLine();
			
			String message ="";
			switch(choice) {
			
			case "C":
				break;
			case "B":
				message = "Hello";
				break;
			case "D":
				message = "Bonjour";
				break;
			case "A":
				message = "ahahaha";
				break;
			case "T":
				message = "Bye";
				break;
			default:
				message = "Invalid choice";
			}
			System.out.println(message);	
		}
		
		

 }

