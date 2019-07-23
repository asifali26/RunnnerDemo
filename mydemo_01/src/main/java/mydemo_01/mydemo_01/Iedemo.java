package mydemo_01.mydemo_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Iedemo {
	public static void main(String []args) {
	WebDriver driver;
	System.setProperty("webdriver.ie.driver" , "C:\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	driver=new InternetExplorerDriver();
      	driver.close();
	}
}
