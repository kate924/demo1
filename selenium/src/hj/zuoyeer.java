package hj;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zuoyeer {
	WebDriver driver;
	//´ò¿ªÒ³Ãæ
	@Before
	public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		driver=new ChromeDriver();
		String url="http://localhost:8080/Exam_ssh/";
		driver.get(url);
	}
	/*
	@Test
	public void ceshi1() {
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[1]")).click();
		driver.findElement(By.name("stuNumber")).sendKeys("123456");
		driver.findElement(By.name("stuName")).sendKeys("kate");
		driver.findElement(By.name("B1")).click();
		
	}
	*/
	@Test
	public void ceshi2() {
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[2]")).click();
		driver.findElement(By.id("name")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.name("B1")).click();
		driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[3]")).click();
	}
}
