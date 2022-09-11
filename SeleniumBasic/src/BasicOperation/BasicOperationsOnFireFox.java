package BasicOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicOperationsOnFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//or using System class
				String driverPath3=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
				//Set the driver executable path using System.setProperty(String key,String value)
				System.setProperty("webdriver.gecko.driver", driverPath3);
				//create an instance of required browser class
				WebDriver driver=new FirefoxDriver();
				
				//need to enter application URL in the opened browserS
				driver.get("https://www.google.com");
				
				//expected page url
				String expectedUrl="https://www.google.com";
				//get the entered URL from the opened browser
				String appCurrentUrl=driver.getCurrentUrl();				
				System.out.println("Actaul URL:"+appCurrentUrl);
				System.out.println("Expected URL: "+expectedUrl);
				if(appCurrentUrl.contains(expectedUrl)) {
					System.out.println("Current URL validation is passed");
				}else {
					System.out.println("Current URL validation is Failed");
				}
				
				//verify that Google search page is opened or not using title
				String actualTitle=driver.getTitle();
				String expectedTitle="Google";
				System.out.println("ActualTitle:"+actualTitle);
				System.out.println("ExpectedTitle: "+expectedTitle);
				if(actualTitle.equals(expectedTitle)) {
					System.out.println("Title validation is passed");
				}else {
					System.out.println("Title validation is Failed");
				}
				//get the webpage source content
				String sourceContent=driver.getPageSource();
				System.out.println("Source content lenght:"+sourceContent.length());
				//close current browser
				driver.close();

	}

}
