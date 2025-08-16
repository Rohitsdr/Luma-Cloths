package Check_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LumaSite {
	public static WebDriver driver = new FirefoxDriver();
	static String Url = "https://magento.softwaretestingboard.com/";

	public static void openSite() {
		driver.get(Url);
	}

	public static void rightLand() {
		String CheckUrl = driver.getCurrentUrl();

		if (Url.equalsIgnoreCase(CheckUrl)) {
			System.out.println("Right page landed");
		} else {
			driver.close();
		}

	}

	public static void select_Jacket() {
		Actions act = new Actions(driver);
		WebElement a1 = driver.findElement(By.id("ui-id-5"));

		act.moveToElement(a1).perform();

		WebElement a2 = driver.findElement(By.id("ui-id-17"));

		act.moveToElement(a2).perform();

		driver.findElement(By.id("ui-id-19")).click();

	}

	public static void Category() {
		Actions act = new Actions(driver);
		WebElement a1 = driver.findElement(By.id("ui-id-5"));

		act.moveToElement(a1).perform();

		WebElement a2 = driver.findElement(By.id("ui-id-17"));

		act.moveToElement(a2).perform();

		driver.findElement(By.id("ui-id-20")).click();

	}

	public static void select_Price() {

		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[2]/div/div[2]/div/div[10]/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[2]/div/div[2]/div/div[10]/div[2]/ol/li[2]/a"))
				.click();
	}

	public static void select_Any_Hoodie() {

		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div")).click();

	}

	public static void select_Size_Color() {

		driver.findElement(By.id("option-label-size-143-item-170")).click();

		driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-49\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();

	}

	public static void go_To_Cart() {

		Actions act = new Actions(driver);
		WebElement a1 = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a"));

		act.moveToElement(a1).click().perform();

		WebElement a2 = driver.findElement(By.id("top-cart-btn-checkout"));

		act.moveToElement(a2).click().perform();

	}

	public static void fill_Detail() throws InterruptedException {

		driver.findElement(By.id("customer-email")).sendKeys("Abcd@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("customer-password")).sendKeys("123456");

	}

	public static void main(String[] arg) throws InterruptedException {

		openSite();
		rightLand();
		
		Category();
		select_Price();
		select_Any_Hoodie();

		Thread.sleep(3000);

		select_Size_Color();

		Thread.sleep(3000);
		go_To_Cart();

		Thread.sleep(10000);

		fill_Detail();

	}
}
