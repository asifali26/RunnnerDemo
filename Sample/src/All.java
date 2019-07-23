import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All {
public static void main(String []args)
{
	WebDriver driver;
//	int a=10;
//	int b=20;
//	int sum=a+b;
	System.setProperty("webdriver.chrome.driver" ,"C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com");
	WebElement firstName = driver.findElement(By.name("firstName"));
	WebElement lastName = driver.findElement(By.name("lastName"));
	WebElement email = driver.findElement(By.id("userName"));
	WebElement uname = driver.findElement(By.id("userName"));
	WebElement password = driver.findElement(By.name("password"));
	WebElement submit = driver.findElement(By.name("login"));
	uname.sendKeys("demo");
	password.sendKeys("demo");
	submit.click();
	driver.close();
//System.out.println("total is :"+sum);	
}
}       
  