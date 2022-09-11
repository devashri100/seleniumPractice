package OpenBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\devashri\\workplace\\SeleniumBasic\\executables\\chromedriver.exe");
		ChromeDriver cdriver = new ChromeDriver();
		
		cdriver.get("https://www.google.com");
		cdriver.close();
	}

}
