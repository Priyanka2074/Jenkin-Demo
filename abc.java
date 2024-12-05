package webdriverDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.Assert;

public class WebdriverDemo {
	public static void main(String []args) {
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--headless=new");
	WebDriver driver = new ChromeDriver(options); 
    driver.manage().window().maximize(); 
    driver.get("https://www.geeksforgeeks.org/");
    String actualRersult=driver.getTitle(); 
    System.out.println(actualRersult);
  
//    String expectedResult="GeeksforGeeks | A computer science portal for geeks"; 
//    Assert.assertEquals(actualRersult, expectedResult); 

	

}
}
