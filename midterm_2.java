
public class midterm_2 {

	public static void main(String[] args) {
		
		int[]array = new int[50];
		
		for(int i=0;i<array.length;i++) {
			array[i]= getRandomInt();//MAKE
		}
		
		int count=0;
		int total=0;
		do {
			total +=array[count];
			count++;
		}while(count<array.length);
		
		double average = calcAverage(total,count); // Make
		int i =0;
		int countOverAvg=0;
		while( i <array.length) {
			if (array[i]>average) {
				countOverAvg++;
			}
			i++;
		}
		System.out.println("Total of the random number is "+ total);
		System.out.printf("The average of the random numbers is %10.2\n",average);
		System.out.println("The number of the random numbers in the array greater "+ "than the average is ");
	}
	public static int getRandomInt() {
		int random = 10 +(int)(Math.random()*(50-10+1));
		return random;
	}
	public static double calcAverage(int total, int count) {
			return(double)total/count;
	}

}
