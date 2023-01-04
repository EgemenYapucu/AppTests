import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1{
// Kullanıcı Adı yanlış girildiğinde.
	public static void main(String[] args) {
		// Kullanıcağımız driverı ve ulaşacağımız lokasyonu set ediyoruz
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		    
		String baseUrl = "https://www.saucedemo.com/";
		driver.get(baseUrl);
		    
		//Sayfada bulunan her bir eleman için test dedğerlerini gönderiyoruz.
	   	driver.findElement(By.id("user-name")).sendKeys("Egemen");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");    
		driver.findElement(By.id("login-button")).click();
			
		String expected_string = "Epic sadface: Username and password do not match any user in this service"; //Sayfanın error mesajı.
		String actual_string = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();// Metin alınır.

		if(expected_string.equals(actual_string)){
			System.out.println("Case 1 successful");
		}else {
			System.out.println("Case 1 failed");
		}//Kayıt olursak test başarısız demektir.
			
	   	//Tarayıcıyı kapatıyoruz.
	   	driver.close();
	}

}









