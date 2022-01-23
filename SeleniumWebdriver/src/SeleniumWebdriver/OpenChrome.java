package SeleniumWebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\CourseWorkspace\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		String url="www.google.com";
		driver.get(url);
		
		
		

	}

}
