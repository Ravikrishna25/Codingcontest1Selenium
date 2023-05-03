package CC1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q2 {

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
        
        
        Thread.sleep(2000);
        
        //1st
        WebElement Filter = driver.findElement(By.className("product_sort_container"));
        Filter.click();
        Thread.sleep(2000);
        
        WebElement A_Z = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]"));
        Thread.sleep(2000);
        A_Z.click();
        
   
        
        WebElement proName1 = driver.findElement(By.className("inventory_item_name"));
        String productName1 = proName1.getText();  
        System.out.println("From the filter A-Z : "+productName1);
        
        
        Thread.sleep(2000);

        //2nd
        
        Filter = driver.findElement(By.className("product_sort_container"));
        Filter.click();
        Thread.sleep(2000);

        
        WebElement Z_A = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]"));
        Thread.sleep(2000);
        Z_A.click();
        
        Thread.sleep(2000);
        
        WebElement proName2 = driver.findElement(By.className("inventory_item_name"));
        String productName2 = proName2.getText();  
        System.out.println("From the filter Z-A : "+productName2);
        
        
        
        
        //3rd point
        Filter = driver.findElement(By.className("product_sort_container"));
        Filter.click();
        Thread.sleep(2000);
        
        WebElement l_h = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]"));
        Thread.sleep(2000);
        l_h.click();
        
        Thread.sleep(2000);
        
        WebElement proName3 = driver.findElement(By.className("inventory_item_name"));
        String productName3 = proName3.getText();  
        System.out.println("From the filter Low-High : "+productName3);
        
        Thread.sleep(2000);
        
        //4th
        
        Filter = driver.findElement(By.className("product_sort_container"));
        Thread.sleep(2000);
        Filter.click();
        
        Thread.sleep(2000);
        
        WebElement h_l = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]"));
        h_l.click();
        
        Thread.sleep(2000);
        
        WebElement proName4 = driver.findElement(By.className("inventory_item_name"));
        String productName4 = proName4.getText();  
        System.out.println("From the filter High-Low : "+productName4);
        
        driver.quit();        
        


	}

}
