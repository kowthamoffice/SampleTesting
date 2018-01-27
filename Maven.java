package Maven.SampleTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Geethu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://facebook.com");
       // driver.manage().window().maximize();
        String Title = driver.getTitle();
        System.out.println("Application title is :: "+Title );
	}

}
