package day10;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dzsc {
	WebDriver driver;
	//��ҳ��
	@Before
	public void openfire() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		driver=new ChromeDriver();
		String url="http://localhost:8080/shop1/index.jsp";
		driver.get(url);
	}
	
	/*
	 * һ������
	����Ʒ��������
	����Ʒ������
	����Ʒ���ͺ���Ʒ����ȷ����
	
	 //����Ʒ��������
	@Test
	public void sousuo() {
		WebElement s1=driver.findElement(By.name("select_type"));
		Select s=new Select(s1);
		s.selectByIndex(1);
		driver.findElement(By.name("Submit")).click();
        driver.close();
	}
	//����Ʒ������
	@Test
	public void sousuo1() throws InterruptedException {
		driver.findElement(By.name("select_p_name")).sendKeys("����");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		Alert com=driver.switchTo().alert();
		Thread.sleep(2000);
		com.accept();
        driver.close();
	}
	//����Ʒ���ͺ���Ʒ����ȷ����
	@Test
	public void sousuo2() throws InterruptedException {
		WebElement s1=driver.findElement(By.name("select_type"));
		Select s=new Select(s1);
		s.selectByIndex(1);
		driver.findElement(By.name("select_p_name")).sendKeys("����");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.className("STYLE1")).click();
        driver.close();
	}
	*/
	
	/*
	
	
	 * ��������
		��¼--ѡ����--ȷ������
	 
	@Test
	public void gouwu() {
		driver.findElement(By.name("c_name")).sendKeys("aaaaaa");
		driver.findElement(By.name("c_pass")).sendKeys("aaa");
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[2]/table[2]/tbody/tr[1]/td[2]/p[3]/input")).click();
		driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td/form/table[2]/tbody/tr[1]/td/font/input[1]")).click();
		WebElement a1=driver.findElement(By.name("pay_fangshi"));
		Select a=new Select(a1);
		a.selectByIndex(1);
		driver.findElement(By.name("pay_address")).sendKeys("China");
		driver.findElement(By.name("pay_email")).sendKeys("2812894165@qq.com");
		driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/table/tbody/tr[6]/td/form/table/tbody/tr[7]/td/input[1]")).click();
		driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/table/tbody/tr[11]/td/table/tbody/tr[4]/td/input[1]")).click();
	}
	
	*/
	
	/*
	
	
	 �����������
	��¼--�����������--�������
	
	@Test
	public void yjfk() {
		driver.findElement(By.name("c_name")).sendKeys("aaaaaa");
		driver.findElement(By.name("c_pass")).sendKeys("aaa");
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();
		driver.findElement(By.linkText("�������")).click();
		driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[5]/td[2]/textarea")).sendKeys("nihaoselenium");
		driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[1]")).click();
		
	}
	*/
	
	/*
	 һ�����һ����Ʒ������
	����ɾ������
	������������
	*/
	
	/*
	@Test
	public void houtai1() {
		driver.findElement(By.xpath("/html/body/center[6]/table/tbody/tr/td/a")).click();
		driver.findElement(By.name("a_name")).sendKeys("admin");
		driver.findElement(By.name("a_pass")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("�����Ʒ������")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.name("t_name")).sendKeys("inter");
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[2]/td[3]/input[1]")).click();
	}
	*/
	
	/*
	@Test
	public void houtai2() {
		driver.findElement(By.xpath("/html/body/center[6]/table/tbody/tr/td/a")).click();
		driver.findElement(By.name("a_name")).sendKeys("admin");
		driver.findElement(By.name("a_pass")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("�鿴/�༭���ж���")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("ɾ��")).click();
	}
	*/
	@Test
	public void houtai3() {
		driver.findElement(By.xpath("/html/body/center[6]/table/tbody/tr/td/a")).click();
		driver.findElement(By.name("a_name")).sendKeys("admin");
		driver.findElement(By.name("a_pass")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("��������")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.name("n_message")).sendKeys("666666");
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[5]/td/input[1]")).click();
	}
}
