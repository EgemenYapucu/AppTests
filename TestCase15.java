import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase15 {

	public static void main(String[] args) {
		// Kullanıcağımız driverı ve ulaşacağımız lokasyonu set ediyoruz
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    
		String baseUrl = "http://localhost/";
	    driver.get(baseUrl);
	    
	    //Sayfada bulunan her bir eleman için test dedğerlerini gönderiyoruz.
	   	driver.findElement(By.name("Geri Bildirimler")).sendKeys("Çok güzel bir çalışmaydı atletik ve kuvvetli bir antrenör.");
		driver.findElement(By.name("Kaydet")).click();

		
		String expected_title = ""; //Bir sonraki sayfanın başlığını bekliyoruz.
		String actual_title = driver.getTitle();// Başlık alınır.
		
		if(expected_title.equals(actual_title)){
			System.out.println("Case 15 failed");
		}else{
			System.out.println("Case 15 successful");
		}//Kayıt olursak test başarısız demektir.
		
	   	//Tarayıcıyı kapatıyoruz.
	   	driver.close();
	}

}