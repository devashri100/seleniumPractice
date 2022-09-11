package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String CurrentWorkingDir=System.getProperty("user.dir");
		String ChromeExePath=CurrentWorkingDir+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",ChromeExePath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		String pageTitle = driver.getTitle();
		
		System.out.println("page title is:" + pageTitle);
		String expectedTitle = "Amazon.com. Spend less. Smile more.";
		System.out.println("title validation status:" + pageTitle.equals(expectedTitle));
		
		String pageurl = driver.getCurrentUrl();
		System.out.println("page title is:" + pageurl);
		String expectedurl="https://www.amazon.in/";
		System.out.println("url validation status:" + pageurl.contains(expectedurl));
		
		String pagesource = driver.getPageSource();
		System.out.println("page source is:" + pagesource);
		System.out.println("page source lenght is:" + pagesource.length());
		
		
		driver.close();

	}

}
