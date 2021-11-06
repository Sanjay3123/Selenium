package week1.day1;

public class ConNegToPosNum {

	public static void main(String[] args) {
		
	
	//1. Initialize an integer with a negative number like, int number = -40;
	int number = -40;
	//2. Check if the number is a negative number Hint : any number that is lesser than zero is a negative number{
	if(number<0) 
	{
	System.out.println("The number is negative " +number);
	
	//3. If so, convert the number to a positive number
	int positiveNumber= number*(-1);
	
	//4. Print as below "The number -40 is converted to 40"	
		
	System.out.println("The number "+number +" is converted to "+positiveNumber);
		
	}
	
	
	
    
	
	}
}
