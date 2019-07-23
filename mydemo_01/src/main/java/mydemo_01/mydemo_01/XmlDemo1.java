package mydemo_01.mydemo_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XmlDemo1 {

	public static void main(String []args)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver" ,"C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
		driver.findElement(By.xpath("//input[@name= \"userName\"]")).sendKeys("asif12345");
		driver.findElement(By.xpath("//input[@name= \"firstName\"]")).sendKeys("asif");
		driver.findElement(By.xpath("//input[@name= \"lastName\"]")).sendKeys("ali");
		driver.findElement(By.xpath("//input[@name= \"password\"]")).sendKeys("1234556");
		driver.findElement(By.xpath("//input[@name= \"confirmPassword\"]")).sendKeys("1234556");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@name= \"emailAddress\"]")).sendKeys("asid@gmail.com");
		driver.findElement(By.xpath("//input[@name= \"mobileNumber\"]")).sendKeys("1234556231");
		driver.findElement(By.xpath("//input[@name= \"dob\"]")).sendKeys("1/2/2019");
		driver.findElement(By.xpath("//textarea[@name= \"address\"]")).sendKeys("FDAMFKNCKANCNCAN");
		driver.findElement(By.xpath("//input[@name= \"answer\"]")).sendKeys("dog");
		driver.findElement(By.xpath("//input[@name= \"Submit\"]")).click();
}
}
