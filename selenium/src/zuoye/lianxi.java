package zuoye;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lianxi {
	WebDriver driver;
	@Before
	public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		driver=new ChromeDriver();
		String url="http://localhost:8080/Banksys_ssh/loginValidate.action";
		driver.get(url);
	}
	/*
	 * ��½-ȡ��-�鿴������Ϣ*/
	@Test
	public void qukuan() throws InterruptedException {
		//��½
		driver.findElement(By.id("loginValidate_userNO")).sendKeys("1545285549703");
		driver.findElement(By.id("loginValidate_password")).sendKeys("123456");
		driver.findElement(By.id("loginValidate_0")).click();
		//���ȡ��
		driver.switchTo().frame("leftFrame");
		driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		driver.switchTo().defaultContent();
		//��ӡ������Ϣ
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.name("money")).sendKeys("100");
		WebElement jy1=driver.findElement(By.id("fmoneyValidate_0"));
		jy1.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("leftFrame");
		driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
		WebElement bb=driver.findElement(By.xpath("/html/body/center"));
		System.out.println(bb.getText());
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		//�ٴ�ȡ���ڵĽ��
		driver.switchTo().frame("leftFrame");
		driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
		Thread.sleep(10000);
		driver.findElement(By.name("money")).sendKeys("100");
		WebElement jy=driver.findElement(By.id("fmoneyValidate_0"));
		jy.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
		WebElement aa=driver.findElement(By.xpath("/html/body/center"));
		System.out.println(aa.getText());
	}
}
