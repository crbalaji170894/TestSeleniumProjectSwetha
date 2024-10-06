import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowserTest {

	public void launchChromeBroswer() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\TestSeleniumProjectSwetha\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

	}

	public void launchFirfoxBrowser() {
		

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\HP\\eclipse-workspace\\TestSeleniumProjectSwetha\\drivers\\geckodriver.exe");

		WebDriver driver1 = new FirefoxDriver();

		driver1.get("https://www.amazon.in/");
	}

	public void launchIEBrowser() {
		System.setProperty("webdriver.iedriverserver.driver",
				"C:\\Users\\HP\\eclipse-workspace\\TestSeleniumProjectSwetha\\drivers\\IEDriverServer.exe");

		WebDriver driver1 = new InternetExplorerDriver();

		driver1.get("https://www.amazon.in/");
	}

	public static void main(String[] args) {

		LaunchBrowserTest testObj = new LaunchBrowserTest();

		testObj.launchFirfoxBrowser();

	}

}
