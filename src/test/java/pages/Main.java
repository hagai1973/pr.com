package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.xml.LaunchSuite.ExistingSuite;

public class Main extends Base {

	public Main(WebDriver driver) {
		super(driver);
	}

	// start registration
	public boolean register() throws InterruptedException {

		click(By.xpath("//a[@title='Register']"));
		return true;
	}

	// select account
	public boolean selectAccount() throws InterruptedException {

		click(By.cssSelector("#other > div.question.first-question > div"));
		click(By.xpath(
				"//div[@class='dropdown custom-select step-one open']//li[@data-value='freelancer-or-smb'][@class='option']"));
		return true;
	}

	
	//verify field 1 is shown
	public boolean verifyFilterInLookingField_1() throws InterruptedException {
		click(By.cssSelector(".dropdown.custom-select.step-two"));			
		
		WebElement we1 = driver.findElement(By.xpath("//div[@id=\"other\"]/div[2]/div/div/ul/li[1]"));
		WebElement we2 = driver.findElement(By.xpath("//div[@id=\"other\"]/div[2]/div/div/ul/li[2]"));
		
		String style1 = we1.getAttribute("style");
		String style2 = we2.getAttribute("style");
		
		if (style1.equals("display: block;") && (style2.equals("display: block;")))
			return true;
		else
			return false;
		
		
	}
	
	

}
