import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase13 {
// Şifrede en az bir büyük, bir küçük harf ile rakam içermelidir.
	public static void main(String[] args) {
		// Kullanıcağımız driverı ve ulaşacağımız lokasyonu set ediyoruz
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    
		String baseUrl = "http://localhost/";
	    driver.get(baseUrl);
	    
	    //Sayfada bulunan her bir eleman için test dedğerlerini gönderiyoruz.
	   	driver.findElement(By.name("E-Posta")).sendKeys("ardaovalı@gmail.com");
		driver.findElement(By.name("Şifre")).sendKeys("123456ee");    
		driver.findElement(By.name("Telefon Numarası")).sendKeys("05467891245");
		driver.findElement(By.name("Bel Çevresi")).sendKeys("90");
		driver.findElement(By.name("Omuz Çevresi")).sendKeys("60");
		driver.findElement(By.name("Kilo")).sendKeys("90");
		driver.findElement(By.name("Kaydet")).click();
		
		String expected_title = ""; //Bir sonraki sayfanın başlığını bekliyoruz.
		String actual_title = driver.getTitle();// Başlık alınır.
		
		if(expected_title.equals(actual_title)){
			System.out.println("Case 13 failed");
		}else {
			System.out.println("Case 13 successful");
		}//Kayıt olursak test başarısız demektir.
		
	   	//Tarayıcıyı kapatıyoruz.
	   	driver.close();
	}

}