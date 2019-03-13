package hj;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hanjia3 {
	WebDriver driver;
	//打开页面
	@Before
	public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		driver=new ChromeDriver();
		String url="https://flight.qunar.com/";
		driver.get(url);
	}
	@Test
	public void wen() throws InterruptedException {
		driver.findElement(By.id("searchTypeSng")).click();
		driver.findElement(By.name("fromCity")).clear();
		driver.findElement(By.name("fromCity")).sendKeys("厦门");
		driver.findElement(By.name("toCity")).sendKeys("南昌");
		driver.findElement(By.name("toCity")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[4]/button")).click();
		Thread.sleep(6000);
	}
}
