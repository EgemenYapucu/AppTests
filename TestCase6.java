import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase6 {
// Bel çevresi, omuz çevresi ve kilo negatif değerde olmamalıdır.	
	public static void main(String[] args) {
		// Kullanıcağımız driverı ve ulaşacağımız lokasyonu set ediyoruz
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				    
		String baseUrl = "https://www.saucedemo.com/";
		driver.get(baseUrl);
		//Sayfada bulunan her bir eleman için test dedğerlerini gönderiyoruz.
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");    
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		
		String expected_string = "Sauce Labs Bike Light";
		String actual_string = driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div")).getText();
		if(expected_string.equals(actual_string)){
			System.out.println("Case 6 succesful");
		}else {
			System.out.println("Case 6 failed");
		}//Textler eşleşiyorsa test başarılı demektir.
		driver.close();
	}

}
