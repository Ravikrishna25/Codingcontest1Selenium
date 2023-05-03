	package CC1;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	
	
	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class Q1 {
	
		public static void main(String[] args) throws InterruptedException {
	
	        // Driver setup
	        WebDriverManager.chromedriver().setup();
	        ChromeOptions co = new ChromeOptions();
	        co.addArguments("--remote-allow-origins=*");
	        WebDriver driver = new ChromeDriver(co);
	
	        // URL to open
	        String url = "https://www.saucedemo.com/";
	
	        // Open the URL
	        driver.get(url);
	
	        // Maximize
	        driver.manage().window().maximize();
	        
	        WebElement userName = driver.findElement(By.id("user-name"));
	        userName.sendKeys("standard_user");
	        
	        WebElement Password = driver.findElement(By.id("password"));
	        Password.sendKeys("secret_sauce");
	        
	        
	        Thread.sleep(2500);
	        
	        WebElement loginButton = driver.findElement(By.id("login-button"));
	        loginButton.click();
	        
	        
	
	        
	        WebElement Add = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	        Add.click();
	        Thread.sleep(1500);
	        
	        
	        WebElement cart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
	        cart.click();
	      
	        
	        
	        String currentURL = driver.getCurrentUrl();
	        String checkURL = "https://www.saucedemo.com/cart.html";
	
	       
	        if (checkURL.equals(currentURL)) {
	            System.out.println("Correct URL");
	        } else {
	            System.out.println("Wrong URL");
	        }
	        
	        Thread.sleep(2000);
	        
	        
	        WebElement checkout = driver.findElement(By.id("checkout"));
	        checkout.click();
	        
	        
	        
	         currentURL = driver.getCurrentUrl();
	         checkURL = "https://www.saucedemo.com/checkout-step-one.html";
	
	       
	        if (checkURL.equals(currentURL)) {
	            System.out.println("Correct URL for user information");
	        } else {
	            System.out.println("Wrong URL");
	        }
	        
	        WebElement firstName = driver.findElement(By.id("first-name"));
	        firstName.sendKeys("Ravi");
	        
	        WebElement lastName = driver.findElement(By.id("last-name"));
	        lastName.sendKeys("krishna");
	        
	        
	        WebElement pinCode = driver.findElement(By.id("postal-code"));
	        pinCode.sendKeys("638001");
	        
	        Thread.sleep(2000);
	        
	        WebElement Continue = driver.findElement(By.id("continue"));
	        Continue.click();
	        
	        
	        
	        
	        String expectedTitle = "Swag Labs";
	        String actualTitle = driver.getTitle();
	        
	        if (expectedTitle.equals(actualTitle)) {
	            System.out.println("Correct title");
	        } else {
	            System.out.println("Wrong Title");
	        }
	        
	        
	        
	        
	        
	
	        String currentURL1 = driver.getCurrentUrl();
	        String checkURL1 = "https://www.saucedemo.com/checkout-step-two.html";
	
	       
	        if (checkURL1.equals(currentURL1)) {
	            System.out.println("Correct URL");
	        } else {
	            System.out.println("Wrong URL");
	        }
	        
	        
	        
	        WebElement proName = driver.findElement(By.className("inventory_item_name"));
	        String productName = proName.getText();  
	        System.out.println(productName);
	        
	        
	        WebElement proPrice = driver.findElement(By.className("inventory_item_price"));
	        String productPrice = proPrice.getText();  
	        System.out.println(productPrice);
	        
	        
	
	        	
	        
	        
	
	        
	        driver.quit();
	    }
	
	}
