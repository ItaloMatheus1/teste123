package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Utils {

	public static WebDriver driver;

	public static void acessarSistema() {
		System.setProperty("Webdrive.chrome.driver", "C:\\drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
	}

	public static <T> T Na(Class<T> classe){
		return PageFactory.initElements(driver, classe);
	}
	
	
	
//	public static void fecharSistema() {
//		driver.close();
//		}

}
