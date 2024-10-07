import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class TestCase_001_LaunchWebBrowser {

	BaseClass base = new BaseClass();

	public void test_with_LaunchAmazonWebPage_Chrome() throws IOException {
		WebDriver chromeBrowserInstantiation = base.chromeBrowserInstantiation();

		String url = AccessProperties.accessPropertiesValues("amazon_url");
		
		base.getWebPage(url, chromeBrowserInstantiation);

	}

	public static void main(String[] args) throws IOException {
		TestCase_001_LaunchWebBrowser obj = new TestCase_001_LaunchWebBrowser();

		obj.test_with_LaunchAmazonWebPage_Chrome();
	}

}
