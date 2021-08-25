package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheUrlOfTheApp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
