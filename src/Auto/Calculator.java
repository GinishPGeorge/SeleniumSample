package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.calculator.net");
driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/table/tbody/tr[2]/td[2]/div/div[1]/span[2]"));
JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", element);
	}

}
