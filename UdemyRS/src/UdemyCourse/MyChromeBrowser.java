package UdemyCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyChromeBrowser {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:/Rahulshetty_Udemy/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}
