import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase11{
//Haftada toplam 2 antrenörden fazla ders alınmamalıdır.
	public static void main(String[] args) {
		// Her gün bir antrenörden fazla antrenör seçilemez.
		
		// Kullanıcağımız driverı ve ulaşacağımız lokasyonu set ediyoruz
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
									    
		String baseUrl = "https://www.saucedemo.com/";
		driver.get(baseUrl);
		//Sayfada bulunan her bir eleman için test dedğerlerini gönderiyoruz.
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");    
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[4]")).click();

		String expected_string = "Sauce Labs Onesie";
		String actual_string = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
		if(expected_string.equals(actual_string)){
			System.out.println("Case 11 succesful");
		}else {
			System.out.println("Case 11 failed");
		}//Textler eşleşiyorsa test başarılı demektir.
		driver.quit();						
	}		
}