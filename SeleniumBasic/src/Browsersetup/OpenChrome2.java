package Browsersetup;

import org.openqa.selenium.chrome.ChromeDriver;

    public class OpenChrome2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentWorkingDir=System.getProperty("user.dir");
		System.out.println("current working dir:"+currentWorkingDir);
		
		
		String chromeExePath=currentWorkingDir+"\\executables\\chromedriver.exe";
				
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		
		ChromeDriver cdriver = new ChromeDriver();
		
		cdriver.get("https://www.google.com");
		cdriver.close();
	}
}
