package Auto;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calculator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.calculator.net");
WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/table/tbody/tr[2]/td[2]/div/div[1]/span[2]"));
JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", element);

driver.wait(3000);
WebElement a=driver.findElement(By.id("sciOutPut"));
String b = a.getText();
System.out.println("The output is " +b);

assertEquals(b, "8");
	}

}
