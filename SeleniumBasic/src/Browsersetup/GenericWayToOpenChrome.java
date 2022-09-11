package Browsersetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentWorkingDir=System.getProperty("user.dir");
        String chromeExePath=currentWorkingDir+"\\executables\\chromedriver.exe";
				
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		
		//ChromeDriver cdriver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
	}

}
