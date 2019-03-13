package hj;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class zuoye1 {
	WebDriver driver;
	//打开页面
	@Before
	public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		driver=new ChromeDriver();
		String url="http://localhost:8080/shop1/index.jsp";
		driver.get(url);
	}
	/*
	@Test
	public void chaxun1() {
		WebElement s1=driver.findElement(By.name("select_type"));
		Select s=new Select(s1);
		s.selectByValue("电视机系列");
		driver.findElement(By.xpath("/html/body/center[3]/form/table/tbody/tr/td[5]/input")).click();
	}
	*/
	/*
	@Test
	public void chaxun2() {
		driver.findElement(By.name("select_p_name")).sendKeys("创维TFT32L16SW");
		driver.findElement(By.xpath("/html/body/center[3]/form/table/tbody/tr/td[5]/input")).click();
		Alert aa=driver.switchTo().alert();//跳转弹框
		aa.accept();//点击弹框中的确定
	}
	*/
	/*
	@Test
	public void goumai() {
		driver.findElement(By.name("c_name")).sendKeys("aaaaaa");
		driver.findElement(By.name("c_pass")).sendKeys("aaa");
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[2]/table[2]/tbody/tr[1]/td[2]/p[3]/input")).click();
		driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td/form/table[2]/tbody/tr[1]/td/font/input[1]")).click();
		WebElement a1=driver.findElement(By.name("pay_fangshi"));
		Select a=new Select(a1);
		a.selectByIndex(2);
		driver.findElement(By.name("pay_address")).sendKeys("china");
		driver.findElement(By.name("pay_email")).sendKeys("2812894165@qq.com");
		driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/table/tbody/tr[6]/td/form/table/tbody/tr[7]/td/input[1]")).click();
	}
	*/
	/*
	@Test
	public void yijian() {
		driver.findElement(By.name("c_name")).sendKeys("aaaaaa");
		driver.findElement(By.name("c_pass")).sendKeys("aaa");
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();
		driver.findElement(By.linkText("意见反馈")).click();
		driver.findElement(By.name("c_message")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[1]")).click();
	}
	*/
	@Test
	public void zhulei() {
		driver.findElement(By.xpath("/html/body/center[6]/table/tbody/tr/td/a")).click();
		driver.findElement(By.name("a_name")).sendKeys("admin");
		driver.findElement(By.name("a_pass")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("添加商品主分类")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.name("t_name")).sendKeys("inter");
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[2]/td[3]/input[1]")).click();
	}
}
