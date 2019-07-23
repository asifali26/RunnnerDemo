package mydemo_01.mydemo_01;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XmlCss {
public static void main(String []args)
{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver" ,"C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/");
	driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	driver.findElement(By.cssSelector("input#userName")).sendKeys("asif12345");
	driver.findElement(By.cssSelector("input#password")).sendKeys("1234556");
    driver.findElement(By.cssSelector("input[name='Login']")).click();
    driver.close();      
	}
}       
