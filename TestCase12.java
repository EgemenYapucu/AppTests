import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase12 {
// Bir antrenörden her hafta 1 kere ders alınabilir.
	public static void main(String[] args) {
		// Kullanıcağımız driverı ve ulaşacağımız lokasyonu set ediyoruz
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			    
		String baseUrl = "http://localhost/";
		driver.get(baseUrl);
			    
		//Sayfada bulunan her bir eleman için test dedğerlerini gönderiyoruz.
	    driver.findElement(By.name("Antrenör1")).click();
	    driver.findElement(By.name("Kaydet")).click();
	    driver.findElement(By.name("Antrenör1")).click();
	    driver.findElement(By.name("Kaydet")).click();
	    
	    String expected_title = ""; //Bir sonraki sayfanın başlığını bekliyoruz.
		String actual_title = driver.getTitle();// Başlık alınır.
				
		if(expected_title.equals(actual_title)){
			System.out.println("Case 12 failed");
		}else {
				System.out.println("Case 12 successful");
		}
		//Tarayıcıyı kapatıyoruz.
	   	driver.close();
	}		
}