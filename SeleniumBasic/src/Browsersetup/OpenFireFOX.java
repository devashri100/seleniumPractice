package Browsersetup;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFOX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
    
    FirefoxDriver fdriver = new FirefoxDriver();
    
    fdriver.get("https://www.google.com");
    
    fdriver.close();
	}

}
