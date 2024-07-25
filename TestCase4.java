import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase4{
// Kullanıcı Adı yanlış girildiğinde.
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
			

			String expected_url = "https://www.saucedemo.com/inventory.html";
			String current_url = driver.getCurrentUrl();
			
			if(expected_url.equals(current_url)){
				System.out.println("Case 4 successful");
			}else {
				System.out.println("Case 4 failed");
			}//Kayıt olursak test başarısız demektir.
			
		   	//Tarayıcıyı kapatıyoruz.
		   	driver.close();
	}

}