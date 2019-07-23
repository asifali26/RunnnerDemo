package mydemo_01.mydemo_01;
	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class XmlDemo {
	public static void main(String []args)
	{
		WebDriver driver;
//		int a=10;
//		int b=20;
//		int sum=a+b;
		System.setProperty("webdriver.chrome.driver" ,"C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
	driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		WebElement firstName = driver.findElement(By.xpath("//input[@name= \"userName\"]"));
		WebElement password = driver.findElement(By.xpath("//input[@name= \"password\"]"));
		WebElement submit = driver.findElement(By.xpath("//input[@name= \"Login\"]"));
		firstName.sendKeys("asif12345");
		password.sendKeys("1234556");
		submit.click();
		List <WebElement> list=driver.findElements(By.tagName("a"));
		int clinks=list.size();
		for(int i=0;i<clinks;i++)
		{
			System.out.println(list.get(i).getText());
		}
		//driver.close();
	//System.out.println("total is :"+sum);	
	}
	}       
