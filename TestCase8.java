import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase8 {
// Çalışma günleri haftanın günlerinden biri olmalıdır.
	public static void main(String[] args) {
		// Kullanıcağımız driverı ve ulaşacağımız lokasyonu set ediyoruz
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    
		String baseUrl = "http://localhost/";
	    driver.get(baseUrl);
	    
	    //Sayfada bulunan her bir eleman için test değerlerini gönderiyoruz.
	   	driver.findElement(By.name("Antrenör adı")).sendKeys("Arda Ovalı");
		driver.findElement(By.name("Cinsiyeti")).sendKeys("Erkek");
		driver.findElement(By.name("Yaşı")).sendKeys("39");
		driver.findElement(By.name("Spor Alanı")).sendKeys("Fitness");
		driver.findElement(By.name("Telefon No")).sendKeys("05314567892");
		driver.findElement(By.name("Çalışma Günleri")).sendKeys("Portakal,Armut,Sabri");
		driver.findElement(By.name("Kaydet")).click();
		
		String expected_title = ""; //Bir sonraki sayfanın başlığını bekliyoruz.
		String actual_title = driver.getTitle();// Başlık alınır.
		
		if(expected_title.equals(actual_title)){
			System.out.println("Case 8 failed");
		}else {
			System.out.println("Case 8 successful");
		}//Kayıt olursak ve bir sonraki sayfaya geçersek test başarısız demektir.
		
	   	//Tarayıcıyı kapatıyoruz.
	   	driver.close();
	}

}
