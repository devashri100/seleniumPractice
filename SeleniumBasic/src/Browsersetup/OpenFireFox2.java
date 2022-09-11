package Browsersetup;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String currentWorkingDir=System.getProperty("user.dir");
	System.out.println("current working dir:"+currentWorkingDir);
		
		
	String chromeExePath=currentWorkingDir+"\\executables\\geckodriver.exe";
				
    System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
    
    FirefoxDriver fdriver = new FirefoxDriver();
    
    fdriver.get("https://www.google.com");
    
    fdriver.close();
	}
}
