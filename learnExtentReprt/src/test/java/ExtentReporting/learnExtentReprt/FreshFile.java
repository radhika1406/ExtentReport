package ExtentReporting.learnExtentReprt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class FreshFile {

	ExtentReports extentt;
    @BeforeTest
    public void config()
    {
    	//We need to class ExtentReport and 
    	//extentSparkReporter() : for creating reports, we need to give path where report file generated
    	//to create directory via command
    	System.out.println("Open Chromebrowser");
    	String path= System.getProperty("user.dir")+"\\reports\\report.html";
    	System.out.println("path is:"+ path);
    	ExtentSparkReporter sr=new ExtentSparkReporter(path);
    	sr.config().setReportName("My First Report");
    	sr.config().setDocumentTitle("Extent Report");
    	sr.config().setTheme(Theme.DARK);
    	
    	extentt=new ExtentReports();
    	extentt.attachReporter(sr);
    	extentt.setSystemInfo("Tester", "Radhika");
    	extentt.setSystemInfo("Environment used", "emma1-stage");
    	
    }
	@Test
	
	public void DropDownVisibleText(String value, WebElement W)
	{
		Select S=new Select(W);
		S.selectByVisibleText(value);
	}
    
	@Test
	public void DropDownByIndex(int value, WebElement W)
	{
		Select S=new Select(W);
		S.selectByIndex(value);
	}
	
	@Test
	public void DropDownByValue(String value, WebElement W)
	{
		Select S=new Select(W);
		S.selectByValue(value);
	}
	
	@Test
	public void InitialDemo() throws Throwable
	{
		extentt.createTest("Facebook New Account");
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\CourseWorkspace\\learnExtentReprt\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.facebook.com";
		driver.get(url);
		extentt.flush();
		
		extentt.createTest("Create new account");
	//	WebElement new_account=driver.findElement(By.linkText("Create New Account"));
		WebElement new_account=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
		new_account.click();
		Thread.sleep(2000);
		extentt.flush();
		
		extentt.createTest("Enter firstname");
		WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys("abcd");
		extentt.flush();
		
		extentt.createTest("Enter surname");
		WebElement surname=driver.findElement(By.name("lastname"));
		surname.sendKeys("efg");
		extentt.flush();
		
		extentt.createTest("Enter email address");
		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("abcdefg@gmail.com");
		extentt.flush();
		
		extentt.createTest("Enter password");
		WebElement passwd=driver.findElement(By.name("reg_passwd__"));
		passwd.sendKeys("Passw0rd");
		
		extentt.createTest("Select Birth Day");
		WebElement birth_day=driver.findElement(By.id("day"));
		DropDownVisibleText("16", birth_day);
		extentt.flush();
		
		extentt.createTest("Select Birth Month");
		WebElement birth_month=driver.findElement(By.id("month"));
		DropDownByIndex(5,birth_month);
		extentt.flush();
		
		extentt.createTest("Select Birth Year");
		WebElement birth_year=driver.findElement(By.id("year"));
		DropDownByValue("1999",birth_year);
		extentt.flush();
		
		extentt.createTest("Select Gender");
		WebElement radio_female=driver.findElement(By.cssSelector("label._58mt"));
		radio_female.click();
		
		extentt.createTest("Click on SIGN UP");
		WebElement sign_up=driver.findElement(By.name("websubmit"));
		sign_up.click();
		Thread.sleep(5000);
		
		driver.quit();
	}
}
