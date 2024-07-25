import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceTests{
	@Test
	//Kullanıcı adı yanlış girilirse
	public void Test01() {
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
		}//Login olursak test başarısız demektir.
		driver.quit();			
	}
	@Test
	//Şifre Yanlış girilirse
	public void Test02() {
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				    
		String baseUrl = "https://www.saucedemo.com/";
		driver.get(baseUrl);
    
		//Sayfada bulunan her bir eleman için test dedğerlerini gönderiyoruz.
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("asdfasdasd");    
		driver.findElement(By.id("login-button")).click();
	
		String expected_string = "Epic sadface: Username and password do not match any user in this service";//Sayfanın error mesajı.
		String actual_string = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();// Metin alınır.
	
		if(expected_string.equals(actual_string)){
			System.out.println("Case 2 succesful");
		}else {
			System.out.println("Case 2 failed");
		}//Kayıt olursak test başarısız demektir.
		driver.quit();
	}
	@Test
	//Herhangi bir değer girilmezse
	public void Test03() {
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
		driver.quit();
	}
	@Test
	//Doğru değerler girilirse
	public void Test04() {
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
		driver.quit();
	}
	@Test
	//Ürün Sepete ekleme işlevi(Çanta)
	public void Test05() {
		// Kullanıcağımız driverı ve ulaşacağımız lokasyonu set ediyoruz
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						    
		String baseUrl = "https://www.saucedemo.com/";
		driver.get(baseUrl);
		//Sayfada bulunan her bir eleman için test dedğerlerini gönderiyoruz.
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");    
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
			
		String expected_string = "Sauce Labs Backpack";
		String actual_string = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		
		if(expected_string.equals(actual_string)){
			System.out.println("Case 5 succesful");
		}else {
			System.out.println("Case 5 failed");
		}//Textler eşleşiyorsa test başarılı demektir.
		driver.quit();
	}
	@Test
	//Ürün Sepete ekleme işlevi(Bisiklet feneri)
	public void Test06() {
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
		driver.quit();
	}
	@Test
	//Sepete ekleme işlevi
	public void Test07() {
		// Kullanıcağımız driverı ve ulaşacağımız lokasyonu set ediyoruz
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						    
		String baseUrl = "https://www.saucedemo.com/";
		driver.get(baseUrl);
		//Sayfada bulunan her bir eleman için test dedğerlerini gönderiyoruz.
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");    
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
				
		String expected_string = "Sauce Labs Bolt T-Shirt";
		String actual_string = driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div")).getText();
		if(expected_string.equals(actual_string)){
			System.out.println("Case 7 succesful");
		}else {
			System.out.println("Case 7 failed");
		}//Textler eşleşiyorsa test başarılı demektir.
		driver.quit();
	}
	@Test
	public void Test08() {
		// Kullanıcağımız driverı ve ulaşacağımız lokasyonu set ediyoruz
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						    
		String baseUrl = "https://www.saucedemo.com/";
		driver.get(baseUrl);
		//Sayfada bulunan her bir eleman için test dedğerlerini gönderiyoruz.
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");    
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
				
		String expected_string = "Sauce Labs Fleece Jacket";
		String actual_string = driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
		if(expected_string.equals(actual_string)){
			System.out.println("Case 8 succesful");
		}else {
			System.out.println("Case 8 failed");
		}//Textler eşleşiyorsa test başarılı demektir.
		driver.quit();
	}
	@Test
	public void Test09() {
		// Kullanıcağımız driverı ve ulaşacağımız lokasyonu set ediyoruz
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						    
		String baseUrl = "https://www.saucedemo.com/";
		driver.get(baseUrl);
		//Sayfada bulunan her bir eleman için test dedğerlerini gönderiyoruz.
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");    
		driver.findElement(By.id("login-button")).click();
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
	@Test
	public void Test10() {
		// Kullanıcağımız driverı ve ulaşacağımız lokasyonu set ediyoruz
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
								    
		String baseUrl = "https://www.saucedemo.com/";
		driver.get(baseUrl);
		//Sayfada bulunan her bir eleman için test dedğerlerini gönderiyoruz.
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");    
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]")).click();
		
		String expected_string = "Sauce Labs Onesie";
		String actual_string = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
		
		if(expected_string.equals(actual_string)){
			System.out.println("Case 10 succesful");
		}else {
			System.out.println("Case 10 failed");
		}//Textler eşleşiyorsa test başarılı demektir.
		driver.quit();
	}
	@Test
	public void Test11(){
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
	

	
