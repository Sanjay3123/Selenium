package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();	//Open the browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");	//Load the URL
		driver.manage().window().maximize();	//Maximize the browser
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");	//Enter UserName
		driver.findElement(By.id("password")).sendKeys("crmsfa");	//Enter Password
		driver.findElement(By.className("decorativeSubmit")).click();	// Click Login
		driver.findElement(By.linkText("CRM/SFA")).click();	// Click CRM/SFA
		driver.findElement(By.linkText("Contacts")).click();	//Click Contacts Tab
		driver.findElement(By.linkText("Create Contact")).click();	//Click Create Contact
		driver.findElement(By.className("inputBox")).sendKeys("Sanjay");	//Type First Name
		driver.findElement(By.id("lastNameField")).sendKeys("Sundaram");	//Type Last Name
		driver.findElement(By.className("smallSubmit")).click();	//Click Create Contact Button
		String firstName = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println("First name is "+firstName);
		
		String title = driver.getTitle();
		System.out.println("Browser title is "+title);
		
		//driver.close();		//driver.close();
		
		
		
		
		
	
	}
	
}


/*Open the browser
Load the URL
Maximize the browser
Enter UserName
Enter Password
Click Login
Click CRM/SFA
Click Contacts Tab
Click Create Contact
Type First Name
Type Last Name
Click Create Contact Button
Print the first name and browser title 
Close the browser*/