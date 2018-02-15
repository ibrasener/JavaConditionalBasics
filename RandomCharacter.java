
public class RandomCharacter {

	public static void main(String[] args) {
		
		int randomNumber=(int) (65+(Math.random()*(90-65+1)));
		char ch= (char)randomNumber;
		System.out.println(ch);
		
		char directlyRandom=(char)(Math.random()*26+'A');
		System.out.println(directlyRandom);

	}

}
