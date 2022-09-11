package Browsersetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentWorkingDir=System.getProperty("user.dir");
			
		String chromeExePath=currentWorkingDir+"\\executables\\geckodriver.exe";
					
	    System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
	    
	    //FirefoxDriver fdriver = new FirefoxDriver();
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.google.com");
	    
	    driver.close();

	}

}
