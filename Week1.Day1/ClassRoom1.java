package week1.day1;

public class ClassRoom1 {

	public static void main(String[] args) {
	
	int number = 4;
	if(number%3==0&&number%5==0)
	{
	System.out.println("TRIZZ-FIZZ");
	}
	else if(number%5==0)
	{
		System.out.println("FIZZ");
	}
	
	else if(number%3==0) 
	{
		System.out.println("TRIZZ");
	}
	
	else {
		System.out.println("Not divisible by 3 and 5");
	}
	
	}
}
