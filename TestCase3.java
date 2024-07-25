import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase3 {
// Kullanıcı adı ve şifre girilmediğinde. 
	public static void main(String[] args){
		// Kullanıcağımız driverı ve ulaşacağımız lokasyonu set ediyoruz
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    
		String baseUrl = "https://www.saucedemo.com/";
	    driver.get(baseUrl);

	    driver.findElement(By.id("login-button")).click();
		
		String expected_string = "Epic sadface: Username is required"; //Sayfanın error mesajı.
		String actual_string = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();// Metin alınır.
		
		if(expected_string.equals(actual_string)){
			System.out.println("Case 3 succesful");
		}else {
			System.out.println("Case 3 failed");
		}//Login olursak test başarısız demektir.
		
	   	//Tarayıcıyı kapatıyoruz.
	   	driver.close();
	}

}

