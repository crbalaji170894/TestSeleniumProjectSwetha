import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

//	WebDriver driver;

	WebDriver chromeDriver;

	WebDriver fireFoxDriver;

	WebDriver internetExplorerDriver;

	public WebDriver chromeBrowserInstantiation() {
		System.setProperty(Constants.chromeDriverKey, System.getProperty("user.dir") + Constants.chromeDriverPath);

		chromeDriver = new ChromeDriver();

		return chromeDriver;
	}

	public void firFoxBrowserInstantiation() {
		System.setProperty(Constants.geckoDriverKey, System.getProperty("user.dir") + Constants.geckoDriverPath);

		fireFoxDriver = new FirefoxDriver();

	}

	public void IEBrowserInstantiation() {
		System.setProperty(Constants.ieDriverKey, System.getProperty("user.dir") + Constants.ieDriverPath);

		internetExplorerDriver = new InternetExplorerDriver();
	}

	public void getWebPage(String URL, WebDriver driver) {

		driver.get(URL);

	}
}
