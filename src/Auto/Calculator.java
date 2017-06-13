package Auto;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

public class Calculator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.calculator.net");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/div[4]/ul/li[3]/a")).click();
	driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr[1]/td/input[1]")).sendKeys("10");
	driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr[1]/td/input[2]")).sendKeys("100");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr[2]/td/input[2]")).click();
	
	String result = driver.findElements(By.xpath("/html/body/div[3]/div[1]/p[2]/font/b")).get(0).getText();
	System.out.println("The output is " +result);

	}

}
