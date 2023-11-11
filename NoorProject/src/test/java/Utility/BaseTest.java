package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Proxy;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	public static WebDriver driver;
	public static String projectPath = System.getProperty("user.dir");
	public static Properties p;
	
	public void launchBrowser(String browser) throws Exception {
		FileInputStream fis = new FileInputStream(projectPath+"/data.properties");
		p = new Properties();
		p.load(fis);
		
		if(p.getProperty(browser).equalsIgnoreCase("chrome")) {
//			ChromeOptions co = new ChromeOptions();
//			co.setBrowserVersion("115");
//			driver = new ChromeDriver(co);
			//System.setProperty("WebDriver.chrome.driver", projectPath+"/driver/Chromedriver.exe");
			driver = new ChromeDriver();
		}else if(p.getProperty(browser).equalsIgnoreCase("edge")) {
			//System.setProperty("WebDriver.edge.driver", projectPath+"/driver/msedgedriver.exe");
			driver = new EdgeDriver();
		}else if(p.getProperty(browser).equalsIgnoreCase("Firefox")) {
			//System.setProperty("WebDriver.geco.driver", projectPath+"/driver/gecodriver.exe");
			driver = new FirefoxDriver();
		}
//		Proxy proxy = new Proxy();
//		proxy.setAutodetect(false);
//		//proxy.setHttpProxy("localhost:8080");
//		proxy.setSslProxy("localhost:8080");
//		ChromeOptions option = new ChromeOptions();
//		option.setCapability("proxy", proxy);
		
	}
	
	public void closeBrowser() throws Exception {
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
	
	public void navigateAppUrl(String url) {
		driver.navigate().to(p.getProperty(url));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String appTitle = driver.getTitle();
		//System.out.println(appTitle);
		if(appTitle.contentEquals("Ace Online Shoe Portal")) {
			System.out.println("Ace Online Shoe Portal open successfully");
		}else {
			System.out.println("Ace Online Shoe Portal did not open");
		}
	}
	
}
