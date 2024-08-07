import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase9 {
// Tarih gün ay yıl şeklinde olmalıdır.
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
		//driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]")).click();

		String expected_string = "Test.allTheThings() T-Shirt (Red)";
		String actual_string = driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
		if(expected_string.equals(actual_string)){
			System.out.println("Case 9 succesful");
		}else {
			System.out.println("Case 9 failed");
		}//Textler eşleşiyorsa test başarılı demektir.
		driver.quit();
	}

}
